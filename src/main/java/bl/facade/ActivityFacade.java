package bl.facade;

import bl.core.Activity;
import bl.core.ActivitySet;
import bl.core.Category;
import bl.core.User;
import bl.manager.ActivityManager;
import exceptions.AlreadyExistsException;

/**
 * The Class ActivityFacade.
 */
public class ActivityFacade
{

	/** The activity manager. */
	private ActivityManager activityManager;

	/**
	 * Instantiates a new activity facade.
	 */
	public ActivityFacade()
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

	/**
	 * Create activity.
	 *
	 * @param name the name
	 * @param description the description
	 * @param category the category
	 * @param user the user
	 * @return the activity
	 * @throws AlreadyExistsException the already exists exception
	 */

	public Activity createActivity(String name, String description, Category category, User user)
			throws AlreadyExistsException
	{
		// TODO Auto-generated method stub
		return this.activityManager.createActivity(name, description, category, user);
	}

	/**
	 * Removes the from my activities.
	 *
	 * @param index the index
	 */
	public void removeFromMyActivities(int index)
	{
		// TODO Auto-generated method stub
		this.activityManager.removeFromMyActivities(index);
	}

}
