package bl;

import persist.*;

public class NotificationManager 
{
	private Factory factory;

	public NotificationManager() 
	{
		this.factory = new FactoryJDBC();
	}

	public void getNotifications()
	{

	}
}
