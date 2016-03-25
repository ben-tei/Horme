package bl.core;

import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Estimate.
 * 
 * @author Meche
 */
public abstract class Estimate {
	/**
	 * Description of the property products.
	 */
	private HashSet<Product> products = new HashSet<Product>();

	/**
	 * Description of the property trader.
	 */
	private Trader trader = null;

	/**
	 * Description of the property user.
	 */
	private User user = null;

	// Start of user code (user defined attributes for Estimate)

	// End of user code

	/**
	 * The constructor.
	 */
	public Estimate() {
		// Start of user code constructor for Estimate)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Estimate)

	// End of user code
	/**
	 * Returns products.
	 * @return products 
	 */
	public HashSet<Product> getProducts() {
		return this.products;
	}

	/**
	 * Returns trader.
	 * @return trader 
	 */
	public Trader getTrader() {
		return this.trader;
	}

	/**
	 * Sets a value to attribute trader. 
	 *
	 * @param newTrader the new trader
	 */
	public void setTrader(Trader newTrader) {
		this.trader = newTrader;
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

}
