package cafexFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JTable;

public class Kitchen extends JFrame {

	private JPanel contentPane;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kitchen frame = new Kitchen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	

	
	
	/**
	 * Create the frame.
	 */
	public Kitchen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 901, 444);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setBounds(12, 13, 644, 371);
		contentPane.add(table);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setBounds(697, 29, 156, 62);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBounds(697, 113, 156, 62);
		contentPane.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.setBounds(697, 198, 156, 62);
		contentPane.add(button_1);
	}
}
