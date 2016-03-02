package bl;

import exceptions.WrongLoginException;

import persist.*;

import util.HashText;

public class UserManager {

	private Factory factory;

	public UserManager()
	{
		this.factory = new FactoryJDBC();
	}

	public User findUser(String login, String password) throws WrongLoginException
	{
		return this.factory.findUser(login, HashText.sha1(password));
	}

}
