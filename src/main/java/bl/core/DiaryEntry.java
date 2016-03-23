package bl.core;

import java.util.HashSet;

/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of DiaryEntry.
 * 
 * @author Meche
 */
public class DiaryEntry {
	/**
	 * Description of the property position.
	 */
	private String position = "";

	/**
	 * Description of the property name.
	 */
	private String name = "";

	/**
	 * Description of the property date.
	 */
	private String date = "";

	/**
	 * Description of the property user.
	 */
	public User user = null;

	/**
	 * Description of the property activity.
	 */
	public Activity activity = null;

	/**
	 * Description of the property content.
	 */
	private String content = "";

	/**
	 * Description of the property comments.
	 */
	public HashSet<Comment> comments = new HashSet<Comment>();

	// Start of user code (user defined attributes for DiaryEntry)

	// End of user code

	/**
	 * The constructor.
	 */
	public DiaryEntry() {
		// Start of user code constructor for DiaryEntry)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for DiaryEntry)

	// End of user code
	/**
	 * Returns position.
	 * @return position 
	 */
	public String getPosition() {
		return this.position;
	}

	/**
	 * Sets a value to attribute position. 
	 * @param newPosition 
	 */
	public void setPosition(String newPosition) {
		this.position = newPosition;
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
	 * Returns activity.
	 * @return activity 
	 */
	public Activity getActivity() {
		return this.activity;
	}

	/**
	 * Sets a value to attribute activity. 
	 * @param newActivity 
	 */
	public void setActivity(Activity newActivity) {
		this.activity = newActivity;
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
	 * Returns comments.
	 * @return comments 
	 */
	public HashSet<Comment> getComments() {
		return this.comments;
	}

}
