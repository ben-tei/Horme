package bl.core;

import java.util.ArrayList;

/**
 * The Class OrderSet.
 */
public abstract class OrderSet
{

	/** The tab orders. */
	private ArrayList<Order> tabOrders;

	/**
	 * Instantiates a new order set.
	 */
	public OrderSet()
	{
		this.tabOrders = new ArrayList<Order>();
	}

	/**
	 * Adds the order.
	 *
	 * @param order
	 *            the order
	 */
	public void addOrder(Order order)
	{
		this.tabOrders.add(order);
	}

	/**
	 * Gets the tab orders.
	 *
	 * @return the tab orders
	 */
	public ArrayList<Order> getTabOrders()
	{
		return tabOrders;
	}

	/**
	 * Sets the tab orders.
	 *
	 * @param tabOrders
	 *            the new tab orders
	 */
	public void setTabOrders(ArrayList<Order> tabOrders)
	{
		this.tabOrders = tabOrders;
	}

	/**
	 * Gets the order by index.
	 *
	 * @param index
	 *            the index
	 * @return the order by index
	 */
	public Order getOrderByIndex(int index)
	{
		return this.tabOrders.get(index);
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size()
	{
		return this.tabOrders.size();
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty()
	{
		return this.tabOrders.size() == 0;
	}

}