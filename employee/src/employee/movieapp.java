package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movieapp {

	protected static final int YES_OPTION = 0;
	protected static final int NO_OPTION = 0;
	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieapp window = new movieapp();
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
	public movieapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 474, 386);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("MOVIE APP");
		lblNewLabel_1.setFont(new Font("Verdana", Font.BOLD, 12));
		lblNewLabel_1.setBackground(new Color(240, 240, 240));
		lblNewLabel_1.setBounds(193, 30, 86, 20);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNewLabel_2.setBounds(10, 101, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("MOVIE");
		lblNewLabel_3.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNewLabel_3.setBounds(10, 177, 46, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("NO.OF TICKETS");
		lblNewLabel_4.setFont(new Font("Verdana", Font.BOLD, 11));
		lblNewLabel_4.setBounds(10, 252, 97, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(259, 99, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "GAAMI", "BHIMAA", "YODHA", "SHAITAAN"}));
		cb1.setBounds(259, 169, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}));
		cb2.setBounds(259, 249, 86, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int bill=0;
				String Name=tb1.getText();
				String Movie=(String) cb1.getSelectedItem();
				String Tickets=(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(Tickets);
				if(Movie.equals("GAAMI"))
				{
					bill=bill+150*nt;
				}
				if(Movie.equals("BHIMAA"))
				{
					bill=bill+150*nt;
				}
				if(Movie.equals("YODHA"))
				{
					bill=bill+150*nt;
				}
				if(Movie.equals("SHAITAAN"))
				{
					bill=bill+150*nt;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton, "name     "+Name+"\nmovie  "+Movie+"\nTickets  "+Tickets+"\nAmount  "+bill);
				if(res==YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton, "Booking Confirmed");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton, "Booking Canceled");
				}
			}
		});
		btnNewButton.setBounds(153, 313, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\on line\\Desktop\\movie2.jpg.png"));
		lblNewLabel.setBounds(0, 0, 458, 347);
		frame.getContentPane().add(lblNewLabel);
	}
}
