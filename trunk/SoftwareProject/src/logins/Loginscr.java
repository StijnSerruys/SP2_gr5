package logins;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;


import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.*;
import java.awt.event.*;

public class Loginscr implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JOptionPane JOptionpane;

	/**
	 * Launch the application.
	 */
	public void start() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Loginscr window = new Loginscr();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		btnNewButton = new JButton("Login");
		btnNewButton.setBounds(208, 200, 97, 25);
		frame.getContentPane().add(btnNewButton);
		
		
		
				
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.setBounds(323, 200, 97, 25);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblPrReadyLogon = new JLabel("PR ready logon");
		lblPrReadyLogon.setBounds(162, 13, 130, 16);
		frame.getContentPane().add(lblPrReadyLogon);
		
		textField= new JTextField();
		textField.setBounds(208, 71, 116, 22);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblUser = new JLabel("User");
		lblUser.setBounds(140, 74, 56, 16);
		frame.getContentPane().add(lblUser);
		
		textField_1 = new JTextField();
		textField_1.setBounds(208, 129, 116, 22);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(140, 132, 56, 16);
		frame.getContentPane().add(lblPassword);
		
		

	}
	

String getFilledinInfo(JTextField j1)
{
	 return j1.getText();
}

@Override
public void actionPerformed(ActionEvent e) {
	if (e.getSource()==btnNewButton_1)
	{
		frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
	}
	else if (e.getSource()==btnNewButton)
	{
		if(LoginDAO.getWachtwoord(textField.getText())!=null)
		{
		LoginDAO.getLoginDetails(textField.getText());
		}
		else 
		{
			JOptionpane.showMessageDialog(null,"Username or password wrong");
		}
	}
	
}


}

