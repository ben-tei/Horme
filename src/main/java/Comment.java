/*******************************************************************************
 * 2016, All rights reserved.
 *******************************************************************************/

// Start of user code (user defined imports)

// End of user code

/**
 * Description of Comment.
 * 
 * @author Meche
 */
public class Comment {
	/**
	 * Description of the property person.
	 */
	public Person person = null;

	/**
	 * Description of the property content.
	 */
	private String content = "";

	/**
	 * Description of the property diaryEntry.
	 */
	public DiaryEntry diaryEntry = null;

	// Start of user code (user defined attributes for Comment)

	// End of user code

	/**
	 * The constructor.
	 */
	public Comment() {
		// Start of user code constructor for Comment)
		super();
		// End of user code
	}

	// Start of user code (user defined methods for Comment)

	// End of user code
	/**
	 * Returns person.
	 * @return person 
	 */
	public Person getPerson() {
		return this.person;
	}

	/**
	 * Sets a value to attribute person. 
	 * @param newPerson 
	 */
	public void setPerson(Person newPerson) {
		this.person = newPerson;
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
	 * Returns diaryEntry.
	 * @return diaryEntry 
	 */
	public DiaryEntry getDiaryEntry() {
		return this.diaryEntry;
	}

	/**
	 * Sets a value to attribute diaryEntry. 
	 * @param newDiaryEntry 
	 */
	public void setDiaryEntry(DiaryEntry newDiaryEntry) {
		this.diaryEntry = newDiaryEntry;
	}

}
