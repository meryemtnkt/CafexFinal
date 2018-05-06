package cafexFinal;
import java.awt.BorderLayout;
import java.sql.*;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTabbedPane;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.ImageIcon;

public class Masalar1 extends JFrame {

	private JPanel contentPane;
	private JTextField textField_3;
	private JTextField textField;
	private JTextField txtI;
	private JTextField txtR;
	private JTextField txtI_1;
	private JTextField txtK;
	private JTextField txtO;
	private JTextField txtR_1;
	private JTextField txtI_2;
	private JTextField txtD;
	private JTextField txtO_1;
	private JTextField txtR_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Masalar1 frame = new Masalar1();
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
	public Masalar1() {
		setTitle("MASALAR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 477);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 11, 549, 391);
		contentPane.add(tabbedPane);
		
		JPanel panel = new JPanel();
		tabbedPane.addTab("BAHÇE", null, panel, null);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("Masa 1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBackground(SystemColor.text);
		btnNewButton.setBounds(53, 22, 95, 54);
		panel.add(btnNewButton);
		
		JButton btnMasa = new JButton("Masa 2");
		btnMasa.setBackground(Color.WHITE);
		btnMasa.setBounds(162, 22, 95, 54);
		panel.add(btnMasa);
		
		JButton btnMasa_1 = new JButton("Masa 3");
		btnMasa_1.setBackground(Color.WHITE);
		btnMasa_1.setBounds(267, 22, 95, 54);
		panel.add(btnMasa_1);
		
		JButton btnMasa_2 = new JButton("Masa 4");
		btnMasa_2.setBackground(Color.WHITE);
		btnMasa_2.setBounds(372, 22, 95, 54);
		panel.add(btnMasa_2);
		
		JButton btnMasa_3 = new JButton("Masa 5");
		btnMasa_3.setBackground(Color.WHITE);
		btnMasa_3.setBounds(53, 87, 95, 54);
		panel.add(btnMasa_3);
		
		JButton btnMasa_4 = new JButton("Masa 6");
		btnMasa_4.setBackground(Color.WHITE);
		btnMasa_4.setBounds(162, 87, 95, 54);
		panel.add(btnMasa_4);
		
		JButton btnMasa_5 = new JButton("Masa 7");
		btnMasa_5.setBackground(Color.WHITE);
		btnMasa_5.setBounds(267, 87, 95, 54);
		panel.add(btnMasa_5);
		
		JButton btnMasa_6 = new JButton("Masa 8");
		btnMasa_6.setBackground(Color.WHITE);
		btnMasa_6.setBounds(372, 87, 95, 54);
		panel.add(btnMasa_6);
		
		textField_3 = new JTextField();
		textField_3.setText("\u015E");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("Arial Black", Font.ITALIC, 16));
		textField_3.setColumns(10);
		textField_3.setBounds(410, 166, 65, 47);
		panel.add(textField_3);
		
		textField = new JTextField();
		textField.setText("G");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("Arial Black", Font.ITALIC, 16));
		textField.setColumns(10);
		textField.setBounds(45, 166, 65, 47);
		panel.add(textField);
		
		txtI = new JTextField();
		txtI.setText("\u0130");
		txtI.setHorizontalAlignment(SwingConstants.CENTER);
		txtI.setFont(new Font("Arial Black", Font.ITALIC, 16));
		txtI.setColumns(10);
		txtI.setBounds(135, 166, 65, 47);
		panel.add(txtI);
		
		txtR = new JTextField();
		txtR.setText("R");
		txtR.setHorizontalAlignment(SwingConstants.CENTER);
		txtR.setFont(new Font("Arial Black", Font.ITALIC, 16));
		txtR.setColumns(10);
		txtR.setBounds(230, 166, 65, 47);
		panel.add(txtR);
		
		txtI_1 = new JTextField();
		txtI_1.setText("\u0130");
		txtI_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtI_1.setFont(new Font("Arial Black", Font.ITALIC, 16));
		txtI_1.setColumns(10);
		txtI_1.setBounds(317, 166, 65, 47);
		panel.add(txtI_1);
		
		JButton btnMasa_7 = new JButton("Masa 9");
		btnMasa_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMasa_7.setBackground(Color.WHITE);
		btnMasa_7.setBounds(53, 235, 95, 54);
		panel.add(btnMasa_7);
		
		JButton btnMasa_8 = new JButton("Masa 10");
		btnMasa_8.setBackground(Color.WHITE);
		btnMasa_8.setBounds(162, 235, 95, 54);
		panel.add(btnMasa_8);
		
		JButton btnMasa_12 = new JButton("Masa 14");
		btnMasa_12.setBackground(Color.WHITE);
		btnMasa_12.setBounds(162, 300, 95, 54);
		panel.add(btnMasa_12);
		
		JButton btnMasa_9 = new JButton("Masa 11");
		btnMasa_9.setBackground(Color.WHITE);
		btnMasa_9.setBounds(267, 235, 95, 54);
		panel.add(btnMasa_9);
		
		JButton btnMasa_10 = new JButton("Masa 12");
		btnMasa_10.setBackground(Color.WHITE);
		btnMasa_10.setBounds(372, 235, 95, 54);
		panel.add(btnMasa_10);
		
		JButton btnMasa_13 = new JButton("Masa 15");
		btnMasa_13.setBackground(Color.WHITE);
		btnMasa_13.setBounds(267, 300, 95, 54);
		panel.add(btnMasa_13);
		
		JButton btnMasa_14 = new JButton("Masa 16");
		btnMasa_14.setBackground(Color.WHITE);
		btnMasa_14.setBounds(372, 300, 95, 54);
		panel.add(btnMasa_14);
		
		JButton button_15 = new JButton("Masa 9");
		button_15.setBackground(Color.WHITE);
		button_15.setBounds(53, 300, 95, 54);
		panel.add(button_15);
		
		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("SALON", null, panel_1, null);
		panel_1.setLayout(null);
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBounds(0, 0, 544, 363);
		panel_1.add(panel_2);
		
		JButton button_16 = new JButton("Masa 1");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button_16.setBackground(Color.WHITE);
		button_16.setBounds(10, 22, 95, 54);
		panel_2.add(button_16);
		
		JButton btnMasa_15 = new JButton("Masa 3");
		btnMasa_15.setBackground(Color.WHITE);
		btnMasa_15.setBounds(10, 151, 95, 54);
		panel_2.add(btnMasa_15);
		
		JButton btnMasa_18 = new JButton("Masa 6");
		btnMasa_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMasa_18.setBackground(Color.WHITE);
		btnMasa_18.setBounds(115, 22, 95, 54);
		panel_2.add(btnMasa_18);
		
		JButton btnMasa_23 = new JButton("Masa 11");
		btnMasa_23.setBackground(Color.WHITE);
		btnMasa_23.setBounds(327, 22, 95, 54);
		panel_2.add(btnMasa_23);
		
		JButton btnMasa_11 = new JButton("Masa 2");
		btnMasa_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMasa_11.setBackground(Color.WHITE);
		btnMasa_11.setBounds(10, 86, 95, 54);
		panel_2.add(btnMasa_11);
		
		JButton btnMasa_19 = new JButton("Masa 7");
		btnMasa_19.setBackground(Color.WHITE);
		btnMasa_19.setBounds(115, 86, 95, 54);
		panel_2.add(btnMasa_19);
		
		JButton btnMasa_20 = new JButton("Masa 8");
		btnMasa_20.setBackground(Color.WHITE);
		btnMasa_20.setBounds(115, 151, 95, 54);
		panel_2.add(btnMasa_20);
		
		JButton btnMasa_28 = new JButton("Masa 16");
		btnMasa_28.setBackground(Color.WHITE);
		btnMasa_28.setBounds(432, 22, 95, 54);
		panel_2.add(btnMasa_28);
		
		JButton btnMasa_16 = new JButton("Masa 4");
		btnMasa_16.setBackground(Color.WHITE);
		btnMasa_16.setBounds(10, 216, 95, 54);
		panel_2.add(btnMasa_16);
		
		JButton btnMasa_21 = new JButton("Masa 9");
		btnMasa_21.setBackground(Color.WHITE);
		btnMasa_21.setBounds(115, 216, 95, 54);
		panel_2.add(btnMasa_21);
		
		JButton btnMasa_22 = new JButton("Masa 10");
		btnMasa_22.setBackground(Color.WHITE);
		btnMasa_22.setBounds(115, 281, 95, 54);
		panel_2.add(btnMasa_22);
		
		JButton btnMasa_29 = new JButton("Masa 17");
		btnMasa_29.setBackground(Color.WHITE);
		btnMasa_29.setBounds(432, 86, 95, 54);
		panel_2.add(btnMasa_29);
		
		JButton btnMasa_25 = new JButton("Masa 13");
		btnMasa_25.setBackground(Color.WHITE);
		btnMasa_25.setBounds(327, 151, 95, 54);
		panel_2.add(btnMasa_25);
		
		JButton btnMasa_32 = new JButton("Masa 20");
		btnMasa_32.setBackground(Color.WHITE);
		btnMasa_32.setBounds(432, 281, 95, 54);
		panel_2.add(btnMasa_32);
		
		JButton btnMasa_27 = new JButton("Masa 15");
		btnMasa_27.setBackground(Color.WHITE);
		btnMasa_27.setBounds(327, 281, 95, 54);
		panel_2.add(btnMasa_27);
		
		JButton btnMasa_17 = new JButton("Masa 5");
		btnMasa_17.setBackground(Color.WHITE);
		btnMasa_17.setBounds(10, 281, 95, 54);
		panel_2.add(btnMasa_17);
		
		JButton btnMasa_24 = new JButton("Masa 12");
		btnMasa_24.setBackground(Color.WHITE);
		btnMasa_24.setBounds(327, 87, 95, 54);
		panel_2.add(btnMasa_24);
		
		JButton btnMasa_30 = new JButton("Masa 18");
		btnMasa_30.setBackground(Color.WHITE);
		btnMasa_30.setBounds(432, 151, 95, 54);
		panel_2.add(btnMasa_30);
		
		JButton btnMasa_26 = new JButton("Masa 14");
		btnMasa_26.setBackground(Color.WHITE);
		btnMasa_26.setBounds(327, 216, 95, 54);
		panel_2.add(btnMasa_26);
		
		JButton btnMasa_31 = new JButton("Masa 19");
		btnMasa_31.setBackground(Color.WHITE);
		btnMasa_31.setBounds(432, 216, 95, 54);
		panel_2.add(btnMasa_31);
		
		txtK = new JTextField();
		txtK.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		txtK.setHorizontalAlignment(SwingConstants.CENTER);
		txtK.setText("K");
		txtK.setBounds(243, 22, 42, 36);
		panel_2.add(txtK);
		txtK.setColumns(10);
		
		txtO = new JTextField();
		txtO.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtO.setText("O");
		txtO.setHorizontalAlignment(SwingConstants.CENTER);
		txtO.setColumns(10);
		txtO.setBounds(243, 69, 42, 36);
		panel_2.add(txtO);
		
		txtR_1 = new JTextField();
		txtR_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtR_1.setText("R");
		txtR_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtR_1.setColumns(10);
		txtR_1.setBounds(243, 116, 42, 36);
		panel_2.add(txtR_1);
		
		txtI_2 = new JTextField();
		txtI_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtI_2.setText("\u0130");
		txtI_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtI_2.setColumns(10);
		txtI_2.setBounds(243, 160, 42, 36);
		panel_2.add(txtI_2);
		
		txtD = new JTextField();
		txtD.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtD.setText("D");
		txtD.setHorizontalAlignment(SwingConstants.CENTER);
		txtD.setColumns(10);
		txtD.setBounds(243, 216, 42, 36);
		panel_2.add(txtD);
		
		txtO_1 = new JTextField();
		txtO_1.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtO_1.setText("O");
		txtO_1.setHorizontalAlignment(SwingConstants.CENTER);
		txtO_1.setColumns(10);
		txtO_1.setBounds(243, 263, 42, 36);
		panel_2.add(txtO_1);
		
		txtR_2 = new JTextField();
		txtR_2.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		txtR_2.setText("R");
		txtR_2.setHorizontalAlignment(SwingConstants.CENTER);
		txtR_2.setColumns(10);
		txtR_2.setBounds(243, 310, 42, 36);
		panel_2.add(txtR_2);
		
		JButton btnNewButton_1 = new JButton("GER\u0130 D\u00D6N");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\hazaly\\Desktop\\icon\\left (1).png"));
		btnNewButton_1.setBackground(new Color(255, 102, 0));
		btnNewButton_1.setBounds(592, 79, 132, 72);
		contentPane.add(btnNewButton_1);
		
		JButton btnSipariEkle = new JButton("S\u0130PAR\u0130\u015E EKLE");
		btnSipariEkle.addActionListener(new ActionListener() {
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
		btnSipariEkle.setIcon(new ImageIcon("C:\\Users\\hazaly\\Desktop\\plus-button.png"));
		btnSipariEkle.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnSipariEkle.setBackground(new Color(153, 51, 204));
		btnSipariEkle.setBounds(592, 187, 132, 72);
		contentPane.add(btnSipariEkle);
		
		JButton btnYeniSipari = new JButton("YEN\u0130 S\u0130PAR\u0130\u015E");
		btnYeniSipari.setIcon(new ImageIcon("C:\\Users\\hazaly\\Desktop\\icon\\list.png"));
		btnYeniSipari.setFont(new Font("Tahoma", Font.PLAIN, 8));
		btnYeniSipari.setBackground(new Color(0, 153, 153));
		btnYeniSipari.setBounds(592, 306, 132, 72);
		contentPane.add(btnYeniSipari);
	}
}