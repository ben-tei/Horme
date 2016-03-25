package persist.jdbc;

import java.sql.*;

import bl.core.ShopCartRowSet;
import bl.core.ShoppingCart;
import bl.core.User;
import java.util.Date;
import java.util.UUID;

/**
 * The Class ShopCartRowSetJDBC.
 */
public class ShoppingCartJDBC extends ShoppingCart {


	/**
	 * Instantiates a new shop cart row set jdbc.
	 *
	 * @param user the user
	 */
	public ShoppingCartJDBC (User user) 
	{

		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rset = null;

		PreparedStatement pstmt = null;

		try {
			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT * FROM ShoppingCart sc WHERE sc.idPerson = ?");

			pstmt.setString(1, user.getId());

			rset = pstmt.executeQuery();

			while(rset.next()) {
				this.setUser(user);
				this.setId(rset.getString("idShoppingCart"));
			}
		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {

			jdbcconnection.close(pstmt);
			jdbcconnection.closeConnection();

		}
	}
	
	public void placeOrder(ShopCartRowSet shopCartRows) 
	{
		
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rset = null;
		
		String numeroOrder = UUID.randomUUID().toString();

		PreparedStatement pstmt1 = null;
		
		PreparedStatement pstmt2 = null;
		
		PreparedStatement pstmt3 = null;
		
		Date date = new Date();
		
		try {
			conn = jdbcconnection.openConnection();

			pstmt1 = conn.prepareStatement("INSERT INTO Order (date, numero, idPerson, idTrader) "
					+ "VALUES (?, ?, ?, ?)");
			
			pstmt1.setDate(1, (java.sql.Date)date);
			pstmt1.setString(2, numeroOrder);
			pstmt1.setString(3, this.getUser().getId());
			pstmt1.setString(4, "1");

			pstmt1.executeUpdate();
			
			pstmt2 = conn.prepareStatement("SELECT idOrder FROM Order WHERE numero=?");
			pstmt1.setString(1, "102");
			
			rset = pstmt2.executeQuery();
			
			if (rset.next())
			{
				
			}
			
			pstmt3 = conn.prepareStatement("INSERT INTO ConstituteOrder (idOrder, idProduct, price, quantity) "
					+ "VALUES (?, ?, ?, ?)");

			
		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {

			jdbcconnection.close(pstmt1);
			jdbcconnection.close(pstmt2);
			jdbcconnection.close(pstmt3);
			jdbcconnection.closeConnection();

		}
		
	}

}
