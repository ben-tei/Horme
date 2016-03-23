package bl.core;

/**
 * The Class ShopCartRow.
 */
public class ShopCartRow {
	
	/** The name. */
	private String name;
	
	/** The price. */
	private int price;
	
	/** The quantity. */
	private int quantity;
	
	
	/**
	 * Instantiates a new shop cart row.
	 */
	public ShopCartRow() {
		
	}
	
	/**
	 * Sets the name.
	 *
	 * @param name the new name
	 */
	public void setName(String name){
		this.name = name;
	}
	
	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName() {
		return this.name;
	}
	
	/**
	 * Sets the price.
	 *
	 * @param price the new price
	 */
	public void setPrice(int price) {
		this.price = price;
	}
	
	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public int getPrice() {
		return this.price;
	}
	
	/**
	 * Sets the quantity.
	 *
	 * @param quantity the new quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
