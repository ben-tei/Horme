package ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu implements ActionListener {

	private JTextField search;
	private ViewController viewController;

	public Menu(JPanel jp, ViewController vc)
	{	
		this.viewController = vc;
		
		JLabel lblUser = new JLabel("Connected as : " + this.viewController.getUserFacade().getUser().getFirstName() + " " + this.viewController.getUserFacade().getUser().getName());
		lblUser.setBounds(15, 31, 309, 14);
		jp.add(lblUser);

		JButton btnNotifications = new JButton("Notifications");
		btnNotifications.setBounds(15, 70, 115, 23);
		btnNotifications.addActionListener(this);
		btnNotifications.setActionCommand("notification");
		jp.add(btnNotifications);

		JButton btnProfil = new JButton("My profil");
		btnProfil.setBounds(140, 70, 83, 23);
		btnProfil.addActionListener(this);
		btnProfil.setActionCommand("profil");
		jp.add(btnProfil);

		JButton btnProducts = new JButton("Products");
		btnProducts.setBounds(233, 70, 91, 23);
		btnProducts.addActionListener(this);
		btnProducts.setActionCommand("products");
		jp.add(btnProducts);

		JButton btnMyActivities = new JButton("My activities");
		btnMyActivities.setBounds(334, 70, 106, 23);
		btnMyActivities.addActionListener(this);
		btnMyActivities.setActionCommand("activities");
		jp.add(btnMyActivities);

		JButton btnMyDiary = new JButton("My diary");
		btnMyDiary.setBounds(450, 70, 83, 23);
		btnMyDiary.addActionListener(this);
		btnMyDiary.setActionCommand("diary");
		jp.add(btnMyDiary);

		JButton btnMyWishlist = new JButton("My wishlist");
		btnMyWishlist.setBounds(543, 70, 97, 23);
		btnMyWishlist.addActionListener(this);
		btnMyWishlist.setActionCommand("wishlist");
		jp.add(btnMyWishlist);

		JButton btnMyOrders = new JButton("My orders");
		btnMyOrders.setBounds(650, 70, 91, 23);
		btnMyOrders.addActionListener(this);
		btnMyOrders.setActionCommand("orders");
		jp.add(btnMyOrders);

		JButton btnShoppingCart = new JButton("Shopping Cart");
		btnShoppingCart.setBounds(751, 70, 115, 23);
		btnShoppingCart.addActionListener(this);
		btnShoppingCart.setActionCommand("cart");
		jp.add(btnShoppingCart);

		this.search = new JTextField();
		search.setBounds(751, 28, 115, 20);
		jp.add(search);

		JLabel lblSearch = new JLabel("Search");
		lblSearch.setBounds(697, 31, 44, 14);
		jp.add(lblSearch);

		JLabel lblHorme = new JLabel("HORME");
		lblHorme.setBounds(400, 10, 60, 22);
		lblHorme.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jp.add(lblHorme);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		
		if(cmd.equals("notification")) {
			this.viewController.showNotificationPanel();
		}
		
		if(cmd.equals("profil")) {
			this.viewController.showProfilPanel();
		}
		
		if(cmd.equals("products"))
		{
			try {
				this.viewController.showProductsPanel();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		
		if(cmd.equals("activities")) {
			this.viewController.showActivitiesPanel();
		}
		
		if(cmd.equals("diary")) {
			this.viewController.showDiaryPanel();
		}
		
		if(cmd.equals("wishlist")) {
			this.viewController.showWishlistPanel();
		}
		
		if(cmd.equals("orders")) {
			this.viewController.showOrdersPanel();
		}
		
		if(cmd.equals("cart")) {
			this.viewController.showShopCartPanel();
		}
	}

}
