package persist;

import bl.User;
import exceptions.WrongLoginException;

public class FactoryJDBC extends Factory
{

	public FactoryJDBC() { }

	@Override
	public User findUser(String login) throws WrongLoginException
	{
		return new UserJDBC(login);
	}

	@Override
	public void getNotifications() 
	{
		NotificationJDBC notifjdbc = new NotificationJDBC();
	}

}
