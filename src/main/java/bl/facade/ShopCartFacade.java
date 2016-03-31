package bl.facade;

import bl.core.Product;
import bl.core.ShopCartRowSet;
import bl.core.ShoppingCart;
import bl.core.User;
import bl.manager.ShopCartManager;

/**
 * The Class ShopCartFacade.
 */
public class ShopCartFacade
{

	/** The shop cart manager. */
	private ShopCartManager shopCartManager;

	/**
	 * Instantiates a new shop cart facade.
	 */
	public ShopCartFacade()
	{
		this.shopCartManager = new ShopCartManager();
	}

	/**
	 * Read shop cart.
	 *
	 * @param user
	 *            the user
	 * @return the shop cart row set
	 */
	public ShopCartRowSet readShopCart(User user)
	{
		return this.shopCartManager.readShopCart(user);
	}

	/**
	 * Gets the shop cart.
	 *
	 * @param user
	 *            the user
	 * @return the shop cart
	 */
	public ShoppingCart getShopCart(User user)
	{
		return this.shopCartManager.getShopCart(user);
	}

	/**
	 * Place order.
	 */
	public void placeOrder()
	{
		this.shopCartManager.placeOrder();
	}

	/**
	 * Adds the to shopping cart.
	 *
	 * @param p
	 *            the p
	 * @param quantity
	 *            the quantity
	 */
	public void addToShoppingCart(Product p, int quantity)
	{
		this.shopCartManager.addToShoppingCart(p, quantity);
	}

	/**
	 * Removes the from shopping cart.
	 *
	 * @param index
	 *            the index
	 * @param quantity
	 *            the quantity
	 */
	public void removeFromShoppingCart(int index, int quantity)
	{
		this.shopCartManager.removeFromShoppingCart(index, quantity);
	}

	/**
	 * Gets the quantity.
	 *
	 * @param idProduct
	 *            the id product
	 * @return the quantity
	 */
	public int getQuantity(String idProduct)
	{
		return this.shopCartManager.getQuantity(idProduct);
	}
}
