package bl.core;

import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Order.
 * 
 * @author Meche
 */
public abstract class Order {
	/**
	 * Description of the property traders.
	 */
	private Trader trader = null;

	/**
	 * Description of the property date.
	 */
	private String date = "";

	/**
	 * Description of the property numero.
	 */
	private String numero = "";

	/**
	 * Description of the property products.
	 */
	private HashSet<Product> products = new HashSet<Product>();

	/**
	 * Description of the property user.
	 */
	private User user = null;

	// Start of user code (user defined attributes for Order)

	// End of user code

	/**
	 * The constructor.
	 */
	public Order() {
		// Start of user code constructor for Order)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Order)

	// End of user code
	/**
	 * Returns traders.
	 * 
	 * @return traders
	 */
	public Trader getTrader() {
		return this.trader;
	}

	/**
	 * Returns date.
	 * 
	 * @return date
	 */
	public String getDate() {
		return this.date;
	}

	/**
	 * Sets a value to attribute date.
	 *
	 * @param newDate
	 *            the new date
	 */
	public void setDate(String newDate) {
		this.date = newDate;
	}

	/**
	 * Returns numero.
	 * 
	 * @return numero
	 */
	public String getNumero() {
		return this.numero;
	}

	/**
	 * Sets a value to attribute numero.
	 *
	 * @param newNumero
	 *            the new numero
	 */
	public void setNumero(String newNumero) {
		this.numero = newNumero;
	}

	/**
	 * Returns products.
	 * 
	 * @return products
	 */
	public HashSet<Product> getProducts() {
		return this.products;
	}

	/**
	 * Returns user.
	 * 
	 * @return user
	 */
	public User getUser() {
		return this.user;
	}

	/**
	 * Sets a value to attribute user.
	 *
	 * @param newUser
	 *            the new user
	 */
	public void setUser(User newUser) {
		this.user = newUser;
	}

	/**
	 * Sets the trader.
	 *
	 * @param newTrader
	 *            the new trader
	 */
	public void setTrader(Trader newTrader) {
		this.trader = newTrader;

	}

}
