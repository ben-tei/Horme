package ui;

import javax.swing.JLabel;
import javax.swing.JPanel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Class IndexView.
 */
public class HomeView extends JPanel implements ActionListener
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The view controller. */
	private ViewController viewController;

	/**
	 * Instantiates a new index view.
	 *
	 * @param vc the ViewController
	 */
	public HomeView(ViewController vc)
	{
		this.viewController = vc;

		this.setLayout(null);

		new Menu(this, this.viewController);

		JLabel welcome = new JLabel("Welcome !");
		welcome.setBounds(65, 175, 80, 14);
		welcome.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(welcome);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub

	}

}
