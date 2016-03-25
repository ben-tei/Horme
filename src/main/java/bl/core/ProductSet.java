package bl.core;

import java.util.ArrayList;

/**
 * The Class ProductSet.
 */
public abstract class ProductSet {

	/** The tab products. */
	private ArrayList<Product> tabProducts;

	/**
	 * Instantiates a new product set.
	 */
	public ProductSet ()
	{
		this.tabProducts = new ArrayList<Product>();
	}

	/**
	 * Adds the product.
	 *
	 * @param product the product
	 */
	public void addProduct(Product product)
	{
		this.tabProducts.add(product);
	}

	/**
	 * Gets the product by index.
	 *
	 * @param index the index
	 * @return the product by index
	 */
	public Product getProductByIndex(int index)
	{
		return this.tabProducts.get(index);
	}

	public Product getProductById(String id)
	{
		int i = 0;
		boolean find = false;
		while(i < this.tabProducts.size() && !find)
		{
			if(this.tabProducts.get(i).getId().equals(id))
			{
				find = true;
			}
			i++;
		}

		return this.tabProducts.get(i-1);
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size()
	{
		return this.tabProducts.size();
	}

}
