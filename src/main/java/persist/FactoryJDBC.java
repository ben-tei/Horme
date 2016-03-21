package persist;

import bl.User;
import core.*;
import exceptions.*;

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
	public User updateUser(String name, String firstname, String street, String zipCode, String city, String phone,
			String email, String login, String password) {
		//return this.factory.updateUser(name, firstname, street, zipCode, city, phone, email, login, password);
		return null;
	}

	@Override
	public ActivitySet readActivities() {
		// TODO Auto-generated method stub
		return new ActivitySetJDBC(null);
	}

}
