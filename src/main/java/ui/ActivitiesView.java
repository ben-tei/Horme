package ui;

import javax.swing.JLabel;
import javax.swing.JPanel;

import bl.core.User;
import bl.facade.ActivityFacade;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Class ActivitiesView.
 */
public class ActivitiesView extends JPanel implements ActionListener {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The view controller. */
	private ViewController viewController;
	
	/** The product facade. */
	private ActivityFacade activityFacade;
	
	/**
	 * Instantiates a new activities view.
	 *
	 * @param vc the vc
	 */
	public ActivitiesView (ViewController vc) {

		this.viewController = vc;
		this.activityFacade = new ActivityFacade();
		this.setLayout(null);

		new Menu(this, this.viewController);
		
		JLabel name = new JLabel("Name");
		name.setBounds(140, 175, 46, 14);
		this.add(name);

		JLabel category = new JLabel("Category");
		category.setBounds(334, 175, 60, 14);
		this.add(category);

		JLabel description = new JLabel("Description");
		description.setBounds(519, 175, 46, 14);
		this.add(description);
		
		int placement = 231;
		User user = this.viewController.getUserFacade().getUser();

		for(int i = 0; i <= activityFacade.readActivities(user).size() - 1; i++) {

			JLabel Pname = new JLabel(activityFacade.readActivities(user).getActivityByIndex(i).getName());
			Pname.setBounds(140, placement, 120, 14);
			this.add(Pname);

			JLabel Pcategory = new JLabel(activityFacade.readActivities(user).getActivityByIndex(i).getCategory().getName());
			Pcategory.setBounds(334, placement, 120, 14);
			this.add(Pcategory);

			JLabel Pdescription = new JLabel(activityFacade.readActivities(user).getActivityByIndex(i).getDescription());
			Pdescription.setBounds(519, placement, 120, 14);
			this.add(Pdescription);

			placement = placement + 32;
		}
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
