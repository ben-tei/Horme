package bl;

import core.Notification;

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
