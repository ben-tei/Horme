package persist.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bl.core.ObjectiveSet;
import bl.core.User;

public class ObjectiveSetJDBC extends ObjectiveSet {

	public ObjectiveSetJDBC(User user) 
	{

		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rsetActivity= null;

		PreparedStatement pstmt = null;

		ObjectiveJDBC objectiveJDBC = null;

		ActivityJDBC activityJDBC;

		try {
			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT o.idObjective, o.name, o.description, o.deadline, a.name, a.idActivity FROM Activity a, Objective o WHERE a.idCategory = c.idCategory"
					+ " AND a.idUser = ?");

			pstmt.setString(1, user.getId());

			rsetActivity = pstmt.executeQuery();

			while(rsetActivity.next()) {
				objectiveJDBC = new ObjectiveJDBC();
				activityJDBC = new ActivityJDBC();
				objectiveJDBC.setId(rsetActivity.getString("a.idActivity"));
				objectiveJDBC.setName(rsetActivity.getString("a.name"));
				activityJDBC.setName(rsetActivity.getString("c.name"));
				objectiveJDBC.setActivity(activityJDBC);
				objectiveJDBC.setDescription(rsetActivity.getString("a.description"));
				this.addObjective(objectiveJDBC);
			}
		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {


			jdbcconnection.closeConnection();

		}
	}

}
