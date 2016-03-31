package persist.jdbc;

import java.sql.*;
import java.text.SimpleDateFormat;

import bl.core.ShopCartRowSet;
import bl.core.ShoppingCart;
import bl.core.User;

import java.util.Calendar;

/**
 * The Class ShopCartRowSetJDBC.
 */
public class ShoppingCartJDBC extends ShoppingCart
{

	/**
	 * Instantiates a new shop cart row set jdbc.
	 *
	 * @param user the user
	 */
	public ShoppingCartJDBC(User user)
	{

		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rset = null;

		PreparedStatement pstmt = null;

		try
		{
			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT * FROM ShoppingCart sc WHERE sc.idPerson = ?");

			pstmt.setString(1, user.getId());

			rset = pstmt.executeQuery();

			while (rset.next())
			{
				this.setUser(user);
				this.setId(rset.getString("idShoppingCart"));
			}
		}

		catch (SQLException e)
		{

			JDBCConnection.ProcessSQLException(e);

		} finally
		{

			jdbcconnection.close(pstmt);
			jdbcconnection.closeConnection();

		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see bl.core.ShoppingCart#placeOrder(bl.core.ShopCartRowSet)
	 */
	public void placeOrder(ShopCartRowSet shopCartRows)
	{

		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rset = null;

		PreparedStatement pstmt = null;

		PreparedStatement pstmt1 = null;

		PreparedStatement pstmt2 = null;

		PreparedStatement pstmt3 = null;

		try
		{
			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT COUNT(*) + 1 AS orderNumber FROM `Order`");

			rset = pstmt.executeQuery();
			rset.next();
			String orderNumber = rset.getString("orderNumber");

			pstmt1 = conn.prepareStatement("INSERT INTO `Order` (date, number, idPerson) " + "VALUES (?, ?, ?)");

			pstmt1.setString(1, new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(Calendar.getInstance().getTime()));
			pstmt1.setString(2, orderNumber);
			pstmt1.setString(3, this.getUser().getId());

			pstmt1.executeUpdate();

			pstmt2 = conn.prepareStatement("SELECT idOrder FROM `Order` WHERE number = ?");
			pstmt2.setString(1, orderNumber);

			rset = pstmt2.executeQuery();

			if (rset.next())
			{
				for (int i = 0; i < shopCartRows.size(); i++)
				{
					pstmt3 = conn.prepareStatement("INSERT INTO ConstituteOrder (idOrder, idProduct, price, quantity) "
							+ "VALUES (?, ?, ?, ?)");

					pstmt3.setString(1, rset.getString("idOrder"));
					pstmt3.setString(2, shopCartRows.getShopCartRowByIndex(i).getIdProduct());
					pstmt3.setString(3, Integer.toString(shopCartRows.getShopCartRowByIndex(i).getPrice()));
					pstmt3.setString(4, Integer.toString(shopCartRows.getShopCartRowByIndex(i).getQuantity()));

					pstmt3.executeUpdate();
				}
			}

		}

		catch (SQLException e)
		{

			JDBCConnection.ProcessSQLException(e);

		} finally
		{

			jdbcconnection.close(pstmt);
			jdbcconnection.close(pstmt1);
			jdbcconnection.close(pstmt2);
			jdbcconnection.close(pstmt3);
			jdbcconnection.closeConnection();

		}

	}

}
