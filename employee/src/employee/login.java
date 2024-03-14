package employee;
//dtd
//ghghg

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {

	private JFrame frame;
	private JTextField tb1;
	private JPasswordField p1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					login window = new login();
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
	public login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 11));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login page");
		lblNewLabel.setBounds(177, 37, 70, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(54, 87, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password");
		lblNewLabel_2.setBounds(54, 140, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		tb1 = new JTextField();
		tb1.setBounds(210, 81, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		p1 = new JPasswordField();
		p1.setBounds(210, 137, 86, 20);
		frame.getContentPane().add(p1);
		
		JButton btnNewButton = new JButton("Submit");
		btnNewButton.addActionListener((ActionListener) new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String password=p1.getText();
				//JOptionPane.showMessageDialog(btnNewButton, "name  "+name+"\n password  "+password); 
				if(name.equals("raju") && password.equals("1234"))
						{
					JOptionPane.showMessageDialog(btnNewButton,  "valid user");
						}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,  "invalid");
					
				}
				
			}
		});
		btnNewButton.setBackground(new Color(240, 240, 240));
		btnNewButton.setBounds(143, 209, 89, 23);
		frame.getContentPane().add(btnNewButton);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
