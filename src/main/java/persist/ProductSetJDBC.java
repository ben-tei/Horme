package persist;

import java.sql.*;

import core.Product;
import core.ProductSet;
import exceptions.*;

public class ProductSetJDBC extends ProductSet {
	
	public ProductSetJDBC () 
	{
		
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rset = null;
		
		Product product = null;
		
		try{
			conn = jdbcconnection.openConnection();

			Statement state = conn.createStatement();
			
			rset = state.executeQuery("SELECT * FROM Product");
		
			
			while(rset.next()){
				product = new Product();
				product.setName(rset.getString("name"));
				product.setReference(rset.getString("reference"));
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

