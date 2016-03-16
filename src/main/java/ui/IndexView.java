package ui;

import javax.swing.JPanel;
import javax.swing.SpringLayout;

import bl.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IndexView extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private SpringLayout sl_container;
	private ViewController viewController;
	private UserFacade userFacade;

	public IndexView (ViewController vc)
	{
		this.userFacade = new UserFacade();

		this.viewController = vc;

		this.sl_container = new SpringLayout();
		this.setLayout(sl_container);

		new Menu(this.sl_container, this);
	}


	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
