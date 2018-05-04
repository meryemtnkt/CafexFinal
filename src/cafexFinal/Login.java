package cafexFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.border.LineBorder;
import java.awt.SystemColor;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import java.awt.Component;
import java.awt.Toolkit;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Login extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JButton button;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
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
	public Login() {
		setTitle("Login CafeX");
		setForeground(new Color(0, 0, 0));
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\2150656046\\Desktop\\704627-200.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 354, 499);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 248, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(42, 209, 252, 29);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnGiri = new JButton("");
		btnGiri.setBounds(240, 361, 54, 46);
		btnGiri.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\icon\\ok-mark (1).png"));
		btnGiri.setBorder(UIManager.getBorder("Tree.editorBorder"));
		btnGiri.setBackground(new Color(50, 205, 50));
		btnGiri.setFont(new Font("Tahoma", Font.BOLD, 13));
		contentPane.add(btnGiri);
		
		button = new JButton("2");
		button.setBounds(108, 251, 54, 46);
		button.setFont(new Font("Tahoma", Font.BOLD, 13));
		button.setBorder(UIManager.getBorder("Tree.editorBorder"));
		button.setBackground(new Color(70, 130, 180));
		contentPane.add(button);
		
		button_1 = new JButton("3");
		button_1.setBounds(174, 251, 54, 46);
		button_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_1.setBorder(UIManager.getBorder("Tree.editorBorder"));
		button_1.setBackground(new Color(70, 130, 180));
		contentPane.add(button_1);
		
		button_2 = new JButton("4");
		button_2.setBounds(42, 306, 54, 46);
		button_2.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_2.setBorder(UIManager.getBorder("Tree.editorBorder"));
		button_2.setBackground(new Color(70, 130, 180));
		contentPane.add(button_2);
		
		button_3 = new JButton("5");
		button_3.setBounds(108, 306, 54, 46);
		button_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_3.setBorder(UIManager.getBorder("Tree.editorBorder"));
		button_3.setBackground(new Color(70, 130, 180));
		contentPane.add(button_3);
		
		button_4 = new JButton("6");
		button_4.setBounds(174, 306, 54, 46);
		button_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_4.setBorder(UIManager.getBorder("Tree.editorBorder"));
		button_4.setBackground(new Color(70, 130, 180));
		contentPane.add(button_4);
		
		button_5 = new JButton("7");
		button_5.setBounds(42, 361, 54, 46);
		button_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_5.setBorder(UIManager.getBorder("Tree.editorBorder"));
		button_5.setBackground(new Color(70, 130, 180));
		contentPane.add(button_5);
		
		button_6 = new JButton("8");
		button_6.setBounds(108, 361, 54, 46);
		button_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_6.setBorder(UIManager.getBorder("Tree.editorBorder"));
		button_6.setBackground(new Color(70, 130, 180));
		contentPane.add(button_6);
		
		button_7 = new JButton("9");
		button_7.setBounds(174, 361, 54, 46);
		button_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_7.setBorder(UIManager.getBorder("Tree.editorBorder"));
		button_7.setBackground(new Color(70, 130, 180));
		contentPane.add(button_7);
		
		button_8 = new JButton("");
		button_8.setBounds(240, 306, 54, 46);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		button_8.setIcon(new ImageIcon("C:\\Users\\2150656046\\Desktop\\Masa\\icon\\eraser.png"));
		button_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_8.setBorder(UIManager.getBorder("Tree.editorBorder"));
		button_8.setBackground(new Color(178, 34, 34));
		contentPane.add(button_8);
		
		button_9 = new JButton("1");
		button_9.setBounds(42, 251, 54, 46);
		button_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_9.setBorder(UIManager.getBorder("Tree.editorBorder"));
		button_9.setBackground(new Color(70, 130, 180));
		contentPane.add(button_9);
		
		button_10 = new JButton("0");
		button_10.setBounds(240, 251, 54, 46);
		button_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		button_10.setBorder(UIManager.getBorder("Tree.editorBorder"));
		button_10.setBackground(new Color(70, 130, 180));
		contentPane.add(button_10);
	}
}
