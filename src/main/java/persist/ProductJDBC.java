package persist;

import java.sql.*;

import core.Product;
import exceptions.*;

public class ProductJDBC extends Product {
	
	public ProductJDBC () 
	{
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		ResultSet rset = null;
		
		try{
			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT * FROM Product WHERE idProduct=?");

			pstmt.setInt(1, 1);

			rset = pstmt.executeQuery();
			
			if (rset.next())
			{
				this.setName(rset.getString("name"));
				this.setReference(rset.getString("reference"));
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
