package ui;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import bl.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WishlistView extends JPanel implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	private SpringLayout sl_container;
	private ViewController viewController;
	
	public WishlistView (ViewController vc) {
		
		this.viewController = vc;

		this.sl_container = new SpringLayout();
		this.setLayout(sl_container);

		new Menu(this.sl_container, this, this.viewController);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
