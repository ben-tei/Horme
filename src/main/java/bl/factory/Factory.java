package bl.factory;

import bl.core.ActivitySet;
import bl.core.ProductSet;
import bl.core.ShopCartRowSet;
import bl.core.User;
import exceptions.*;

public abstract class Factory {

	public abstract User findUser(String login) throws WrongLoginException;

	public abstract User createUser(String name, String firstname, String street, String zipCode, String city, 
			String phone, String email, String login, String password) throws AlreadyExistsException;

	public abstract void getNotifications();

	public abstract ProductSet readProducts();
	
	public abstract ProductSet searchProducts(String searchString);

	public abstract ActivitySet readActivities(User user);

	public abstract ShopCartRowSet readShopCart(User user);

}
