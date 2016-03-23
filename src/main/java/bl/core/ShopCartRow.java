package bl.core;

public class ShopCartRow {
	
	private String name;
	private int price;
	private int quantity;
	
	
	public ShopCartRow() {
		
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
