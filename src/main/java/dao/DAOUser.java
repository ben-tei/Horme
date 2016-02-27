package dao;

import java.sql.*;

import core.User;

public class DAOUser extends DAOConnection
{

	public User getUser(String login, String password)
	{
		Connection conn = null;

		PreparedStatement pstmt = null;

		ResultSet rset = null;

		User user = null;

		try {

			conn = openConnection();

			pstmt= conn.prepareStatement("SELECT * FROM person WHERE username=? AND password=?");

			pstmt.setString(1, login);
			pstmt.setString(2, password);

			rset = pstmt.executeQuery();

			if (rset.next())
			{
				user = new User();
				user.setLogin(rset.getString("username"));	// getString(1)
				user.setPassword(rset.getString("password"));
			}
		}

		catch (SQLException e) {

			ProcessSQLException(e);

		} finally {

			close(pstmt);

			closeConnection();

		}

		return user;
	}

}