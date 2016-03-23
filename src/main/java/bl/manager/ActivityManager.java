package bl.manager;

import bl.core.ActivitySet;
import bl.core.User;
import bl.factory.Factory;
import persist.factoryjdbc.FactoryJDBC;

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
