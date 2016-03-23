package bl.facade;

import bl.business.ActivitySet;
import bl.business.ProductSet;
import bl.business.User;
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
