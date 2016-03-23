package bl.facade;

import bl.business.User;
import bl.manager.UserManager;
import exceptions.*;

public class UserFacade {

	private UserManager userManager;

	public UserFacade()
	{
		this.userManager = new UserManager();
	}

	public User login(String login, String password) throws WrongLoginException, WrongPasswordException
	{
		return this.userManager.findUser(login, password);
	}

	public User signUp(String name, String firstname, String street, String zipCode, String city, String phone,
			String email, String login, String password) throws AlreadyExistsException
	{
		return this.userManager.createUser(name, firstname, street, zipCode, city, phone, email, login, password);
	}

	public User editProfile(String name, String firstname, String street, String zipCode, String city, String phone,
			String email)
	{
		return this.userManager.updateUser(name, firstname, street, zipCode, city, phone, email);
	}

	public User getUser()
	{
		return this.userManager.getUser();
	}

}
