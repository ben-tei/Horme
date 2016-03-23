package ui;

import javax.swing.JPanel;

import bl.facade.NotificationFacade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotificationView extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private NotificationFacade notificationFacade;
	private ViewController viewController;

	public NotificationView (ViewController vc) {

		this.notificationFacade = new NotificationFacade();

		this.viewController = vc;

		this.setLayout(null);

		new Menu(this, this.viewController);
		

	}

	public void getNotifications() {
		this.notificationFacade.getNotifications();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
