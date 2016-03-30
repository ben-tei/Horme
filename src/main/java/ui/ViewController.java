package ui;

import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import bl.facade.ActivityFacade;
import bl.facade.CategoryFacade;
import bl.facade.DiaryFacade;
import bl.facade.ProductFacade;
import bl.facade.ShopCartFacade;
import bl.facade.UserFacade;

/**
 * The Class ViewController.
 */
public class ViewController {

	/** The my window. */
	private Window myWindow;

	/** The my j panel. */
	private JPanel myJPanel;

	/** The user facade. */
	private UserFacade userFacade;

	/** The activity facade. */
	private ActivityFacade activityFacade;

	private CategoryFacade categoryFacade;

	private ShopCartFacade shopCartFacade;

	private ProductFacade productFacade;

	private DiaryFacade diaryFacade;

	/**
	 * Instantiates a new view controller.
	 */
	public ViewController() {
		this.myWindow = new Window(600, 920);
		try {
			this.myWindow.setIconImage(ImageIO.read(new File("assets/icon.png")));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		this.userFacade = new UserFacade();
		this.shopCartFacade = new ShopCartFacade();
		this.categoryFacade = new CategoryFacade();
		this.productFacade = new ProductFacade();
		this.activityFacade = new ActivityFacade();
		this.diaryFacade = new DiaryFacade();
		this.showLoginPanel();
		this.myWindow.setVisible(true);
	}

	/**
	 * Gets the user facade.
	 *
	 * @return the user facade
	 */
	public UserFacade getUserFacade() {
		return this.userFacade;
	}

	/**
	 * Gets the activity facade.
	 *
	 * @return the activity facade
	 */
	public ActivityFacade getActivityFacade() {
		return this.activityFacade;
	}

	public DiaryFacade getDiaryFacade() {
		return diaryFacade;
	}

	public CategoryFacade getCategoryFacade() {
		return categoryFacade;
	}

	public ShopCartFacade getShopCartFacade() {
		return this.shopCartFacade;
	}

	public ProductFacade getProductFacade() {
		return productFacade;
	}

	public Window getMyWindow() {
		return myWindow;
	}

	/**
	 * Show index panel.
	 */
	public void showHomePanel() {
		this.myWindow.setTitle("Horme - Home");
		this.myJPanel = new HomeView(this);
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}

	/**
	 * Show notification panel.
	 */
	public void showNotificationPanel() {
		this.myWindow.setTitle("Horme - Notifications");
		this.myJPanel = new NotificationView(this);
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}

	/**
	 * Show profile panel.
	 */
	public void showProfilePanel() {
		this.myWindow.setTitle("Horme - Profile");
		this.myJPanel = new ProfileView(this);
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}

	/**
	 * Show activities panel.
	 */
	public void showActivitiesPanel() {
		this.myWindow.setTitle("Horme - Activities");
		this.myJPanel = new ActivitiesView(this);
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}

	public void showCreateActivityPanel() {
		this.myWindow.setTitle("Horme - Create Activity");
		this.myJPanel = new CreateActivityView(this);
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}

	public void showCreateObjectivePanel() {
		this.myWindow.setTitle("Horme - Create Objective");
		this.myJPanel = new CreateObjectiveView(this);
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}

	/**
	 * Show activity panel.
	 */
	public void showActivityPanel() {
		this.myWindow.setTitle("Horme - New Activity");
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}

	/**
	 * Show diary panel.
	 */
	public void showDiaryPanel() {
		this.myWindow.setTitle("Horme - Diary");
		this.myJPanel = new DiaryView(this);
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}

	/**
	 * Show wishlist panel.
	 */
	public void showWishlistPanel() {
		this.myWindow.setTitle("Horme - Wishlist");
		this.myJPanel = new WishlistView(this);
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}

	/**
	 * Show orders panel.
	 */
	public void showOrdersPanel() {
		this.myWindow.setTitle("Horme - Orders");
		this.myJPanel = new OrdersView(this);
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}

	/**
	 * Show shop cart panel.
	 */
	public void showShopCartPanel() {
		this.myWindow.setTitle("Horme - Shopping Cart");
		this.myJPanel = new ShopCartView(this);
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();

	}

	/**
	 * Show login panel.
	 */
	public void showLoginPanel() {
		this.myWindow.setTitle("Horme - Login");
		this.myJPanel = new LoginView(this);
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();
		((LoginView) this.myJPanel).getLoginField().requestFocusInWindow();
	}

	/**
	 * Show sign up panel.
	 */
	public void showSignUpPanel() {
		this.myWindow.setTitle("Horme - Sign Up");
		this.myJPanel = new SignUpView(this);
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();
		((SignUpView) this.myJPanel).getNameField().requestFocusInWindow();
	}

	/**
	 * Show products panel.
	 */
	public void showProductsPanel() {
		this.myWindow.setTitle("Horme - Products");
		this.myJPanel = new ProductView(this);
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();
	}

	/**
	 * Show search panel.
	 *
	 * @param searchString
	 *            the search string
	 */
	public void showSearchPanel(String searchString) {
		this.myWindow.setTitle("Horme - Search");
		this.myJPanel = new SearchView(this, searchString);
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();
	}

	public void showForgotPasswordPanel() {
		this.myWindow.setTitle("Horme - Forgot Password");
		this.myJPanel = new ForgotPasswordView(this);
		this.myWindow.setContentPane(this.myJPanel);
		this.myWindow.getContentPane().revalidate();
		this.myWindow.getContentPane().repaint();
		
	}

}
