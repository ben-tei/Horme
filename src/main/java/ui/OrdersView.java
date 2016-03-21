package ui;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrdersView extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private ViewController viewController;
	
	public OrdersView (ViewController vc) {
		
		this.viewController = vc;

		this.setLayout(null);

		new Menu(this, this.viewController);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
