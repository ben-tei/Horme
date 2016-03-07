package bl;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

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

}
