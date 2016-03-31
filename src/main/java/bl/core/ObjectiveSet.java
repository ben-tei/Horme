package bl.core;

import java.util.ArrayList;

/**
 * The Class ObjectiveSet.
 */
public abstract class ObjectiveSet
{

	/** The tab orders. */
	private ArrayList<Objective> tabObjectives;

	/**
	 * Instantiates a new order set.
	 */
	public ObjectiveSet()
	{
		this.tabObjectives = new ArrayList<Objective>();
	}

	/**
	 * Adds the order.
	 *
	 * @param o
	 *            the o
	 */
	public void addObjective(Objective o)
	{
		this.tabObjectives.add(o);
	}

	/**
	 * Gets the tab objectives.
	 *
	 * @return the tab objectives
	 */
	public ArrayList<Objective> getTabObjectives()
	{
		return tabObjectives;
	}

	/**
	 * Sets the tab objectives.
	 *
	 * @param tabObjectives
	 *            the new tab objectives
	 */
	public void setTabObjectives(ArrayList<Objective> tabObjectives)
	{
		this.tabObjectives = tabObjectives;
	}

	/**
	 * Gets the order by index.
	 *
	 * @param index
	 *            the index
	 * @return the order by index
	 */
	public Objective getObjectiveByIndex(int index)
	{
		return this.tabObjectives.get(index);
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size()
	{
		return this.tabObjectives.size();
	}

	/**
	 * Checks if is empty.
	 *
	 * @return true, if is empty
	 */
	public boolean isEmpty()
	{
		return this.tabObjectives.size() == 0;
	}

}
