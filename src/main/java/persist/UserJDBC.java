package persist;

import java.sql.*;

import bl.User;

import exceptions.WrongLoginException;

public class UserJDBC extends User
{

	public UserJDBC(String login, String password)
	{
		super(login, password);
	}

	public static User findUser(String login, String password) throws WrongLoginException
	{
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		ResultSet rset = null;

		UserJDBC userjdbc = null;

		try {

			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT * FROM user WHERE username=? AND password=?");

			pstmt.setString(1, login);
			pstmt.setString(2, password);

			rset = pstmt.executeQuery();

			if (rset.next())
			{
				userjdbc = new UserJDBC(rset.getString("username"), rset.getString("password"));
			}
			else
			{
				throw new WrongLoginException("Wrong login/password");
			}
		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {

			jdbcconnection.close(pstmt);

			jdbcconnection.closeConnection();

		}

		return userjdbc;
	}

}