package ui;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class ViewController {

	private JFrame myWindow;
	private JPanel myJPanel;

	public ViewController()
	{
		this.myWindow = new Window(600, 800);
		this.myJPanel = new LoginView(this);
		this.myWindow.setContentPane(myJPanel);
		this.myWindow.setVisible(true);
	}

	public void doAfterLogin()
	{
		JPanel pan = new JPanel();
		pan.setBackground(Color.ORANGE);        
		this.myWindow.setContentPane(pan);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();
	}

	public void showSignUp()
	{
		this.myWindow.setTitle("Horme - Sign Up");
		SignUpView suv = new SignUpView(this);        
		this.myWindow.setContentPane(suv);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();
	}

}
