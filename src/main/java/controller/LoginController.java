package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.security.NoSuchAlgorithmException;

import javax.swing.JOptionPane;

import core.User;
import dao.DAOUser;
import util.HashText;
import view.LoginView;

public class LoginController
{
	private LoginView loginView;

	private String loginText, passwdText;

	public LoginController()
	{

	} 

	public void initLoginPanel()
	{
		this.loginView.getBtnLogin().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				loginText = loginView.getLoginText();
				passwdText = loginView.getPasswdText();
				
				try {
					passwdText = HashText.sha1(passwdText);
				} catch (NoSuchAlgorithmException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				DAOUser userDAO = new DAOUser();

				User user = userDAO.getUser(loginText, passwdText);

				if(user != null)
				{
					JOptionPane.showMessageDialog(loginView, "Welcome on Horme, " + loginText + " !", "Success", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(loginView, "Wrong login and/or password", "Failure", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
	}

	public void setView(LoginView loginView)
	{
		this.loginView = loginView;
		this.initLoginPanel();
	}

}
