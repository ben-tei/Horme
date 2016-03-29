package bl.core;

import java.util.ArrayList;

public abstract class ObjectiveSet {

	/** The tab orders. */
	private ArrayList<Objective> tabObjectives;

	/**
	 * Instantiates a new order set.
	 */
	public ObjectiveSet() {
		this.tabObjectives = new ArrayList<Objective>();
	}

	/**
	 * Adds the order.
	 *
	 * @param order
	 *            the order
	 */
	public void addObjective(Objective o) {
		this.tabObjectives.add(o);
	}

	public ArrayList<Objective> getTabObjectives() {
		return tabObjectives;
	}

	public void setTabObjectives(ArrayList<Objective> tabObjectives) {
		this.tabObjectives = tabObjectives;
	}

	/**
	 * Gets the order by index.
	 *
	 * @param index
	 *            the index
	 * @return the order by index
	 */
	public Objective getObjectiveByIndex(int index) {
		return this.tabObjectives.get(index);
	}

	/**
	 * Size.
	 *
	 * @return the int
	 */
	public int size() {
		return this.tabObjectives.size();
	}

	public boolean isEmpty() {
		return this.tabObjectives.size() == 0;
	}

}
