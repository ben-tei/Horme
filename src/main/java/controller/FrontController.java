package controller;

import view.LoginView;

public class FrontController {

	public static void main(String[] args) {

		LoginController loginController = new LoginController();

		LoginView loginView = new LoginView(loginController);

		loginController.setView(loginView); 

		loginView.setVisible(true);

	}

}
