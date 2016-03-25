package persist.factoryjdbc;

import bl.core.ActivitySet;
import bl.core.OrderSet;
import bl.core.ProductSet;
import bl.core.ShopCartRowSet;
import bl.core.User;
import bl.factory.Factory;
import exceptions.*;
import persist.jdbc.ActivitySetJDBC;
import persist.jdbc.NotificationJDBC;
import persist.jdbc.OrderSetJDBC;
import persist.jdbc.ProductSetJDBC;
import persist.jdbc.ShopCartRowSetJDBC;
import persist.jdbc.UserJDBC;

/**
 * The Class FactoryJDBC.
 */
public class FactoryJDBC extends Factory
{

	/**
	 * Instantiates a new factory jdbc.
	 */
	public FactoryJDBC() { }

	/* (non-Javadoc)
	 * @see bl.factory.Factory#findUser(java.lang.String)
	 */
	@Override
	public User findUser(String login) throws WrongLoginException
	{
		return new UserJDBC(login);
	}

	/* (non-Javadoc)
	 * @see bl.factory.Factory#createUser(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 */
	@Override
	public User createUser(String name, String firstname, String street, String zipCode, String city, String phone,
			String email, String login, String password) throws AlreadyExistsException
	{
		return new UserJDBC(name, firstname, street, zipCode, city, phone, email, login, password);
	}

	/* (non-Javadoc)
	 * @see bl.factory.Factory#getNotifications()
	 */
	@Override
	public void getNotifications() 
	{
		NotificationJDBC notifjdbc = new NotificationJDBC();
	}


	/* (non-Javadoc)
	 * @see bl.factory.Factory#readProducts()
	 */
	@Override
	public ProductSet readProducts() 
	{
		return new ProductSetJDBC();
	}

	/* (non-Javadoc)
	 * @see bl.factory.Factory#searchProducts(java.lang.String)
	 */
	@Override
	public ProductSet searchProducts(String searchString)
	{
		return new ProductSetJDBC(searchString);
	}

	/* (non-Javadoc)
	 * @see bl.factory.Factory#readShopCart(bl.core.User)
	 */
	@Override
	public ShopCartRowSet readShopCart(User user) 
	{
		return new ShopCartRowSetJDBC(user);
	}

	/* (non-Javadoc)
	 * @see bl.factory.Factory#readActivities(bl.core.User)
	 */
	public ActivitySet readActivities(User user) {
		// TODO Auto-generated method stub
		return new ActivitySetJDBC(user);
	}

	/* (non-Javadoc)
	 * @see bl.factory.Factory#readOrders(bl.core.User)
	 */
	@Override
	public OrderSet readOrders(User user) {
		return new OrderSetJDBC(user);
	}

}