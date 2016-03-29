package bl.core;

/**
 * The Class ShopCartRow.
 */
public abstract class ShopCartRow {

	/** The name. */
	private String idProduct;

	private String idShoppingCart;

	private String name;

	/** The price. */
	private int price;

	/** The quantity. */
	private int quantity;

	/**
	 * Instantiates a new shop cart row.
	 */
	public ShopCartRow() {
		super();
	}

	public String getIdProduct() {
		return idProduct;
	}

	public void setIdProduct(String idProduct) {
		this.idProduct = idProduct;
	}

	public String getIdShoppingCart() {
		return idShoppingCart;
	}

	public void setIdShoppingCart(String idShoppingCart) {
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
	 * @param price
	 *            the new price
	 */
	public void setPrice(int price) {
		this.price = price;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public Integer getPrice() {
		return this.price;
	}

	/**
	 * Sets the quantity.
	 *
	 * @param quantity
	 *            the new quantity
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public Integer getQuantity() {
		return this.quantity;
	}

	public abstract void save();

	public abstract void remove(String idProduct, String idShopCart);

}
