package ui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import bl.core.User;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Class ActivitiesView.
 */
public class ActivitiesView extends JPanel implements ActionListener
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The view controller. */
	private ViewController viewController;

	/** The button add activity. */
	private JButton btnAddActivity;

	/**
	 * Instantiates a new activities view.
	 *
	 * @param vc the ViewController
	 */
	public ActivitiesView(ViewController vc)
	{

		this.viewController = vc;

		this.setLayout(null);

		new Menu(this, this.viewController);

		JLabel name = new JLabel("Name");
		name.setBounds(140, 175, 200, 14);
		this.add(name);

		JLabel category = new JLabel("Category");
		category.setBounds(400, 175, 100, 14);
		this.add(category);

		JLabel description = new JLabel("Description");
		description.setBounds(520, 175, 250, 14);
		this.add(description);

		this.btnAddActivity = new JButton("Add Activity");
		btnAddActivity.setBounds(700, 500, 150, 23);
		this.btnAddActivity.addActionListener(this);
		this.btnAddActivity.setActionCommand("addActivity");
		this.btnAddActivity.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(btnAddActivity);

		int placement = 231;
		User user = this.viewController.getUserFacade().getUser();

		for (int i = 0; i <= this.viewController.getActivityFacade().readActivities(user).size() - 1; i++)
		{

			JLabel Aname = new JLabel(
					this.viewController.getActivityFacade().readActivities(user).getActivityByIndex(i).getName());
			Aname.setBounds(140, placement, 200, 14);
			this.add(Aname);

			JLabel Acategory = new JLabel(this.viewController.getActivityFacade().readActivities(user)
					.getActivityByIndex(i).getCategory().getName());
			Acategory.setBounds(400, placement, 100, 14);
			this.add(Acategory);

			JLabel Adescription = new JLabel(this.viewController.getActivityFacade().readActivities(user)
					.getActivityByIndex(i).getDescription());
			Adescription.setBounds(520, placement, 200, 14);
			this.add(Adescription);

			MyJButton deleteActivity = new MyJButton("Delete", i);
			deleteActivity.addActionListener(this);
			deleteActivity.setActionCommand("delete");
			deleteActivity.setBounds(700, placement - 3, 80, 20);
			this.add(deleteActivity);

			placement = placement + 32;
		}
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		if (cmd.equals("addActivity"))
		{
			this.viewController.showCreateActivityPanel();
		} else if (cmd.equals("delete"))
		{
			int index = ((MyJButton) e.getSource()).getIndex();
			viewController.getActivityFacade().removeFromMyActivities(index);
			viewController.showActivitiesPanel();
		}
	}

}
