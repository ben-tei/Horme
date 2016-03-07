package bl;

import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;
import persist.*;

import util.HashText;

public class UserManager {

	private Factory factory;
	private User user;

	public UserManager()
	{
		this.factory = new FactoryJDBC();
	}

	public User findUser(String login, String password) throws WrongLoginException, WrongPasswordException
	{
		user = this.factory.findUser(login);
		user.isPasswordOK(HashText.sha1(password));
		return user;
	}

}
