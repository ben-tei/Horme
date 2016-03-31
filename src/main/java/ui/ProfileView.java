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

/**
 * The Class ProfileView.
 */
public class ProfileView extends JPanel implements ActionListener
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The view controller. */
	private ViewController viewController;

	/** The name field. */
	private JTextField nameField;

	/** The street field. */
	private JTextField streetField;

	/** The city field. */
	private JTextField cityField;

	/** The email field. */
	private JTextField emailField;

	/** The login field. */
	private JTextField loginField;

	/** The pswd field. */
	private JPasswordField pswdField;

	/** The siret field. */
	private JTextField siretField;

	/** The firstname field. */
	private JTextField firstnameField;

	/** The zip field. */
	private JTextField zipField;

	/** The phone field. */
	private JTextField phoneField;

	/** The pswd confirm field. */
	private JPasswordField pswdConfirmField;

	/** The email confirm field. */
	private JTextField emailConfirmField;

	/** The website field. */
	private JTextField websiteField;

	/**
	 * Instantiates a new profile view.
	 *
	 * @param vc the ViewController
	 */
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

		JLabel lblCity = new JLabel("City *");
		lblCity.setBounds(75, 259, 41, 20);
		lblCity.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblCity);

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
	 * Gets the street field.
	 *
	 * @return the street field
	 */
	public JTextField getStreetField()
	{
		return streetField;
	}

	/**
	 * Gets the city field.
	 *
	 * @return the city field
	 */
	public JTextField getCityField()
	{
		return cityField;
	}

	/**
	 * Gets the email field.
	 *
	 * @return the email field
	 */
	public JTextField getEmailField()
	{
		return emailField;
	}

	/**
	 * Gets the login field.
	 *
	 * @return the login field
	 */
	public JTextField getLoginField()
	{
		return loginField;
	}

	/**
	 * Gets the pswd field.
	 *
	 * @return the pswd field
	 */
	public JPasswordField getPswdField()
	{
		return pswdField;
	}

	/**
	 * Gets the siret field.
	 *
	 * @return the siret field
	 */
	public JTextField getSiretField()
	{
		return siretField;
	}

	/**
	 * Gets the firstname field.
	 *
	 * @return the firstname field
	 */
	public JTextField getFirstnameField()
	{
		return firstnameField;
	}

	/**
	 * Gets the zip field.
	 *
	 * @return the zip field
	 */
	public JTextField getZipField()
	{
		return zipField;
	}

	/**
	 * Gets the phone field.
	 *
	 * @return the phone field
	 */
	public JTextField getPhoneField()
	{
		return phoneField;
	}

	/**
	 * Gets the pswd confirm.
	 *
	 * @return the pswd confirm
	 */
	public JPasswordField getPswdConfirm()
	{
		return pswdConfirmField;
	}

	/**
	 * Gets the email confirm.
	 *
	 * @return the email confirm
	 */
	public JTextField getEmailConfirm()
	{
		return emailConfirmField;
	}

	/**
	 * Gets the website field.
	 *
	 * @return the website field
	 */
	public JTextField getWebsiteField()
	{
		return websiteField;
	}

	/**
	 * Fields are empty.
	 *
	 * @return true, if successful
	 */
	public boolean fieldsAreEmpty()
	{
		return getNameField().getText().equals("") || getStreetField().getText().equals("")
				|| getCityField().getText().equals("") || getEmailField().getText().equals("")
				|| getFirstnameField().getText().equals("") || getZipField().getText().equals("")
				|| getPhoneField().getText().equals("") || getEmailConfirm().getText().equals("");
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		if (cmd.equals("back"))
		{
			this.viewController.showHomePanel();
		} else if (cmd.equals("confirm"))
		{
			if (fieldsAreEmpty())
			{
				JOptionPane.showMessageDialog(null, "All fields with a * are mandatory fields !", "Failure",
						JOptionPane.WARNING_MESSAGE);
			} else if (!getEmailConfirm().getText().equals(getEmailField().getText()))
			{
				JOptionPane.showMessageDialog(null, "The two email address do not match !", "Failure",
						JOptionPane.WARNING_MESSAGE);
			} else if (!EmailValidator.validate(getEmailConfirm().getText())
					|| !EmailValidator.validate(getEmailField().getText()))
			{
				JOptionPane.showMessageDialog(null, "Email address not valid !", "Failure",
						JOptionPane.WARNING_MESSAGE);
			} else
			{
				this.viewController.getUserFacade().editProfile(getNameField().getText(), getFirstnameField().getText(),
						getStreetField().getText(), getZipField().getText(), getCityField().getText(),
						getPhoneField().getText(), getEmailField().getText());

				JOptionPane.showMessageDialog(null, "Your profile has been updated !", "Success",
						JOptionPane.INFORMATION_MESSAGE);
				this.viewController.showProfilePanel();

			}
		}
	}

}
