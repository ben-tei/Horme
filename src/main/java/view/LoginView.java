package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import java.awt.Font;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginView extends JFrame
{

	private static final long serialVersionUID = 1L;
	private JPanel container = new JPanel();
	private int height = 600;
	private int width = 800;
	private JPasswordField passwordField;
	private JTextField loginField;
	private JLabel lblConnexion;
	private JLabel lblLogin;
	private JLabel lblPassword;
	private JButton btnLogin;
	private JButton btnBack;
	private SpringLayout sl_container;

	public LoginView()
	{
		this.setTitle("Login - Horme");

		this.setSize(width, height);

		this.setLocationRelativeTo(null);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		this.setContentPane(container);
		this.sl_container = new SpringLayout();
		this.container.setLayout(sl_container);

		this.lblConnexion = new JLabel("Connexion");
		this.sl_container.putConstraint(SpringLayout.NORTH, lblConnexion, 10, SpringLayout.NORTH, container);
		this.sl_container.putConstraint(SpringLayout.WEST, lblConnexion, 345, SpringLayout.WEST, container);
		this.lblConnexion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.container.add(lblConnexion);

		this.lblLogin = new JLabel("Login");
		this.sl_container.putConstraint(SpringLayout.NORTH, lblLogin, 103, SpringLayout.SOUTH, lblConnexion);
		this.sl_container.putConstraint(SpringLayout.WEST, lblLogin, 139, SpringLayout.WEST, container);
		this.lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.container.add(lblLogin);

		this.lblPassword = new JLabel("Password");
		this.sl_container.putConstraint(SpringLayout.NORTH, lblPassword, 167, SpringLayout.SOUTH, lblConnexion);
		this.sl_container.putConstraint(SpringLayout.WEST, lblPassword, 139, SpringLayout.WEST, container);
		this.sl_container.putConstraint(SpringLayout.SOUTH, lblLogin, -44, SpringLayout.NORTH, lblPassword);
		this.lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.container.add(lblPassword);

		this.passwordField = new JPasswordField();
		this.sl_container.putConstraint(SpringLayout.NORTH, passwordField, 167, SpringLayout.SOUTH, lblConnexion);
		this.sl_container.putConstraint(SpringLayout.WEST, passwordField, 27, SpringLayout.EAST, lblPassword);
		this.sl_container.putConstraint(SpringLayout.SOUTH, passwordField, 0, SpringLayout.SOUTH, lblPassword);
		this.sl_container.putConstraint(SpringLayout.EAST, passwordField, -363, SpringLayout.EAST, container);
		this.container.add(passwordField);

		this.loginField = new JTextField();
		this.sl_container.putConstraint(SpringLayout.NORTH, loginField, 2, SpringLayout.NORTH, lblLogin);
		this.sl_container.putConstraint(SpringLayout.WEST, loginField, 55, SpringLayout.EAST, lblLogin);
		this.sl_container.putConstraint(SpringLayout.EAST, loginField, -363, SpringLayout.EAST, container);
		this.container.add(loginField);

		this.btnLogin = new JButton("Login");
		this.sl_container.putConstraint(SpringLayout.NORTH, btnLogin, 51, SpringLayout.SOUTH, lblPassword);
		this.sl_container.putConstraint(SpringLayout.WEST, btnLogin, 0, SpringLayout.WEST, lblLogin);
		this.container.add(btnLogin);

		this.btnBack = new JButton("Back");
		this.sl_container.putConstraint(SpringLayout.NORTH, btnBack, 0, SpringLayout.NORTH, btnLogin);
		this.sl_container.putConstraint(SpringLayout.EAST, btnBack, 0, SpringLayout.EAST, passwordField);
		this.container.add(btnBack);

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
		return new String( this.passwordField.getPassword() );
	}

}
