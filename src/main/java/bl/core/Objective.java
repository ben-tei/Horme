package bl.core;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Objective.
 * 
 * @author Meche
 */
public abstract class Objective {
	/**
	 * Description of the property deadline.
	 */
	private String deadline = "";

	/**
	 * Description of the property description.
	 */
	private String description = "";

	/**
	 * Description of the property name.
	 */
	private String name = "";

	/**
	 * Description of the property activity.
	 */
	private Activity activity = null;

	// Start of user code (user defined attributes for Objective)

	// End of user code

	/**
	 * The constructor.
	 */
	public Objective() {
		// Start of user code constructor for Objective)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Objective)

	// End of user code
	/**
	 * Returns deadline.
	 * @return deadline 
	 */
	public String getDeadline() {
		return this.deadline;
	}

	/**
	 * Sets a value to attribute deadline. 
	 *
	 * @param newDeadline the new deadline
	 */
	public void setDeadline(String newDeadline) {
		this.deadline = newDeadline;
	}

	/**
	 * Returns description.
	 * @return description 
	 */
	public String getDescription() {
		return this.description;
	}

	/**
	 * Sets a value to attribute description. 
	 *
	 * @param newDescription the new description
	 */
	public void setDescription(String newDescription) {
		this.description = newDescription;
	}

	/**
	 * Returns name.
	 * @return name 
	 */
	public String getName() {
		return this.name;
	}

	/**
	 * Sets a value to attribute name. 
	 *
	 * @param newName the new name
	 */
	public void setName(String newName) {
		this.name = newName;
	}

	/**
	 * Returns activity.
	 * @return activity 
	 */
	public Activity getActivity() {
		return this.activity;
	}

	/**
	 * Sets a value to attribute activity. 
	 *
	 * @param newActivity the new activity
	 */
	public void setActivity(Activity newActivity) {
		this.activity = newActivity;
	}

}
