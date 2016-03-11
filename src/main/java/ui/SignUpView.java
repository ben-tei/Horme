package ui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import bl.UserFacade;
import java.awt.Color;

public class SignUpView extends JPanel implements ActionListener {

	private static final long serialVersionUID = 1L;
	private SpringLayout sl_container;
	private UserFacade userFacade;
	private ViewController viewController;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;

	public SignUpView(ViewController vc)
	{
		this.userFacade = new UserFacade();

		this.viewController = vc;

		this.sl_container = new SpringLayout();
		this.setLayout(sl_container);
		
		JLabel lblSignUp = new JLabel("Sign Up");
		sl_container.putConstraint(SpringLayout.NORTH, lblSignUp, 10, SpringLayout.NORTH, this);
		sl_container.putConstraint(SpringLayout.WEST, lblSignUp, 363, SpringLayout.WEST, this);
		lblSignUp.setFont(new Font("Tahoma", Font.PLAIN, 20));
		this.add(lblSignUp);
		
		JLabel lblNewLabel = new JLabel("Name *");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		sl_container.putConstraint(SpringLayout.NORTH, lblNewLabel, 106, SpringLayout.NORTH, this);
		sl_container.putConstraint(SpringLayout.WEST, lblNewLabel, 52, SpringLayout.WEST, this);
		this.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Street *");
		sl_container.putConstraint(SpringLayout.WEST, lblNewLabel_1, 0, SpringLayout.WEST, lblNewLabel);
		sl_container.putConstraint(SpringLayout.SOUTH, lblNewLabel_1, -390, SpringLayout.SOUTH, this);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Email *");
		sl_container.putConstraint(SpringLayout.WEST, lblNewLabel_2, 0, SpringLayout.WEST, lblNewLabel);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Login");
		sl_container.putConstraint(SpringLayout.NORTH, lblNewLabel_3, 40, SpringLayout.SOUTH, lblNewLabel_2);
		sl_container.putConstraint(SpringLayout.WEST, lblNewLabel_3, 0, SpringLayout.WEST, lblNewLabel);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Password");
		sl_container.putConstraint(SpringLayout.NORTH, lblNewLabel_4, 38, SpringLayout.SOUTH, lblNewLabel_3);
		sl_container.putConstraint(SpringLayout.WEST, lblNewLabel_4, 0, SpringLayout.WEST, lblNewLabel);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("City");
		sl_container.putConstraint(SpringLayout.NORTH, lblNewLabel_2, 33, SpringLayout.SOUTH, lblNewLabel_5);
		sl_container.putConstraint(SpringLayout.NORTH, lblNewLabel_5, 43, SpringLayout.SOUTH, lblNewLabel_1);
		sl_container.putConstraint(SpringLayout.WEST, lblNewLabel_5, 0, SpringLayout.WEST, lblNewLabel);
		lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("SIRET");
		sl_container.putConstraint(SpringLayout.NORTH, lblNewLabel_6, 34, SpringLayout.SOUTH, lblNewLabel_4);
		sl_container.putConstraint(SpringLayout.WEST, lblNewLabel_6, 0, SpringLayout.WEST, lblNewLabel);
		lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("Firstname *");
		sl_container.putConstraint(SpringLayout.NORTH, lblNewLabel_7, 0, SpringLayout.NORTH, lblNewLabel);
		sl_container.putConstraint(SpringLayout.WEST, lblNewLabel_7, 281, SpringLayout.EAST, lblNewLabel);
		lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Zip Code *");
		sl_container.putConstraint(SpringLayout.NORTH, lblNewLabel_8, 0, SpringLayout.NORTH, lblNewLabel_1);
		sl_container.putConstraint(SpringLayout.WEST, lblNewLabel_8, 0, SpringLayout.WEST, lblNewLabel_7);
		lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Phone *");
		sl_container.putConstraint(SpringLayout.NORTH, lblNewLabel_9, 0, SpringLayout.NORTH, lblNewLabel_5);
		sl_container.putConstraint(SpringLayout.WEST, lblNewLabel_9, 0, SpringLayout.WEST, lblNewLabel_7);
		lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("Email confirmation *");
		sl_container.putConstraint(SpringLayout.NORTH, lblNewLabel_10, 0, SpringLayout.NORTH, lblNewLabel_2);
		sl_container.putConstraint(SpringLayout.WEST, lblNewLabel_10, 0, SpringLayout.WEST, lblNewLabel_7);
		lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblNewLabel_10);
		
		JLabel lblNewLabel_11 = new JLabel("Password Confirmation *");
		sl_container.putConstraint(SpringLayout.NORTH, lblNewLabel_11, 0, SpringLayout.NORTH, lblNewLabel_4);
		sl_container.putConstraint(SpringLayout.WEST, lblNewLabel_11, 0, SpringLayout.WEST, lblNewLabel_7);
		lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblNewLabel_11);
		
		JLabel lblNewLabel_12 = new JLabel("Website");
		sl_container.putConstraint(SpringLayout.NORTH, lblNewLabel_12, 0, SpringLayout.NORTH, lblNewLabel_6);
		sl_container.putConstraint(SpringLayout.WEST, lblNewLabel_12, 0, SpringLayout.WEST, lblNewLabel_7);
		lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
		this.add(lblNewLabel_12);
		
		JLabel lblNewLabel_13 = new JLabel("All fields with a * are mandatory fields");
		sl_container.putConstraint(SpringLayout.WEST, lblNewLabel_13, 0, SpringLayout.WEST, lblNewLabel);
		lblNewLabel_13.setForeground(new Color(255, 0, 0));
		lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 12));
		this.add(lblNewLabel_13);
		
		JButton btnNewButton = new JButton("Confirm");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sl_container.putConstraint(SpringLayout.SOUTH, btnNewButton, -24, SpringLayout.SOUTH, this);
		sl_container.putConstraint(SpringLayout.NORTH, lblNewLabel_13, -1, SpringLayout.NORTH, btnNewButton);
		sl_container.putConstraint(SpringLayout.WEST, btnNewButton, 0, SpringLayout.WEST, lblNewLabel_7);
		this.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Back");
		btnNewButton_1.addActionListener(this);
		btnNewButton_1.setActionCommand("back");
		sl_container.putConstraint(SpringLayout.EAST, btnNewButton_1, -102, SpringLayout.EAST, this);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		sl_container.putConstraint(SpringLayout.SOUTH, btnNewButton_1, -24, SpringLayout.SOUTH, this);
		this.add(btnNewButton_1);
		
		textField = new JTextField();
		sl_container.putConstraint(SpringLayout.WEST, textField, 32, SpringLayout.EAST, lblNewLabel);
		sl_container.putConstraint(SpringLayout.EAST, textField, -130, SpringLayout.WEST, lblNewLabel_7);
		this.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		sl_container.putConstraint(SpringLayout.SOUTH, textField, -36, SpringLayout.NORTH, textField_1);
		sl_container.putConstraint(SpringLayout.EAST, textField_1, 0, SpringLayout.EAST, lblNewLabel_13);
		sl_container.putConstraint(SpringLayout.WEST, textField_1, 32, SpringLayout.EAST, lblNewLabel_1);
		sl_container.putConstraint(SpringLayout.NORTH, textField_1, 0, SpringLayout.NORTH, lblNewLabel_1);
		this.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		sl_container.putConstraint(SpringLayout.NORTH, textField_2, 0, SpringLayout.NORTH, lblNewLabel_5);
		sl_container.putConstraint(SpringLayout.WEST, textField_2, 60, SpringLayout.EAST, lblNewLabel_5);
		sl_container.putConstraint(SpringLayout.EAST, textField_2, 0, SpringLayout.EAST, lblNewLabel_13);
		this.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		sl_container.putConstraint(SpringLayout.WEST, textField_3, 34, SpringLayout.EAST, lblNewLabel_2);
		sl_container.putConstraint(SpringLayout.SOUTH, textField_3, 0, SpringLayout.SOUTH, lblNewLabel_2);
		sl_container.putConstraint(SpringLayout.EAST, textField_3, 0, SpringLayout.EAST, lblNewLabel_13);
		this.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		sl_container.putConstraint(SpringLayout.WEST, textField_4, 48, SpringLayout.EAST, lblNewLabel_3);
		sl_container.putConstraint(SpringLayout.SOUTH, textField_4, 0, SpringLayout.SOUTH, lblNewLabel_3);
		sl_container.putConstraint(SpringLayout.EAST, textField_4, 0, SpringLayout.EAST, lblNewLabel_13);
		this.add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		sl_container.putConstraint(SpringLayout.NORTH, textField_5, 0, SpringLayout.NORTH, lblNewLabel_4);
		sl_container.putConstraint(SpringLayout.WEST, textField_5, 20, SpringLayout.EAST, lblNewLabel_4);
		sl_container.putConstraint(SpringLayout.EAST, textField_5, 0, SpringLayout.EAST, lblNewLabel_13);
		this.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		sl_container.putConstraint(SpringLayout.WEST, textField_6, 43, SpringLayout.EAST, lblNewLabel_6);
		sl_container.putConstraint(SpringLayout.SOUTH, textField_6, 0, SpringLayout.SOUTH, lblNewLabel_6);
		sl_container.putConstraint(SpringLayout.EAST, textField_6, 0, SpringLayout.EAST, lblNewLabel_13);
		this.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		sl_container.putConstraint(SpringLayout.WEST, textField_7, -188, SpringLayout.EAST, this);
		sl_container.putConstraint(SpringLayout.EAST, textField_7, -69, SpringLayout.EAST, this);
		sl_container.putConstraint(SpringLayout.SOUTH, textField_7, 0, SpringLayout.SOUTH, lblNewLabel);
		this.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		sl_container.putConstraint(SpringLayout.WEST, textField_8, 0, SpringLayout.WEST, textField_7);
		sl_container.putConstraint(SpringLayout.SOUTH, textField_8, 0, SpringLayout.SOUTH, lblNewLabel_1);
		sl_container.putConstraint(SpringLayout.EAST, textField_8, 0, SpringLayout.EAST, textField_7);
		this.add(textField_8);
		textField_8.setColumns(10);
		
		textField_9 = new JTextField();
		sl_container.putConstraint(SpringLayout.NORTH, textField_9, 0, SpringLayout.NORTH, lblNewLabel_5);
		sl_container.putConstraint(SpringLayout.WEST, textField_9, 0, SpringLayout.WEST, textField_7);
		sl_container.putConstraint(SpringLayout.EAST, textField_9, 0, SpringLayout.EAST, textField_7);
		this.add(textField_9);
		textField_9.setColumns(10);
		
		textField_10 = new JTextField();
		sl_container.putConstraint(SpringLayout.NORTH, textField_10, 0, SpringLayout.NORTH, lblNewLabel_2);
		sl_container.putConstraint(SpringLayout.WEST, textField_10, 0, SpringLayout.WEST, textField_7);
		sl_container.putConstraint(SpringLayout.EAST, textField_10, 0, SpringLayout.EAST, textField_7);
		this.add(textField_10);
		textField_10.setColumns(10);
		
		textField_11 = new JTextField();
		sl_container.putConstraint(SpringLayout.NORTH, textField_11, 0, SpringLayout.NORTH, lblNewLabel_4);
		sl_container.putConstraint(SpringLayout.WEST, textField_11, 40, SpringLayout.EAST, lblNewLabel_11);
		sl_container.putConstraint(SpringLayout.EAST, textField_11, 0, SpringLayout.EAST, textField_7);
		this.add(textField_11);
		textField_11.setColumns(10);
		
		textField_12 = new JTextField();
		sl_container.putConstraint(SpringLayout.NORTH, textField_12, 0, SpringLayout.NORTH, lblNewLabel_6);
		sl_container.putConstraint(SpringLayout.WEST, textField_12, 0, SpringLayout.WEST, textField_7);
		sl_container.putConstraint(SpringLayout.EAST, textField_12, 0, SpringLayout.EAST, textField_7);
		this.add(textField_12);
		textField_12.setColumns(10);

		


	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String cmd = e.getActionCommand();
		if(cmd.equals("back"))
		{
			this.viewController.showLoginPanel();
		}
	}
	
}
