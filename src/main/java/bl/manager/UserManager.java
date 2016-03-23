package bl.manager;

import bl.core.User;
import bl.factory.Factory;
import exceptions.AlreadyExistsException;
import exceptions.WrongLoginException;
import exceptions.WrongPasswordException;
import persist.factoryjdbc.FactoryJDBC;
import persist.jdbc.UserJDBC;
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

	public User createUser(String name, String firstname, String street, String zipCode, String city, String phone,
			String email, String login, String password) throws AlreadyExistsException
	{
		user = this.factory.createUser(name, firstname, street, zipCode, city, phone, email, login, HashText.sha1(password));
		return user;
	}

	public User updateUser(String name, String firstname, String street, String zipCode, String city, String phone,
			String email)
	{
		((UserJDBC) this.user).updateUser(name, firstname, street, zipCode, city, phone, email);
		return this.user;
	}

	public User getUser()
	{
		return this.user;
	}

}
