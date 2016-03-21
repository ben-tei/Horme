package ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

import exceptions.AlreadyExistsException;
import util.EmailValidator;

import java.awt.Color;

public class SignUpView extends JPanel implements ActionListener {

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

	public SignUpView(ViewController vc)
	{
		this.viewController = vc;

		this.setLayout(null);

		JLabel lblSignUp = new JLabel("Sign Up");
		lblSignUp.setBounds(413, 11, 68, 25);
		lblSignUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.add(lblSignUp);

		JLabel lblName = new JLabel("Name *");
		lblName.setBounds(75, 106, 55, 20);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblName);

		JLabel lblStreet = new JLabel("Street *");
		lblStreet.setBounds(75, 162, 55, 20);
		lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblStreet);

		JLabel lblEmail = new JLabel("Email *");
		lblEmail.setBounds(75, 278, 53, 20);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblEmail);

		JLabel lblLogin = new JLabel("Login *");
		lblLogin.setBounds(75, 336, 53, 20);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblLogin);

		JLabel lblPswd = new JLabel("Password *");
		lblPswd.setBounds(75, 396, 81, 20);
		lblPswd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblPswd);

		JLabel lblCity = new JLabel("City *");
		lblCity.setBounds(75, 225, 41, 20);
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblCity);

		/*JLabel lblSiret = new JLabel("SIRET");
		sl_container.putConstraint(SpringLayout.NORTH, lblSiret, 34, SpringLayout.SOUTH, lblPswd);
		sl_container.putConstraint(SpringLayout.WEST, lblSiret, 0, SpringLayout.WEST, lblName);
		lblSiret.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblSiret);*/

		JLabel lblFirstname = new JLabel("Firstname *");
		lblFirstname.setBounds(450, 106, 83, 20);
		lblFirstname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblFirstname);

		JLabel lblZip = new JLabel("Zip Code *");
		lblZip.setBounds(450, 162, 77, 20);
		lblZip.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblZip);

		JLabel lblPhone = new JLabel("Phone *");
		lblPhone.setBounds(450, 225, 58, 20);
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblPhone);

		JLabel lblEmailConfirm = new JLabel("Confirm Email *");
		lblEmailConfirm.setBounds(450, 278, 115, 20);
		lblEmailConfirm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblEmailConfirm);

		JLabel lblPswdConfirm = new JLabel("Confirm Password *");
		lblPswdConfirm.setBounds(450, 396, 143, 20);
		lblPswdConfirm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblPswdConfirm);

		/*JLabel lblWebsite = new JLabel("Website");
		sl_container.putConstraint(SpringLayout.NORTH, lblWebsite, 0, SpringLayout.NORTH, lblSiret);
		sl_container.putConstraint(SpringLayout.WEST, lblWebsite, 0, SpringLayout.WEST, lblFirstname);
		lblWebsite.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblWebsite);*/

		JLabel lblFields = new JLabel("All fields with a * are mandatory fields");
		lblFields.setBounds(75, 499, 206, 15);
		lblFields.setForeground(new Color(255, 0, 0));
		lblFields.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(lblFields);

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

		streetField = new JTextField();
		streetField.setBounds(175, 162, 200, 20);
		this.add(streetField);

		cityField = new JTextField();
		cityField.setBounds(175, 225, 200, 20);
		this.add(cityField);

		emailField = new JTextField();
		emailField.setBounds(175, 278, 200, 20);
		this.add(emailField);

		loginField = new JTextField();
		loginField.setBounds(175, 338, 200, 20);
		this.add(loginField);

		pswdField = new JPasswordField();
		pswdField.setBounds(175, 396, 200, 20);
		this.add(pswdField);

		/*siretField = new JTextField();
		sl_container.putConstraint(SpringLayout.WEST, siretField, 43, SpringLayout.EAST, lblSiret);
		sl_container.putConstraint(SpringLayout.SOUTH, siretField, 0, SpringLayout.SOUTH, lblSiret);
		sl_container.putConstraint(SpringLayout.EAST, siretField, 0, SpringLayout.EAST, lblFields);
		this.add(siretField);*/

		firstnameField = new JTextField();
		firstnameField.setBounds(613, 106, 200, 20);
		this.add(firstnameField);

		zipField = new JTextField();
		zipField.setBounds(613, 162, 200, 20);
		this.add(zipField);

		phoneField = new JTextField();
		phoneField.setBounds(613, 225, 200, 20);
		this.add(phoneField);

		emailConfirmField = new JTextField();
		emailConfirmField.setBounds(613, 278, 200, 20);
		this.add(emailConfirmField);

		pswdConfirmField = new JPasswordField();
		pswdConfirmField.setBounds(613, 396, 200, 20);
		this.add(pswdConfirmField);

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
		return getNameField().getText().equals("") && getStreetField().getText().equals("") && getCityField().getText().equals("")
				&& getEmailField().getText().equals("") && getLoginField().getText().equals("") && new String(getPswdField().getPassword()).equals("")
				&& getFirstnameField().getText().equals("") && getZipField().getText().equals("") && getPhoneField().getText().equals("")
				&& new String(getPswdConfirm().getPassword()).equals("") && getEmailConfirm().getText().equals("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		if(cmd.equals("back"))
		{
			this.viewController.showLoginPanel();
		}
		else if(cmd.equals("confirm"))
		{
			if(fieldsAreEmpty())
			{
				JOptionPane.showMessageDialog(null, "All fields with a * are mandatory fields !", "Failure", JOptionPane.WARNING_MESSAGE);
			}
			else if(!Arrays.equals(getPswdField().getPassword(), getPswdConfirm().getPassword()))
			{
				JOptionPane.showMessageDialog(null, "The two passwords do not match !", "Failure", JOptionPane.WARNING_MESSAGE);
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
				try {
					this.viewController.getUserFacade().signUp(getNameField().getText(), getFirstnameField().getText(), getStreetField().getText(), 
							getZipField().getText(), getCityField().getText(), getPhoneField().getText(), getEmailField().getText(), 
							getLoginField().getText(), new String(getPswdField().getPassword()));
					System.out.println(new String(getPswdField().getPassword()));
					JOptionPane.showMessageDialog(null, "You are now registered " + getLoginField().getText() + " !", "Success", JOptionPane.INFORMATION_MESSAGE);
				} catch (AlreadyExistsException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage(), "Failure", JOptionPane.WARNING_MESSAGE);
				}

			}
		}
	}

}
