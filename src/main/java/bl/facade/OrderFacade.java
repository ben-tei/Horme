package bl.facade;

import bl.core.OrderSet;
import bl.core.User;
import bl.manager.OrderManager;

/**
 * The Class OrderFacade.
 */
public class OrderFacade {

	/** The order manager. */
	private OrderManager orderManager;

	/**
	 * Instantiates a new order facade.
	 */
	public OrderFacade ()
	{
		this.orderManager = new OrderManager();
	}

	/**
	 * Read orders.
	 *
	 * @return the order set
	 */
	public OrderSet readOrders(User user)
	{
		return this.orderManager.readOrders(user);
	}

}
