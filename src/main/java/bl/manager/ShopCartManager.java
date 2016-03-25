package bl.manager;

import bl.core.ShopCartRow;
import bl.core.ShopCartRowSet;
import bl.core.ShoppingCart;
import bl.core.User;
import bl.factory.Factory;
import persist.factoryjdbc.FactoryJDBC;

/**
 * The Class ShopCartManager.
 */
public class ShopCartManager {

	/** The factory. */
	private Factory factory;

	private ShopCartRow shopCartRow;

	/** The shop cart rows. */
	private ShopCartRowSet shopCartRows;

	private ShoppingCart shopCart;

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

	public ShoppingCart getShopCart(User user) {
		shopCart = factory.getShopCart(user);
		return shopCart;
	}
<<<<<<< HEAD
	
	public void placeOrder(){
		this.shopCart.placeOrder(shopCartRows);
	}
=======

	public void addToShoppingCart(int indice, int quantity)
	{
		this.shopCartRow = factory.addToShoppingCart(indice, quantity);
	}

>>>>>>> origin/master

}
