package persist;

import bl.User;
import exceptions.WrongLoginException;

public class FactoryJDBC extends Factory {

	public FactoryJDBC() { }

	@Override
	public User findUser(String login, String password) throws WrongLoginException {
		return UserJDBC.findUser(login, password);
	}

}
