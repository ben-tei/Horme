package ui;

import javax.swing.JButton;

public class MyJButton extends JButton {

	private static final long serialVersionUID = 1L;
	private int indice;

	public MyJButton(String name, int indice)
	{
		super(name);
		this.indice = indice;
	}

	public int getIndice()
	{
		return this.indice;
	}

}
