package bl;

public class UserFacade {

	private UserManager usermanager;

	public UserFacade()
	{
		this.usermanager = new UserManager();
	}

	public User login(String login, String password)
	{
		return this.usermanager.createUser(login, password);
	}

}
