package ui;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import bl.core.User;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * The Class DiaryView.
 */
public class DiaryView extends JPanel implements ActionListener {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The view controller. */
	private ViewController viewController;

	private JButton btnAddObjective;

	/**
	 * Instantiates a new diary view.
	 *
	 * @param vc the vc
	 */
	public DiaryView(ViewController vc) {

		this.viewController = vc;

		this.setLayout(null);

		new Menu(this, this.viewController);
		
		JLabel name = new JLabel("Name");
		name.setBounds(140, 175, 200, 14);
		this.add(name);

		JLabel description = new JLabel("Description");
		description.setBounds(350, 175, 100, 14);
		this.add(description);

		JLabel deadline = new JLabel("DeadLine");
		deadline.setBounds(520, 175, 250, 14);
		this.add(deadline);
		
		JLabel activity = new JLabel("Activity");
		activity.setBounds(650, 175, 250, 14);
		this.add(activity);

		this.btnAddObjective = new JButton("Add Objective");
		btnAddObjective.setBounds(700, 500, 150, 23);
		this.btnAddObjective.addActionListener(this);
		this.btnAddObjective.setActionCommand("addObjective");
		this.btnAddObjective.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(btnAddObjective);
		
		int placement = 231;
		User user = this.viewController.getUserFacade().getUser();

		for(int i = 0; i <= this.viewController.getDiaryFacade().readObjectives(user).size() - 1; i++) {

			JLabel Oname = new JLabel(this.viewController.getDiaryFacade().readObjectives(user).getObjectiveByIndex(i).getName());
			Oname.setBounds(140, placement, 200, 14);
			this.add(Oname);

			JLabel Odescription = new JLabel(this.viewController.getDiaryFacade().readObjectives(user).getObjectiveByIndex(i).getDescription());
			Odescription.setBounds(350, placement, 200, 14);
			this.add(Odescription);
			
			JLabel Odeadline = new JLabel(this.viewController.getDiaryFacade().readObjectives(user).getObjectiveByIndex(i).getDeadline());
			Odeadline.setBounds(520, placement, 200, 14);
			this.add(Odeadline);

			JLabel Oactivity = new JLabel(this.viewController.getDiaryFacade().readObjectives(user).getObjectiveByIndex(i).getDescription());
			Oactivity.setBounds(650, placement, 200, 14);
			this.add(Oactivity);

			MyJButton deleteObjective = new MyJButton("Delete", i);
			deleteObjective.addActionListener(this);
			deleteObjective.setActionCommand("delete");
			deleteObjective.setBounds(700, placement - 3, 80, 20);
			this.add(deleteObjective);

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
