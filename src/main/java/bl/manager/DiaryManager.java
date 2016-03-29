package bl.manager;

import bl.core.Activity;
import bl.core.ActivitySet;
import bl.core.Objective;
import bl.core.ObjectiveSet;
import bl.core.User;
import bl.factory.Factory;
import persist.factoryjdbc.FactoryJDBC;

public class DiaryManager {

	/** The factory. */
	private Factory factory;

	/** The activities. */
	private ObjectiveSet objectives;

	/** An activity. */
	private Objective objective;

	/**
	 * Instantiates a new activity manager.
	 */
	public DiaryManager()
	{
		this.factory = new FactoryJDBC();
	}

	/**
	 * Read activities.
	 *
	 * @param user the user
	 * @return the activity set
	 */
	public ObjectiveSet readObjectives(User user)
	{
		objectives = factory.readObjectives(user);
		return objectives;
	}

}
