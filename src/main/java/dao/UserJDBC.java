package dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import core.User;

public class UserJDBC
{

	private MySQLAccess dbconnect = null;

	public UserJDBC()
	{
		this.dbconnect = new MySQLAccess();
	}

	public User login(String log, String pswd)
	{
		this.dbconnect.openConnection();
		ResultSet rs = null;
		User user = null;

		try {
			String query = "SELECT username, password FROM person WHERE username ='" + log + "' AND password ='" + pswd + "'";
			this.dbconnect.executeRequest(query);
			while ((rs = this.dbconnect.fetchArray()) != null) {
				user = new User();
				user.setLogin(rs.getString("username"));
				user.setPassword(rs.getString("password"));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		this.dbconnect.close();
		
		return user;
	}

}
