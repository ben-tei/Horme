package ui;

import javax.swing.JPanel;

import bl.facade.NotificationFacade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Class NotificationView.
 */
public class NotificationView extends JPanel implements ActionListener {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The notification facade. */
	private NotificationFacade notificationFacade;
	
	/** The view controller. */
	private ViewController viewController;

	/**
	 * Instantiates a new notification view.
	 *
	 * @param vc the vc
	 */
	public NotificationView (ViewController vc) {

		this.notificationFacade = new NotificationFacade();

		this.viewController = vc;

		this.setLayout(null);

		new Menu(this, this.viewController);
		

	}

	/**
	 * Gets the notifications.
	 *
	 * @return the notifications
	 */
	public void getNotifications() {
		this.notificationFacade.getNotifications();
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
