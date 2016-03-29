package persist.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bl.core.ActivityCategorySet;
import bl.core.Category;

public class ActivityCategorySetJDBC extends ActivityCategorySet {

	public ActivityCategorySetJDBC() {
		// TODO Auto-generated constructor stub
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rset = null;

		PreparedStatement pstmt = null;

		Category category = new CategoryJDBC();

		try {
			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT * FROM Category");

			rset = pstmt.executeQuery();

			while (rset.next()) {
				category = new CategoryJDBC();
				category.setId(rset.getString("idCategory"));
				category.setName(rset.getString("name"));
				category.setLongDescription(rset.getString("longDescription"));
				category.setShortDescription(rset.getString("shortDescription"));
				this.addCategory(category);
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
