package bl.core;

import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of WhishList.
 * 
 * @author Meche
 */
public abstract class WhishList
{
	/**
	 * Description of the property ressources.
	 */
	private HashSet<Ressource> ressources = new HashSet<Ressource>();

	/**
	 * Description of the property user.
	 */
	private User user = null;

	/**
	 * Description of the property name.
	 */
	private String name = "";

	/**
	 * Description of the property shoppingCarts.
	 */
	private HashSet<ShoppingCart> shoppingCarts = new HashSet<ShoppingCart>();

	// Start of user code (user defined attributes for WhishList)

	// End of user code

	/**
	 * The constructor.
	 */
	public WhishList()
	{
		// Start of user code constructor for WhishList)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for WhishList)

	// End of user code
	/**
	 * Returns ressources.
	 * 
	 * @return ressources
	 */
	public HashSet<Ressource> getRessources()
	{
		return this.ressources;
	}

	/**
	 * Returns user.
	 * 
	 * @return user
	 */
	public User getUser()
	{
		return this.user;
	}

	/**
	 * Sets a value to attribute user.
	 *
	 * @param newUser
	 *            the new user
	 */
	public void setUser(User newUser)
	{
		this.user = newUser;
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
	 * @param newName
	 *            the new name
	 */
	public void setName(String newName)
	{
		this.name = newName;
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

}
