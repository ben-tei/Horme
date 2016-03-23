package bl.core;

import java.util.ArrayList;

/**
 * The Class ShopCartRowSet.
 */
public class ShopCartRowSet {
	
/** The tab shop cart. */
public ArrayList<Product> tabShopCart;
	
	/**
	 * Instantiates a new shop cart row set.
	 */
	public ShopCartRowSet (){
		this.tabShopCart = new ArrayList<Product>();
	}
	
	/**
	 * Adds the product.
	 *
	 * @param product the product
	 */
	public void AddProduct(Product product){
		this.tabShopCart.add(product);
	}
	
	/**
	 * Gets the product by index.
	 *
	 * @param index the index
	 * @return the product by index
	 */
	public Product getProductByIndex(int index){
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
