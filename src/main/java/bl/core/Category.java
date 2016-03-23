package bl.core;

import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Category.
 * 
 * @author Meche
 */
public class Category {
	/**
	 * Description of the property name.
	 */
	private String name = "";

	/**
	 * Description of the property shortDescription.
	 */
	private String shortDescription = "";

	/**
	 * Description of the property longDescription.
	 */
	private String longDescription = "";

	/**
	 * Description of the property categories2.
	 */
	public HashSet<Category> categories2 = new HashSet<Category>();

	/**
	 * Description of the property activities.
	 */
	public HashSet<Activity> activities = new HashSet<Activity>();

	/**
	 * Description of the property products.
	 */
	public HashSet<Product> products = new HashSet<Product>();

	/**
	 * Description of the property categories1.
	 */
	public HashSet<Category> categories1 = new HashSet<Category>();

	// Start of user code (user defined attributes for Category)

	// End of user code

	/**
	 * The constructor.
	 */
	public Category() {
		// Start of user code constructor for Category)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Category)

	// End of user code
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
	 * Returns shortDescription.
	 * @return shortDescription 
	 */
	public String getShortDescription() {
		return this.shortDescription;
	}

	/**
	 * Sets a value to attribute shortDescription. 
	 * @param newShortDescription 
	 */
	public void setShortDescription(String newShortDescription) {
		this.shortDescription = newShortDescription;
	}

	/**
	 * Returns longDescription.
	 * @return longDescription 
	 */
	public String getLongDescription() {
		return this.longDescription;
	}

	/**
	 * Sets a value to attribute longDescription. 
	 * @param newLongDescription 
	 */
	public void setLongDescription(String newLongDescription) {
		this.longDescription = newLongDescription;
	}

	/**
	 * Returns categories2.
	 * @return categories2 
	 */
	public HashSet<Category> getCategories2() {
		return this.categories2;
	}

	/**
	 * Returns activities.
	 * @return activities 
	 */
	public HashSet<Activity> getActivities() {
		return this.activities;
	}

	/**
	 * Returns products.
	 * @return products 
	 */
	public HashSet<Product> getProducts() {
		return this.products;
	}

	/**
	 * Returns categories1.
	 * @return categories1 
	 */
	public HashSet<Category> getCategories1() {
		return this.categories1;
	}

}
