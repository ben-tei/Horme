package bl.manager;

import bl.business.ProductSet;
import bl.business.ShopCartRowSet;
import bl.business.User;
import bl.factory.Factory;
import persist.*;
import persist.factoryjdbc.FactoryJDBC;

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
