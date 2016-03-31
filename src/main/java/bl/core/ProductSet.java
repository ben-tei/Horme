package bl.core;

import java.util.ArrayList;

/**
 * The Class ProductSet.
 */
public abstract class ProductSet
{

	/** The tab products. */
	private ArrayList<Product> tabProducts;

	/**
	 * Instantiates a new product set.
	 */
	public ProductSet()
	{
		this.tabProducts = new ArrayList<Product>();
	}

	/**
	 * Adds the product.
	 *
	 * @param product
	 *            the product
	 */
	public void addProduct(Product product)
	{
		this.tabProducts.add(product);
	}

	/**
	 * Gets the tab products.
	 *
	 * @return the tab products
	 */
	public ArrayList<Product> getTabProducts()
	{
		return tabProducts;
	}

	/**
	 * Sets the tab products.
	 *
	 * @param tabProducts
	 *            the new tab products
	 */
	public void setTabProducts(ArrayList<Product> tabProducts)
	{
		this.tabProducts = tabProducts;
	}

	/**
	 * Gets the product by index.
	 *
	 * @param index
	 *            the index
	 * @return the product by index
	 */
	public Product getProductByIndex(int index)
	{
		return this.tabProducts.get(index);
	}

	/**
	 * Gets the product by id.
	 *
	 * @param id
	 *            the id
	 * @return the product by id
	 */
	public Product getProductById(String id)
	{
		int i = 0;
		boolean find = false;
		while (i < this.tabProducts.size() && !find)
		{
			if (this.tabProducts.get(i).getId().equals(id))
			{
				find = true;
			}
			i++;
		}

		return this.tabProducts.get(i - 1);
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

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty()
	{
		return this.tabProducts.size() == 0;
	}

}
