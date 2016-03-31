package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import org.jdatepicker.impl.JDatePanelImpl;
import org.jdatepicker.impl.JDatePickerImpl;
import org.jdatepicker.impl.UtilDateModel;

import bl.core.ActivitySet;
import bl.core.User;
import exceptions.AlreadyExistsException;
import util.DateLabelFormatter;

/**
 * The Class CreateObjectiveView.
 */
public class CreateObjectiveView extends JPanel implements ActionListener
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The view controller. */
	private ViewController viewController;

	/** The name field. */
	private JTextField nameField;

	/** The cb activities. */
	private JComboBox<String> cbActivities = new JComboBox<String>();

	/** The description field. */
	private JTextField descriptionField;

	/** The activity set. */
	private ActivitySet activitySet;

	/** The model. */
	private UtilDateModel model = new UtilDateModel();

	/** The date panel. */
	private JDatePanelImpl datePanel;

	/** The date picker. */
	private JDatePickerImpl datePicker;

	/**
	 * Instantiates a new creates the objective view.
	 *
	 * @param vc the vc
	 */
	public CreateObjectiveView(ViewController vc)
	{
		this.viewController = vc;

		this.setLayout(null);

		new Menu(this, this.viewController);

		User user = this.viewController.getUserFacade().getUser();

		this.activitySet = this.viewController.getActivityFacade().readActivities(user);

		JLabel lblName = new JLabel("Name *");
		lblName.setBounds(75, 175, 90, 20);
		this.add(lblName);

		JLabel lblDescription = new JLabel("Description *");
		lblDescription.setBounds(75, 255, 90, 20);
		this.add(lblDescription);

		JLabel lblDeadline = new JLabel("Deadline *");
		lblDeadline.setBounds(75, 335, 90, 20);
		this.add(lblDeadline);

		JLabel lblActivity = new JLabel("Activity *");
		lblActivity.setBounds(75, 415, 90, 20);
		this.add(lblActivity);

		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(this);
		btnConfirm.setActionCommand("confirm");
		btnConfirm.setBounds(438, 495, 83, 23);
		this.add(btnConfirm);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(this);
		btnBack.setActionCommand("back");
		btnBack.setBounds(692, 495, 68, 23);
		this.add(btnBack);

		nameField = new JTextField();
		nameField.setBounds(175, 175, 200, 20);
		this.nameField.addActionListener(this);
		this.nameField.setActionCommand("confirm");
		this.add(nameField);

		descriptionField = new JTextField();
		descriptionField.setBounds(175, 255, 200, 20);
		this.descriptionField.addActionListener(this);
		this.descriptionField.setActionCommand("confirm");
		this.add(descriptionField);

		Properties p = new Properties();
		p.put("text.today", "Today");
		p.put("text.month", "Month");
		p.put("text.year", "Year");
		this.datePanel = new JDatePanelImpl(model, p);
		this.datePicker = new JDatePickerImpl(datePanel, new DateLabelFormatter());
		datePicker.setBounds(175, 335, 200, 30);
		this.add(datePicker);

		cbActivities.setBounds(175, 415, 200, 20);
		for (int i = 0; i < this.activitySet.size(); i++)
		{
			this.cbActivities.addItem(this.activitySet.getActivityByIndex(i).getName());
		}
		this.add(cbActivities);

	}

	/**
	 * Gets the name field.
	 *
	 * @return the name field
	 */
	public JTextField getNameField()
	{
		return nameField;
	}

	/**
	 * Gets the category choice.
	 *
	 * @return the category choice
	 */

	public String getNameActivity()
	{
		if (cbActivities.getItemCount() != 0)
		{
			return (String) cbActivities.getSelectedItem();
		} else
		{
			return "";
		}
	}

	/**
	 * Gets the description field.
	 *
	 * @return the description field
	 */
	public JTextField getDescriptionField()
	{
		return descriptionField;
	}

	/**
	 * Gets the deadline text.
	 *
	 * @return the deadline text
	 */
	public String getDeadlineText()
	{
		return datePicker.getJFormattedTextField().getText();
	}

	/**
	 * Fields are empty.
	 *
	 * @return true, if successful
	 */

	public boolean fieldsAreEmpty()
	{
		return getNameField().getText().equals("") || getNameActivity().equals("")
				|| getDescriptionField().getText().equals("") || getDeadlineText().isEmpty();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		if (cmd.equals("back"))
		{
			this.viewController.showActivitiesPanel();
		} else if (cmd.equals("confirm"))
		{
			if (fieldsAreEmpty())
			{
				JOptionPane.showMessageDialog(null, "All fields with a * are mandatory fields !", "Failure",
						JOptionPane.WARNING_MESSAGE);
			} else
			{
				try
				{
					java.util.Date date = (Date) datePicker.getModel().getValue();
					SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
					String stringDate = dateFormat.format(date);
					java.sql.Date valideDate = java.sql.Date.valueOf(stringDate);

					this.viewController.getDiaryFacade().createObjective(getNameField().getText(),
							getDescriptionField().getText(), valideDate,
							this.activitySet.getActivityByIndex(cbActivities.getSelectedIndex()));

					JOptionPane.showMessageDialog(null,
							"Activity \"" + getNameField().getText() + "\" successfully added" + " !", "Success",
							JOptionPane.INFORMATION_MESSAGE);
					this.viewController.showDiaryPanel();
				} catch (AlreadyExistsException e1)
				{
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e1.getMessage(), "Failure", JOptionPane.WARNING_MESSAGE);
				}

			}

		}
	}
}