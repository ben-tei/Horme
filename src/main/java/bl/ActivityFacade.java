package bl;

import core.ActivitySet;
import core.ProductSet;

public class ActivityFacade {
	
private ActivityManager activityManager;
	
	public ActivityFacade ()
	{
		this.activityManager = new ActivityManager();
	}
	
	public ActivitySet readActivities()
	{
		return this.activityManager.readActivities();
	}
}
