package bl.facade;

import bl.core.ProductSet;
import bl.manager.ProductManager;
import exceptions.NotEnoughStockException;

/**
 * The Class ProductFacade.
 */
public class ProductFacade
{

	/** The product manager. */
	private ProductManager productManager;

	/**
	 * Instantiates a new product facade.
	 */
	public ProductFacade()
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

	/**
	 * Update quantity in stock.
	 *
	 * @param index the index
	 * @param quantity the quantity
	 * @throws NotEnoughStockException the not enough stock exception
	 */
	public void updateQuantityInStock(int index, int quantity) throws NotEnoughStockException
	{
		this.productManager.updateQuantityInStock(index, quantity);
	}

	/**
	 * Update quantity in stock.
	 *
	 * @param idProduct the id product
	 * @param quantity the quantity
	 * @param oldQuantity the old quantity
	 * @throws NotEnoughStockException the not enough stock exception
	 */
	public void updateQuantityInStock(String idProduct, int quantity, int oldQuantity) throws NotEnoughStockException
	{
		this.productManager.updateQuantityInStock(idProduct, quantity, oldQuantity);
	}

}
