package ui;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import bl.core.ProductSet;
import bl.core.ShopCartRowSet;
import exceptions.NotEnoughStockException;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

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

	private ArrayList<JComboBox<Integer>> comboBoxList = new ArrayList<JComboBox<Integer>>();

	private ShopCartRowSet shopCartRowSet;

	private ProductSet productSet;


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

		this.shopCartRowSet = this.viewController.getShopCartFacade().readShopCart(this.viewController.getUserFacade().getUser());
		this.productSet = this.viewController.getProductFacade().readProducts();

		for(int i = 0; i <= this.shopCartRowSet.size() - 1; i++) {

			JLabel Pname = new JLabel(this.shopCartRowSet.getShopCartRowByIndex(i).getName());
			Pname.setBounds(140, placement, 120, 14);
			this.add(Pname);

			JComboBox<Integer> Pquantity = new JComboBox<Integer>();

			for(int j = 0; j < this.productSet.getProductById(this.shopCartRowSet.getShopCartRowByIndex(i).getIdProduct()).getStockQuantity() + this.shopCartRowSet.getShopCartRowByIndex(i).getQuantity() + 1; j++)
			{
				Pquantity.addItem(j);
			}
			Pquantity.setSelectedIndex(this.shopCartRowSet.getShopCartRowByIndex(i).getQuantity());
			Pquantity.setBounds(334, placement - 3, 50, 20);
			this.add(Pquantity);
			comboBoxList.add(Pquantity);

			JLabel Pprice = new JLabel(Integer.toString(this.shopCartRowSet.getShopCartRowByIndex(i).getPrice()));
			Pprice.setBounds(519, placement, 120, 14);
			this.add(Pprice);

			MyJButton updateShopCarte = new MyJButton("Update", i);
			updateShopCarte.addActionListener(this);
			updateShopCarte.setActionCommand("update");
			updateShopCarte.setBounds(620, placement - 3, 80, 20);
			this.add(updateShopCarte);

			placement = placement + 50;
		}

		if(this.shopCartRowSet.size() > 0)
		{

			btnValidate = new JButton("Validate the cart");
			btnValidate.setBounds(135, placement + 50, 140, 23);
			btnValidate.addActionListener(this);
			btnValidate.setActionCommand("validate");
			this.add(btnValidate);
		}

	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();

		if(cmd.equals("validate")) {
			this.viewController.getShopCartFacade().placeOrder();
			JOptionPane.showMessageDialog(null, "Your order has been successfully added", "Order Confirmation", JOptionPane.INFORMATION_MESSAGE);
			this.viewController.showOrdersPanel();
		}
		else if(cmd.equals("update"))
		{
			int index = ((MyJButton)e.getSource()).getIndex();
			int oldQuantity = viewController.getShopCartFacade().getQuantity(this.shopCartRowSet.getShopCartRowByIndex(index).getIdProduct());
			try {
				viewController.getProductFacade().updateQuantityInStock(this.shopCartRowSet.getShopCartRowByIndex(index).getIdProduct(), (int) comboBoxList.get(index).getSelectedItem(), oldQuantity);
				viewController.getShopCartFacade().removeFromShoppingCart(index, (int) comboBoxList.get(index).getSelectedItem());
				JOptionPane.showMessageDialog(null, "The product has been updated !", "Success", JOptionPane.INFORMATION_MESSAGE);
				viewController.showShopCartPanel();
			} catch (NotEnoughStockException e1) {
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1.getMessage(), "Failure", JOptionPane.WARNING_MESSAGE);
			}

		}

	}

}
