package bl.facade;

import bl.core.Activity;
import bl.core.Objective;
import bl.core.ObjectiveSet;
import bl.core.User;
import bl.manager.DiaryManager;
import exceptions.AlreadyExistsException;

public class DiaryFacade {

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
	 * @return the notifications
	 */
	public ObjectiveSet readObjectives(User user)
	{
		return this.diaryManager.readObjectives(user);
	}

	public Objective createObjective(String name, String description, String deadline, Activity activity) throws AlreadyExistsException {
		// TODO Auto-generated method stub
		return this.diaryManager.createObjective(name, description, deadline, activity);
	}

	public void removeFromMyObjectives(int index) {
		// TODO Auto-generated method stub
		this.diaryManager.removeFromMyObjectives(index);
	}

}
