package bl.manager;

import bl.core.Product;
import bl.core.ShopCartRow;
import bl.core.ShopCartRowSet;
import bl.core.ShoppingCart;
import bl.core.User;
import bl.factory.Factory;
import persist.factoryjdbc.FactoryJDBC;

/**
 * The Class ShopCartManager.
 */
public class ShopCartManager {

	/** The factory. */
	private Factory factory;

	private ShopCartRow shopCartRow;

	/** The shop cart rows. */
	private ShopCartRowSet shopCartRows;

	private ShoppingCart shopCart;

	/**
	 * Instantiates a new shop cart manager.
	 */
	public ShopCartManager() {
		this.factory = new FactoryJDBC();
	}

	/**
	 * Read shop cart.
	 *
	 * @param user
	 *            the user
	 * @return the shop cart row set
	 */
	public ShopCartRowSet readShopCart(User user) {
		return shopCartRows;
	}

	public ShoppingCart getShopCart(User user) {
		shopCart = factory.getShopCart(user);
		shopCartRows = factory.readShopCart(user);
		return shopCart;
	}

	public void placeOrder() {
		this.shopCart.placeOrder(shopCartRows);
		for (int i = 0; i < this.shopCartRows.size(); i++) {
			this.shopCartRows.getShopCartRowByIndex(i).remove(this.shopCartRows.getShopCartRowByIndex(i).getIdProduct(),
					this.shopCartRows.getShopCartRowByIndex(i).getIdShoppingCart());
		}

		this.shopCartRows.getTabShopCart().clear();
	}

	public int getQuantity(String idProduct) {
		int quantity = 0;
		boolean find = false;
		int i = 0;
		while (i < this.shopCartRows.size() && !find) {
			if (this.shopCartRows.getShopCartRowByIndex(i).getIdProduct().equals(idProduct)) {
				quantity = this.shopCartRows.getShopCartRowByIndex(i).getQuantity();
				find = true;
			}
			i++;

		}
		return quantity;
	}

	public void addToShoppingCart(Product p, int quantity) {
		this.shopCartRow = factory.createShopCartRow(p, this.shopCart, quantity);
		boolean find = false;
		int i = 0;
		while (i < this.shopCartRows.size() && !find) {
			if (this.shopCartRows.getShopCartRowByIndex(i).getIdProduct().equals(p.getId())
					&& this.shopCartRows.getShopCartRowByIndex(i).getIdShoppingCart().equals(this.shopCart.getId())) {
				find = true;
			}
			i++;
		}

		if (!find) {
			this.shopCartRows.addShopCartRow(this.shopCartRow);
		} else {
			this.shopCartRows.getShopCartRowByIndex(i - 1)
					.setQuantity(quantity + this.shopCartRows.getShopCartRowByIndex(i - 1).getQuantity());
		}

	}

	public void removeFromShoppingCart(int index, int quantity) {
		if (quantity == 0) {
			String idProduct = this.shopCartRows.getShopCartRowByIndex(index).getIdProduct();
			String idShopCart = this.shopCartRows.getShopCartRowByIndex(index).getIdShoppingCart();
			this.shopCartRows.getShopCartRowByIndex(index).remove(idProduct, idShopCart);
			this.shopCartRows.getTabShopCart().remove(index);
		} else {
			this.shopCartRows.getShopCartRowByIndex(index).setQuantity(quantity);
			this.shopCartRows.getShopCartRowByIndex(index).save();
		}
	}

}
