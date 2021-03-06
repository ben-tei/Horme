package ui;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import bl.core.User;

import javax.swing.JButton;

/**
 * The Class LoginView.
 */
public class LoginView extends JPanel implements ActionListener
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The password field. */
	private JPasswordField passwordField;

	/** The login field. */
	private JTextField loginField;

	/** The label connexion. */
	private JLabel lblConnexion;

	/** The label login. */
	private JLabel lblLogin;

	/** The label password. */
	private JLabel lblPassword;

	/** The button login. */
	private JButton btnLogin;

	/** The button sign up. */
	private JButton btnSignUp;

	/** The view controller. */
	private ViewController viewController;

	/**
	 * Instantiates a new login view.
	 *
	 * @param vc the ViewController
	 */
	public LoginView(ViewController vc)
	{
		this.viewController = vc;

		this.setLayout(null);

		this.lblConnexion = new JLabel("Connection");
		lblConnexion.setBounds(410, 11, 100, 25);
		this.lblConnexion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.add(lblConnexion);

		this.lblLogin = new JLabel("Login");
		lblLogin.setBounds(290, 150, 39, 20);
		this.lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblLogin);

		this.lblPassword = new JLabel("Password");
		lblPassword.setBounds(290, 212, 67, 20);
		this.lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblPassword);

		this.passwordField = new JPasswordField();
		passwordField.setBounds(418, 212, 155, 20);
		this.passwordField.addActionListener(this);
		this.passwordField.setActionCommand("login");
		this.add(passwordField);

		this.loginField = new JTextField();
		loginField.setBounds(418, 150, 155, 20);
		this.loginField.addActionListener(this);
		this.loginField.setActionCommand("login");
		this.add(loginField);

		this.btnLogin = new JButton("Login");
		btnLogin.setBounds(290, 285, 67, 23);
		this.btnLogin.addActionListener(this);
		this.btnLogin.setActionCommand("login");
		this.btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(btnLogin);

		this.btnSignUp = new JButton("Sign up");
		btnSignUp.setBounds(494, 285, 79, 23);
		this.btnSignUp.addActionListener(this);
		this.btnSignUp.setActionCommand("signup");
		this.btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(btnSignUp);

		JLabel forgotPswd = new JLabel("Forgot your password ?");
		forgotPswd.setBounds(290, 380, 200, 20);
		forgotPswd.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(forgotPswd);
		forgotPswd.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				viewController.showForgotPasswordPanel();
			}

		});

	}

	/**
	 * Gets the login field.
	 *
	 * @return the login field
	 */
	public JTextField getLoginField()
	{
		return this.loginField;
	}

	/**
	 * Gets the password field.
	 *
	 * @return the password field
	 */
	public JPasswordField getPasswordField()
	{
		return this.passwordField;
	}

	/**
	 * Gets the button login.
	 *
	 * @return the button login
	 */
	public JButton getBtnLogin()
	{
		return this.btnLogin;
	}

	/**
	 * Gets the login text.
	 *
	 * @return the login text
	 */
	public String getLoginText()
	{
		return this.loginField.getText();
	}

	/**
	 * Gets the passwd text.
	 *
	 * @return the passwd text
	 */
	public String getPasswdText()
	{
		return new String(this.passwordField.getPassword());
	}

	public void actionPerformed(ActionEvent e)
	{
		String cmd = e.getActionCommand();
		if (cmd.equals("login"))
		{
			if ((!getLoginText().equals("")) && (!getPasswdText().equals("")))
			{
				try
				{
					User u = this.viewController.getUserFacade().login(getLoginText(), getPasswdText());
					u.setShoppingCart(this.viewController.getShopCartFacade().getShopCart(u));

					JOptionPane.showMessageDialog(null, "Welcome on Horme, " + this.getLoginText() + " !", "Success",
							JOptionPane.INFORMATION_MESSAGE);
					this.viewController.showHomePanel();
				} catch (WrongLoginException | WrongPasswordException e1)
				{
					// TODO Auto-generated catch block
					// e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage(), "Failure", JOptionPane.WARNING_MESSAGE);
				}
			}
		} else if (cmd.equals("signup"))
		{
			this.viewController.showSignUpPanel();
		}

	}

}
