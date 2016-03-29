package persist.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bl.core.Activity;
import bl.core.Objective;
import exceptions.AlreadyExistsException;

public class ObjectiveJDBC extends Objective {

	public ObjectiveJDBC() {
		// TODO Auto-generated constructor stub
		super();
	}

	public ObjectiveJDBC(String name, String description, String deadline, Activity activity) throws AlreadyExistsException {
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		PreparedStatement pstmt2 = null;

		ResultSet rset = null;

		try {

			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT * FROM Objective WHERE name = ? AND idActivity = ?");

			pstmt.setString(1, name);
			pstmt.setString(2, activity.getId());

			rset = pstmt.executeQuery();

			if (!rset.next())
			{
				pstmt2 = conn.prepareStatement("INSERT INTO Objective (name, description, deadline, idActivity) "
						+ "VALUES (?, ?, ?, ?)");

				pstmt2.setString(1, name);
				pstmt2.setString(2, description);
				pstmt2.setString(3, deadline);
				pstmt2.setString(4, activity.getId());

				pstmt2.executeUpdate();

			}
			else
			{
				throw new AlreadyExistsException("Objective already exists !");
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
	public void remove(String idObjective) {
		// TODO Auto-generated method stub
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		try {

			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("DELETE FROM Objective WHERE idObjective = ?");

			pstmt.setString(1, idObjective);

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
