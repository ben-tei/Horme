package ui;

import javax.swing.JButton;

public class MyJButton extends JButton {

	private static final long serialVersionUID = 1L;
	private int index;

	public MyJButton(String name, int index)
	{
		super(name);
		this.index = index;
	}

	public int getIndex()
	{
		return this.index;
	}

}
