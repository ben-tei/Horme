package persist.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bl.core.Activity;
import bl.core.Category;
import bl.core.User;
import exceptions.AlreadyExistsException;

/**
 * The Class ActivityJDBC.
 */
public class ActivityJDBC extends Activity
{

	/**
	 * Instantiates a new activity jdbc.
	 */
	public ActivityJDBC()
	{
		super();
	}

	/**
	 * Instantiates a new activity jdbc.
	 *
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param category
	 *            the category
	 * @param user
	 *            the user
	 * @throws AlreadyExistsException
	 *             the already exists exception
	 */
	public ActivityJDBC(String name, String description, Category category, User user) throws AlreadyExistsException
	{
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		PreparedStatement pstmt2 = null;

		ResultSet rset = null;

		try
		{

			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT * FROM Activity WHERE name=?");

			pstmt.setString(1, name);

			rset = pstmt.executeQuery();

			if (!rset.next())
			{
				pstmt2 = conn.prepareStatement(
						"INSERT INTO Activity (name, description, idCategory, idUser) " + "VALUES (?, ?, ?, ?)");

				pstmt2.setString(1, name);
				pstmt2.setString(2, description);
				pstmt2.setString(3, category.getId());
				pstmt2.setString(4, user.getId());

				pstmt2.executeUpdate();

			} else
			{
				throw new AlreadyExistsException("Activity already exists !");
			}
		}

		catch (SQLException e)
		{

			JDBCConnection.ProcessSQLException(e);

		} finally
		{

			jdbcconnection.close(pstmt);

			jdbcconnection.close(pstmt2);

			jdbcconnection.closeConnection();

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see bl.core.Activity#remove()
	 */
	@Override
	public void remove()
	{
		// TODO Auto-generated method stub
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		PreparedStatement pstmt2 = null;

		try
		{

			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("DELETE FROM Objective WHERE idActivity = ?");

			pstmt.setString(1, this.getId());

			pstmt.executeUpdate();

			pstmt2 = conn.prepareStatement("DELETE FROM Activity WHERE idActivity = ?");

			pstmt2.setString(1, this.getId());

			pstmt2.executeUpdate();

		}

		catch (SQLException e)
		{

			JDBCConnection.ProcessSQLException(e);

		} finally
		{

			jdbcconnection.close(pstmt);

			jdbcconnection.close(pstmt2);

			jdbcconnection.closeConnection();

		}
	}

}