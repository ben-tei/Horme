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
import javax.swing.SpringLayout;

import bl.UserFacade;
import exceptions.AlreadyExistsException;
import util.EmailValidator;

import java.awt.Color;

public class SignUpView extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private SpringLayout sl_container;
	private UserFacade userFacade;
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
		this.userFacade = new UserFacade();

		this.viewController = vc;

		this.sl_container = new SpringLayout();
		this.setLayout(sl_container);

		JLabel lblSignUp = new JLabel("Sign Up");
		sl_container.putConstraint(SpringLayout.NORTH, lblSignUp, 10, SpringLayout.NORTH, this);
		sl_container.putConstraint(SpringLayout.WEST, lblSignUp, 363, SpringLayout.WEST, this);
		lblSignUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.add(lblSignUp);

		JLabel lblName = new JLabel("Name *");
		sl_container.putConstraint(SpringLayout.NORTH, lblName, 106, SpringLayout.NORTH, this);
		sl_container.putConstraint(SpringLayout.WEST, lblName, 25, SpringLayout.WEST, this);
		lblName.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblName);

		JLabel lblStreet = new JLabel("Street *");
		sl_container.putConstraint(SpringLayout.NORTH, lblStreet, 36, SpringLayout.SOUTH, lblName);
		sl_container.putConstraint(SpringLayout.WEST, lblStreet, 0, SpringLayout.WEST, lblName);
		lblStreet.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblStreet);

		JLabel lblEmail = new JLabel("Email *");
		sl_container.putConstraint(SpringLayout.WEST, lblEmail, 0, SpringLayout.WEST, lblName);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblEmail);

		JLabel lblLogin = new JLabel("Login *");
		sl_container.putConstraint(SpringLayout.NORTH, lblLogin, 38, SpringLayout.SOUTH, lblEmail);
		sl_container.putConstraint(SpringLayout.WEST, lblLogin, 0, SpringLayout.WEST, lblName);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblLogin);

		JLabel lblPswd = new JLabel("Password *");
		sl_container.putConstraint(SpringLayout.NORTH, lblPswd, 40, SpringLayout.SOUTH, lblLogin);
		sl_container.putConstraint(SpringLayout.WEST, lblPswd, 0, SpringLayout.WEST, lblName);
		lblPswd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblPswd);

		JLabel lblCity = new JLabel("City *");
		sl_container.putConstraint(SpringLayout.SOUTH, lblCity, -327, SpringLayout.SOUTH, this);
		sl_container.putConstraint(SpringLayout.NORTH, lblEmail, 33, SpringLayout.SOUTH, lblCity);
		sl_container.putConstraint(SpringLayout.WEST, lblCity, 0, SpringLayout.WEST, lblName);
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblCity);

		/*JLabel lblSiret = new JLabel("SIRET");
		sl_container.putConstraint(SpringLayout.NORTH, lblSiret, 34, SpringLayout.SOUTH, lblPswd);
		sl_container.putConstraint(SpringLayout.WEST, lblSiret, 0, SpringLayout.WEST, lblName);
		lblSiret.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblSiret);*/

		JLabel lblFirstname = new JLabel("Firstname *");
		sl_container.putConstraint(SpringLayout.NORTH, lblFirstname, 0, SpringLayout.NORTH, lblName);
		lblFirstname.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblFirstname);

		JLabel lblZip = new JLabel("Zip Code *");
		sl_container.putConstraint(SpringLayout.WEST, lblZip, 400, SpringLayout.WEST, this);
		sl_container.putConstraint(SpringLayout.WEST, lblFirstname, 0, SpringLayout.WEST, lblZip);
		sl_container.putConstraint(SpringLayout.NORTH, lblZip, 0, SpringLayout.NORTH, lblStreet);
		lblZip.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblZip);

		JLabel lblPhone = new JLabel("Phone *");
		sl_container.putConstraint(SpringLayout.NORTH, lblPhone, 0, SpringLayout.NORTH, lblCity);
		sl_container.putConstraint(SpringLayout.WEST, lblPhone, 400, SpringLayout.WEST, this);
		lblPhone.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblPhone);

		JLabel lblEmailConfirm = new JLabel("Confirm Email *");
		sl_container.putConstraint(SpringLayout.NORTH, lblEmailConfirm, 0, SpringLayout.NORTH, lblEmail);
		sl_container.putConstraint(SpringLayout.WEST, lblEmailConfirm, 400, SpringLayout.WEST, this);
		lblEmailConfirm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblEmailConfirm);

		JLabel lblPswdConfirm = new JLabel("Confirm Password *");
		sl_container.putConstraint(SpringLayout.NORTH, lblPswdConfirm, 0, SpringLayout.NORTH, lblPswd);
		sl_container.putConstraint(SpringLayout.WEST, lblPswdConfirm, 0, SpringLayout.WEST, lblFirstname);
		lblPswdConfirm.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblPswdConfirm);

		/*JLabel lblWebsite = new JLabel("Website");
		sl_container.putConstraint(SpringLayout.NORTH, lblWebsite, 0, SpringLayout.NORTH, lblSiret);
		sl_container.putConstraint(SpringLayout.WEST, lblWebsite, 0, SpringLayout.WEST, lblFirstname);
		lblWebsite.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblWebsite);*/

		JLabel lblFields = new JLabel("All fields with a * are mandatory fields");
		sl_container.putConstraint(SpringLayout.WEST, lblFields, 0, SpringLayout.WEST, lblName);
		sl_container.putConstraint(SpringLayout.SOUTH, lblFields, -58, SpringLayout.SOUTH, this);
		lblFields.setForeground(new Color(255, 0, 0));
		lblFields.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(lblFields);

		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(this);
		btnConfirm.setActionCommand("confirm");
		sl_container.putConstraint(SpringLayout.NORTH, btnConfirm, -4, SpringLayout.NORTH, lblFields);
		sl_container.putConstraint(SpringLayout.WEST, btnConfirm, 0, SpringLayout.WEST, lblFirstname);
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(btnConfirm);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(this);
		btnBack.setActionCommand("back");
		sl_container.putConstraint(SpringLayout.NORTH, btnBack, -4, SpringLayout.NORTH, lblFields);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(btnBack);

		nameField = new JTextField();
		sl_container.putConstraint(SpringLayout.WEST, nameField, 45, SpringLayout.EAST, lblName);
		sl_container.putConstraint(SpringLayout.NORTH, nameField, 106, SpringLayout.NORTH, this);
		this.add(nameField);

		streetField = new JTextField();
		sl_container.putConstraint(SpringLayout.NORTH, streetField, 36, SpringLayout.SOUTH, nameField);
		sl_container.putConstraint(SpringLayout.EAST, nameField, 0, SpringLayout.EAST, streetField);
		sl_container.putConstraint(SpringLayout.WEST, streetField, 45, SpringLayout.EAST, lblStreet);
		sl_container.putConstraint(SpringLayout.EAST, streetField, -75, SpringLayout.WEST, lblZip);
		this.add(streetField);

		cityField = new JTextField();
		sl_container.putConstraint(SpringLayout.WEST, cityField, 59, SpringLayout.EAST, lblCity);
		sl_container.putConstraint(SpringLayout.EAST, cityField, -75, SpringLayout.WEST, lblPhone);
		this.add(cityField);

		emailField = new JTextField();
		sl_container.putConstraint(SpringLayout.WEST, emailField, 47, SpringLayout.EAST, lblEmail);
		sl_container.putConstraint(SpringLayout.EAST, emailField, -75, SpringLayout.WEST, lblEmailConfirm);
		sl_container.putConstraint(SpringLayout.SOUTH, cityField, -33, SpringLayout.NORTH, emailField);
		sl_container.putConstraint(SpringLayout.NORTH, emailField, 278, SpringLayout.NORTH, this);
		this.add(emailField);

		loginField = new JTextField();
		sl_container.putConstraint(SpringLayout.NORTH, loginField, 40, SpringLayout.SOUTH, emailField);
		sl_container.putConstraint(SpringLayout.WEST, loginField, 47, SpringLayout.EAST, lblLogin);
		sl_container.putConstraint(SpringLayout.EAST, loginField, -589, SpringLayout.EAST, this);
		this.add(loginField);

		pswdField = new JPasswordField();
		sl_container.putConstraint(SpringLayout.NORTH, pswdField, 38, SpringLayout.SOUTH, loginField);
		sl_container.putConstraint(SpringLayout.WEST, pswdField, 19, SpringLayout.EAST, lblPswd);
		sl_container.putConstraint(SpringLayout.EAST, pswdField, -75, SpringLayout.WEST, lblPswdConfirm);
		this.add(pswdField);

		/*siretField = new JTextField();
		sl_container.putConstraint(SpringLayout.WEST, siretField, 43, SpringLayout.EAST, lblSiret);
		sl_container.putConstraint(SpringLayout.SOUTH, siretField, 0, SpringLayout.SOUTH, lblSiret);
		sl_container.putConstraint(SpringLayout.EAST, siretField, 0, SpringLayout.EAST, lblFields);
		this.add(siretField);*/

		firstnameField = new JTextField();
		sl_container.putConstraint(SpringLayout.EAST, btnBack, 0, SpringLayout.EAST, firstnameField);
		sl_container.putConstraint(SpringLayout.NORTH, firstnameField, 106, SpringLayout.NORTH, this);
		sl_container.putConstraint(SpringLayout.WEST, firstnameField, 563, SpringLayout.WEST, this);
		sl_container.putConstraint(SpringLayout.EAST, firstnameField, -151, SpringLayout.EAST, this);
		this.add(firstnameField);

		zipField = new JTextField();
		sl_container.putConstraint(SpringLayout.SOUTH, firstnameField, -36, SpringLayout.NORTH, zipField);
		sl_container.putConstraint(SpringLayout.NORTH, zipField, 162, SpringLayout.NORTH, this);
		sl_container.putConstraint(SpringLayout.WEST, zipField, 86, SpringLayout.EAST, lblZip);
		sl_container.putConstraint(SpringLayout.EAST, zipField, -151, SpringLayout.EAST, this);
		this.add(zipField);

		phoneField = new JTextField();
		sl_container.putConstraint(SpringLayout.WEST, phoneField, 105, SpringLayout.EAST, lblPhone);
		sl_container.putConstraint(SpringLayout.EAST, phoneField, -151, SpringLayout.EAST, this);
		this.add(phoneField);

		emailConfirmField = new JTextField();
		sl_container.putConstraint(SpringLayout.SOUTH, phoneField, -33, SpringLayout.NORTH, emailConfirmField);
		sl_container.putConstraint(SpringLayout.WEST, emailConfirmField, 48, SpringLayout.EAST, lblEmailConfirm);
		sl_container.putConstraint(SpringLayout.EAST, emailConfirmField, -151, SpringLayout.EAST, this);
		sl_container.putConstraint(SpringLayout.NORTH, emailConfirmField, 278, SpringLayout.NORTH, this);
		this.add(emailConfirmField);

		pswdConfirmField = new JPasswordField();
		sl_container.putConstraint(SpringLayout.NORTH, pswdConfirmField, 0, SpringLayout.NORTH, lblPswd);
		sl_container.putConstraint(SpringLayout.WEST, pswdConfirmField, 20, SpringLayout.EAST, lblPswdConfirm);
		sl_container.putConstraint(SpringLayout.EAST, pswdConfirmField, -151, SpringLayout.EAST, this);
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
					userFacade.signUp(getNameField().getText(), getFirstnameField().getText(), getStreetField().getText(), 
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
