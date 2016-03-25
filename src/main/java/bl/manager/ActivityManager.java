package bl.manager;

import bl.core.Activity;
import bl.core.ActivitySet;
import bl.core.User;
import bl.factory.Factory;
import persist.factoryjdbc.FactoryJDBC;

/**
 * The Class ActivityManager.
 */
public class ActivityManager {

	/** The factory. */
	private Factory factory;

	/** The activities. */
	private ActivitySet activities;

	/** An activity. */
	private Activity activity;

	/**
	 * Instantiates a new activity manager.
	 */
	public ActivityManager()
	{
		this.factory = new FactoryJDBC();
	}

	/**
	 * Read activities.
	 *
	 * @param user the user
	 * @return the activity set
	 */
	public ActivitySet readActivities(User user)
	{
		activities = factory.readActivities(user);
		return activities;
	}

	/**
	 * Create activity.
	 *
	 * @param user the user
	 * @return the activity set
	 */
	public Activity createActivity(String name, String category, String description)
	{
		activity = this.factory.createActivity(name, category, description);
		return activity;
	}


}
