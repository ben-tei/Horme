package bl;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;

public class UserFacade {

	private UserManager usermanager;

	public UserFacade()
	{
		this.usermanager = new UserManager();
	}

	public User login(String login, String password) throws WrongLoginException, WrongPasswordException
	{
		return this.usermanager.findUser(login, password);
	}

}
