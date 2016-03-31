package bl.manager;

import bl.core.Product;
import bl.core.ShopCartRow;
import bl.core.ShopCartRowSet;
import bl.core.ShoppingCart;
import bl.core.User;
import bl.factory.Factory;
import persist.factoryjdbc.FactoryJDBC;

/**
 * The Class ShopCartManager.
 */
public class ShopCartManager
{

	/** The factory. */
	private Factory factory;

	/** The shop cart row. */
	private ShopCartRow shopCartRow;

	/** The shop cart rows. */
	private ShopCartRowSet shopCartRows;

	/** The shop cart. */
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
	 * @param user
	 *            the user
	 * @return the shop cart row set
	 */
	public ShopCartRowSet readShopCart(User user)
	{
		return shopCartRows;
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
		shopCart = factory.getShopCart(user);
		shopCartRows = factory.readShopCart(user);
		return shopCart;
	}

	/**
	 * Place order.
	 */
	public void placeOrder()
	{
		this.shopCart.placeOrder(shopCartRows);
		for (int i = 0; i < this.shopCartRows.size(); i++)
		{
			this.shopCartRows.getShopCartRowByIndex(i).remove();
		}

		this.shopCartRows.getTabShopCart().clear();
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
		int quantity = 0;
		boolean find = false;
		int i = 0;
		while (i < this.shopCartRows.size() && !find)
		{
			if (this.shopCartRows.getShopCartRowByIndex(i).getIdProduct().equals(idProduct))
			{
				quantity = this.shopCartRows.getShopCartRowByIndex(i).getQuantity();
				find = true;
			}
			i++;

		}
		return quantity;
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
		this.shopCartRow = factory.createShopCartRow(p, this.shopCart, quantity);
		boolean find = false;
		int i = 0;
		while (i < this.shopCartRows.size() && !find)
		{
			if (this.shopCartRows.getShopCartRowByIndex(i).getIdProduct().equals(p.getId())
					&& this.shopCartRows.getShopCartRowByIndex(i).getIdShoppingCart().equals(this.shopCart.getId()))
			{
				find = true;
			}
			i++;
		}

		if (!find)
		{
			this.shopCartRows.addShopCartRow(this.shopCartRow);
		} else
		{
			this.shopCartRows.getShopCartRowByIndex(i - 1)
					.setQuantity(quantity + this.shopCartRows.getShopCartRowByIndex(i - 1).getQuantity());
		}

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
		if (quantity == 0)
		{
			this.shopCartRows.getShopCartRowByIndex(index).remove();
			this.shopCartRows.getTabShopCart().remove(index);
		} else
		{
			this.shopCartRows.getShopCartRowByIndex(index).setQuantity(quantity);
			this.shopCartRows.getShopCartRowByIndex(index).save();
		}
	}

}
