package bl.manager;

import bl.core.ShopCartRowSet;
import bl.core.User;
import bl.factory.Factory;
import persist.factoryjdbc.FactoryJDBC;

/**
 * The Class ShopCartManager.
 */
public class ShopCartManager {

	/** The factory. */
	private Factory factory;
	
	/** The shop cart rows. */
	private ShopCartRowSet shopCartRows;

	/**
	 * Instantiates a new shop cart manager.
	 */
	public ShopCartManager()
	{
		this.factory = new FactoryJDBC();
	}

	/**
	 * Read shop cart.
	 *
	 * @param user the user
	 * @return the shop cart row set
	 */
	public ShopCartRowSet readShopCart(User user)
	{
		shopCartRows = factory.readShopCart(user);
		return shopCartRows;
	}


}
