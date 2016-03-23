package bl.facade;

import bl.core.ProductSet;
import bl.manager.ProductManager;

/**
 * The Class ProductFacade.
 */
public class ProductFacade {

	/** The product manager. */
	private ProductManager productManager;

	/**
	 * Instantiates a new product facade.
	 */
	public ProductFacade ()
	{
		this.productManager = new ProductManager();
	}

	/**
	 * Read products.
	 *
	 * @return the product set
	 */
	public ProductSet readProducts()
	{
		return this.productManager.readProducts();
	}

	/**
	 * Search products.
	 *
	 * @param searchString the search string
	 * @return the product set
	 */
	public ProductSet searchProducts(String searchString)
	{
		return this.productManager.searchProducts(searchString);
	}

}
