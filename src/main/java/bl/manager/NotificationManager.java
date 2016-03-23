package bl.manager;

import bl.factory.Factory;
import persist.factoryjdbc.FactoryJDBC;

/**
 * The Class NotificationManager.
 */
public class NotificationManager 
{
	
	/** The factory. */
	private Factory factory;

	/**
	 * Instantiates a new notification manager.
	 */
	public NotificationManager() 
	{
		this.factory = new FactoryJDBC();
	}

	/**
	 * Gets the notifications.
	 *
	 * @return the notifications
	 */
	public void getNotifications()
	{

	}
}
