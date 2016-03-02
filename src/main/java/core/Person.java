package core;

import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Person.
 * 
 * @author Meche
 */
public abstract class Person {
	/**
	 * Description of the property firstName.
	 */
	private String firstName;

	/**
	 * Description of the property comments.
	 */
	public HashSet<Comment> comments = new HashSet<Comment>();

	/**
	 * Description of the property notifications.
	 */
	public HashSet<Notification> notifications = new HashSet<Notification>();

	/**
	 * Description of the property password.
	 */
	private String password;

	/**
	 * Description of the property name.
	 */
	private String name;

	/**
	 * Description of the property zipCode.
	 */
	private String zipCode;

	/**
	 * Description of the property phone.
	 */
	private String phone;

	/**
	 * Description of the property city.
	 */
	private String city;

	/**
	 * Description of the property email.
	 */
	private String email;

	/**
	 * Description of the property login.
	 */
	private String login;

	/**
	 * Description of the property street.
	 */
	private String street;

	// Start of user code (user defined attributes for Person)

	// End of user code

	/**
	 * The constructor.
	 */
	public Person() {
		// Start of user code constructor for Person)
		super();
		// End of user code
	}

	public Person(String login, String password) {
		this.login = login;
		this.password = password;
	}

	// Start of user code (user defined methods for Person)

	// End of user code
	/**
	 * Returns firstName.
	 * @return firstName 
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * Sets a value to attribute firstName. 
	 * @param newFirstName 
	 */
	public void setFirstName(String newFirstName) {
		this.firstName = newFirstName;
	}

	/**
	 * Returns comments.
	 * @return comments 
	 */
	public HashSet<Comment> getComments() {
		return this.comments;
	}

	/**
	 * Returns notifications.
	 * @return notifications 
	 */
	public HashSet<Notification> getNotifications() {
		return this.notifications;
	}

	/**
	 * Returns password.
	 * @return password 
	 */
	public String getPassword() {
		return this.password;
	}

	/**
	 * Sets a value to attribute password. 
	 * @param newPassword 
	 */
	public void setPassword(String newPassword) {
		this.password = newPassword;
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
	 * Returns zipCode.
	 * @return zipCode 
	 */
	public String getZipCode() {
		return this.zipCode;
	}

	/**
	 * Sets a value to attribute zipCode. 
	 * @param newZipCode 
	 */
	public void setZipCode(String newZipCode) {
		this.zipCode = newZipCode;
	}

	/**
	 * Returns phone.
	 * @return phone 
	 */
	public String getPhone() {
		return this.phone;
	}

	/**
	 * Sets a value to attribute phone. 
	 * @param newPhone 
	 */
	public void setPhone(String newPhone) {
		this.phone = newPhone;
	}

	/**
	 * Returns city.
	 * @return city 
	 */
	public String getCity() {
		return this.city;
	}

	/**
	 * Sets a value to attribute city. 
	 * @param newCity 
	 */
	public void setCity(String newCity) {
		this.city = newCity;
	}

	/**
	 * Returns email.
	 * @return email 
	 */
	public String getEmail() {
		return this.email;
	}

	/**
	 * Sets a value to attribute email. 
	 * @param newEmail 
	 */
	public void setEmail(String newEmail) {
		this.email = newEmail;
	}

	/**
	 * Returns login.
	 * @return login 
	 */
	public String getLogin() {
		return this.login;
	}

	/**
	 * Sets a value to attribute login. 
	 * @param newLogin 
	 */
	public void setLogin(String newLogin) {
		this.login = newLogin;
	}

	/**
	 * Returns street.
	 * @return street 
	 */
	public String getStreet() {
		return this.street;
	}

	/**
	 * Sets a value to attribute street. 
	 * @param newStreet 
	 */
	public void setStreet(String newStreet) {
		this.street = newStreet;
	}

}
