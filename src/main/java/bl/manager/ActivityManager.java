package bl.manager;

import bl.core.Activity;
import bl.core.ActivitySet;
import bl.core.Category;
import bl.core.User;
import bl.factory.Factory;
import exceptions.AlreadyExistsException;
import persist.factoryjdbc.FactoryJDBC;

/**
 * The Class ActivityManager.
 */
public class ActivityManager
{

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
	 * @param name the name
	 * @param description the description
	 * @param category the category
	 * @param user the user
	 * @return the activity set
	 * @throws AlreadyExistsException the already exists exception
	 */

	public Activity createActivity(String name, String description, Category category, User user)
			throws AlreadyExistsException
	{
		// TODO Auto-generated method stub
		activity = this.factory.createActivity(name, description, category, user);
		return activity;
	}

	/**
	 * Removes the from my activities.
	 *
	 * @param index the index
	 */
	public void removeFromMyActivities(int index)
	{
		// TODO Auto-generated method stub
		this.activities.getActivityByIndex(index).remove();
		this.activities.getTabActivities().remove(index);
	}

}
