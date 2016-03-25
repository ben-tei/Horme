package ui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Class ShopCartView.
 */
public class ShopCartView extends JPanel implements ActionListener {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The view controller. */
	private ViewController viewController;

	/** The btn validate. */
	private JButton btnValidate;


	/**
	 * Instantiates a new shop cart view.
	 *
	 * @param vc the vc
	 */
	public ShopCartView (ViewController vc) {

		this.viewController = vc;

		this.setLayout(null);

		new Menu(this, this.viewController);


		JLabel name = new JLabel("Name");
		name.setBounds(140, 175, 46, 14);
		this.add(name);

		JLabel quantity = new JLabel("Quantity");
		quantity.setBounds(334, 175, 60, 14);
		this.add(quantity);

		JLabel price = new JLabel("Price");
		price.setBounds(519, 175, 46, 14);
		this.add(price);




		int placement = 231;


		for(int i = 0; i <= this.viewController.getShopCartFacade().readShopCart(this.viewController.getUserFacade().getUser()).size() - 1; i++) {

			JLabel Pname = new JLabel(this.viewController.getShopCartFacade().readShopCart(this.viewController.getUserFacade().getUser()).getShopCartRowByIndex(i).getName());
			Pname.setBounds(140, placement, 120, 14);
			this.add(Pname);

			JLabel Pquantity = new JLabel(this.viewController.getShopCartFacade().readShopCart(this.viewController.getUserFacade().getUser()).getShopCartRowByIndex(i).getQuantity());
			Pquantity.setBounds(334, placement, 120, 14);
			this.add(Pquantity);

			JLabel Pprice = new JLabel(this.viewController.getShopCartFacade().readShopCart(this.viewController.getUserFacade().getUser()).getShopCartRowByIndex(i).getPrice());
			Pprice.setBounds(519, placement, 120, 14);
			this.add(Pprice);

			placement = placement + 32;
		}

		btnValidate = new JButton("Validate the cart");
		btnValidate.setBounds(135, placement+24, 140, 23);
		btnValidate.addActionListener(this);
		btnValidate.setActionCommand("validate");
		this.add(btnValidate);

	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		
		if(cmd.equals("validate")) {
			this.shopCartFacade.placeOrder();
			JOptionPane.showMessageDialog(null, "Your order has been successfully added", "Order Confirmation", JOptionPane.INFORMATION_MESSAGE);
			this.viewController.showOrdersPanel();
		}

	}

}
