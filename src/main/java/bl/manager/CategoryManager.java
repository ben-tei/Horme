package bl.manager;

import bl.core.ActivityCategorySet;
import bl.factory.Factory;
import persist.factoryjdbc.FactoryJDBC;

/**
 * The Class NotificationManager.
 */
public class CategoryManager 
{

	/** The factory. */
	private Factory factory;

	private ActivityCategorySet activitiesCategories;

	/**
	 * Instantiates a new notification manager.
	 */
	public CategoryManager() 
	{
		this.factory = new FactoryJDBC();
	}

	/**
	 * Gets the notifications.
	 * @return 
	 *
	 * @return the notifications
	 */
	public ActivityCategorySet getActivitiesCategories()
	{
		this.activitiesCategories = this.factory.getActivitiesCategories();
		return this.activitiesCategories;
	}
}
