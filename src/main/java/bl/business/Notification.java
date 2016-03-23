package bl.business;

import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Notification.
 * 
 * @author Meche
 */
public class Notification {
	/**
	 * Description of the property name.
	 */
	private String name = "";

	/**
	 * Description of the property persons.
	 */
	public HashSet<Person> persons = new HashSet<Person>();

	/**
	 * Description of the property content.
	 */
	private String content = "";

	/**
	 * Description of the property date.
	 */
	private String date = "";

	// Start of user code (user defined attributes for Notification)

	// End of user code

	/**
	 * The constructor.
	 */
	public Notification() {
		// Start of user code constructor for Notification)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Notification)

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
	 * Returns persons.
	 * @return persons 
	 */
	public HashSet<Person> getPersons() {
		return this.persons;
	}

	/**
	 * Returns content.
	 * @return content 
	 */
	public String getContent() {
		return this.content;
	}

	/**
	 * Sets a value to attribute content. 
	 * @param newContent 
	 */
	public void setContent(String newContent) {
		this.content = newContent;
	}

	/**
	 * Returns date.
	 * @return date 
	 */
	public String getDate() {
		return this.date;
	}

	/**
	 * Sets a value to attribute date. 
	 * @param newDate 
	 */
	public void setDate(String newDate) {
		this.date = newDate;
	}

}
