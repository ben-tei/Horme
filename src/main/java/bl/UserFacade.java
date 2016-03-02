package bl;

import exceptions.WrongLoginException;

public class UserFacade {

	private UserManager usermanager;

	public UserFacade()
	{
		this.usermanager = new UserManager();
	}

	public User login(String login, String password) throws WrongLoginException
	{
		return this.usermanager.findUser(login, password);
	}

}
