package ui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import bl.core.ProductSet;
import exceptions.NotEnoughStockException;

/**
 * The Class ProductView.
 */
public class SearchView extends JPanel implements ActionListener
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The view controller. */
	private ViewController viewController;

	/** The product set. */
	private ProductSet productSet;

	/** The combo box list. */
	private ArrayList<JComboBox<Integer>> comboBoxList = new ArrayList<JComboBox<Integer>>();

	/**
	 * Instantiates a new product view.
	 *
	 * @param vc the ViewController
	 * @param searchString the search string
	 */
	public SearchView(ViewController vc, String searchString)
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

		productSet = this.viewController.getProductFacade().searchProducts(searchString);

		for (int i = 0; i < productSet.size(); i++)
		{

			if (productSet.getProductByIndex(i).getStockQuantity() > 0)
			{

				JLabel Pname = new JLabel(productSet.getProductByIndex(i).getName());
				Pname.setBounds(65, placement, 120, 14);
				this.add(Pname);

				JLabel Preference = new JLabel(productSet.getProductByIndex(i).getReference());
				Preference.setBounds(260, placement, 120, 14);
				this.add(Preference);

				JLabel Pprice = new JLabel(Integer.toString(productSet.getProductByIndex(i).getPrice()));
				Pprice.setBounds(445, placement, 120, 14);
				this.add(Pprice);

				JComboBox<Integer> Pquantity = new JComboBox<Integer>();
				for (int j = 0; j < productSet.getProductByIndex(i).getStockQuantity(); j++)
				{
					Pquantity.addItem(j + 1);
				}
				Pquantity.setBounds(620, placement - 3, 50, 20);
				this.add(Pquantity);
				comboBoxList.add(Pquantity);

				MyJButton addToShopCartButton = new MyJButton("Add to Shopping Cart", i);
				addToShopCartButton.addActionListener(this);
				addToShopCartButton.setActionCommand("add");
				addToShopCartButton.setBounds(710, placement - 3, 160, 20);
				this.add(addToShopCartButton);

				placement = placement + 50;
			}
		}

	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		if (cmd.equals("add"))
		{
			int index = ((MyJButton) e.getSource()).getIndex();
			try
			{
				viewController.getProductFacade().updateQuantityInStock(index,
						(int) comboBoxList.get(index).getSelectedItem());
				viewController.getShopCartFacade().addToShoppingCart(productSet.getProductByIndex(index),
						(int) comboBoxList.get(index).getSelectedItem());
				JOptionPane.showMessageDialog(null, "The product has been added !", "Success",
						JOptionPane.INFORMATION_MESSAGE);
				viewController.showShopCartPanel();
			} catch (NotEnoughStockException e1)
			{
				// TODO Auto-generated catch block
				JOptionPane.showMessageDialog(null, e1.getMessage(), "Failure", JOptionPane.WARNING_MESSAGE);
			}
		}

	}

}
