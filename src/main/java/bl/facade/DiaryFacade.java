package bl.facade;

import java.sql.Date;

import bl.core.Activity;
import bl.core.Objective;
import bl.core.ObjectiveSet;
import bl.core.User;
import bl.manager.DiaryManager;
import exceptions.AlreadyExistsException;

/**
 * The Class DiaryFacade.
 */
public class DiaryFacade
{

	/** The diary manager. */
	private DiaryManager diaryManager;

	/**
	 * Instantiates a new notification facade.
	 */
	public DiaryFacade()
	{
		this.diaryManager = new DiaryManager();
	}

	/**
	 * Gets the notifications.
	 *
	 * @param user
	 *            the user
	 * @return the notifications
	 */
	public ObjectiveSet readObjectives(User user)
	{
		return this.diaryManager.readObjectives(user);
	}

	/**
	 * Creates the objective.
	 *
	 * @param name
	 *            the name
	 * @param description
	 *            the description
	 * @param valideDate
	 *            the valide date
	 * @param activity
	 *            the activity
	 * @return the objective
	 * @throws AlreadyExistsException
	 *             the already exists exception
	 */
	public Objective createObjective(String name, String description, Date valideDate, Activity activity)
			throws AlreadyExistsException
	{
		// TODO Auto-generated method stub
		return this.diaryManager.createObjective(name, description, valideDate, activity);
	}

	/**
	 * Removes the from my objectives.
	 *
	 * @param index
	 *            the index
	 */
	public void removeFromMyObjectives(int index)
	{
		// TODO Auto-generated method stub
		this.diaryManager.removeFromMyObjectives(index);
	}

}
