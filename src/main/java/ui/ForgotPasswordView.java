package ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import exceptions.WrongLoginException;

/**
 * The Class ForgotPasswordView.
 */
public class ForgotPasswordView extends JPanel implements ActionListener
{

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	/** The view controller. */
	private ViewController viewController;

	/** The login field. */
	private JTextField loginField;

	/**
	 * Instantiates a new forgot password view.
	 *
	 * @param vc the ViewController
	 */
	public ForgotPasswordView(ViewController vc)
	{
		this.viewController = vc;

		this.setLayout(null);

		JLabel lblForgot = new JLabel("Forgot Password");
		lblForgot.setBounds(410, 11, 200, 25);
		lblForgot.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.add(lblForgot);

		JLabel lblLogin = new JLabel("Login");
		lblLogin.setBounds(300, 150, 55, 20);
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblLogin);

		loginField = new JTextField();
		loginField.setBounds(400, 150, 200, 20);
		loginField.addActionListener(this);
		loginField.setActionCommand("confirm");
		this.add(loginField);

		JButton btnConfirm = new JButton("Confirm");
		btnConfirm.addActionListener(this);
		btnConfirm.setActionCommand("confirm");
		btnConfirm.setBounds(300, 300, 83, 23);
		btnConfirm.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(btnConfirm);

		JButton btnBack = new JButton("Back");
		btnBack.addActionListener(this);
		btnBack.setActionCommand("back");
		btnBack.setBounds(530, 300, 68, 23);
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(btnBack);
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		String cmd = e.getActionCommand();
		if (cmd.equals("back"))
		{
			this.viewController.showLoginPanel();
		} else if (cmd.equals("confirm"))
		{
			if (this.loginField.getText().equals(""))
			{
				JOptionPane.showMessageDialog(null, "Login is required !", "Failure", JOptionPane.WARNING_MESSAGE);
			} else
			{
				try
				{
					this.viewController.getUserFacade().sendMail(this.loginField.getText());
					JOptionPane.showMessageDialog(null, "You will receive an email !", "Success",
							JOptionPane.INFORMATION_MESSAGE);
					this.viewController.showLoginPanel();
				} catch (WrongLoginException e1)
				{
					// TODO Auto-generated catch block
					JOptionPane.showMessageDialog(null, e1.getMessage(), "Failure", JOptionPane.WARNING_MESSAGE);
				}

			}
		}

	}

}
