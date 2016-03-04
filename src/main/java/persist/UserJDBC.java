package persist;

import java.sql.*;

import bl.User;

import exceptions.WrongLoginException;

public class UserJDBC extends User
{

	public UserJDBC(String login) throws WrongLoginException
	{
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		ResultSet rset = null;

		try {

			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT * FROM Person WHERE login=?");

			pstmt.setString(1, login);

			rset = pstmt.executeQuery();

			if (rset.next())
			{
				this.setLogin(rset.getString("login"));
				this.setPassword(rset.getString("password"));
			}
			else
			{
				throw new WrongLoginException("Wrong login !");
			}
		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {

			jdbcconnection.close(pstmt);

			jdbcconnection.closeConnection();

		}
	}

}