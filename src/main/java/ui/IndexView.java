package ui;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SpringLayout;

import bl.*;
import exceptions.WrongLoginException;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Dimension;

public class IndexView extends JPanel implements ActionListener {
	
	private SpringLayout sl_container;
	private JTextField search;
	private ViewController viewController;
	private UserFacade userFacade;

	public IndexView (ViewController vc)
	{
		this.userFacade = new UserFacade();
		
		this.viewController = vc;
	
		this.sl_container = new SpringLayout();
		this.setLayout(sl_container);
		
		JLabel lblNewLabel = new JLabel("UserLoged");
		sl_container.putConstraint(SpringLayout.WEST, lblNewLabel, 10, SpringLayout.WEST, this);
		this.add(lblNewLabel);
		
		JButton btnNotifications = new JButton("Notifications");
		sl_container.putConstraint(SpringLayout.NORTH, btnNotifications, 70, SpringLayout.NORTH, this);
		sl_container.putConstraint(SpringLayout.WEST, btnNotifications, 20, SpringLayout.EAST, lblNewLabel);
		sl_container.putConstraint(SpringLayout.NORTH, lblNewLabel, 4, SpringLayout.NORTH, btnNotifications);
		this.add(btnNotifications);
		
		JButton btnProfil = new JButton("My profil");
		sl_container.putConstraint(SpringLayout.NORTH, btnProfil, 0, SpringLayout.NORTH, btnNotifications);
		sl_container.putConstraint(SpringLayout.WEST, btnProfil, 16, SpringLayout.EAST, btnNotifications);
		this.add(btnProfil);
		
		JButton btnProducts = new JButton("Products");
		sl_container.putConstraint(SpringLayout.NORTH, btnProducts, 0, SpringLayout.NORTH, btnNotifications);
		sl_container.putConstraint(SpringLayout.WEST, btnProducts, 0, SpringLayout.EAST, btnProfil);
		this.add(btnProducts);
		
		JButton btnMyActivities = new JButton("My activities");
		sl_container.putConstraint(SpringLayout.NORTH, btnMyActivities, 0, SpringLayout.NORTH, btnNotifications);
		sl_container.putConstraint(SpringLayout.WEST, btnMyActivities, 1, SpringLayout.EAST, btnProducts);
		this.add(btnMyActivities);
		
		JButton btnMyDiary = new JButton("My diary");
		sl_container.putConstraint(SpringLayout.NORTH, btnMyDiary, 0, SpringLayout.NORTH, btnNotifications);
		sl_container.putConstraint(SpringLayout.WEST, btnMyDiary, 1, SpringLayout.EAST, btnMyActivities);
		this.add(btnMyDiary);
		
		JButton btnMyWishlist = new JButton("My wishlist");
		sl_container.putConstraint(SpringLayout.NORTH, btnMyWishlist, 0, SpringLayout.NORTH, btnNotifications);
		sl_container.putConstraint(SpringLayout.WEST, btnMyWishlist, 1, SpringLayout.EAST, btnMyDiary);
		this.add(btnMyWishlist);
		
		JButton btnMyOrders = new JButton("My orders");
		sl_container.putConstraint(SpringLayout.NORTH, btnMyOrders, 0, SpringLayout.NORTH, btnNotifications);
		sl_container.putConstraint(SpringLayout.WEST, btnMyOrders, 1, SpringLayout.EAST, btnMyWishlist);
		this.add(btnMyOrders);
		
		JButton btnShoppingCart = new JButton("Shopping Cart");
		sl_container.putConstraint(SpringLayout.NORTH, btnShoppingCart, -4, SpringLayout.NORTH, lblNewLabel);
		sl_container.putConstraint(SpringLayout.WEST, btnShoppingCart, 19, SpringLayout.EAST, btnMyOrders);
		this.add(btnShoppingCart);
		
		this.search = new JTextField();
		sl_container.putConstraint(SpringLayout.WEST, search, 0, SpringLayout.WEST, btnShoppingCart);
		sl_container.putConstraint(SpringLayout.SOUTH, search, -22, SpringLayout.NORTH, btnShoppingCart);
		sl_container.putConstraint(SpringLayout.EAST, search, 0, SpringLayout.EAST, btnShoppingCart);
		this.add(search);
		this.search.setColumns(10);
		
		JLabel lblSearch = new JLabel("Search");
		sl_container.putConstraint(SpringLayout.WEST, lblSearch, -50, SpringLayout.WEST, search);
		sl_container.putConstraint(SpringLayout.SOUTH, lblSearch, -25, SpringLayout.NORTH, btnMyOrders);
		sl_container.putConstraint(SpringLayout.EAST, lblSearch, -6, SpringLayout.WEST, search);
		this.add(lblSearch);
		
		JLabel lblHorme = new JLabel("HORME");
		this.sl_container.putConstraint(SpringLayout.NORTH, lblHorme, 10, SpringLayout.NORTH, this);
		this.sl_container.putConstraint(SpringLayout.WEST, lblHorme, 400, SpringLayout.WEST, this);
		lblHorme.setFont(new Font("Tahoma", Font.PLAIN, 18));
		this.add(lblHorme);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
