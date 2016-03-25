package ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import exceptions.NotEnoughStockException;

public class SelectProductQuantityDialog extends JDialog {

	private static final long serialVersionUID = 1L;
	private JTextField quantityField;
	private JLabel quantityLabel;
	private int quantity;
	private ViewController viewController;
	private int id;

	public SelectProductQuantityDialog(ViewController vc, String title, boolean modal, int id) {
		super(vc.getMyWindow(), title, modal);
		this.viewController = vc;
		this.id = id;
		this.setSize(440, 135);
		this.setLocationRelativeTo(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		this.initComponent();
		this.setVisible(true);
	}

	public void initComponent() {

		JPanel panQuantity = new JPanel();
		panQuantity.setBackground(Color.white);
		panQuantity.setPreferredSize(new Dimension(380, 60));
		this.quantityField = new JTextField();
		this.quantityField.setPreferredSize(new Dimension(200, 25));
		panQuantity.setBorder(BorderFactory.createTitledBorder("Quantity"));
		this.quantityLabel = new JLabel("Enter the Quantity :");
		panQuantity.add(this.quantityLabel);
		panQuantity.add(this.quantityField);

		JPanel content = new JPanel();
		content.setBackground(Color.white);
		content.add(panQuantity);

		JPanel control = new JPanel();
		JButton okButton = new JButton("OK");

		okButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				boolean isQuantityString = false;
				if (quantityField.getText().trim().length() != 0)
				{
					int i = 0;
					while (i < quantityField.getText().trim().length() && !isQuantityString) {
						if (!Character.isDigit(quantityField.getText().trim().charAt(i)))
						{
							isQuantityString = true;
						}
						i++;
					}

					if (!isQuantityString)
					{
						if (Integer.parseInt(quantityField.getText()) > 0)
						{
							try {
								viewController.getProductFacade().updateQuantityInStock(id, Integer.parseInt(quantityField.getText()));
								viewController.getShopCartFacade().addToShoppingCart(id, Integer.parseInt(quantityField.getText()));
								setVisible(false);
								viewController.showProductsPanel();
							} catch (NotEnoughStockException e) {
								// TODO Auto-generated catch block
								JOptionPane.showMessageDialog(null,
										e.getMessage(), "Failure", JOptionPane.ERROR_MESSAGE);
							}
						}
					}
					else
					{
						JOptionPane.showMessageDialog(null,
								"Not a Positive Number...", "Failure", JOptionPane.ERROR_MESSAGE);
					}
				}  
			}
		}); 

		control.add(okButton);

		this.getContentPane().add(content, BorderLayout.CENTER);
		this.getContentPane().add(control, BorderLayout.SOUTH);     
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}  



}
