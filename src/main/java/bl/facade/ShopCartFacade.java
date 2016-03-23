package bl.facade;

import bl.core.ShopCartRowSet;
import bl.core.User;
import bl.manager.ShopCartManager;

public class ShopCartFacade {

	private ShopCartManager shopCartManager;

	public ShopCartFacade () {
		this.shopCartManager = new ShopCartManager();
	}

	public ShopCartRowSet readShopCart(User user) {
		return this.shopCartManager.readShopCart(user);
	}
}
