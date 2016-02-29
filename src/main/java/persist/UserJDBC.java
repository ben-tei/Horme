package persist;

import java.sql.*;

import bl.User;

public class UserJDBC extends User
{

	private JDBCConnection jdbcconnection;

	public UserJDBC()
	{
		jdbcconnection = new JDBCConnection();
	}

	public void setUserJDBC(String login, String password)
	{
		Connection conn = null;

		PreparedStatement pstmt = null;

		ResultSet rset = null;

		try {

			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT * FROM user WHERE username=? and password=?");

			pstmt.setString(1, login);
			pstmt.setString(2, password);

			rset = pstmt.executeQuery();

			if (rset.next())
			{
				this.setLogin(rset.getString("username"));
				this.setPassword(rset.getString("password"));
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