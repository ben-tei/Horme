package bl.manager;

import java.sql.Date;

import bl.core.Activity;
import bl.core.Objective;
import bl.core.ObjectiveSet;
import bl.core.User;
import bl.factory.Factory;
import exceptions.AlreadyExistsException;
import persist.factoryjdbc.FactoryJDBC;

/**
 * The Class DiaryManager.
 */
public class DiaryManager
{

	/** The factory. */
	private Factory factory;

	/** The activities. */
	private ObjectiveSet objectives;

	/** The objective. */
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

	/**
	 * Creates the objective.
	 *
	 * @param name the name
	 * @param description the description
	 * @param valideDate the valide date
	 * @param activity the activity
	 * @return the objective
	 * @throws AlreadyExistsException the already exists exception
	 */
	public Objective createObjective(String name, String description, Date valideDate, Activity activity)
			throws AlreadyExistsException
	{
		// TODO Auto-generated method stub
		objective = this.factory.createObjective(name, description, valideDate, activity);
		return objective;
	}

	/**
	 * Removes the from my objectives.
	 *
	 * @param index the index
	 */
	public void removeFromMyObjectives(int index)
	{
		// TODO Auto-generated method stub
		this.objectives.getObjectiveByIndex(index).remove();
		this.objectives.getTabObjectives().remove(index);
	}

}
