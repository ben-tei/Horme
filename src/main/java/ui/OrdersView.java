package ui;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JPanel;

import bl.core.User;
import bl.facade.OrderFacade;
import bl.facade.ProductFacade;

/**
 * The Class OrdersView.
 */
public class OrdersView extends JPanel implements ActionListener {
	
	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The view controller. */
	private ViewController viewController;
	
	/** The order facade. */
	private OrderFacade orderFacade;
	
	/**
	 * Instantiates a new orders view.
	 *
	 * @param vc the vc
	 */
	public OrdersView (ViewController vc) {
		
		this.viewController = vc;
		this.orderFacade = new OrderFacade();

		this.setLayout(null);

		new Menu(this, this.viewController);
		
		JLabel date = new JLabel("Date");
		date.setBounds(140, 175, 46, 14);
		this.add(date);

		JLabel numero = new JLabel("Number");
		numero.setBounds(334, 175, 60, 14);
		this.add(numero);

		JLabel website = new JLabel("Website");
		website.setBounds(519, 175, 80, 14);
		this.add(website);
		
		int placement = 231;
		
		User user = this.viewController.getUserFacade().getUser();
		
		for(int i = 0; i <= orderFacade.readOrders(user).size() - 1; i++) {

			JLabel Pdate = new JLabel(orderFacade.readOrders(user).getOrderByIndex(i).getDate());
			Pdate.setBounds(140, placement, 120, 14);
			this.add(Pdate);

			JLabel Pnumero = new JLabel(orderFacade.readOrders(user).getOrderByIndex(i).getNumero());
			Pnumero.setBounds(334, placement, 120, 14);
			this.add(Pnumero);

			JLabel Pwebsite = new JLabel(orderFacade.readOrders(user).getOrderByIndex(i).getTrader().getWebsite());
			Pwebsite.setBounds(519, placement, 300, 14);
			this.add(Pwebsite);

			placement = placement + 32;
		}

	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
