package bl.core;

import java.util.ArrayList;

/**
 * The Class ShopCartRowSet.
 */
public abstract class ShopCartRowSet
{

	/** The tab shop cart. */
	private ArrayList<ShopCartRow> tabShopCart;

	/**
	 * Instantiates a new shop cart row set.
	 */
	public ShopCartRowSet()
	{
		this.tabShopCart = new ArrayList<ShopCartRow>();
	}

	/**
	 * Adds the shop cart row.
	 *
	 * @param rowCart the row cart
	 */
	public void addShopCartRow(ShopCartRow rowCart)
	{
		this.tabShopCart.add(rowCart);
	}

	/**
	 * Gets the shop cart row by index.
	 *
	 * @param index the index
	 * @return the shop cart row by index
	 */
	public ShopCartRow getShopCartRowByIndex(int index)
	{
		return this.tabShopCart.get(index);
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size()
	{
		return this.tabShopCart.size();
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty()
	{
		return this.tabShopCart.size() == 0;
	}

	/**
	 * Gets the tab shop cart.
	 *
	 * @return the tab shop cart
	 */
	public ArrayList<ShopCartRow> getTabShopCart()
	{
		return tabShopCart;
	}

}
