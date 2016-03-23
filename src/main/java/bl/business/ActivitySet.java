package bl.business;

import java.util.ArrayList;

public class ActivitySet {
	
public ArrayList<Activity> tabActivities;
	
	public ActivitySet(){
		this.tabActivities = new ArrayList<Activity>();
	}
	
	public void AddActivity(Activity activity){
		this.tabActivities.add(activity);
	}
	
	public Activity getActivityByIndex(int index){
		return this.tabActivities.get(index);
	}
	
	public int size(){
		return this.tabActivities.size();
	}
}
