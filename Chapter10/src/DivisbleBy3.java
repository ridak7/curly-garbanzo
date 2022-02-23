import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DivisbleBy3 {

	private JFrame frame;
	private JTextField tf;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DivisbleBy3 window = new DivisbleBy3();
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
	public DivisbleBy3() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 460, 292);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.PINK);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lb = new JLabel("Enter an integer: ");
		lb.setFont(new Font("Garamond", Font.PLAIN, 15));
		lb.setBounds(60, 103, 139, 31);
		panel.add(lb);
		
		JLabel lb2 = new JLabel("Divisible By Three");
		lb2.setFont(new Font("Garamond", Font.BOLD | Font.ITALIC, 21));
		lb2.setBounds(125, 30, 173, 45);
		panel.add(lb2);
		
		JLabel output = new JLabel("");
		output.setBounds(199, 153, 213, 60);
		panel.add(output);
		
		tf = new JTextField();
		tf.setBounds(209, 100, 178, 38);
		panel.add(tf);
		tf.setColumns(10);
		
		JButton check = new JButton("Check");
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String input = tf.getText();
				int num = Integer.parseInt(input);
				
				
				if(num % 3 >= 1 || num % 3 <= -1)  {
					output.setText("Your integer " + num + " is not divisble by 3");
				}
				
				else {
					output.setText("Integer " + num + " is divisble by 3");
				}
				
				
			}
		});
		check.setFont(new Font("Garamond", Font.PLAIN, 14));
		check.setBounds(29, 161, 153, 52);
		panel.add(check);
		
		
	}
}
