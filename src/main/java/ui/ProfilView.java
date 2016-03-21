package ui;

import javax.swing.JPanel;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ProfilView extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private ViewController viewController;
	
	public ProfilView (ViewController vc) {
		
		this.viewController = vc;

		this.setLayout(null);

		new Menu(this, this.viewController);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	

}
