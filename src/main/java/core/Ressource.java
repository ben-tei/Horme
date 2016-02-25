package core;

import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Ressource.
 * 
 * @author Meche
 */
public class Ressource {
	/**
	 * Description of the property nom.
	 */
	private String nom = "";

	/**
	 * Description of the property whishLists.
	 */
	public HashSet<WhishList> whishLists = new HashSet<WhishList>();

	/**
	 * Description of the property activitys.
	 */
	public HashSet<Activity> activitys = new HashSet<Activity>();

	// Start of user code (user defined attributes for Ressource)

	// End of user code

	/**
	 * The constructor.
	 */
	public Ressource() {
		// Start of user code constructor for Ressource)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Ressource)

	// End of user code
	/**
	 * Returns nom.
	 * @return nom 
	 */
	public String getNom() {
		return this.nom;
	}

	/**
	 * Sets a value to attribute nom. 
	 * @param newNom 
	 */
	public void setNom(String newNom) {
		this.nom = newNom;
	}

	/**
	 * Returns whishLists.
	 * @return whishLists 
	 */
	public HashSet<WhishList> getWhishLists() {
		return this.whishLists;
	}

	/**
	 * Returns activitys.
	 * @return activitys 
	 */
	public HashSet<Activity> getActivitys() {
		return this.activitys;
	}

}
