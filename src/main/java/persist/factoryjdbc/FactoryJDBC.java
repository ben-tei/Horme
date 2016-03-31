package persist.factoryjdbc;

import java.sql.Date;

import bl.core.Activity;
import bl.core.ActivityCategorySet;
import bl.core.ActivitySet;
import bl.core.Category;
import bl.core.Objective;
import bl.core.ObjectiveSet;
import bl.core.OrderSet;
import bl.core.Product;
import bl.core.ProductSet;
import bl.core.ShopCartRow;
import bl.core.ShopCartRowSet;
import bl.core.ShoppingCart;
import bl.core.User;
import bl.factory.Factory;
import exceptions.*;
import persist.jdbc.ActivityCategorySetJDBC;
import persist.jdbc.ActivityJDBC;
import persist.jdbc.ActivitySetJDBC;
import persist.jdbc.ObjectiveJDBC;
import persist.jdbc.ObjectiveSetJDBC;
import persist.jdbc.OrderSetJDBC;
import persist.jdbc.ProductSetJDBC;
import persist.jdbc.ShopCartRowJDBC;
import persist.jdbc.ShopCartRowSetJDBC;
import persist.jdbc.ShoppingCartJDBC;
import persist.jdbc.UserJDBC;

/**
 * The Class FactoryJDBC.
 */
public class FactoryJDBC extends Factory
{

	/**
	 * Instantiates a new factory jdbc.
	 */
	public FactoryJDBC()
	{
	}

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
	public ProductSet readProducts()
	{
		return new ProductSetJDBC();
	}

	@Override
	public ProductSet searchProducts(String searchString)
	{
		return new ProductSetJDBC(searchString);
	}

	@Override
	public ShopCartRowSet readShopCart(User user)
	{
		return new ShopCartRowSetJDBC(user);
	}

	public ShoppingCart getShopCart(User user)
	{
		return new ShoppingCartJDBC(user);
	}

	public ActivitySet readActivities(User user)
	{
		// TODO Auto-generated method stub
		return new ActivitySetJDBC(user);
	}

	@Override
	public OrderSet readOrders(User user)
	{
		return new OrderSetJDBC(user);
	}

	@Override
	public ShopCartRow createShopCartRow(Product p, ShoppingCart shopCart, int quantity)
	{
		// TODO Auto-generated method stub
		return new ShopCartRowJDBC(p, shopCart, quantity);
	}

	@Override
	public ActivityCategorySet getActivitiesCategories()
	{
		// TODO Auto-generated method stub
		return new ActivityCategorySetJDBC();
	}

	@Override
	public Activity createActivity(String name, String description, Category category, User user)
			throws AlreadyExistsException
	{
		// TODO Auto-generated method stub
		return new ActivityJDBC(name, description, category, user);
	}

	@Override
	public ObjectiveSet readObjectives(User user)
	{
		// TODO Auto-generated method stub
		return new ObjectiveSetJDBC(user);
	}

	@Override
	public Objective createObjective(String name, String description, Date valideDate, Activity activity)
			throws AlreadyExistsException
	{
		// TODO Auto-generated method stub
		return new ObjectiveJDBC(name, description, valideDate, activity);
	}

}
