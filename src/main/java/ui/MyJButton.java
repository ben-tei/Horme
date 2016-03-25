package ui;

import javax.swing.JButton;

public class MyJButton extends JButton {

	private static final long serialVersionUID = 1L;
	private int id;

	public MyJButton(String name, int id)
	{
		super(name);
		this.id = id;
	}

	public int getId()
	{
		return this.id;
	}

}
