package core;

import persist.UserJDBC;

public class PersonFacade {

	private Person person;

	public PersonFacade(String type)
	{
		if(type == "user")
		{
			this.person = new UserJDBC();
		}
		else if(type == "administrator")
		{

		}
		else if(type == "trader")
		{

		} 
	}

	public Person login(String login, String pwd)
	{
		return this.person.login(login, pwd);
	}
}