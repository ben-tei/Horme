package bl;

import core.ProductSet;
import core.ShopCartRowSet;
import persist.*;

public class ShopCartManager {

	private Factory factory;
	private ShopCartRowSet shopCartRows;

	public ShopCartManager()
	{
		this.factory = new FactoryJDBC();
	}

	public ShopCartRowSet readShopCart(User user)
	{
		shopCartRows = factory.readShopCart(user);
		return shopCartRows;
	}


}
