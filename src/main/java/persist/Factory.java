package persist;

import bl.User;
import core.*;
import exceptions.*;

public abstract class Factory {

	public abstract User findUser(String login) throws WrongLoginException;

	public abstract User createUser(String name, String firstname, String street, String zipCode, String city, 
			String phone, String email, String login, String password) throws AlreadyExistsException;

	public abstract void getNotifications();
	
	public abstract Product readProducts();
}
