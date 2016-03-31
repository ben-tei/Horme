package bl.core;

import java.util.ArrayList;

/**
 * The Class ActivityCategorySet.
 */
public abstract class ActivityCategorySet
{

	/** The tab activities categories. */
	private ArrayList<Category> tabActivitiesCategories;

	/**
	 * Instantiates a new shop cart row set.
	 */
	public ActivityCategorySet()
	{
		this.tabActivitiesCategories = new ArrayList<Category>();
	}

	/**
	 * Adds the shop cart row.
	 *
	 * @param cat
	 *            the cat
	 */
	public void addCategory(Category cat)
	{
		this.tabActivitiesCategories.add(cat);
	}

	/**
	 * Gets the shop cart row by index.
	 *
	 * @param index
	 *            the index
	 * @return the shop cart row by index
	 */
	public Category getCategoryByIndex(int index)
	{
		return this.tabActivitiesCategories.get(index);
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size()
	{
		return this.tabActivitiesCategories.size();
	}

	/**
	 * Gets the tab activities categories.
	 *
	 * @return the tab activities categories
	 */
	public ArrayList<Category> getTabActivitiesCategories()
	{
		return tabActivitiesCategories;
	}

}
