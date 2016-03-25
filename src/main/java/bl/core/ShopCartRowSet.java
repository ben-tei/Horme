package bl.core;

import java.util.ArrayList;

/**
 * The Class ShopCartRowSet.
 */
public class ShopCartRowSet {

	/** The tab shop cart. */
	public ArrayList<ShopCartRow> tabShopCart;

	/**
	 * Instantiates a new shop cart row set.
	 */
	public ShopCartRowSet (){
		this.tabShopCart = new ArrayList<ShopCartRow>();
	}

	/**
	 * Adds the shop cart row.
	 *
	 * @param shop cart row the shop cart row
	 */
	public void addShopCartRow(ShopCartRow rowCart){
		this.tabShopCart.add(rowCart);
	}

	/**
	 * Gets the shop cart row by index.
	 *
	 * @param index the index
	 * @return the shop cart row by index
	 */
	public ShopCartRow getShopCartRowByIndex(int index){
		return this.tabShopCart.get(index);
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size(){
		return this.tabShopCart.size();
	}


}
