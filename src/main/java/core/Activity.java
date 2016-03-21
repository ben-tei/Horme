package core;

import java.util.HashSet;

import bl.User;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Activity.
 * 
 * @author Meche
 */
public class Activity {
	/**
	 * Description of the property user.
	 */
	public User user = null;

	/**
	 * Description of the property ressources.
	 */
	public HashSet<Ressource> ressources = new HashSet<Ressource>();

	/**
	 * Description of the property name.
	 */
	private String name = "";
	
	/**
	 * Description of the property description.
	 */
	private String description = "";

	/**
	 * Description of the property category.
	 */
	public Category category = null;

	/**
	 * Description of the property entries.
	 */
	public HashSet<DiaryEntry> entries = new HashSet<DiaryEntry>();

	/**
	 * Description of the property objectives.
	 */
	public HashSet<Objective> objectives = new HashSet<Objective>();

	// Start of user code (user defined attributes for Activity)

	// End of user code

	/**
	 * The constructor.
	 */
	public Activity() {
		// Start of user code constructor for Activity)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Activity)

	// End of user code
	/**
	 * Returns user.
	 * @return user 
	 */
	public User getUser() {
		return this.user;
	}

	/**
	 * Sets a value to attribute user. 
	 * @param newUser 
	 */
	public void setUser(User newUser) {
		this.user = newUser;
	}

	/**
	 * Returns ressources.
	 * @return ressources 
	 */
	public HashSet<Ressource> getRessources() {
		return this.ressources;
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
	 * @param newName 
	 */
	public void setName(String newName) {
		this.name = newName;
	}

	/**
	 * Returns category.
	 * @return category 
	 */
	public Category getCategory() {
		return this.category;
	}

	/**
	 * Sets a value to attribute category. 
	 * @param newCategory 
	 */
	public void setCategory(Category newCategory) {
		this.category = newCategory;
	}

	/**
	 * Returns entries.
	 * @return entries 
	 */
	public HashSet<DiaryEntry> getEntries() {
		return this.entries;
	}

	/**
	 * Returns objectives.
	 * @return objectives 
	 */
	public HashSet<Objective> getObjectives() {
		return this.objectives;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
