package persist.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bl.core.Activity;
import bl.core.Category;
import bl.core.User;
import exceptions.AlreadyExistsException;


public class ActivityJDBC extends Activity {

	public ActivityJDBC()
	{
		super();
	}

	/**
	 * Instantiates a new activity jdbc.
	 *
	 * @param name the name
	 * @param category the category
	 * @param descritption the description
	 * @throws AlreadyExistsException 
	 */
	public ActivityJDBC(String name, String description, Category category, User user) throws AlreadyExistsException
	{
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		PreparedStatement pstmt2 = null;

		ResultSet rset = null;

		try {

			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT * FROM Activity WHERE name=?");

			pstmt.setString(1, name);

			rset = pstmt.executeQuery();

			if (!rset.next())
			{
				pstmt2 = conn.prepareStatement("INSERT INTO Activity (name, description, idCategory, idUser) "
						+ "VALUES (?, ?, ?, ?)");

				pstmt2.setString(1, name);
				pstmt2.setString(2, description);
				pstmt2.setString(3, category.getId());
				pstmt2.setString(4, user.getId());

				pstmt2.executeUpdate();

			}
			else
			{
				throw new AlreadyExistsException("Activity already exists !");
			}
		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {

			jdbcconnection.close(pstmt);

			jdbcconnection.close(pstmt2);

			jdbcconnection.closeConnection();

		}
	}

	@Override
	public void remove(String idActivity) {
		// TODO Auto-generated method stub
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		try {

			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("DELETE FROM Activity WHERE idActivity = ?");

			pstmt.setString(1, idActivity);

			pstmt.executeUpdate();

		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {

			jdbcconnection.close(pstmt);

			jdbcconnection.closeConnection();

		}
	}

}