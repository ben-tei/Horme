package persist.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bl.core.Product;

public class ProductJDBC extends Product {

	@Override
	public void save() {
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		try {

			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement(
					"UPDATE Product SET stockQuantity = ?, price = ?, reference = ?, name = ? WHERE idProduct = ?");

			pstmt.setString(1, Integer.toString(this.getStockQuantity()));
			pstmt.setString(2, Integer.toString(this.getPrice()));
			pstmt.setString(3, this.getReference());
			pstmt.setString(4, this.getName());
			pstmt.setString(5, this.getId());

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
