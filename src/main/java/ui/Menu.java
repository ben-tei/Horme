package ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * The Class Menu.
 */
public class Menu implements ActionListener
{

	/** The search. */
	private JTextField search;

	/** The view controller. */
	private ViewController viewController;

	/** The label user. */
	private JLabel lblUser;

	/** The button notifications. */
	private JButton btnHome;

	/** The button profile. */
	private JButton btnProfile;

	/** The button products. */
	private JButton btnProducts;

	/** The button my activities. */
	private JButton btnMyActivities;

	/** The button my diary. */
	private JButton btnMyDiary;

	/** The button my wishlist. */
	private JButton btnMyWishlist;

	/** The button my orders. */
	private JButton btnMyOrders;

	/** The button shopping cart. */
	private JButton btnShoppingCart;

	/** The button disconnect. */
	private JButton btnDisconnect;

	/** The label search. */
	private JLabel lblSearch;

	/** The label horme. */
	private JLabel lblHorme;

	/**
	 * Instantiates a new menu.
	 *
	 * @param jp the JPanel
	 * @param vc the ViewController
	 */
	public Menu(JPanel jp, ViewController vc)
	{
		this.viewController = vc;

		String firstname = this.viewController.getUserFacade().getUser().getFirstName();
		String name = this.viewController.getUserFacade().getUser().getName();

		lblUser = new JLabel(firstname + " " + name);
		lblUser.setBounds(15, 31, 174, 14);
		jp.add(lblUser);

		int x = 0;

		if (firstname.length() + name.length() > 23)
		{
			x = 194;
		}
		else
		{
			x = (firstname.length() + name.length() + 1) * 11;
		}

		btnDisconnect = new JButton("Logout");
		btnDisconnect.setBounds(x, 28, 80, 20);
		btnDisconnect.addActionListener(this);
		btnDisconnect.setActionCommand("logout");
		btnDisconnect.setFocusPainted(false);
		jp.add(btnDisconnect);

		btnHome = new JButton("Home");
		btnHome.setBounds(15, 70, 115, 23);
		btnHome.addActionListener(this);
		btnHome.setActionCommand("home");
		jp.add(btnHome);

		btnProfile = new JButton("My profile");
		btnProfile.setBounds(140, 70, 89, 23);
		btnProfile.addActionListener(this);
		btnProfile.setActionCommand("profil");
		jp.add(btnProfile);

		btnProducts = new JButton("Products");
		btnProducts.setBounds(236, 70, 91, 23);
		btnProducts.addActionListener(this);
		btnProducts.setActionCommand("products");
		jp.add(btnProducts);

		btnMyActivities = new JButton("My activities");
		btnMyActivities.setBounds(334, 70, 106, 23);
		btnMyActivities.addActionListener(this);
		btnMyActivities.setActionCommand("activities");
		jp.add(btnMyActivities);

		btnMyDiary = new JButton("My diary");
		btnMyDiary.setBounds(450, 70, 83, 23);
		btnMyDiary.addActionListener(this);
		btnMyDiary.setActionCommand("diary");
		jp.add(btnMyDiary);

		btnMyWishlist = new JButton("My wishlist");
		btnMyWishlist.setBounds(543, 70, 97, 23);
		btnMyWishlist.addActionListener(this);
		btnMyWishlist.setActionCommand("wishlist");
		jp.add(btnMyWishlist);

		btnMyOrders = new JButton("My orders");
		btnMyOrders.setBounds(650, 70, 91, 23);
		btnMyOrders.addActionListener(this);
		btnMyOrders.setActionCommand("orders");
		jp.add(btnMyOrders);

		btnShoppingCart = new JButton("Shopping Cart");
		btnShoppingCart.setBounds(751, 70, 115, 23);
		btnShoppingCart.addActionListener(this);
		btnShoppingCart.setActionCommand("cart");
		jp.add(btnShoppingCart);

		this.search = new JTextField();
		search.setBounds(751, 28, 115, 20);
		search.addActionListener(this);
		search.setActionCommand("search");
		jp.add(search);

		lblSearch = new JLabel("Search");
		lblSearch.setBounds(697, 31, 44, 14);
		jp.add(lblSearch);

		lblHorme = new JLabel("HORME");
		lblHorme.setBounds(400, 10, 60, 22);
		lblHorme.setFont(new Font("Tahoma", Font.PLAIN, 18));
		jp.add(lblHorme);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();

		if (cmd.equals("home"))
		{
			this.viewController.showHomePanel();
		}

		else if (cmd.equals("profil"))
		{
			this.viewController.showProfilePanel();
		}

		else if (cmd.equals("products"))
		{
			this.viewController.showProductsPanel();
		}

		else if (cmd.equals("activities"))
		{
			this.viewController.showActivitiesPanel();
		}

		else if (cmd.equals("diary"))
		{
			this.viewController.showDiaryPanel();
		}

		else if (cmd.equals("wishlist"))
		{
			this.viewController.showWishlistPanel();
		}

		else if (cmd.equals("orders"))
		{
			this.viewController.showOrdersPanel();
		}

		else if (cmd.equals("cart"))
		{
			this.viewController.showShopCartPanel();
		}

		else if (cmd.equals("search"))
		{
			this.viewController.showSearchPanel(this.search.getText());
		}

		else if (cmd.equals("logout"))
		{
			this.viewController.showLoginPanel();
		}
	}

}
