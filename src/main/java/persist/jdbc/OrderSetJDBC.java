package persist.jdbc;

import java.sql.*;

import bl.core.Order;
import bl.core.OrderSet;
import bl.core.Trader;
import bl.core.User;

/**
 * The Class OrderSetJDBC.
 */
public class OrderSetJDBC extends OrderSet {

	/**
	 * Instantiates a new order set jdbc.
	 */
	public OrderSetJDBC (User user) 
	{

		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rset = null;
		
		PreparedStatement pstmt = null;

		Order order = null;

		Trader trader = null;

		try{
			conn = jdbcconnection.openConnection();

			//revoir requete
			pstmt = conn.prepareStatement("SELECT `idPerson`, `website`, `date`, `numero` FROM `Order`, `Trader` WHERE `Order`.`idTrader` = `Trader`.`idPerson`" + "AND `Order`.`idPerson`= ?");
			
			pstmt.setString(1, user.getId());
			
			rset = pstmt.executeQuery();

			while(rset.next()){
				order = new Order();
				order.setDate(rset.getString("date"));
				order.setNumero(rset.getString("numero"));
				trader = new Trader(rset.getString("idPerson"));
				order.setTrader(trader);
				this.AddOrder(order);
			}
		}

		catch (SQLException e) {

			JDBCConnection.ProcessSQLException(e);

		} finally {


			jdbcconnection.closeConnection();

		}
	}
}




