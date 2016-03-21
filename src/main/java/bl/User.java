package bl;

import java.util.HashSet;

import core.Activity;
import core.DiaryEntry;
import core.Estimate;
import core.Order;
import core.Person;
import core.ShoppingCart;
import core.WhishList;
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
public abstract class User extends Person {
	/**
	 * Description of the property id.
	 */
	public String id = "";
	/**
	 * Description of the property whishLists.
	 */
	public HashSet<WhishList> whishLists = new HashSet<WhishList>();

	/**
	 * Description of the property shoppingCarts.
	 */
	public HashSet<ShoppingCart> shoppingCarts = new HashSet<ShoppingCart>();

	/**
	 * Description of the property entries.
	 */
	public HashSet<DiaryEntry> entries = new HashSet<DiaryEntry>();

	/**
	 * Description of the property estimates.
	 */
	public HashSet<Estimate> estimates = new HashSet<Estimate>();

	/**
	 * Description of the property orders.
	 */
	public HashSet<Order> orders = new HashSet<Order>();

	/**
	 * Description of the property proposedActivities.
	 */
	public HashSet<Activity> proposedActivities = new HashSet<Activity>();

	// Start of user code (user defined attributes for User)

	// End of user code

	/**
	 * The constructor.
	 */
	public User() {
		// Start of user code constructor for User)
		super();
		// End of user code
	}

	public User(String login, String password) {
		super(login, password);
	}

	// Start of user code (user defined methods for User)

	// End of user code
	/**
	 * Returns whishLists.
	 * @return whishLists 
	 */
	public HashSet<WhishList> getWhishLists() {
		return this.whishLists;
	}

	/**
	 * Returns shoppingCarts.
	 * @return shoppingCarts 
	 */
	public HashSet<ShoppingCart> getShoppingCarts() {
		return this.shoppingCarts;
	}

	/**
	 * Returns entries.
	 * @return entries 
	 */
	public HashSet<DiaryEntry> getEntries() {
		return this.entries;
	}

	/**
	 * Returns estimates.
	 * @return estimates 
	 */
	public HashSet<Estimate> getEstimates() {
		return this.estimates;
	}

	/**
	 * Returns orders.
	 * @return orders 
	 */
	public HashSet<Order> getOrders() {
		return this.orders;
	}

	/**
	 * Returns proposedActivities.
	 * @return proposedActivities 
	 */
	public HashSet<Activity> getProposedActivities() {
		return this.proposedActivities;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public boolean isPasswordOK(String password) throws WrongPasswordException
	{
		if(this.getPassword().equals(password))
		{
			return true;
		}
		else
		{
			throw new WrongPasswordException("Wrong password !");
		}
	}

}
