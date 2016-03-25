package bl.core;

/**
 * The Class ShopCartRow.
 */
public class ShopCartRow {

	/** The name. */
	private int idProduct;

	private int idShoppingCart;

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

	public int getIdProduct() {
		return idProduct;
	}


	public void setIdProduct(int idProduct) {
		this.idProduct = idProduct;
	}


	public int getIdShoppingCart() {
		return idShoppingCart;
	}


	public void setIdShoppingCart(int idShoppingCart) {
		this.idShoppingCart = idShoppingCart;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
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
	public String getPrice() {
		return Integer.toString(this.price);
	}

	/**
	 * Sets the quantity.
	 *
	 * @param quantity the new quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public String getQuantity() {
		return Integer.toString(this.quantity);
	}


}
