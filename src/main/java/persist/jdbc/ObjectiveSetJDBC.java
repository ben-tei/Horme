package persist.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bl.core.ObjectiveSet;
import bl.core.User;

/**
 * The Class ObjectiveSetJDBC.
 */
public class ObjectiveSetJDBC extends ObjectiveSet
{

	/**
	 * Instantiates a new objective set jdbc.
	 */
	public ObjectiveSetJDBC()
	{
		// TODO Auto-generated constructor stub
		super();
	}

	/**
	 * Instantiates a new objective set jdbc.
	 *
	 * @param user
	 *            the user
	 */
	public ObjectiveSetJDBC(User user)
	{

		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rset = null;

		PreparedStatement pstmt = null;

		ObjectiveJDBC objectiveJDBC = null;

		ActivityJDBC activityJDBC;

		try
		{
			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement(
					"SELECT o.idObjective, o.name, o.description, o.deadline, a.name, a.idActivity FROM Activity a, Objective o WHERE o.idActivity"
							+ " = a.idActivity AND a.idUser = ?");

			pstmt.setString(1, user.getId());

			rset = pstmt.executeQuery();

			while (rset.next())
			{
				objectiveJDBC = new ObjectiveJDBC();
				activityJDBC = new ActivityJDBC();
				objectiveJDBC.setId(rset.getString("o.idObjective"));
				objectiveJDBC.setName(rset.getString("o.name"));
				objectiveJDBC.setDescription(rset.getString("o.description"));
				objectiveJDBC.setDeadline(rset.getString("o.deadline"));
				activityJDBC.setName(rset.getString("a.name"));
				activityJDBC.setId(rset.getString("a.idActivity"));
				objectiveJDBC.setActivity(activityJDBC);
				this.addObjective(objectiveJDBC);
			}
		}

		catch (SQLException e)
		{

			JDBCConnection.ProcessSQLException(e);

		} finally
		{

			jdbcconnection.closeConnection();

		}
	}

}
