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
public class ShoppingCart {
	/**
	 * Description of the property whishLists.
	 */
	public HashSet<WhishList> whishLists = new HashSet<WhishList>();

	/**
	 * Description of the property user.
	 */
	public User user = null;

	/**
	 * Description of the property products.
	 */
	public HashSet<Product> products = new HashSet<Product>();

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
	 * @param newUser 
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

}
