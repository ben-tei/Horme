package bl.manager;

import bl.core.ProductSet;
import bl.factory.Factory;
import persist.factoryjdbc.FactoryJDBC;

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

	public ProductSet searchProducts(String productName)
	{
		products = factory.searchProducts(productName);
		return products;
	}

}
