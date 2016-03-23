package bl.facade;

import bl.core.User;
import bl.manager.UserManager;
import exceptions.*;

/**
 * The Class UserFacade.
 */
public class UserFacade {

	/** The user manager. */
	private UserManager userManager;

	/**
	 * Instantiates a new user facade.
	 */
	public UserFacade()
	{
		this.userManager = new UserManager();
	}

	/**
	 * Login.
	 *
	 * @param login the login
	 * @param password the password
	 * @return the user
	 * @throws WrongLoginException the wrong login exception
	 * @throws WrongPasswordException the wrong password exception
	 */
	public User login(String login, String password) throws WrongLoginException, WrongPasswordException
	{
		return this.userManager.findUser(login, password);
	}

	/**
	 * Sign up.
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
	public User signUp(String name, String firstname, String street, String zipCode, String city, String phone,
			String email, String login, String password) throws AlreadyExistsException
	{
		return this.userManager.createUser(name, firstname, street, zipCode, city, phone, email, login, password);
	}

	/**
	 * Edits the profile.
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
	public User editProfile(String name, String firstname, String street, String zipCode, String city, String phone,
			String email)
	{
		return this.userManager.updateUser(name, firstname, street, zipCode, city, phone, email);
	}

	/**
	 * Gets the user.
	 *
	 * @return the user
	 */
	public User getUser()
	{
		return this.userManager.getUser();
	}

}
