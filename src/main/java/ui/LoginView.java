package ui;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import bl.UserFacade;
import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginView extends JPanel implements ActionListener
{

	private static final long serialVersionUID = 1L;
	private JPasswordField passwordField;
	private JTextField loginField;
	private JLabel lblConnexion;
	private JLabel lblLogin;
	private JLabel lblPassword;
	private JButton btnLogin;
	private JButton btnSignUp;
	private SpringLayout sl_container;
	private UserFacade userFacade;
	private ViewController viewController;

	public LoginView(ViewController vc)
	{
		this.userFacade = new UserFacade();

		this.viewController = vc;

		this.sl_container = new SpringLayout();
		this.setLayout(sl_container);

		this.lblConnexion = new JLabel("Connexion");
		this.sl_container.putConstraint(SpringLayout.NORTH, lblConnexion, 10, SpringLayout.NORTH, this);
		this.sl_container.putConstraint(SpringLayout.WEST, lblConnexion, 363, SpringLayout.WEST, this);
		this.lblConnexion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.add(lblConnexion);

		this.lblLogin = new JLabel("Login");
		this.sl_container.putConstraint(SpringLayout.NORTH, lblLogin, 103, SpringLayout.SOUTH, lblConnexion);
		this.sl_container.putConstraint(SpringLayout.EAST, lblLogin, -526, SpringLayout.EAST, this);
		this.lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblLogin);

		this.lblPassword = new JLabel("Password");
		this.sl_container.putConstraint(SpringLayout.NORTH, lblPassword, 167, SpringLayout.SOUTH, lblConnexion);
		this.sl_container.putConstraint(SpringLayout.EAST, lblPassword, -498, SpringLayout.EAST, this);
		this.sl_container.putConstraint(SpringLayout.SOUTH, lblLogin, -44, SpringLayout.NORTH, lblPassword);
		this.lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblPassword);

		this.passwordField = new JPasswordField();
		this.sl_container.putConstraint(SpringLayout.NORTH, passwordField, 167, SpringLayout.SOUTH, lblConnexion);
		this.sl_container.putConstraint(SpringLayout.WEST, passwordField, 33, SpringLayout.EAST, lblPassword);
		this.sl_container.putConstraint(SpringLayout.SOUTH, passwordField, 0, SpringLayout.SOUTH, lblPassword);
		this.sl_container.putConstraint(SpringLayout.EAST, passwordField, -273, SpringLayout.EAST, this);
		this.add(passwordField);

		this.loginField = new JTextField();
		this.sl_container.putConstraint(SpringLayout.NORTH, loginField, 2, SpringLayout.NORTH, lblLogin);
		this.sl_container.putConstraint(SpringLayout.WEST, loginField, 61, SpringLayout.EAST, lblLogin);
		sl_container.putConstraint(SpringLayout.EAST, loginField, -273, SpringLayout.EAST, this);
		this.add(loginField);

		this.btnLogin = new JButton("Login");
		this.btnLogin.addActionListener(this);
		this.btnLogin.setActionCommand("login");
		this.btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.sl_container.putConstraint(SpringLayout.NORTH, btnLogin, 51, SpringLayout.SOUTH, lblPassword);
		this.sl_container.putConstraint(SpringLayout.WEST, btnLogin, 0, SpringLayout.WEST, lblLogin);
		this.add(btnLogin);

		this.btnSignUp = new JButton("Sign up");
		this.btnSignUp.addActionListener(this);
		this.btnSignUp.setActionCommand("signup");
		this.btnSignUp.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.sl_container.putConstraint(SpringLayout.NORTH, btnSignUp, 0, SpringLayout.NORTH, btnLogin);
		this.sl_container.putConstraint(SpringLayout.EAST, btnSignUp, 2, SpringLayout.EAST, passwordField);
		this.add(btnSignUp);

		this.getLoginField().requestFocusInWindow();

	}

	public JTextField getLoginField()
	{
		return this.loginField;
	}

	public JPasswordField getPasswordField()
	{
		return this.passwordField;
	}

	public JButton getBtnLogin()
	{
		return this.btnLogin;
	}

	public String getLoginText()
	{
		return this.loginField.getText(); 
	}

	public String getPasswdText()
	{
		return new String(this.passwordField.getPassword());
	}

	public void actionPerformed(ActionEvent e)
	{
		String cmd = e.getActionCommand();
		if(cmd.equals("login"))
		{
			if((!getLoginText().equals("")) && (!getPasswdText().equals("")))
			{
				try {
					userFacade.login(getLoginText(), getPasswdText());
					JOptionPane.showMessageDialog(null, "Welcome on Horme, " + this.getLoginText() + " !", "Success", JOptionPane.INFORMATION_MESSAGE);
					this.viewController.doAfterLogin();
				} catch (WrongLoginException | WrongPasswordException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage(), "Failure", JOptionPane.WARNING_MESSAGE);
				}			
			}
		}
		else if(cmd.equals("signup"))
		{
			this.viewController.showSignUp();
		}

	}

}

