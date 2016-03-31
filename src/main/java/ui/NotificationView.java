package ui;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Class NotificationView.
 */
public class NotificationView extends JPanel implements ActionListener
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The view controller. */
	private ViewController viewController;

	/**
	 * Instantiates a new notification view.
	 *
	 * @param vc the ViewController
	 */
	public NotificationView(ViewController vc)
	{

		this.viewController = vc;

		this.setLayout(null);

		new Menu(this, this.viewController);

	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		// TODO Auto-generated method stub

	}

}
