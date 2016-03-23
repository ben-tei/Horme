package bl.manager;

import bl.core.ProductSet;
import bl.factory.Factory;
import persist.factoryjdbc.FactoryJDBC;

/**
 * The Class ProductManager.
 */
public class ProductManager {

	/** The factory. */
	private Factory factory;
	
	/** The products. */
	private ProductSet products;

	/**
	 * Instantiates a new product manager.
	 */
	public ProductManager()
	{
		this.factory = new FactoryJDBC();
	}

	/**
	 * Read products.
	 *
	 * @return the product set
	 */
	public ProductSet readProducts()
	{
		products = factory.readProducts();
		return products;
	}

	/**
	 * Search products.
	 *
	 * @param searchString the search string
	 * @return the product set
	 */
	public ProductSet searchProducts(String searchString)
	{
		products = factory.searchProducts(searchString);
		return products;
	}

}
