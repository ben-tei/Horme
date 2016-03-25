package ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import bl.core.Category;

public class ActivityView extends JPanel implements ActionListener {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The view controller. */
	private ViewController viewController;

	/** The name field. */
	private JTextField nameField;

	/** The street field. */
	private JComboBox<Category> categoryChoice;

	/** The city field. */
	private JTextField descriptionField;
	

	public ActivityView(ViewController vc)
	{
		this.viewController = vc;

		this.setLayout(null);

		JLabel lblNewActivity = new JLabel("Create a new activity");
		lblNewActivity.setBounds(413, 11, 68, 25);
		lblNewActivity.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.add(lblNewActivity);
		
		JLabel lblName = new JLabel("Name *");
		lblName.setBounds(75, 106, 55, 20);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblName);

		JComboBox cbCategory = new JComboBox();
		JLabel lblCategory = new JLabel("Category *");
		lblCategory.setBounds(75, 162, 55, 20);
		lblCategory.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblCategory);

		JLabel lblDescription = new JLabel("Description *");
		lblDescription.setBounds(75, 278, 53, 20);
		lblDescription.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblDescription);
		
		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(this);
		btnConfirm.setActionCommand("confirm");
		btnConfirm.setBounds(438, 495, 83, 23);
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(btnConfirm);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(this);
		btnBack.setActionCommand("back");
		btnBack.setBounds(692, 495, 68, 23);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(btnBack);
		
		nameField = new JTextField();
		nameField.setBounds(175, 106, 200, 20);
		this.add(nameField);
		
		categoryChoice = new JComboBox();
		categoryChoice.setBounds(175, 162, 200, 20);
		this.add(categoryChoice);

		descriptionField = new JTextField();
		descriptionField.setBounds(175, 162, 200, 20);
		this.add(descriptionField);
		
	}
		
		/**
		 * Gets the name field.
		 *
		 * @return the name field
		 */
		public JTextField getNameField() {
			return nameField;
		}

		/**
		 * Gets the category choice.
		 *
		 * @return the category choice
		 */
		
		public JComboBox getCategoryChoice() {
			return categoryChoice;
		}

		/**
		 * Gets the description field.
		 *
		 * @return the description field
		 */
		public JTextField getDescriptionField() {
			return descriptionField;
		}
		
		/**
		 * Fields are empty.
		 *
		 * @return true, if successful
		 */
		String nameCategory = (String)categoryChoice.getSelectedItem();
		public boolean fieldsAreEmpty()
		{
			return getNameField().getText().equals("") || nameCategory.equals("") || getDescriptionField().getText().equals("");
		}

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			String cmd = e.getActionCommand();
			if(cmd.equals("back"))
			{
				this.viewController.showActivitiesPanel();
			}
			else if(cmd.equals("confirm"))
			{
				if(fieldsAreEmpty())
				{
					JOptionPane.showMessageDialog(null, "All fields with a * are mandatory fields !", "Failure", JOptionPane.WARNING_MESSAGE);
				}
				else
				{
						this.viewController.getActivityFacade().createActivity(getNameField().getText(), getCategoryChoice().getSelectedItem().toString(), 
								getDescriptionField().getText());

						
						// this.viewController.getShoppingCartFacade().createSC(this.viewController.getUserFacade().getUser())

						JOptionPane.showMessageDialog(null, "Activity " + getNameField().getText()+" successfully added" + " !", "Success", JOptionPane.INFORMATION_MESSAGE);
						this.viewController.showActivitiesPanel();
					
				}

				}
			}
}
