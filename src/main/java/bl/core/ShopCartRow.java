package bl.core;

/**
 * The Class ShopCartRow.
 */
public abstract class ShopCartRow
{

	/** The name. */
	private String idProduct;

	/** The id shopping cart. */
	private String idShoppingCart;

	/** The name. */
	private String name;

	/** The price. */
	private int price;

	/** The quantity. */
	private int quantity;

	/**
	 * Instantiates a new shop cart row.
	 */
	public ShopCartRow()
	{
		super();
	}

	/**
	 * Gets the id product.
	 *
	 * @return the id product
	 */
	public String getIdProduct()
	{
		return idProduct;
	}

	/**
	 * Sets the id product.
	 *
	 * @param idProduct
	 *            the new id product
	 */
	public void setIdProduct(String idProduct)
	{
		this.idProduct = idProduct;
	}

	/**
	 * Gets the id shopping cart.
	 *
	 * @return the id shopping cart
	 */
	public String getIdShoppingCart()
	{
		return idShoppingCart;
	}

	/**
	 * Sets the id shopping cart.
	 *
	 * @param idShoppingCart
	 *            the new id shopping cart
	 */
	public void setIdShoppingCart(String idShoppingCart)
	{
		this.idShoppingCart = idShoppingCart;
	}

	/**
	 * Gets the name.
	 *
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}

	/**
	 * Sets the name.
	 *
	 * @param name
	 *            the new name
	 */
	public void setName(String name)
	{
		this.name = name;
	}

	/**
	 * Sets the price.
	 *
	 * @param price
	 *            the new price
	 */
	public void setPrice(int price)
	{
		this.price = price;
	}

	/**
	 * Gets the price.
	 *
	 * @return the price
	 */
	public Integer getPrice()
	{
		return this.price;
	}

	/**
	 * Sets the quantity.
	 *
	 * @param quantity
	 *            the new quantity
	 */
	public void setQuantity(int quantity)
	{
		this.quantity = quantity;
	}

	/**
	 * Gets the quantity.
	 *
	 * @return the quantity
	 */
	public Integer getQuantity()
	{
		return this.quantity;
	}

	/**
	 * Save.
	 */
	public abstract void save();

	/**
	 * Removes the.
	 */
	public abstract void remove();

}
