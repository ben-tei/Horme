package bl.core;

import java.util.ArrayList;

/**
 * The Class ActivitySet.
 */
public class ActivitySet {
	
/** The tab activities. */
public ArrayList<Activity> tabActivities;
	
	/**
	 * Instantiates a new activity set.
	 */
	public ActivitySet(){
		this.tabActivities = new ArrayList<Activity>();
	}
	
	/**
	 * Adds the activity.
	 *
	 * @param activity the activity
	 */
	public void AddActivity(Activity activity){
		this.tabActivities.add(activity);
	}
	
	/**
	 * Gets the activity by index.
	 *
	 * @param index the index
	 * @return the activity by index
	 */
	public Activity getActivityByIndex(int index){
		return this.tabActivities.get(index);
	}
	
	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size(){
		return this.tabActivities.size();
	}
}
