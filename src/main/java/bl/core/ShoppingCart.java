package bl.core;

import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of ShoppingCart.
 * 
 * @author Meche
 */
public abstract class ShoppingCart {
	/**
	 * Description of the property id.
	 */
	private String id = "";
	/**
	 * Description of the property whishLists.
	 */
	private HashSet<WhishList> whishLists = new HashSet<WhishList>();

	/**
	 * Description of the property user.
	 */
	private User user = null;

	/**
	 * Description of the property products.
	 */
	private HashSet<Product> products = new HashSet<Product>();

	// Start of user code (user defined attributes for ShoppingCart)

	// End of user code

	/**
	 * The constructor.
	 */
	public ShoppingCart() {
		// Start of user code constructor for ShoppingCart)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for ShoppingCart)

	// End of user code
	/**
	 * Returns whishLists.
	 * @return whishLists 
	 */
	public HashSet<WhishList> getWhishLists() {
		return this.whishLists;
	}

	/**
	 * Returns user.
	 * @return user 
	 */
	public User getUser() {
		return this.user;
	}

	/**
	 * Sets a value to attribute user. 
	 *
	 * @param newUser the new user
	 */
	public void setUser(User newUser) {
		this.user = newUser;
	}

	/**
	 * Returns products.
	 * @return products 
	 */
	public HashSet<Product> getProducts() {
		return this.products;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public abstract void placeOrder(ShopCartRowSet shopCartRows);

}
