package persist.jdbc;

import java.sql.*;

import bl.core.ProductSet;

/**
 * The Class ProductSetJDBC.
 */
public class ProductSetJDBC extends ProductSet
{

	/**
	 * Instantiates a new product set jdbc.
	 */
	public ProductSetJDBC()
	{

		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rset = null;

		ProductJDBC product = null;

		try
		{
			conn = jdbcconnection.openConnection();

			Statement state = conn.createStatement();

			rset = state.executeQuery("SELECT * FROM Product");

			while (rset.next())
			{
				product = new ProductJDBC();
				product.setId(rset.getString("idProduct"));
				product.setName(rset.getString("name"));
				product.setReference(rset.getString("reference"));
				product.setPrice(rset.getInt("price"));
				product.setStockQuantity(rset.getInt("stockQuantity"));
				this.addProduct(product);
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

	/**
	 * Instantiates a new product set jdbc.
	 *
	 * @param searchString the search string
	 */
	public ProductSetJDBC(String searchString)
	{

		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rset = null;

		PreparedStatement pstmt = null;

		ProductJDBC product = null;

		try
		{
			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT * FROM Product WHERE name LIKE ? OR reference LIKE ?");

			pstmt.setString(1, "%" + searchString + "%");
			pstmt.setString(2, "%" + searchString + "%");

			rset = pstmt.executeQuery();

			while (rset.next())
			{
				product = new ProductJDBC();
				product.setId(rset.getString("idProduct"));
				product.setName(rset.getString("name"));
				product.setReference(rset.getString("reference"));
				product.setPrice(rset.getInt("price"));
				product.setStockQuantity(rset.getInt("stockQuantity"));
				this.addProduct(product);
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
