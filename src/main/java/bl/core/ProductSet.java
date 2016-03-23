package bl.core;

import java.util.ArrayList;

/**
 * The Class ProductSet.
 */
public class ProductSet {
	
	/** The tab products. */
	public ArrayList<Product> tabProducts;
	
	/**
	 * Instantiates a new product set.
	 */
	public ProductSet (){
		this.tabProducts = new ArrayList<Product>();
	}
	
	/**
	 * Adds the product.
	 *
	 * @param product the product
	 */
	public void AddProduct(Product product){
		this.tabProducts.add(product);
	}
	
	/**
	 * Gets the product by index.
	 *
	 * @param index the index
	 * @return the product by index
	 */
	public Product getProductByIndex(int index){
		return this.tabProducts.get(index);
	}
	
	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size(){
		return this.tabProducts.size();
	}
	
}
