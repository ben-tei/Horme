package bl.business;

import java.util.ArrayList;

public class ShopCartRowSet {
	
public ArrayList<Product> tabShopCart;
	
	public ShopCartRowSet (){
		this.tabShopCart = new ArrayList<Product>();
	}
	
	public void AddProduct(Product product){
		this.tabShopCart.add(product);
	}
	
	public Product getProductByIndex(int index){
		return this.tabShopCart.get(index);
	}
	
	public int size(){
		return this.tabShopCart.size();
	}
	

}
