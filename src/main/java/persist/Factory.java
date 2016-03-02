package persist;

import bl.User;

import exceptions.WrongLoginException;

public abstract class Factory {

	public abstract User createUser(String login, String password) throws WrongLoginException;
}
