package bl;

import exceptions.WrongLoginException;

import persist.*;

import util.HashText;

public class UserManager {

	private Factory factory;
	private User u;

	public UserManager()
	{
		this.factory = new FactoryJDBC();
	}

	public User createUser(String login, String password) throws WrongLoginException
	{
		u = this.factory.createUser(login, HashText.sha1(password));

		return u;
	}

}
