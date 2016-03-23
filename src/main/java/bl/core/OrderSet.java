package bl.core;

import java.util.ArrayList;

/**
 * The Class OrderSet.
 */
public class OrderSet {
	
	/** The tab orders. */
	public ArrayList<Order> tabOrders;
	
	/**
	 * Instantiates a new order set.
	 */
	public OrderSet (){
		this.tabOrders = new ArrayList<Order>();
	}
	
	/**
	 * Adds the order.
	 *
	 * @param order the order
	 */
	public void AddOrder(Order order){
		this.tabOrders.add(order);
	}
	
	/**
	 * Gets the order by index.
	 *
	 * @param index the index
	 * @return the order by index
	 */
	public Order getOrderByIndex(int index){
		return this.tabOrders.get(index);
	}
	
	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size(){
		return this.tabOrders.size();
	}
	
}