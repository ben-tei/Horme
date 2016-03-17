package bl;

import core.Product;
import persist.*;

public class ProductManager {
	
	private Factory factory;
	private Product product;
	
	public ProductManager()
	{
		this.factory = new FactoryJDBC();
	}
	
	public Product readProducts()
	{
		product = factory.readProducts();
		return product;
	}

}
