package bl;

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

}
