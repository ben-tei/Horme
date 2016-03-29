package bl.manager;

import java.sql.Date;

import bl.core.Activity;
import bl.core.Objective;
import bl.core.ObjectiveSet;
import bl.core.User;
import bl.factory.Factory;
import exceptions.AlreadyExistsException;
import persist.factoryjdbc.FactoryJDBC;

public class DiaryManager {

	/** The factory. */
	private Factory factory;

	/** The activities. */
	private ObjectiveSet objectives;

	private Objective objective;

	/**
	 * Instantiates a new activity manager.
	 */
	public DiaryManager() {
		this.factory = new FactoryJDBC();
	}

	/**
	 * Read activities.
	 *
	 * @param user
	 *            the user
	 * @return the activity set
	 */
	public ObjectiveSet readObjectives(User user) {
		objectives = factory.readObjectives(user);
		return objectives;
	}

	public Objective createObjective(String name, String description, Date valideDate, Activity activity)
			throws AlreadyExistsException {
		// TODO Auto-generated method stub
		objective = this.factory.createObjective(name, description, valideDate, activity);
		return objective;
	}

	public void removeFromMyObjectives(int index) {
		// TODO Auto-generated method stub
		String idObjective = this.objectives.getObjectiveByIndex(index).getId();
		this.objectives.getObjectiveByIndex(index).remove(idObjective);
		this.objectives.getTabObjectives().remove(index);
	}

}
