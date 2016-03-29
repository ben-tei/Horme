package bl.facade;

import bl.core.ObjectiveSet;
import bl.core.User;
import bl.manager.DiaryManager;

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

}
