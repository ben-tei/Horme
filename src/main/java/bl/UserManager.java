package bl;

import java.security.NoSuchAlgorithmException;

import persist.*;

import util.HashText;

public class UserManager {

	private Factory factory;
	private UserJDBC u;

	public UserManager()
	{
		this.factory = new FactoryJDBC();
	}

	public User createUser(String login, String password)
	{
		u = this.factory.createUser();
		try {
			u.setUserJDBC(login, HashText.sha1(password));
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(u.getLogin() == null)
		{
			u = null;
		}
		return u;
	}

}
