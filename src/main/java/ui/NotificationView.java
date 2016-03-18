package ui;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import bl.NotificationFacade;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NotificationView extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private NotificationFacade notificationFacade;
	private SpringLayout sl_container;
	private ViewController viewController;

	public NotificationView (ViewController vc, String loginText) {

		this.notificationFacade = new NotificationFacade();

		this.viewController = vc;

		this.sl_container = new SpringLayout();
		this.setLayout(sl_container);

		new Menu(this.sl_container, this, this.viewController);


	}

	public void getNotifications() {
		this.notificationFacade.getNotifications();
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
