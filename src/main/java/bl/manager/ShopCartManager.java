package bl.manager;

import bl.core.ShopCartRowSet;
import bl.core.User;
import bl.factory.Factory;
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
