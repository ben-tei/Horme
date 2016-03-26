package bl.manager;

import bl.core.ProductSet;
import bl.factory.Factory;
import exceptions.NotEnoughStockException;
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

	public void updateQuantityInStock(int index, int quantity) throws NotEnoughStockException
	{
		int quantityInStock = this.products.getProductByIndex(index).getStockQuantity();
		if(quantityInStock < quantity)
		{
			throw new NotEnoughStockException("Not enough stock !");
		}
		else
		{
			this.products.getProductByIndex(index).setStockQuantity(quantityInStock - quantity);
			this.products.getProductByIndex(index).save();
		}
	}

	public void updateQuantityInStock(String idProduct, int quantity, int oldQuantity) throws NotEnoughStockException
	{
		int quantityInStock = this.products.getProductById(idProduct).getStockQuantity();

		if(quantityInStock + oldQuantity - quantity < 0)
		{
			throw new NotEnoughStockException("Not enough stock !");
		}
		else
		{
			this.products.getProductById(idProduct).setStockQuantity(quantityInStock + oldQuantity - quantity);
			this.products.getProductById(idProduct).save();
		}
	}

}
