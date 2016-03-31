package ui;

import javax.swing.JFrame;

/**
 * The Class Window.
 */
public class Window extends JFrame
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/**
	 * Instantiates a new window.
	 *
	 * @param height
	 *            the height
	 * @param width
	 *            the width
	 */
	public Window(int height, int width)
	{
		this.setTitle("Horme");

		this.setSize(width, height);

		this.setLocationRelativeTo(null);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.setResizable(false);
	}

}
