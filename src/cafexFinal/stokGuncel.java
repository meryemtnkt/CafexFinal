package cafexFinal;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class stokGuncel extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stokGuncel frame = new stokGuncel();
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
	public stokGuncel() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 422, 335);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u00DCR\u00DCN ADI");
		lblNewLabel.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel.setBounds(57, 50, 60, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("T\u00DCR\u00DC ");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblNewLabel_1.setBounds(57, 92, 46, 14);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblMiktar = new JLabel("M\u0130KTARI");
		lblMiktar.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblMiktar.setBounds(57, 135, 60, 14);
		contentPane.add(lblMiktar);
		
		JLabel lblSonKullanmaTarihi = new JLabel("SON KULLANMA TAR\u0130H\u0130");
		lblSonKullanmaTarihi.setFont(new Font("Segoe UI", Font.BOLD, 12));
		lblSonKullanmaTarihi.setBounds(57, 176, 146, 14);
		contentPane.add(lblSonKullanmaTarihi);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(225, 48, 105, 20);
		contentPane.add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
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
		comboBox_1.setBounds(225, 90, 105, 20);
		contentPane.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(225, 133, 105, 20);
		contentPane.add(comboBox_2);
		
		textField = new JTextField();
		textField.setBounds(225, 174, 105, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton = new JButton("GER\u0130");
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton.setBackground(new Color(255, 102, 0));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\gozde\\Desktop\\CafexFinal\\icon\\left (1).png"));
		btnNewButton.setForeground(SystemColor.textHighlightText);
		btnNewButton.setBounds(10, 233, 105, 41);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EKLE");
		btnNewButton_1.setBackground(new Color(0, 128, 0));
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\gozde\\Desktop\\CafexFinal\\icon\\ok-mark (1).png"));
		btnNewButton_1.setBounds(139, 233, 105, 41);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("TEM\u0130ZLE");
		btnNewButton_2.setBackground(new Color(255, 0, 0));
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\gozde\\Desktop\\CafexFinal\\icon\\cancel"));
		btnNewButton_2.setForeground(new Color(255, 255, 255));
		btnNewButton_2.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton_2.setBounds(268, 233, 128, 41);
		contentPane.add(btnNewButton_2);
	}
}