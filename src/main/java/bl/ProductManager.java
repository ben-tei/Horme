package bl;

import core.ProductSet;
import persist.*;

public class ProductManager {
	
	private Factory factory;
	private ProductSet products;
	
	public ProductManager()
	{
		this.factory = new FactoryJDBC();
	}
	
	public ProductSet readProducts()
	{
		products = factory.readProducts();
		return products;
	}

}
