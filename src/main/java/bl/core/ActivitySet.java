package bl.core;

import java.util.ArrayList;

/**
 * The Class ActivitySet.
 */
public abstract class ActivitySet
{

	/** The tab activities. */
	private ArrayList<Activity> tabActivities;

	/**
	 * Instantiates a new activity set.
	 */
	public ActivitySet()
	{
		this.tabActivities = new ArrayList<Activity>();
	}

	/**
	 * Adds the activity.
	 *
	 * @param activity the activity
	 */
	public void addActivity(Activity activity)
	{
		this.tabActivities.add(activity);
	}

	/**
	 * Gets the activity by index.
	 *
	 * @param index the index
	 * @return the activity by index
	 */
	public Activity getActivityByIndex(int index)
	{
		return this.tabActivities.get(index);
	}

	/**
	 * Gets the tab activities.
	 *
	 * @return the tab activities
	 */
	public ArrayList<Activity> getTabActivities()
	{
		return tabActivities;
	}

	/**
	 * Sets the tab activities.
	 *
	 * @param tabActivities the new tab activities
	 */
	public void setTabActivities(ArrayList<Activity> tabActivities)
	{
		this.tabActivities = tabActivities;
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size()
	{
		return this.tabActivities.size();
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty()
	{
		return this.tabActivities.size() == 0;
	}

}
