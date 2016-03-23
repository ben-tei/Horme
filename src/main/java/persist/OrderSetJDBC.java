package persist;

import java.sql.*;

import core.Order;
import core.OrderSet;
import core.Trader;
import exceptions.*;

public class OrderSetJDBC extends OrderSet {
	
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
			
			rset = state.executeQuery("SELECT `website`, `date`, `numero` FROM `Order`, `Trader` WHERE `Order`.`idTrader` = `Trader`.`idPerson` AND `numero`='9873567'");
			
			
			while(rset.next()){
				order = new Order();
				order.setDate(rset.getString("date"));
				order.setNumero(rset.getString("numero"));
				order.setTrader(rset.getString("website"));
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




