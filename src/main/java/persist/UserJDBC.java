package persist;

import java.sql.ResultSet;
import java.sql.SQLException;

import core.Person;

public class UserJDBC extends Person
{

	private MySQLAccess dbconnect = null;

	public UserJDBC()
	{
		this.dbconnect = new MySQLAccess();
	}

	@Override
	public void setPerson(String log, String pswd)
	{
		this.dbconnect.openConnection();
		ResultSet rs = null;

		try {
			String query = "SELECT username, password FROM person WHERE username ='" + log + "' AND password ='" + pswd + "'";
			this.dbconnect.executeRequest(query);
			while ((rs = this.dbconnect.fetchArray()) != null) {
				this.setLogin(rs.getString("username"));
				this.setPassword(rs.getString("password"));
			}
			if(this.dbconnect.count() == 0)
			{
				this.setLogin(null);
				this.setPassword(null);
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		this.dbconnect.close();
	}

}
