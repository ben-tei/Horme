package bl.manager;

import bl.core.OrderSet;
import bl.core.User;
import bl.factory.Factory;
import persist.factoryjdbc.FactoryJDBC;

/**
 * The Class OrderManager.
 */
public class OrderManager {

	/** The factory. */
	private Factory factory;

	/** The orders. */
	private OrderSet orders;

	/**
	 * Instantiates a new order manager.
	 */
	public OrderManager()
	{
		this.factory = new FactoryJDBC();
	}

	/**
	 * Read orders.
	 *
	 * @return the order set
	 */
	public OrderSet readOrders(User user)
	{
		orders = factory.readOrders(user);
		return orders;
	}
}

