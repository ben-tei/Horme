package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SpringLayout;
import bl.ProductFacade;

public class ProductView extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	private SpringLayout sl_container;
	private ViewController viewController;
	private ProductFacade productFacade;

	public ProductView (ViewController vc) throws SQLException
	{
		this.viewController = vc;
		this.productFacade = new ProductFacade();

		this.sl_container = new SpringLayout();
		this.setLayout(sl_container);

		new Menu(this.sl_container, this, this.viewController);
		
		JLabel name = new JLabel("Name");
		this.sl_container.putConstraint(SpringLayout.WEST, name, 100, SpringLayout.WEST, this);
		this.sl_container.putConstraint(SpringLayout.NORTH, name, 180, SpringLayout.NORTH, this);
		this.add(name);
		
		JLabel reference = new JLabel("Reference");
		this.sl_container.putConstraint(SpringLayout.WEST, reference, 250, SpringLayout.WEST, this);
		this.sl_container.putConstraint(SpringLayout.NORTH, reference, 180, SpringLayout.NORTH, this);
		this.add(reference);
		
		JLabel price = new JLabel("Price");
		this.sl_container.putConstraint(SpringLayout.WEST, price, 400, SpringLayout.WEST, this);
		this.sl_container.putConstraint(SpringLayout.NORTH, price, 180, SpringLayout.NORTH, this);
		this.add(price);
		
		JLabel quantity = new JLabel("Quantity");
		this.sl_container.putConstraint(SpringLayout.WEST, quantity, 550, SpringLayout.WEST, this);
		this.sl_container.putConstraint(SpringLayout.NORTH, quantity, 180, SpringLayout.NORTH, this);
		this.add(quantity);
		
		
		int placement = 210;
		
		
		for(int i = 0; i <= productFacade.readProducts().size() - 1; i++) {
			
			
			JLabel Pname = new JLabel(productFacade.readProducts().getProductByIndex(i).getName());
			this.sl_container.putConstraint(SpringLayout.WEST, Pname, 100, SpringLayout.WEST, this);
			this.sl_container.putConstraint(SpringLayout.NORTH, Pname, placement, SpringLayout.NORTH, this);
			this.add(Pname);
			
			JLabel Preference = new JLabel(productFacade.readProducts().getProductByIndex(i).getReference());
			this.sl_container.putConstraint(SpringLayout.WEST, Preference, 250, SpringLayout.WEST, this);
			this.sl_container.putConstraint(SpringLayout.NORTH, Preference, placement, SpringLayout.NORTH, this);
			this.add(Preference);
			
			JLabel Pprice = new JLabel(productFacade.readProducts().getProductByIndex(i).getPrice());
			this.sl_container.putConstraint(SpringLayout.WEST, Pprice, 400, SpringLayout.WEST, this);
			this.sl_container.putConstraint(SpringLayout.NORTH, Pprice, placement, SpringLayout.NORTH, this);
			this.add(Pprice);
			
			JLabel Pquantity = new JLabel(productFacade.readProducts().getProductByIndex(i).getStockQuantity());
			this.sl_container.putConstraint(SpringLayout.WEST, Pquantity, 550, SpringLayout.WEST, this);
			this.sl_container.putConstraint(SpringLayout.NORTH, Pquantity, placement, SpringLayout.NORTH, this);
			this.add(Pquantity);
			
			placement = placement + 20;
		}
			

	}
	

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		

	}

}
