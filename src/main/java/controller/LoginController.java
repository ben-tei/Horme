package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import core.User;
import dao.DAOUser;
import view.LoginView;

public class LoginController
{
	private LoginView loginView;

	private String loginText, passwdText;

	public LoginController( )
	{

	} 

	public void initLoginPanel()
	{
		this.loginView.getBtnLogin().addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				loginText = loginView.getLoginText();
				passwdText = loginView.getPasswdText();

				DAOUser userDAO = new DAOUser();

				User user = userDAO.getUser(loginText, passwdText);

				if(user != null && user.isPasswordOK(passwdText))
				{
					JOptionPane.showMessageDialog(loginView, "Welcome on Horme, " + loginText + " !", "Success", JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{
					JOptionPane.showMessageDialog(loginView, "Wrong login and/or password", "Success", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		});
	}

	public void setView( LoginView loginView )
	{
		this.loginView = loginView;
		this.initLoginPanel();
	}

}
