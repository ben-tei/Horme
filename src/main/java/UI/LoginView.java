package ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import core.PersonFacade;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;

public class LoginView extends JFrame implements ActionListener
{

	private JPanel container = new JPanel();
	private int height = 600;
	private int width = 800;
	private JPasswordField passwordField;
	private JTextField loginField;
	private PersonFacade personFacade;

	public LoginView()
	{
		this.personFacade = new PersonFacade("user");
		// Definit un titre pour notre fenetre
		this.setTitle("Login - Horme");

		this.setSize(width, height);
		// Nous demandons maintenant a notre objet de se positionner au centre
		this.setLocationRelativeTo(null);
		// Termine le processus lorsqu on clique sur la croix rouge
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);

		// On previent notre JFrame que notre JPanel sera son content pane
		this.setContentPane(container);
		SpringLayout sl_container = new SpringLayout();
		container.setLayout(sl_container);

		JLabel lblConnexion = new JLabel("Connexion");
		sl_container.putConstraint(SpringLayout.NORTH, lblConnexion, 10, SpringLayout.NORTH, container);
		sl_container.putConstraint(SpringLayout.WEST, lblConnexion, 345, SpringLayout.WEST, container);
		lblConnexion.setFont(new Font("Tahoma", Font.PLAIN, 20));
		container.add(lblConnexion);

		JLabel lblLogin = new JLabel("Login");
		sl_container.putConstraint(SpringLayout.NORTH, lblLogin, 103, SpringLayout.SOUTH, lblConnexion);
		sl_container.putConstraint(SpringLayout.WEST, lblLogin, 139, SpringLayout.WEST, container);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		container.add(lblLogin);

		JLabel lblPassword = new JLabel("Password");
		sl_container.putConstraint(SpringLayout.NORTH, lblPassword, 167, SpringLayout.SOUTH, lblConnexion);
		sl_container.putConstraint(SpringLayout.WEST, lblPassword, 139, SpringLayout.WEST, container);
		sl_container.putConstraint(SpringLayout.SOUTH, lblLogin, -44, SpringLayout.NORTH, lblPassword);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 16));
		container.add(lblPassword);

		passwordField = new JPasswordField();
		sl_container.putConstraint(SpringLayout.NORTH, passwordField, 167, SpringLayout.SOUTH, lblConnexion);
		sl_container.putConstraint(SpringLayout.WEST, passwordField, 27, SpringLayout.EAST, lblPassword);
		sl_container.putConstraint(SpringLayout.SOUTH, passwordField, 0, SpringLayout.SOUTH, lblPassword);
		sl_container.putConstraint(SpringLayout.EAST, passwordField, -363, SpringLayout.EAST, container);
		container.add(passwordField);

		loginField = new JTextField();
		sl_container.putConstraint(SpringLayout.NORTH, loginField, 2, SpringLayout.NORTH, lblLogin);
		sl_container.putConstraint(SpringLayout.WEST, loginField, 55, SpringLayout.EAST, lblLogin);
		sl_container.putConstraint(SpringLayout.EAST, loginField, -363, SpringLayout.EAST, container);
		container.add(loginField);

		JButton btnLogin = new JButton("Login");
		sl_container.putConstraint(SpringLayout.NORTH, btnLogin, 51, SpringLayout.SOUTH, lblPassword);
		sl_container.putConstraint(SpringLayout.WEST, btnLogin, 0, SpringLayout.WEST, lblLogin);
		btnLogin.addActionListener(this);
		btnLogin.setActionCommand("login");
		container.add(btnLogin);

		JButton btnBack = new JButton("Back");
		sl_container.putConstraint(SpringLayout.NORTH, btnBack, 0, SpringLayout.NORTH, btnLogin);
		sl_container.putConstraint(SpringLayout.EAST, btnBack, 0, SpringLayout.EAST, passwordField);
		btnBack.addActionListener(this);
		btnBack.setActionCommand("back");
		container.add(btnBack);

		// Et enfin, la rendre visible 
		this.setVisible(true);
	}

	public String getLoginText()
	{
		return this.loginField.getText(); 
	}

	public String getPasswdText()
	{
		return new String( this.passwordField.getPassword() );
	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		String cmd = arg0.getActionCommand();
		if(cmd.equals("login"))
		{
			if((!this.getLoginText().equals("")) && (!this.getPasswdText().equals("")))
			{
				if (this.personFacade.login(this.getLoginText(), this.getPasswdText()) == null)
				{
					JOptionPane.showMessageDialog(null, "Wrong login and/or password", "Failure", JOptionPane.ERROR_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Welcome on Horme, " + this.getLoginText() + " !", "Success", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}		
	}
}
