package bl.core;

import java.util.HashSet;

import exceptions.WrongPasswordException;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of User.
 * 
 * @author Meche
 */
public abstract class User extends Person
{
	/**
	 * Description of the property id.
	 */
	private String id = "";
	/**
	 * Description of the property whishLists.
	 */
	private HashSet<WhishList> whishLists = new HashSet<WhishList>();

	/**
	 * Description of the property shoppingCarts.
	 */
	private ShoppingCart shoppingCart;

	/**
	 * Description of the property entries.
	 */
	private HashSet<DiaryEntry> entries = new HashSet<DiaryEntry>();

	/**
	 * Description of the property estimates.
	 */
	private HashSet<Estimate> estimates = new HashSet<Estimate>();

	/**
	 * Description of the property orders.
	 */
	private HashSet<Order> orders = new HashSet<Order>();

	/**
	 * Description of the property proposedActivities.
	 */
	private HashSet<Activity> proposedActivities = new HashSet<Activity>();

	// Start of user code (user defined attributes for User)

	// End of user code

	/**
	 * The constructor.
	 */
	public User()
	{
		// Start of user code constructor for User)
		super();
		// End of user code
	}

	/**
	 * Instantiates a new user.
	 *
	 * @param login the login
	 * @param password the password
	 */
	public User(String login, String password)
	{
		super(login, password);
	}

	// Start of user code (user defined methods for User)

	// End of user code
	/**
	 * Returns whishLists.
	 * 
	 * @return whishLists
	 */
	public HashSet<WhishList> getWhishLists()
	{
		return this.whishLists;
	}

	/**
	 * Gets the shopping cart.
	 *
	 * @return the shopping cart
	 */
	public ShoppingCart getShoppingCart()
	{
		return shoppingCart;
	}

	/**
	 * Sets the shopping cart.
	 *
	 * @param shoppingCart the new shopping cart
	 */
	public void setShoppingCart(ShoppingCart shoppingCart)
	{
		this.shoppingCart = shoppingCart;
	}

	/**
	 * Returns entries.
	 * 
	 * @return entries
	 */
	public HashSet<DiaryEntry> getEntries()
	{
		return this.entries;
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
	 * Returns orders.
	 * 
	 * @return orders
	 */
	public HashSet<Order> getOrders()
	{
		return this.orders;
	}

	/**
	 * Returns proposedActivities.
	 * 
	 * @return proposedActivities
	 */
	public HashSet<Activity> getProposedActivities()
	{
		return this.proposedActivities;
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
	 * Checks if is password ok.
	 *
	 * @param password the password
	 * @return true, if is password ok
	 * @throws WrongPasswordException the wrong password exception
	 */
	public boolean isPasswordOK(String password) throws WrongPasswordException
	{
		if (this.getPassword().equals(password))
		{
			return true;
		} else
		{
			throw new WrongPasswordException("Wrong password !");
		}
	}

	/**
	 * Save.
	 */
	public abstract void save();

}
