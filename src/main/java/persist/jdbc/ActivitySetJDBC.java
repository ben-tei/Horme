package persist.jdbc;

import java.sql.*;

import bl.core.ActivitySet;
import bl.core.User;

/**
 * The Class ActivitySetJDBC.
 */
public class ActivitySetJDBC extends ActivitySet  {

	/**
	 * Instantiates a new activity set jdbc.
	 *
	 * @param user the user
	 */
	public ActivitySetJDBC(User user) 
	{

		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rsetActivity= null;

		PreparedStatement pstmt = null;

		ActivityJDBC activity = null;

		CategoryJDBC category;

		try{
			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT a.name, a.description, c.name FROM Activity a, Category c WHERE a.idCategory = c.idCategory"
					+ " AND a.idUser = ?");

			pstmt.setString(1, user.getId());

			rsetActivity = pstmt.executeQuery();

			while(rsetActivity.next()) {
				activity = new ActivityJDBC();
				category = new CategoryJDBC();
				activity.setName(rsetActivity.getString("a.name"));
				category.setName(rsetActivity.getString("c.name"));
				activity.setCategory(category);
				activity.setDescription(rsetActivity.getString("a.description"));
				this.AddActivity(activity);
			}
		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {


			jdbcconnection.closeConnection();

		}
	}
}
