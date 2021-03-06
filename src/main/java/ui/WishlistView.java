package ui;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Class WishlistView.
 */
public class WishlistView extends JPanel implements ActionListener
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The view controller. */
	private ViewController viewController;

	/**
	 * Instantiates a new wishlist view.
	 *
	 * @param vc the ViewController
	 */
	public WishlistView(ViewController vc)
	{

		this.viewController = vc;

		this.setLayout(null);

		new Menu(this, this.viewController);

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub

	}

}
