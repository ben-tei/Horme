package ui;

import javax.swing.JButton;

/**
 * The Class MyJButton.
 */
public class MyJButton extends JButton
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The index. */
	private int index;

	/**
	 * Instantiates a new myJButton.
	 *
	 * @param name the name
	 * @param index the index
	 */
	public MyJButton(String name, int index)
	{
		super(name);
		this.index = index;
	}

	/**
	 * Gets the index.
	 *
	 * @return the index
	 */
	public int getIndex()
	{
		return this.index;
	}

}
