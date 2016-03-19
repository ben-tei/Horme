package core;

import java.util.ArrayList;

public class ProductSet {
	
	public ArrayList<Product> tabProducts;
	
	public ProductSet (){
		this.tabProducts = new ArrayList<Product>();
	}
	
	public void AddProduct(Product product){
		this.tabProducts.add(product);
	}
	
	public Product getProductByIndex(int index){
		return this.tabProducts.get(index);
	}
	
	public int size(){
		return this.tabProducts.size();
	}
	
}
