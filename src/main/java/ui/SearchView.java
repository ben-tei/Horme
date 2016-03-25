package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * The Class SearchView.
 */
public class SearchView extends JPanel implements ActionListener {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The view controller. */
	private ViewController viewController;

	/**
	 * Instantiates a new search view.
	 *
	 * @param vc the vc
	 * @param productName the product name
	 */
	public SearchView (ViewController vc, String productName)
	{
		this.viewController = vc;

		this.setLayout(null);

		new Menu(this, this.viewController);

		JLabel name = new JLabel("Name");
		name.setBounds(65, 175, 46, 14);
		this.add(name);

		JLabel reference = new JLabel("Reference");
		reference.setBounds(260, 175, 80, 14);
		this.add(reference);

		JLabel price = new JLabel("Price");
		price.setBounds(445, 175, 46, 14);
		this.add(price);

		JLabel quantity = new JLabel("Quantity");
		quantity.setBounds(620, 175, 80, 14);
		this.add(quantity);


		int placement = 231;


		for(int i = 0; i <= this.viewController.getProductFacade().searchProducts(productName).size() - 1; i++) {

			JLabel Pname = new JLabel(this.viewController.getProductFacade().readProducts().getProductByIndex(i).getName());
			Pname.setBounds(65, placement, 120, 14);
			this.add(Pname);

			JLabel Preference = new JLabel(this.viewController.getProductFacade().readProducts().getProductByIndex(i).getReference());
			Preference.setBounds(260, placement, 120, 14);
			this.add(Preference);

			JLabel Pprice = new JLabel(this.viewController.getProductFacade().readProducts().getProductByIndex(i).getPrice());
			Pprice.setBounds(445, placement, 120, 14);
			this.add(Pprice);

			JLabel Pquantity = new JLabel(this.viewController.getProductFacade().readProducts().getProductByIndex(i).getStockQuantity());
			Pquantity.setBounds(620, placement, 120, 14);
			this.add(Pquantity);

			JButton addToShopCartButton = new JButton("Add to Shopping Cart");
			addToShopCartButton.setBounds(710, placement-3, 160, 20);
			this.add(addToShopCartButton);

			placement = placement + 50;
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
