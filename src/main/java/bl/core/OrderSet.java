package bl.core;

import java.util.ArrayList;

/**
 * The Class OrderSet.
 */
public abstract class OrderSet {

	/** The tab orders. */
	private ArrayList<Order> tabOrders;

	/**
	 * Instantiates a new order set.
	 */
	public OrderSet() {
		this.tabOrders = new ArrayList<Order>();
	}

	/**
	 * Adds the order.
	 *
	 * @param order
	 *            the order
	 */
	public void addOrder(Order order) {
		this.tabOrders.add(order);
	}

	public ArrayList<Order> getTabOrders() {
		return tabOrders;
	}

	public void setTabOrders(ArrayList<Order> tabOrders) {
		this.tabOrders = tabOrders;
	}

	/**
	 * Gets the order by index.
	 *
	 * @param index
	 *            the index
	 * @return the order by index
	 */
	public Order getOrderByIndex(int index) {
		return this.tabOrders.get(index);
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size() {
		return this.tabOrders.size();
	}

	public boolean isEmpty() {
		return this.tabOrders.size() == 0;
	}

}