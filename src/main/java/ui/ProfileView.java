package ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import util.EmailValidator;

import java.awt.Color;

public class ProfileView extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private ViewController viewController;
	private JTextField nameField;
	private JTextField streetField;
	private JTextField cityField;
	private JTextField emailField;
	private JTextField loginField;
	private JPasswordField pswdField;
	private JTextField siretField;
	private JTextField firstnameField;
	private JTextField zipField;
	private JTextField phoneField;
	private JPasswordField pswdConfirmField;
	private JTextField emailConfirmField;
	private JTextField websiteField;

	public ProfileView(ViewController vc)
	{
		this.viewController = vc;

		this.setLayout(null);

		new Menu(this, this.viewController);

		JLabel lblName = new JLabel("Name *");
		lblName.setBounds(75, 140, 55, 20);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblName);

		JLabel lblStreet = new JLabel("Street *");
		lblStreet.setBounds(75, 196, 55, 20);
		lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblStreet);

		JLabel lblEmail = new JLabel("Email *");
		lblEmail.setBounds(75, 312, 53, 20);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblEmail);

		/*JLabel lblPswd = new JLabel("Password");
		lblPswd.setBounds(75, 430, 81, 20);
		lblPswd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblPswd);*/

		JLabel lblCity = new JLabel("City *");
		lblCity.setBounds(75, 259, 41, 20);
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblCity);

		/*JLabel lblSiret = new JLabel("SIRET");
		sl_container.putConstraint(SpringLayout.NORTH, lblSiret, 34, SpringLayout.SOUTH, lblPswd);
		sl_container.putConstraint(SpringLayout.WEST, lblSiret, 0, SpringLayout.WEST, lblName);
		lblSiret.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblSiret);*/

		JLabel lblFirstname = new JLabel("Firstname *");
		lblFirstname.setBounds(450, 140, 83, 20);
		lblFirstname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblFirstname);

		JLabel lblZip = new JLabel("Zip Code *");
		lblZip.setBounds(450, 196, 77, 20);
		lblZip.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblZip);

		JLabel lblPhone = new JLabel("Phone *");
		lblPhone.setBounds(450, 259, 58, 20);
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblPhone);

		JLabel lblEmailConfirm = new JLabel("Confirm Email *");
		lblEmailConfirm.setBounds(450, 312, 115, 20);
		lblEmailConfirm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblEmailConfirm);

		/*JLabel lblPswdConfirm = new JLabel("Confirm Password");
		lblPswdConfirm.setBounds(450, 430, 143, 20);
		lblPswdConfirm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblPswdConfirm);*/

		/*JLabel lblWebsite = new JLabel("Website");
		sl_container.putConstraint(SpringLayout.NORTH, lblWebsite, 0, SpringLayout.NORTH, lblSiret);
		sl_container.putConstraint(SpringLayout.WEST, lblWebsite, 0, SpringLayout.WEST, lblFirstname);
		lblWebsite.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblWebsite);*/

		JLabel lblFields = new JLabel("All fields with a * are mandatory fields");
		lblFields.setBounds(75, 400, 206, 15);
		lblFields.setForeground(new Color(255, 0, 0));
		lblFields.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(lblFields);

		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(this);
		btnConfirm.setActionCommand("confirm");
		btnConfirm.setBounds(438, 400, 83, 23);
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(btnConfirm);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(this);
		btnBack.setActionCommand("back");
		btnBack.setBounds(692, 400, 68, 23);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(btnBack);

		nameField = new JTextField(this.viewController.getUserFacade().getUser().getName());
		nameField.setBounds(175, 140, 200, 20);
		this.add(nameField);

		streetField = new JTextField(this.viewController.getUserFacade().getUser().getStreet());
		streetField.setBounds(175, 196, 200, 20);
		this.add(streetField);

		cityField = new JTextField(this.viewController.getUserFacade().getUser().getCity());
		cityField.setBounds(175, 259, 200, 20);
		this.add(cityField);

		emailField = new JTextField(this.viewController.getUserFacade().getUser().getEmail());
		emailField.setBounds(175, 312, 200, 20);
		this.add(emailField);

		/*pswdField = new JPasswordField();
		pswdField.setBounds(175, 430, 200, 20);
		this.add(pswdField);*/

		/*siretField = new JTextField();
		sl_container.putConstraint(SpringLayout.WEST, siretField, 43, SpringLayout.EAST, lblSiret);
		sl_container.putConstraint(SpringLayout.SOUTH, siretField, 0, SpringLayout.SOUTH, lblSiret);
		sl_container.putConstraint(SpringLayout.EAST, siretField, 0, SpringLayout.EAST, lblFields);
		this.add(siretField);*/

		firstnameField = new JTextField(this.viewController.getUserFacade().getUser().getFirstName());
		firstnameField.setBounds(613, 140, 200, 20);
		this.add(firstnameField);

		zipField = new JTextField(this.viewController.getUserFacade().getUser().getZipCode());
		zipField.setBounds(613, 196, 200, 20);
		this.add(zipField);

		phoneField = new JTextField(this.viewController.getUserFacade().getUser().getPhone());
		phoneField.setBounds(613, 259, 200, 20);
		this.add(phoneField);

		emailConfirmField = new JTextField(this.viewController.getUserFacade().getUser().getEmail());
		emailConfirmField.setBounds(613, 312, 200, 20);
		this.add(emailConfirmField);

		/*pswdConfirmField = new JPasswordField();
		pswdConfirmField.setBounds(613, 430, 200, 20);
		this.add(pswdConfirmField);*/

		/*websiteField = new JTextField();
		sl_container.putConstraint(SpringLayout.NORTH, websiteField, 0, SpringLayout.NORTH, lblSiret);
		sl_container.putConstraint(SpringLayout.WEST, websiteField, 0, SpringLayout.WEST, firstnameField);
		sl_container.putConstraint(SpringLayout.EAST, websiteField, 0, SpringLayout.EAST, firstnameField);
		this.add(websiteField);*/

	}

	public JTextField getNameField() {
		return nameField;
	}

	public JTextField getStreetField() {
		return streetField;
	}

	public JTextField getCityField() {
		return cityField;
	}

	public JTextField getEmailField() {
		return emailField;
	}

	public JTextField getLoginField() {
		return loginField;
	}

	public JPasswordField getPswdField() {
		return pswdField;
	}

	public JTextField getSiretField() {
		return siretField;
	}

	public JTextField getFirstnameField() {
		return firstnameField;
	}

	public JTextField getZipField() {
		return zipField;
	}

	public JTextField getPhoneField() {
		return phoneField;
	}

	public JPasswordField getPswdConfirm() {
		return pswdConfirmField;
	}

	public JTextField getEmailConfirm() {
		return emailConfirmField;
	}

	public JTextField getWebsiteField() {
		return websiteField;
	}

	public boolean fieldsAreEmpty()
	{
		return getNameField().getText().equals("") || getStreetField().getText().equals("") || getCityField().getText().equals("")
				|| getEmailField().getText().equals("") || getFirstnameField().getText().equals("") || getZipField().getText().equals("")
				|| getPhoneField().getText().equals("") || getEmailConfirm().getText().equals("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		if(cmd.equals("back"))
		{
			this.viewController.showIndexPanel();
		}
		else if(cmd.equals("confirm"))
		{
			if(fieldsAreEmpty())
			{
				JOptionPane.showMessageDialog(null, "All fields with a * are mandatory fields !", "Failure", JOptionPane.WARNING_MESSAGE);
			}
			else if(!getEmailConfirm().getText().equals(getEmailField().getText()))
			{
				JOptionPane.showMessageDialog(null, "The two email address do not match !", "Failure", JOptionPane.WARNING_MESSAGE);
			}
			else if(!EmailValidator.validate(getEmailConfirm().getText()) || !EmailValidator.validate(getEmailField().getText()))
			{
				JOptionPane.showMessageDialog(null, "Email address not valid !", "Failure", JOptionPane.WARNING_MESSAGE);
			}
			else
			{
				this.viewController.getUserFacade().editProfile(getNameField().getText(), getFirstnameField().getText(), getStreetField().getText(), 
						getZipField().getText(), getCityField().getText(), getPhoneField().getText(), getEmailField().getText());

				JOptionPane.showMessageDialog(null, "Your profile has been updated !", "Success", JOptionPane.INFORMATION_MESSAGE);

			}
		}
	}

}
