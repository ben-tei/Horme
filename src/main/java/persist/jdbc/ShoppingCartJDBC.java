package persist.jdbc;

import java.sql.*;

import bl.core.ShoppingCart;
import bl.core.User;

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

}
