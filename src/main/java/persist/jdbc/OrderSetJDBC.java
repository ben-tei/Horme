package persist.jdbc;

import java.sql.*;

import bl.core.Order;
import bl.core.OrderSet;
import bl.core.Trader;

/**
 * The Class OrderSetJDBC.
 */
public class OrderSetJDBC extends OrderSet {

	/**
	 * Instantiates a new order set jdbc.
	 */
	public OrderSetJDBC () 
	{

		JDBCConnection jdbcconnection = new JDBCConnection();

		Connection conn = null;

		ResultSet rset = null;

		Order order = null;

		Trader trader = null;

		try{
			conn = jdbcconnection.openConnection();

			Statement state = conn.createStatement();

			rset = state.executeQuery("SELECT `idPerson`, `website`, `date`, `numero` FROM `Order`, `Trader` WHERE `Order`.`idTrader` = `Trader`.`idPerson` AND `numero`='9873567'");


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




