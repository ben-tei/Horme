package ui;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Class OrdersView.
 */
public class OrdersView extends JPanel implements ActionListener {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The view controller. */
	private ViewController viewController;
	
	/**
	 * Instantiates a new orders view.
	 *
	 * @param vc the vc
	 */
	public OrdersView (ViewController vc) {
		
		this.viewController = vc;

		this.setLayout(null);

		new Menu(this, this.viewController);
		
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
