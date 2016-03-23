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
public class Menu implements ActionListener {

	/** The search. */
	private JTextField search;
	
	/** The view controller. */
	private ViewController viewController;
	
	/** The lbl user. */
	private JLabel lblUser;
	
	/** The btn notifications. */
	private JButton btnNotifications;
	
	/** The btn profile. */
	private JButton btnProfile;
	
	/** The btn products. */
	private JButton btnProducts;
	
	/** The btn my activities. */
	private JButton btnMyActivities;
	
	/** The btn my diary. */
	private JButton btnMyDiary;
	
	/** The btn my wishlist. */
	private JButton btnMyWishlist;
	
	/** The btn my orders. */
	private JButton btnMyOrders;
	
	/** The btn shopping cart. */
	private JButton btnShoppingCart;
	
	/** The lbl search. */
	private JLabel lblSearch;
	
	/** The lbl horme. */
	private JLabel lblHorme;

	/**
	 * Instantiates a new menu.
	 *
	 * @param jp the jp
	 * @param vc the vc
	 */
	public Menu(JPanel jp, ViewController vc)
	{	
		this.viewController = vc;

		lblUser = new JLabel("Connected as : " + this.viewController.getUserFacade().getUser().getFirstName() + " " + this.viewController.getUserFacade().getUser().getName());
		lblUser.setBounds(15, 31, 309, 14);
		jp.add(lblUser);

		btnNotifications = new JButton("Notifications");
		btnNotifications.setBounds(15, 70, 115, 23);
		btnNotifications.addActionListener(this);
		btnNotifications.setActionCommand("notification");
		jp.add(btnNotifications);

		btnProfile = new JButton("My profile");
		btnProfile.setBounds(140, 70, 89, 23);
		btnProfile.addActionListener(this);
		btnProfile.setActionCommand("profil");
		jp.add(btnProfile);

		btnProducts = new JButton("Products");
		btnProducts.setBounds(233, 70, 91, 23);
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

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();

		if(cmd.equals("notification")) {
			this.viewController.showNotificationPanel();
		}

		else if(cmd.equals("profil")) {
			this.viewController.showProfilePanel();
		}

		else if(cmd.equals("products"))
		{
			this.viewController.showProductsPanel();
		}

		else if(cmd.equals("activities")) {
			this.viewController.showActivitiesPanel();
		}

		else if(cmd.equals("diary")) {
			this.viewController.showDiaryPanel();
		}

		else if(cmd.equals("wishlist")) {
			this.viewController.showWishlistPanel();
		}

		else if(cmd.equals("orders")) {
			this.viewController.showOrdersPanel();
		}

		else if(cmd.equals("cart")) {
			this.viewController.showShopCartPanel();
		}

		else if(cmd.equals("search")) {
			this.viewController.showSearchPanel(this.search.getText());
		}
	}

}
