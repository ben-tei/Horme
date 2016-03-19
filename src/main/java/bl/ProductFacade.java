package bl;

import core.ProductSet;

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

}
