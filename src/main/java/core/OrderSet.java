package core;

import java.util.ArrayList;

public class OrderSet {
	
	public ArrayList<Order> tabOrders;
	
	public OrderSet (){
		this.tabOrders = new ArrayList<Order>();
	}
	
	public void AddOrder(Order order){
		this.tabOrders.add(order);
	}
	
	public Order getOrderByIndex(int index){
		return this.tabOrders.get(index);
	}
	
	public int size(){
		return this.tabOrders.size();
	}
	
}