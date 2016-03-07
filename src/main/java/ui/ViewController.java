package ui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewController {

	private JFrame mafenetre;
	private JPanel monjpanel;

	public ViewController()
	{
		this.mafenetre = new Window(600, 800);
		this.monjpanel = new LoginView(this);
		this.mafenetre.setContentPane(monjpanel);
		this.mafenetre.setVisible(true);
	}

	public void doAfterLogin()
	{
		JPanel pan = new JPanel();
		pan.setBackground(Color.ORANGE);        
		this.mafenetre.setContentPane(pan);
		this.mafenetre.getContentPane().revalidate();
		this.mafenetre.getContentPane().repaint();
	}

}
