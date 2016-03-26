package bl.facade;

import bl.core.Product;
import bl.core.ShopCartRowSet;
import bl.core.ShoppingCart;
import bl.core.User;
import bl.manager.ShopCartManager;

/**
 * The Class ShopCartFacade.
 */
public class ShopCartFacade {

	/** The shop cart manager. */
	private ShopCartManager shopCartManager;

	/**
	 * Instantiates a new shop cart facade.
	 */
	public ShopCartFacade () {
		this.shopCartManager = new ShopCartManager();
	}

	/**
	 * Read shop cart.
	 *
	 * @param user the user
	 * @return the shop cart row set
	 */
	public ShopCartRowSet readShopCart(User user) {
		return this.shopCartManager.readShopCart(user);
	}

	public ShoppingCart getShopCart(User user) {
		return this.shopCartManager.getShopCart(user);
	}

	public void placeOrder()
	{
		this.shopCartManager.placeOrder();
	}

	public void addToShoppingCart(Product p, int quantity)
	{
		this.shopCartManager.addToShoppingCart(p, quantity);
	}

	public void removeFromShoppingCart(int index, int quantity)
	{
		this.shopCartManager.removeFromShoppingCart(index, quantity);
	}

	public int getQuantity(String idProduct)
	{
		return this.shopCartManager.getQuantity(idProduct);
	}
}
