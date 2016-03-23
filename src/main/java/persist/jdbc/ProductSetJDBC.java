package persist.jdbc;

import java.sql.*;

import bl.core.Product;
import bl.core.ProductSet;

public class ProductSetJDBC extends ProductSet {

	public ProductSetJDBC () 
	{

		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rset = null;

		Product product = null;

		try {
			conn = jdbcconnection.openConnection();

			Statement state = conn.createStatement();

			rset = state.executeQuery("SELECT * FROM Product");


			while(rset.next()){
				product = new Product();
				product.setName(rset.getString("name"));
				product.setReference(rset.getString("reference"));
				product.setPrice(rset.getInt("price"));
				product.setStockQuantity(rset.getInt("stockQuantity"));
				this.AddProduct(product);
			}
		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {

			jdbcconnection.closeConnection();

		}
	}

	public ProductSetJDBC (String productName) 
	{

		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rset = null;

		PreparedStatement pstmt = null;

		Product product = null;

		try {
			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT * FROM Product WHERE name LIKE ?");

			pstmt.setString(1, "%"+ productName + "%");

			rset = pstmt.executeQuery();

			while(rset.next()){
				product = new Product();
				product.setName(rset.getString("name"));
				product.setReference(rset.getString("reference"));
				product.setPrice(rset.getInt("price"));
				product.setStockQuantity(rset.getInt("stockQuantity"));
				this.AddProduct(product);
			}
		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {

			jdbcconnection.closeConnection();

		}
	}

}

