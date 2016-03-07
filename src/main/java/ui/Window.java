package ui;

import javax.swing.JFrame;

public class Window extends JFrame
{
	private static final long serialVersionUID = 1L;
	
	public Window(int height, int width)
	{
		this.setTitle("Horme");

		this.setSize(width, height);

		this.setLocationRelativeTo(null);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.setResizable(false);
	}
		
}
