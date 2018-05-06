package cafexFinal;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import com.toedter.calendar.JCalendar;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class rezekle extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rezekle frame = new rezekle();
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
	public rezekle() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\x.png.jpg"));
		setTitle("REZERVASYON EKLE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1229, 627);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\network.png"));
		lblNewLabel.setBounds(81, 49, 46, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\phone-call.png"));
		lblNewLabel_1.setBounds(81, 109, 46, 32);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\calendar.png"));
		lblNewLabel_2.setBounds(589, 331, 46, 32);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\restaurant.png"));
		lblNewLabel_3.setBounds(81, 194, 46, 32);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\maid.png"));
		lblNewLabel_4.setBounds(81, 259, 46, 32);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\notepad.png"));
		lblNewLabel_5.setBounds(81, 331, 46, 32);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("M\u00DC\u015ETER\u0130 AD SOYAD");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(138, 60, 126, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("M\u00DC\u015ETER\u0130 TELEFONU");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(137, 127, 126, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblMasaNo = new JLabel("MASA NO");
		lblMasaNo.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblMasaNo.setBounds(137, 205, 127, 14);
		contentPane.add(lblMasaNo);
		
		JLabel lblPersonelAd = new JLabel("PERSONEL ADI");
		lblPersonelAd.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblPersonelAd.setBounds(137, 270, 127, 14);
		contentPane.add(lblPersonelAd);
		
		JLabel lblNotlar = new JLabel("NOTLAR");
		lblNotlar.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNotlar.setBounds(137, 346, 127, 14);
		contentPane.add(lblNotlar);
		
		textField = new JTextField();
		textField.setBounds(359, 57, 158, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(359, 121, 158, 20);
		contentPane.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(359, 194, 158, 20);
		contentPane.add(textField_3);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(356, 331, 158, 86);
		contentPane.add(editorPane);
		
		JLabel label = new JLabel("REZERVASYON TAR\u0130H\u0130");
		label.setFont(new Font("Tahoma", Font.BOLD, 11));
		label.setBounds(645, 331, 126, 32);
		contentPane.add(label);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(820, 331, 175, 146);
		contentPane.add(calendar);
		
		JButton btnNewButton = new JButton("KAYDET");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Connection conn = null;
			 	try {
			           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
			           
			 		if(conn!=null) {
			 			System.out.println("Connected Succesfully");
			 		}
			 		
			 	}catch(Exception e1) {
			 		System.out.println(e1);
				
			 	}
			 	
			 
			 	
			}
		});
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\ok-mark (1).png"));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(51, 153, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(370, 516, 126, 34);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("GER\u0130 D\u00D6N");
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\left (1).png"));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(new Color(255, 102, 0));
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton_1.setBounds(708, 516, 126, 34);
		contentPane.add(btnNewButton_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(359, 267, 158, 20);
		contentPane.add(comboBox);
	}
}