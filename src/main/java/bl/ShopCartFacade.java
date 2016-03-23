package bl;

import core.ShopCartRowSet;

public class ShopCartFacade {
	
	private ShopCartManager shopCartManager;
	
	public ShopCartFacade () {
		this.shopCartManager = new ShopCartManager();
	}
	
    public ShopCartRowSet readShopCart(User user) {
    	return this.shopCartManager.readShopCart(user);
    }
}
