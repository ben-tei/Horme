package persist;

import java.sql.*;

import bl.User;
import core.Product;
import core.ShopCartRow;
import core.ShopCartRowSet;
import exceptions.*;

public class ShopCartRowSetJDBC extends ShopCartRowSet {
	
	
	public ShopCartRowSetJDBC (User user) 
	{
		
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rset = null;
		
		PreparedStatement pstmt = null;
		
		Product product = null;
		
		try {
			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT * FROM Product"); // where idUser = ? ; pstmt.setString(1, user.getId());

			//pstmt.setString(1, user.getId());

			rset = pstmt.executeQuery();
			
			while(rset.next()) {
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
