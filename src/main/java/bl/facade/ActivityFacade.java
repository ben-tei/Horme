package bl.facade;

import bl.core.ActivitySet;
import bl.core.User;
import bl.manager.ActivityManager;

/**
 * The Class ActivityFacade.
 */
public class ActivityFacade {

	/** The activity manager. */
	private ActivityManager activityManager;

	/**
	 * Instantiates a new activity facade.
	 */
	public ActivityFacade ()
	{
		this.activityManager = new ActivityManager();
	}

	/**
	 * Read activities.
	 *
	 * @param user the user
	 * @return the activity set
	 */
	public ActivitySet readActivities(User user)
	{
		return this.activityManager.readActivities(user);
	}
}
