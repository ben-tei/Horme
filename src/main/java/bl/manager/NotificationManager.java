package bl.manager;

import bl.factory.Factory;
import persist.factoryjdbc.FactoryJDBC;

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
