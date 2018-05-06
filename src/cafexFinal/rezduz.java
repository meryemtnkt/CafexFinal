package cafexFinal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.*;
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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class rezduz extends JFrame {

	private JPanel contentPane;
	private JTextField ara;
	private JTextField textField_1;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rezduz frame = new rezduz();
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
	public rezduz() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\x.png.jpg"));
		setTitle("REZERVASYON D\u00DCZENLE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1207, 609);
		contentPane = new JPanel();
		contentPane.setToolTipText("");
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\network.png"));
		lblNewLabel.setBounds(60, 88, 46, 32);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\phone-call.png"));
		lblNewLabel_1.setBounds(60, 156, 46, 36);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\calendar.png"));
		lblNewLabel_2.setBounds(60, 237, 46, 35);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\restaurant.png"));
		lblNewLabel_3.setBounds(60, 32, 46, 37);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\question.png"));
		lblNewLabel_5.setBounds(553, 237, 46, 32);
		contentPane.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("M\u00DC\u015ETER\u0130 AD SOYAD");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_6.setBounds(116, 103, 111, 14);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("M\u00DC\u015ETER\u0130 TELEFONU");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(116, 167, 111, 14);
		contentPane.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("REZERVASYON TAR\u0130H\u0130");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(130, 248, 132, 14);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("MASA NO");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(116, 46, 111, 14);
		contentPane.add(lblNewLabel_9);
		
		JLabel lblNewLabel_11 = new JLabel("\u0130PTAL SEBEB\u0130");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_11.setBounds(618, 248, 111, 14);
		contentPane.add(lblNewLabel_11);
		
		ara = new JTextField();
		ara.setBounds(296, 43, 169, 20);
		contentPane.add(ara);
		ara.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(296, 100, 169, 20);
		contentPane.add(textField_1);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(296, 161, 169, 20);
		contentPane.add(textField_3);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(765, 237, 211, 146);
		contentPane.add(editorPane);
		
		JCalendar calendar = new JCalendar();
		calendar.setBounds(296, 237, 175, 146);
		contentPane.add(calendar);
		
		JButton btnNewButton = new JButton("ARA");
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
			 	try {
			 		
					Class.forName("com.mysql.jdbc.Driver");
					
					Statement stmt=conn.createStatement(); 
					String sql="Select * from rezervation where tableName='"+ara.getText().toString()+"'";
					ResultSet rs=stmt.executeQuery(sql); 
					if(rs.next()) {
						rezduz rd = new rezduz();
						rd.setVisible(true);
						rd.setTitle("Rezervasyon Bilgileri");
					
						
					}
			
					 
					else	{
					JOptionPane.showMessageDialog(null, "Rezervasyon Yok");
						ara.setText("");
					conn.close();
					}}
				catch(Exception b) { System.out.print(b);
				}
				}
			 	
			}
		);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\magnifier.png"));
		btnNewButton.setBackground(Color.MAGENTA);
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(560, 32, 125, 37);
		contentPane.add(btnNewButton);
		
		JButton btnDzenle = new JButton("D\u00DCZENLE");
		btnDzenle.setBackground(new Color(51, 153, 0));
		btnDzenle.setForeground(Color.WHITE);
		btnDzenle.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnDzenle.setIcon(new ImageIcon("C:\\Users\\ASUS\\Downloads\\pencil-edit-button.png"));
		btnDzenle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnDzenle.setBounds(243, 465, 132, 37);
		contentPane.add(btnDzenle);
		
		JButton btnSil = new JButton("S\u0130L");
		btnSil.setForeground(Color.WHITE);
		btnSil.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSil.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\cancel"));
		btnSil.setBackground(new Color(255, 0, 0));
		btnSil.setBounds(553, 465, 132, 37);
		contentPane.add(btnSil);
		
		JButton btnGeriDn = new JButton("GER\u0130 D\u00D6N");
		btnGeriDn.setBackground(new Color(255, 102, 0));
		btnGeriDn.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnGeriDn.setIcon(new ImageIcon("C:\\Users\\ASUS\\Desktop\\CafexFinal\\icon\\left (1).png"));
		btnGeriDn.setForeground(Color.WHITE);
		btnGeriDn.setBounds(850, 465, 126, 37);
		contentPane.add(btnGeriDn);
	}
}