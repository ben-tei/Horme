package ui;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

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
	private ViewController viewController;

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
					this.viewController.getUserFacade().login(getLoginText(), getPasswdText());
					JOptionPane.showMessageDialog(null, "Welcome on Horme, " + this.getLoginText() + " !", "Success", JOptionPane.INFORMATION_MESSAGE);
					this.viewController.showIndexPanel();
				} catch (WrongLoginException | WrongPasswordException e1) {
					// TODO Auto-generated catch block
					//e1.printStackTrace();
					JOptionPane.showMessageDialog(null, e1.getMessage(), "Failure", JOptionPane.WARNING_MESSAGE);
				}			
			}
		}
		else if(cmd.equals("signup"))
		{
			this.viewController.showSignUpPanel();
		}

	}

}

