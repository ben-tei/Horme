package persist.jdbc;

import java.sql.*;

import bl.core.ShopCartRowSet;
import bl.core.User;

/**
 * The Class ShopCartRowSetJDBC.
 */
public class ShopCartRowSetJDBC extends ShopCartRowSet {


	/**
	 * Instantiates a new shop cart row set jdbc.
	 *
	 * @param user the user
	 */
	public ShopCartRowSetJDBC (User user) 
	{

		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rset = null;

		PreparedStatement pstmt = null;

		ShopCartRowJDBC rowCart = null;

		try {
			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT ConstituteShoppingCart.idProduct, ConstituteShoppingCart.idShoppingCart, quantity, ConstituteShoppingCart.price, "
					+ "Product.name FROM Product, ConstituteShoppingCart, ShoppingCart WHERE Product.idProduct = ConstituteShoppingCart.idProduct "
					+ "AND ShoppingCart.idPerson = ? AND ShoppingCart.idShoppingCart = ConstituteShoppingCart.idShoppingCart");

			pstmt.setString(1, user.getId());

			rset = pstmt.executeQuery();

			while(rset.next()) {
				rowCart = new ShopCartRowJDBC();
				rowCart.setIdProduct(rset.getString("idProduct"));
				rowCart.setIdShoppingCart(rset.getString("idShoppingCart"));
				rowCart.setName(rset.getString("name"));
				rowCart.setPrice(rset.getInt("price"));
				rowCart.setQuantity(rset.getInt("quantity"));
				this.addShopCartRow(rowCart);
			}
		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {

			jdbcconnection.closeConnection();

		}
	}

}
