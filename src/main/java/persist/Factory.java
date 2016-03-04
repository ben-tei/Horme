package persist;

import bl.User;
import core.*;

import exceptions.WrongLoginException;

public abstract class Factory {

	public abstract User findUser(String login, String password) throws WrongLoginException;
	public abstract void getNotifications();
}
