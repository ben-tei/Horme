package persist;

import bl.User;
import exceptions.WrongLoginException;

public class FactoryJDBC extends Factory {

	public FactoryJDBC() { }

	@Override
	public User createUser(String login, String password) throws WrongLoginException {
		return new UserJDBC(login, password);
	}

}
