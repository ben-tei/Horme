package ui;

import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

public class Menu {

	private JTextField search;

	public Menu(SpringLayout sl_container, JPanel jp)
	{		
		JLabel lblNewLabel = new JLabel("UserLoged");
		sl_container.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, jp);
		jp.add(lblNewLabel);

		JButton btnNotifications = new JButton("Notifications");
		sl_container.putConstraint(SpringLayout.NORTH, btnNotifications, 70, SpringLayout.NORTH, jp);
		sl_container.putConstraint(SpringLayout.WEST, btnNotifications, 20, SpringLayout.EAST, lblNewLabel);
		sl_container.putConstraint(SpringLayout.NORTH, lblNewLabel, 4, SpringLayout.NORTH, btnNotifications);
		jp.add(btnNotifications);

		JButton btnProfil = new JButton("My profil");
		sl_container.putConstraint(SpringLayout.NORTH, btnProfil, 0, SpringLayout.NORTH, btnNotifications);
		sl_container.putConstraint(SpringLayout.WEST, btnProfil, 16, SpringLayout.EAST, btnNotifications);
		jp.add(btnProfil);

		JButton btnProducts = new JButton("Products");
		sl_container.putConstraint(SpringLayout.NORTH, btnProducts, 0, SpringLayout.NORTH, btnNotifications);
		sl_container.putConstraint(SpringLayout.WEST, btnProducts, 1, SpringLayout.EAST, btnProfil);
		jp.add(btnProducts);

		JButton btnMyActivities = new JButton("My activities");
		sl_container.putConstraint(SpringLayout.NORTH, btnMyActivities, 0, SpringLayout.NORTH, btnNotifications);
		sl_container.putConstraint(SpringLayout.WEST, btnMyActivities, 1, SpringLayout.EAST, btnProducts);
		jp.add(btnMyActivities);

		JButton btnMyDiary = new JButton("My diary");
		sl_container.putConstraint(SpringLayout.NORTH, btnMyDiary, 0, SpringLayout.NORTH, btnNotifications);
		sl_container.putConstraint(SpringLayout.WEST, btnMyDiary, 1, SpringLayout.EAST, btnMyActivities);
		jp.add(btnMyDiary);

		JButton btnMyWishlist = new JButton("My wishlist");
		sl_container.putConstraint(SpringLayout.NORTH, btnMyWishlist, 0, SpringLayout.NORTH, btnNotifications);
		sl_container.putConstraint(SpringLayout.WEST, btnMyWishlist, 1, SpringLayout.EAST, btnMyDiary);
		jp.add(btnMyWishlist);

		JButton btnMyOrders = new JButton("My orders");
		sl_container.putConstraint(SpringLayout.NORTH, btnMyOrders, 0, SpringLayout.NORTH, btnNotifications);
		sl_container.putConstraint(SpringLayout.WEST, btnMyOrders, 1, SpringLayout.EAST, btnMyWishlist);
		jp.add(btnMyOrders);

		JButton btnShoppingCart = new JButton("Shopping Cart");
		sl_container.putConstraint(SpringLayout.NORTH, btnShoppingCart, -4, SpringLayout.NORTH, lblNewLabel);
		sl_container.putConstraint(SpringLayout.WEST, btnShoppingCart, 19, SpringLayout.EAST, btnMyOrders);
		jp.add(btnShoppingCart);

		this.search = new JTextField();
		sl_container.putConstraint(SpringLayout.WEST, search, 0, SpringLayout.WEST, btnShoppingCart);
		sl_container.putConstraint(SpringLayout.SOUTH, search, -22, SpringLayout.NORTH, btnShoppingCart);
		sl_container.putConstraint(SpringLayout.EAST, search, 0, SpringLayout.EAST, btnShoppingCart);
		jp.add(search);

		JLabel lblSearch = new JLabel("Search");
		sl_container.putConstraint(SpringLayout.WEST, lblSearch, -50, SpringLayout.WEST, search);
		sl_container.putConstraint(SpringLayout.SOUTH, lblSearch, -25, SpringLayout.NORTH, btnMyOrders);
		sl_container.putConstraint(SpringLayout.EAST, lblSearch, -6, SpringLayout.WEST, search);
		jp.add(lblSearch);

		JLabel lblHorme = new JLabel("HORME");
		sl_container.putConstraint(SpringLayout.NORTH, lblHorme, 10, SpringLayout.NORTH, jp);
		sl_container.putConstraint(SpringLayout.WEST, lblHorme, 400, SpringLayout.WEST, jp);
		lblHorme.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jp.add(lblHorme);
	}

}
