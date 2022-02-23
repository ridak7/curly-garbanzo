import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class MetricConverison {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConverison window = new MetricConverison();
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
	public MetricConverison() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 253);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.LIGHT_GRAY);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Select a converison type:");
		lblNewLabel_1.setFont(new Font("Serif", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(24, 73, 156, 14);
		panel.add(lblNewLabel_1);
		
		JLabel Title = new JLabel("Metric Converison");
		Title.setBounds(135, 22, 148, 21);
		Title.setFont(new Font("Georgia", Font.PLAIN, 18));
		panel.add(Title);
		
		JLabel output = new JLabel("");
		output.setHorizontalAlignment(SwingConstants.CENTER);
		output.setFont(new Font("Georgia", Font.PLAIN, 17));
		output.setBounds(69, 136, 270, 32);
		panel.add(output);
		JComboBox combo = new JComboBox();
		combo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (combo.getSelectedItem().equals("1. Inches to Centimeters")) {
					output.setText("1 Inch = 2.54 Centimeters");
				}
				else if(combo.getSelectedItem().equals("2. Feet to Meters")) {
					output.setText("1 Foot = 0.3048 Meters");
				}
				else if(combo.getSelectedItem().equals("3. Gallons to Liters")) {
					output.setText("1 Gallon = 4.5461 Liters");
				}
				else if(combo.getSelectedItem().equals("4. Pounds to Kilograms")) {
					output.setText("1 Pound = 0.4536 Kilograms");
				}
				else if(combo.getSelectedItem().equals("")){
					output.setText("");
				}
				
			}
		});
		combo.setModel(new DefaultComboBoxModel(new String[] {"", "1. Inches to Centimeters", "2. Feet to Meters", "3. Gallons to Liters", "4. Pounds to Kilograms"}));
		combo.setBounds(187, 71, 177, 22);
		panel.add(combo);
		
		
		
		
	}
}
