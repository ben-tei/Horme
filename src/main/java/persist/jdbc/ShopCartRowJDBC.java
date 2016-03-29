package persist.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bl.core.Product;
import bl.core.ShopCartRow;
import bl.core.ShoppingCart;

public class ShopCartRowJDBC extends ShopCartRow {

	public ShopCartRowJDBC() {
		// TODO Auto-generated constructor stub
		super();
	}

	public ShopCartRowJDBC(Product p, ShoppingCart shopCart, int quantity) {
		// TODO Auto-generated constructor stub
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		PreparedStatement pstmt2 = null;

		ResultSet rset = null;

		try {

			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement(
					"SELECT * FROM ConstituteShoppingCart WHERE idShoppingCart = ? AND idProduct = ?");

			pstmt.setString(1, shopCart.getId());
			pstmt.setString(2, p.getId());

			rset = pstmt.executeQuery();

			if (!rset.next()) {
				pstmt2 = conn.prepareStatement("INSERT INTO ConstituteShoppingCart VALUES (?, ?, ?, ?)");

				pstmt2.setString(1, Integer.toString(quantity));
				pstmt2.setString(2, Integer.toString(p.getPrice()));
				pstmt2.setString(3, shopCart.getId());
				pstmt2.setString(4, p.getId());

				pstmt2.executeUpdate();

			} else {

				pstmt2 = conn.prepareStatement(
						"UPDATE ConstituteShoppingCart SET quantity = quantity + ?, price = ? WHERE idShoppingCart = ? AND idProduct = ?");

				pstmt2.setString(1, Integer.toString(quantity));
				pstmt2.setString(2, Integer.toString(p.getPrice()));
				pstmt2.setString(3, shopCart.getId());
				pstmt2.setString(4, p.getId());

				pstmt2.executeUpdate();
			}

			this.setIdProduct(p.getId());
			this.setIdShoppingCart(shopCart.getId());
			this.setName(p.getName());
			this.setPrice(p.getPrice());
			this.setQuantity(quantity);
		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {

			jdbcconnection.close(pstmt);

			jdbcconnection.close(pstmt2);

			jdbcconnection.closeConnection();

		}
	}

	@Override
	public void save() {
		// TODO Auto-generated method stub
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		try {

			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement(
					"UPDATE ConstituteShoppingCart SET quantity = ?, price = ? WHERE idShoppingCart = ? AND idProduct = ?");

			pstmt.setString(1, Integer.toString(this.getQuantity()));
			pstmt.setString(2, Integer.toString(this.getPrice()));
			pstmt.setString(3, this.getIdShoppingCart());
			pstmt.setString(4, this.getIdProduct());

			pstmt.executeUpdate();

		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {

			jdbcconnection.close(pstmt);

			jdbcconnection.closeConnection();

		}
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		PreparedStatement pstmt = null;

		try {

			conn = jdbcconnection.openConnection();

			pstmt = conn
					.prepareStatement("DELETE FROM ConstituteShoppingCart WHERE idShoppingCart = ? AND idProduct = ?");

			pstmt.setString(1, this.getIdShoppingCart());
			pstmt.setString(2, this.getIdProduct());

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
