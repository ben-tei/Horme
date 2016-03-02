package persist;

import bl.User;
import exceptions.WrongLoginException;

public class FactoryJDBC extends Factory {

	public FactoryJDBC() { }

	@Override
	public User findUser(String login, String password) throws WrongLoginException {
		UserJDBC userjdbc = null;
		try {
			userjdbc = new UserJDBC();
			userjdbc.findUser(login, password);
		} catch (WrongLoginException e) {
			throw e;
		}
		return userjdbc;
	}

}
