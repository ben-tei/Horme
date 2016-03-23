package bl.facade;

import bl.core.Notification;
import bl.manager.NotificationManager;

public class NotificationFacade {

	private NotificationManager notificationManager;

	public NotificationFacade() 
	{
		this.notificationManager = new NotificationManager();
	}

	public void getNotifications(){
		this.notificationManager.getNotifications();
	}
}
