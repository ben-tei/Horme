package bl;

import core.Product;

public class ProductFacade {
	
	private ProductManager productManager;
	
	public ProductFacade ()
	{
		this.productManager = new ProductManager();
	}
	
	public Product readProducts()
	{
		return this.productManager.readProducts();
	}

}
