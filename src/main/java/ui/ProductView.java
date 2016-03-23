package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JPanel;

import bl.facade.ProductFacade;

/**
 * The Class ProductView.
 */
public class ProductView extends JPanel implements ActionListener{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;
	
	/** The view controller. */
	private ViewController viewController;
	
	/** The product facade. */
	private ProductFacade productFacade;

	/**
	 * Instantiates a new product view.
	 *
	 * @param vc the vc
	 */
	public ProductView (ViewController vc)
	{
		this.viewController = vc;
		this.productFacade = new ProductFacade();

		this.setLayout(null);

		new Menu(this, this.viewController);

		JLabel name = new JLabel("Name");
		name.setBounds(140, 175, 46, 14);
		this.add(name);

		JLabel reference = new JLabel("Reference");
		reference.setBounds(334, 175, 60, 14);
		this.add(reference);

		JLabel price = new JLabel("Price");
		price.setBounds(519, 175, 46, 14);
		this.add(price);

		JLabel quantity = new JLabel("Quantity");
		quantity.setBounds(695, 175, 52, 14);
		this.add(quantity);


		int placement = 231;


		for(int i = 0; i <= productFacade.readProducts().size() - 1; i++) {

			JLabel Pname = new JLabel(productFacade.readProducts().getProductByIndex(i).getName());
			Pname.setBounds(140, placement, 120, 14);
			this.add(Pname);

			JLabel Preference = new JLabel(productFacade.readProducts().getProductByIndex(i).getReference());
			Preference.setBounds(334, placement, 120, 14);
			this.add(Preference);

			JLabel Pprice = new JLabel(productFacade.readProducts().getProductByIndex(i).getPrice());
			Pprice.setBounds(519, placement, 120, 14);
			this.add(Pprice);

			JLabel Pquantity = new JLabel(productFacade.readProducts().getProductByIndex(i).getStockQuantity());
			Pquantity.setBounds(695, placement, 120, 14);
			this.add(Pquantity);

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
