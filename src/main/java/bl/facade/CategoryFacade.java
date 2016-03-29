package bl.facade;

import bl.core.ActivityCategorySet;
import bl.manager.CategoryManager;

/**
 * The Class NotificationFacade.
 */
public class CategoryFacade {

	/** The notification manager. */
	private CategoryManager categoryManager;

	/**
	 * Instantiates a new notification facade.
	 */
	public CategoryFacade() {
		this.categoryManager = new CategoryManager();
	}

	/**
	 * Gets the notifications.
	 *
	 * @return the notifications
	 */
	public ActivityCategorySet getActivitiesCategories() {
		return this.categoryManager.getActivitiesCategories();
	}
}
