package bl.facade;

import bl.manager.NotificationManager;

/**
 * The Class NotificationFacade.
 */
public class NotificationFacade {

	/** The notification manager. */
	private NotificationManager notificationManager;

	/**
	 * Instantiates a new notification facade.
	 */
	public NotificationFacade() 
	{
		this.notificationManager = new NotificationManager();
	}

	/**
	 * Gets the notifications.
	 *
	 * @return the notifications
	 */
	public void getNotifications(){
		this.notificationManager.getNotifications();
	}
}
