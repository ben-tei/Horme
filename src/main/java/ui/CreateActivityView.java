package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import bl.core.ActivityCategorySet;
import exceptions.AlreadyExistsException;

/**
 * The Class CreateActivityView.
 */
public class CreateActivityView extends JPanel implements ActionListener
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The view controller. */
	private ViewController viewController;

	/** The name field. */
	private JTextField nameField;

	/** The cb categories. */
	private JComboBox<String> cbCategories = new JComboBox<String>();

	/** The description field. */
	private JTextField descriptionField;

	/** The activity category set. */
	private ActivityCategorySet activityCategorySet;

	/**
	 * Instantiates a new creates the activity view.
	 *
	 * @param vc the vc
	 */
	public CreateActivityView(ViewController vc)
	{
		this.viewController = vc;

		this.setLayout(null);

		new Menu(this, this.viewController);

		this.activityCategorySet = this.viewController.getCategoryFacade().getActivitiesCategories();

		JLabel lblName = new JLabel("Name *");
		lblName.setBounds(75, 175, 90, 20);
		this.add(lblName);

		JLabel lblCategory = new JLabel("Category *");
		lblCategory.setBounds(75, 255, 90, 20);
		this.add(lblCategory);

		JLabel lblDescription = new JLabel("Description *");
		lblDescription.setBounds(75, 335, 90, 20);
		this.add(lblDescription);

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

		cbCategories.setBounds(175, 255, 200, 20);
		for (int i = 0; i < this.activityCategorySet.size(); i++)
		{
			this.cbCategories.addItem(this.activityCategorySet.getCategoryByIndex(i).getName());
		}
		this.add(cbCategories);

		descriptionField = new JTextField();
		descriptionField.setBounds(175, 335, 200, 20);
		this.descriptionField.addActionListener(this);
		this.descriptionField.setActionCommand("confirm");
		this.add(descriptionField);

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

	public String getNameCategory()
	{
		if (cbCategories.getItemCount() != 0)
		{
			return (String) cbCategories.getSelectedItem();
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
	 * Fields are empty.
	 *
	 * @return true, if successful
	 */

	public boolean fieldsAreEmpty()
	{
		return getNameField().getText().equals("") || getNameCategory().equals("")
				|| getDescriptionField().getText().equals("");
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
					this.viewController.getActivityFacade().createActivity(getNameField().getText(),
							getDescriptionField().getText(),
							this.activityCategorySet.getCategoryByIndex(cbCategories.getSelectedIndex()),
							this.viewController.getUserFacade().getUser());

					JOptionPane.showMessageDialog(null,
							"Activity \"" + getNameField().getText() + "\" successfully added" + " !", "Success",
							JOptionPane.INFORMATION_MESSAGE);
					this.viewController.showActivitiesPanel();
				} catch (AlreadyExistsException e1)
				{
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e1.getMessage(), "Failure", JOptionPane.WARNING_MESSAGE);
				}

			}

		}
	}
}
