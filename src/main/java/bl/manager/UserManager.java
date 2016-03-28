package bl.manager;

import bl.core.User;
import bl.factory.Factory;
import exceptions.AlreadyExistsException;
import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;
import persist.factoryjdbc.FactoryJDBC;
import util.HashText;

/**
 * The Class UserManager.
 */
public class UserManager {

	/** The factory. */
	private Factory factory;

	/** The user. */
	private User user;

	/**
	 * Instantiates a new user manager.
	 */
	public UserManager()
	{
		this.factory = new FactoryJDBC();
	}

	/**
	 * Find user.
	 *
	 * @param login the login
	 * @param password the password
	 * @return the user
	 * @throws WrongLoginException the wrong login exception
	 * @throws WrongPasswordException the wrong password exception
	 */
	public User findUser(String login, String password) throws WrongLoginException, WrongPasswordException
	{
		user = this.factory.findUser(login);
		user.isPasswordOK(HashText.sha1(password));
		return user;
	}

	/**
	 * Creates the user.
	 *
	 * @param name the name
	 * @param firstname the firstname
	 * @param street the street
	 * @param zipCode the zip code
	 * @param city the city
	 * @param phone the phone
	 * @param email the email
	 * @param login the login
	 * @param password the password
	 * @return the user
	 * @throws AlreadyExistsException the already exists exception
	 */
	public User createUser(String name, String firstname, String street, String zipCode, String city, String phone,
			String email, String login, String password) throws AlreadyExistsException
	{
		name = name.toUpperCase();
		firstname = firstname.substring(0, 1).toUpperCase() + firstname.substring(1);
		city = city.substring(0, 1).toUpperCase() + city.substring(1);

		user = this.factory.createUser(name, firstname, street, zipCode, city, phone, email, login, HashText.sha1(password));
		return user;
	}

	/**
	 * Update user.
	 *
	 * @param name the name
	 * @param firstname the firstname
	 * @param street the street
	 * @param zipCode the zip code
	 * @param city the city
	 * @param phone the phone
	 * @param email the email
	 * @return the user
	 */
	public User updateUser(String name, String firstname, String street, String zipCode, String city, String phone,
			String email)
	{
		name = name.toUpperCase();
		firstname = firstname.substring(0, 1).toUpperCase() + firstname.substring(1);
		city = city.substring(0, 1).toUpperCase() + city.substring(1);
		
		this.user.setName(name);
		this.user.setFirstName(firstname);
		this.user.setStreet(street);
		this.user.setZipCode(zipCode);
		this.user.setCity(city);
		this.user.setPhone(phone);
		this.user.setEmail(email);
		this.user.save();
		return this.user;
	}

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public User getUser()
	{
		return this.user;
	}

}
