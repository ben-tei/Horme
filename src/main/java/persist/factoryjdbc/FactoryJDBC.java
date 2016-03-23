package persist.factoryjdbc;

import bl.core.ActivitySet;
import bl.core.ProductSet;
import bl.core.ShopCartRowSet;
import bl.core.User;
import bl.factory.Factory;
import exceptions.*;
import persist.jdbc.ActivitySetJDBC;
import persist.jdbc.NotificationJDBC;
import persist.jdbc.ProductSetJDBC;
import persist.jdbc.ShopCartRowSetJDBC;
import persist.jdbc.UserJDBC;

public class FactoryJDBC extends Factory
{

	public FactoryJDBC() { }

	@Override
	public User findUser(String login) throws WrongLoginException
	{
		return new UserJDBC(login);
	}

	@Override
	public User createUser(String name, String firstname, String street, String zipCode, String city, String phone,
			String email, String login, String password) throws AlreadyExistsException
	{
		return new UserJDBC(name, firstname, street, zipCode, city, phone, email, login, password);
	}

	@Override
	public void getNotifications() 
	{
		NotificationJDBC notifjdbc = new NotificationJDBC();
	}


	@Override
	public ProductSet readProducts() 
	{
		return new ProductSetJDBC();
	}

	@Override
	public ShopCartRowSet readShopCart(User user) 
	{
		return new ShopCartRowSetJDBC(user);
	}

	@Override
	public ActivitySet readActivities(User user) {
		// TODO Auto-generated method stub
		return new ActivitySetJDBC(user);
	}

}
