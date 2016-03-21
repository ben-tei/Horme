package ui;

import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JPanel;

import bl.UserFacade;

public class ViewController {

	private JFrame myWindow;
	private JPanel myJPanel;
	private UserFacade userFacade;

	public ViewController()
	{
		this.myWindow = new Window(600, 920);
		this.myWindow.setVisible(true);
		this.showLoginPanel();
		this.userFacade = new UserFacade();
	}

	public UserFacade getUserFacade()
	{
		return this.userFacade;
	}

	public void showIndexPanel()
	{
		this.myWindow.setTitle("Horme - Welcome");
		this.myJPanel = new IndexView(this);      
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}
	
	public void showNotificationPanel()
	{
		this.myWindow.setTitle("Horme - Notifications");
		this.myJPanel = new NotificationView(this);      
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}
	
	public void showProfilePanel()
	{
		this.myWindow.setTitle("Horme - Profil");
		this.myJPanel = new ProfileView(this);      
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}
	
	public void showActivitiesPanel()
	{
		this.myWindow.setTitle("Horme - Activities");
		this.myJPanel = new ActivitiesView(this);      
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}
	
	public void showDiaryPanel()
	{
		this.myWindow.setTitle("Horme - Diary");
		this.myJPanel = new DiaryView(this);      
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}
	
	public void showWishlistPanel()
	{
		this.myWindow.setTitle("Horme - Wishlist");
		this.myJPanel = new WishlistView(this);      
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}
	
	public void showOrdersPanel()
	{
		this.myWindow.setTitle("Horme - Orders");
		this.myJPanel = new OrdersView(this);      
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}
	
	public void showShopCartPanel()
	{
		this.myWindow.setTitle("Horme - Shopping Cart");
		this.myJPanel = new ShopCartView(this);      
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}

	public void showLoginPanel()
	{
		this.myWindow.setTitle("Horme - Login");
		this.myJPanel = new LoginView(this);        
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();
		((LoginView) this.myJPanel).getLoginField().requestFocusInWindow();
	}

	public void showSignUpPanel()
	{
		this.myWindow.setTitle("Horme - Sign Up");
		this.myJPanel = new SignUpView(this);        
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();
		((SignUpView) this.myJPanel).getNameField().requestFocusInWindow();
	}
	
	public void showProductsPanel() throws SQLException
	{
		this.myWindow.setTitle("Horme - Products");
		this.myJPanel = new ProductView(this);        
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();
	}

}
