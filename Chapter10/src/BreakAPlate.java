import java.awt.EventQueue;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class BreakAPlate {

	private JFrame frame;
	private JLabel plate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon plates = new ImageIcon("C:\\Users\\904275012\\Desktop\\CS30 WS Eclipse\\Chapter10\\src\\plates.gif");
		ImageIcon platesAllBroken = new ImageIcon("C:\\Users\\904275012\\Desktop\\CS30 WS Eclipse\\Chapter10\\src\\plates_all_broken.gif");
		ImageIcon placeholder = new ImageIcon("C:\\Users\\904275012\\Desktop\\CS30 WS Eclipse\\Chapter10\\src\\placeholder.gif");
		ImageIcon platestwobroken = new ImageIcon("C:\\Users\\904275012\\Desktop\\CS30 WS Eclipse\\Chapter10\\src\\plates_two_broken.gif");
		ImageIcon sticker = new ImageIcon("C:\\Users\\904275012\\Desktop\\CS30 WS Eclipse\\Chapter10\\src\\sticker.gif");
		ImageIcon tigerplush = new ImageIcon("C:\\Users\\904275012\\Desktop\\CS30 WS Eclipse\\Chapter10\\src\\tiger_plush.gif");
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 341);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel plate;
		plate = new JLabel();
		plate.setHorizontalAlignment(SwingConstants.CENTER);
		plate.setBounds(58, 52, 313, 89);
		panel.add(plate);
		plate.setIcon(plates);
		
		JLabel prize = new JLabel();
		prize.setHorizontalAlignment(SwingConstants.CENTER);
		prize.setBounds(111, 204, 200, 87);
		panel.add(prize);
		prize.setIcon(placeholder);
		
		
		JButton playbutton = new JButton("Start Playing Here");
		playbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				Random num = new Random();
				int random = num.nextInt(2); 
				if (random == 1) {
					plate.setIcon(platesAllBroken);
					prize.setIcon(tigerplush);
					playbutton.setText("Play Again");
				}
				if(random == 0) {
					plate.setIcon(platestwobroken);
					prize.setIcon(sticker);
					playbutton.setText("Play Again");
				}
			} 
		});
		playbutton.setBounds(140, 152, 157, 41);
		panel.add(playbutton);
		
		JLabel title = new JLabel("Welcome To Break A Plate");
		title.setFont(new Font("Nirmala UI", Font.PLAIN, 17));
		title.setBounds(111, 11, 223, 30);
		panel.add(title);
		

		
	
	}
}
