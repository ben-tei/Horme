package bl.facade;

import bl.core.ProductSet;
import bl.manager.ProductManager;

public class ProductFacade {

	private ProductManager productManager;

	public ProductFacade ()
	{
		this.productManager = new ProductManager();
	}

	public ProductSet readProducts()
	{
		return this.productManager.readProducts();
	}

	public ProductSet searchProducts(String productName)
	{
		return this.productManager.searchProducts(productName);
	}

}
