package gui;


import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;


import javax.swing.JTextField;
import javax.swing.JOptionPane;
import java.awt.event.*;
import javax.swing.JPasswordField;

public class Loginscr implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JButton btnNewButton_1;
	private JButton btnNewButton;
	private JOptionPane JOptionpane;
	private JPasswordField textField_1;

	/**
	 * Launch the application.
	 * @wbp.parser.entryPoint
	 */
	public Loginscr()
	{
		initialize();
	}

	public static void start() {
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

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setBounds(140, 132, 56, 16);
		frame.getContentPane().add(lblPassword);

		textField_1 = new JPasswordField();
		textField_1.setBounds(208, 129, 116, 22);
		frame.getContentPane().add(textField_1);
		btnNewButton.addActionListener(this);
		btnNewButton_1.addActionListener(this);


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
			if(dao.LoginDAO.getWachtwoord(textField.getText())!=null)
			{
				String ww = dao.LoginDAO.getWachtwoord(textField.getText());
				System.out.println(ww);
			}
			else
			{
				JOptionpane.showMessageDialog(null,"Username or password wrong");
			}
		}

	}
}

