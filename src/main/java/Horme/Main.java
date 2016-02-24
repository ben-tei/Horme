package Horme;

import UI.LoginView;
import jdbc.MySQLAccess;

public class Main {

	public static void main(String[] args) {

		LoginView lv = new LoginView();
		MySQLAccess mysql = new MySQLAccess();
		mysql.openConnection();
	}

}
