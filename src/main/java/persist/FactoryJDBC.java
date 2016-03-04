package persist;

import bl.User;
import core.*;
import exceptions.WrongLoginException;

public class FactoryJDBC extends Factory {

	public FactoryJDBC() { }

	@Override
	public User findUser(String login, String password) throws WrongLoginException {
		try {
			UserJDBC userjdbc = new UserJDBC();
			userjdbc.findUser(login, password);
			return userjdbc;
		} catch (WrongLoginException e) {
			throw e;
		}
	}
	
	@Override
	public void getNotifications() 
	{
		NotificationJDBC notifjdbc = new NotificationJDBC();
	}

}
