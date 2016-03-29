package bl.factory;

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
import exceptions.*;

/**
 * The Class Factory.
 */
public abstract class Factory {

	/**
	 * Find user.
	 *
	 * @param login
	 *            the login
	 * @return the user
	 * @throws WrongLoginException
	 *             the wrong login exception
	 */
	public abstract User findUser(String login) throws WrongLoginException;

	/**
	 * Creates the user.
	 *
	 * @param name
	 *            the name
	 * @param firstname
	 *            the firstname
	 * @param street
	 *            the street
	 * @param zipCode
	 *            the zip code
	 * @param city
	 *            the city
	 * @param phone
	 *            the phone
	 * @param email
	 *            the email
	 * @param login
	 *            the login
	 * @param password
	 *            the password
	 * @return the user
	 * @throws AlreadyExistsException
	 *             the already exists exception
	 */
	public abstract User createUser(String name, String firstname, String street, String zipCode, String city,
			String phone, String email, String login, String password) throws AlreadyExistsException;

	/**
	 * Read products.
	 *
	 * @return the product set
	 */
	public abstract ProductSet readProducts();

	/**
	 * Search products.
	 *
	 * @param searchString
	 *            the search string
	 * @return the product set
	 */
	public abstract ProductSet searchProducts(String searchString);

	/**
	 * Read activities.
	 *
	 * @param user
	 *            the user
	 * @return the activity set
	 */
	public abstract ActivitySet readActivities(User user);

	/**
	 * Read shop cart.
	 *
	 * @param user
	 *            the user
	 * @return the shop cart row set
	 */
	public abstract ShopCartRowSet readShopCart(User user);

	public abstract ShoppingCart getShopCart(User user);

	public abstract ShopCartRow createShopCartRow(Product p, ShoppingCart shopCart, int quantity);

	/**
	 * Read orders.
	 *
	 ** @param user
	 *            the user
	 * @return the order set
	 */
	public abstract OrderSet readOrders(User user);

	public abstract ActivityCategorySet getActivitiesCategories();

	public abstract Activity createActivity(String name, String description, Category category, User user)
			throws AlreadyExistsException;

	public abstract ObjectiveSet readObjectives(User user);

	public abstract Objective createObjective(String name, String description, Date valideDate, Activity activity)
			throws AlreadyExistsException;

}
