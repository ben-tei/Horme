package persist.jdbc;

import java.sql.*;

import bl.core.OrderSet;
import bl.core.User;

/**
 * The Class OrderSetJDBC.
 */
public class OrderSetJDBC extends OrderSet
{

	/**
	 * Instantiates a new order set jdbc.
	 *
	 * @param user
	 *            the user
	 */
	public OrderSetJDBC(User user)
	{

		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rset = null;

		PreparedStatement pstmt = null;

		OrderJDBC order = null;

		try
		{
			conn = jdbcconnection.openConnection();

			pstmt = conn.prepareStatement("SELECT `date`, `number` FROM `Order` WHERE `Order`.`idPerson`= ?");

			pstmt.setString(1, user.getId());

			rset = pstmt.executeQuery();

			while (rset.next())
			{

				order = new OrderJDBC();
				order.setDate(rset.getString("date"));
				order.setNumero(rset.getString("number"));
				this.addOrder(order);
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
