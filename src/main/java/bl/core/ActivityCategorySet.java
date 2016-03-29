package bl.core;

import java.util.ArrayList;

public abstract class ActivityCategorySet {

	private ArrayList<Category> tabActivitiesCategories;

	/**
	 * Instantiates a new shop cart row set.
	 */
	public ActivityCategorySet() {
		this.tabActivitiesCategories = new ArrayList<Category>();
	}

	/**
	 * Adds the shop cart row.
	 *
	 * @param shop
	 *            cart row the shop cart row
	 */
	public void addCategory(Category cat) {
		this.tabActivitiesCategories.add(cat);
	}

	/**
	 * Gets the shop cart row by index.
	 *
	 * @param index
	 *            the index
	 * @return the shop cart row by index
	 */
	public Category getCategoryByIndex(int index) {
		return this.tabActivitiesCategories.get(index);
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size() {
		return this.tabActivitiesCategories.size();
	}

	public ArrayList<Category> getTabActivitiesCategories() {
		return tabActivitiesCategories;
	}

}
