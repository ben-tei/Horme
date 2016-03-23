package bl;

import core.ActivitySet;
import persist.Factory;
import persist.FactoryJDBC;

public class ActivityManager {

	private Factory factory;
	private ActivitySet activities;

	public ActivityManager()
	{
		this.factory = new FactoryJDBC();
	}

	public ActivitySet readActivities(User user)
	{
		activities = factory.readActivities(user);
		return activities;
	}

}
