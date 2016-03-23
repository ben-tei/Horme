package bl.facade;

import bl.core.ActivitySet;
import bl.core.User;
import bl.manager.ActivityManager;

public class ActivityFacade {

	private ActivityManager activityManager;

	public ActivityFacade ()
	{
		this.activityManager = new ActivityManager();
	}

	public ActivitySet readActivities(User user)
	{
		return this.activityManager.readActivities(user);
	}
}
