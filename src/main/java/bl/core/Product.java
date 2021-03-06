package bl.core;

import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Product.
 * 
 * @author Meche
 */
public abstract class Product
{
	/**
	 * Description of the id.
	 */
	private String id = "";
	/**
	 * Description of the property orders.
	 */
	private HashSet<Order> orders = new HashSet<Order>();

	/**
	 * Description of the property shoppingCarts.
	 */
	private HashSet<ShoppingCart> shoppingCarts = new HashSet<ShoppingCart>();

	/**
	 * Description of the property traders.
	 */
	private Trader trader = null;

	/**
	 * Description of the property reference.
	 */
	private String reference = "";

	/**
	 * Description of the property estimates.
	 */
	private HashSet<Estimate> estimates = new HashSet<Estimate>();

	/**
	 * Description of the property name.
	 */
	private String name = "";

	/**
	 * Description of the property stockQuantity.
	 */
	private Integer stockQuantity = Integer.valueOf(0);

	/**
	 * Description of the property stockQuantity.
	 */
	private Integer price = Integer.valueOf(0);

	/**
	 * Description of the property category.
	 */
	private Category category = null;

	// Start of user code (user defined attributes for Product)

	// End of user code

	/**
	 * The constructor.
	 */
	public Product()
	{
		// Start of user code constructor for Product)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Product)

	// End of user code
	/**
	 * Returns orders.
	 * 
	 * @return orders
	 */
	public HashSet<Order> getOrders()
	{
		return this.orders;
	}

	/**
	 * Returns shoppingCarts.
	 * 
	 * @return shoppingCarts
	 */
	public HashSet<ShoppingCart> getShoppingCarts()
	{
		return this.shoppingCarts;
	}

	/**
	 * Returns traders.
	 * 
	 * @return traders
	 */
	public Trader getTrader()
	{
		return this.trader;
	}

	/**
	 * Returns reference.
	 * 
	 * @return reference
	 */
	public String getReference()
	{
		return this.reference;
	}

	/**
	 * Sets a value to attribute reference.
	 *
	 * @param newReference the new reference
	 */
	public void setReference(String newReference)
	{
		this.reference = newReference;
	}

	/**
	 * Returns estimates.
	 * 
	 * @return estimates
	 */
	public HashSet<Estimate> getEstimates()
	{
		return this.estimates;
	}

	/**
	 * Returns name.
	 * 
	 * @return name
	 */
	public String getName()
	{
		return this.name;
	}

	/**
	 * Sets a value to attribute name.
	 *
	 * @param newName the new name
	 */
	public void setName(String newName)
	{
		this.name = newName;
	}

	/**
	 * Returns stockQuantity.
	 * 
	 * @return stockQuantity
	 */
	public Integer getStockQuantity()
	{
		return this.stockQuantity;
	}

	/**
	 * Sets a value to attribute stockQuantity.
	 *
	 * @param newStockQuantity the new stock quantity
	 */
	public void setStockQuantity(Integer newStockQuantity)
	{
		this.stockQuantity = newStockQuantity;
	}

	/**
	 * Returns category.
	 * 
	 * @return category
	 */
	public Category getCategory()
	{
		return this.category;
	}

	/**
	 * Sets a value to attribute category.
	 *
	 * @param newCategory the new category
	 */
	public void setCategory(Category newCategory)
	{
		this.category = newCategory;
	}

	/**
	 * Returns price.
	 * 
	 * @return price
	 */
	public Integer getPrice()
	{
		return this.price;
	}

	/**
	 * Sets a value to attribute price.
	 *
	 * @param newPrice the new price
	 */
	public void setPrice(Integer newPrice)
	{
		this.price = newPrice;
	}

	/**
	 * Gets the id.
	 *
	 * @return the id
	 */
	public String getId()
	{
		return id;
	}

	/**
	 * Sets the id.
	 *
	 * @param id the new id
	 */
	public void setId(String id)
	{
		this.id = id;
	}

	/**
	 * Save.
	 */
	public abstract void save();

}
