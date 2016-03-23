package bl.facade;

import bl.business.ShopCartRowSet;
import bl.business.User;
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
