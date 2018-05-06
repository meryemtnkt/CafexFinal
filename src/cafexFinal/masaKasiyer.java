package cafexFinal;
import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTable;

public class masaKasiyer extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField adet;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					masaKasiyer frame = new masaKasiyer();
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
	public masaKasiyer() {
		setTitle("KASA - Y\u00D6NET\u0130C\u0130 / MASA S\u0130PAR\u0130\u015E");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1233, 820);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("      Masa 41");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(new Color(255, 102, 0));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\dining-table (1).png"));
		btnNewButton.setBounds(12, 17, 285, 43);
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(833, 35, 135, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("   GER\u0130 D\u00D6N");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
	
			}
		});
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\left (1).png"));
		btnNewButton_1.setBackground(new Color(255, 102, 0));
		btnNewButton_1.setBounds(996, 12, 198, 53);
		contentPane.add(btnNewButton_1);
		
		JLabel lblGarson = new JLabel("Garson");
		lblGarson.setBounds(749, 44, 70, 20);
		contentPane.add(lblGarson);
		
		JLabel lblmenu = new JLabel("------------------MENU------------");
		lblmenu.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblmenu.setBounds(12, 102, 232, 41);
		contentPane.add(lblmenu);
		
		JButton btnNewButton_2 = new JButton("   FAST FOOD");
		btnNewButton_2.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\hamburger.png"));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(new Color(51, 204, 51));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
			 		Connection conn = null;
			 		
					Class.forName("com.mysql.jdbc.Driver");
					conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
					
					Statement stmt=conn.createStatement(); 
					String sql="Select * from product";
					ResultSet rs=stmt.executeQuery(sql); 
					System.out.println(rs);
					
					
				
					
					
				}catch(Exception e1) {
			 		System.out.println(e1);
			 	
			}}
		});
		btnNewButton_2.setBounds(12, 141, 225, 74);
		contentPane.add(btnNewButton_2);
		
		JButton btnTatllar = new JButton("   TATLILAR");
		btnTatllar.addActionListener(new ActionListener() {
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
		btnTatllar.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\muffin.png"));
		btnTatllar.setForeground(new Color(255, 255, 255));
		btnTatllar.setBackground(new Color(255, 0, 255));
		btnTatllar.setBounds(12, 228, 225, 74);
		contentPane.add(btnTatllar);
		
		JButton btnDondurma = new JButton("   DONDURMA");
		btnDondurma.addActionListener(new ActionListener() {
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
		btnDondurma.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\ice-cream.png"));
		btnDondurma.setForeground(new Color(255, 255, 255));
		btnDondurma.setBackground(new Color(255, 204, 51));
		btnDondurma.setBounds(12, 318, 225, 74);
		contentPane.add(btnDondurma);
		
		JButton btnScakIecekler = new JButton(" SICAK \u0130\u00C7ECEKLER");
		btnScakIecekler.addActionListener(new ActionListener() {
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
		btnScakIecekler.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\cup (1).png"));
		btnScakIecekler.setForeground(new Color(255, 255, 255));
		btnScakIecekler.setBackground(new Color(255, 0, 51));
		btnScakIecekler.setBounds(12, 403, 225, 78);
		contentPane.add(btnScakIecekler);
		
		JButton btnSoukIecekler = new JButton("SO\u011EUK \u0130\u00C7ECEKLER");
		btnSoukIecekler.addActionListener(new ActionListener() {
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
		btnSoukIecekler.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\cola (2).png"));
		btnSoukIecekler.setForeground(new Color(255, 255, 255));
		btnSoukIecekler.setBackground(new Color(0, 102, 204));
		btnSoukIecekler.setBounds(12, 494, 225, 74);
		contentPane.add(btnSoukIecekler);
		
		JLabel lblmenuIerik = new JLabel("--------------MENU \u0130\u00C7ER\u0130K--------");
		lblmenuIerik.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblmenuIerik.setBounds(268, 102, 336, 41);
		contentPane.add(lblmenuIerik);
		
		JLabel lblsipariler = new JLabel("--------------S\u0130PAR\u0130\u015ELER-------");
		lblsipariler.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblsipariler.setBounds(643, 102, 336, 41);
		contentPane.add(lblsipariler);
		
		adet = new JTextField();
		adet.setColumns(10);
		adet.setBounds(1026, 141, 156, 40);
		contentPane.add(adet);
		
		JLabel lbladet = new JLabel("--------------ADET-----------");
		lbladet.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lbladet.setBounds(996, 102, 336, 41);
		contentPane.add(lbladet);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adet.setText(adet.getText()+"1");
			}
		});
		btn1.setBounds(1026, 194, 44, 40);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adet.setText(adet.getText()+"2");
			}
			
		});
		btn2.setBounds(1082, 194, 44, 40);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adet.setText(adet.getText()+"3");
			}
		});
		btn3.setBounds(1138, 194, 44, 40);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adet.setText(adet.getText()+"4");
			}
		});
		btn4.setBounds(1026, 245, 44, 40);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adet.setText(adet.getText()+"5");
			}
		});
		btn5.setBounds(1082, 245, 44, 40);
		contentPane.add(btn5);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				adet.setText(adet.getText()+"8");
			}
		});
		btn8.setBounds(1082, 298, 44, 40);
		contentPane.add(btn8);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adet.setText(adet.getText()+"7");
			}
		});
		btn7.setBounds(1026, 298, 44, 40);
		contentPane.add(btn7);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adet.setText(adet.getText()+"6");
			}
		});
		btn6.setBounds(1138, 245, 44, 40);
		contentPane.add(btn6);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adet.setText(adet.getText()+"9");
			}
		});
		btn9.setBounds(1138, 298, 44, 40);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				adet.setText(adet.getText()+"0");
			}
		});
		btn0.setBounds(1138, 351, 44, 40);
		contentPane.add(btn0);
		
		JButton btnC = new JButton("c");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String back=null;
				if (adet.getText().length()>0)
				{
					StringBuilder strB= new StringBuilder(adet.getText());
					strB.deleteCharAt(adet.getText().length()-1);
					back=strB.toString();
					adet.setText(back);
				}
			}
		});
		btnC.setBounds(1026, 351, 100, 40);
		contentPane.add(btnC);
		
		JButton btnSipariOnay = new JButton("Sipari\u015F Onay");
		btnSipariOnay.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\ok-mark (1).png"));
		btnSipariOnay.setForeground(Color.WHITE);
		btnSipariOnay.setBackground(new Color(51, 153, 0));
		btnSipariOnay.setBounds(996, 430, 198, 53);
		contentPane.add(btnSipariOnay);
		
		JButton btnSipariIptal = new JButton("  Sipari\u015F \u0130ptal");
		btnSipariIptal.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\cancel"));
		btnSipariIptal.setForeground(Color.WHITE);
		btnSipariIptal.setBackground(new Color(255, 0, 0));
		btnSipariIptal.setBounds(996, 508, 198, 53);
		contentPane.add(btnSipariIptal);
		
		JLabel lbldemeler = new JLabel("--------------\u00D6DEMELER--------");
		lbldemeler.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lbldemeler.setBounds(268, 587, 336, 41);
		contentPane.add(lbldemeler);
		
		JLabel lbldemeekli = new JLabel("\u00D6deme \u015Eekli");
		lbldemeekli.setBounds(268, 636, 118, 20);
		contentPane.add(lbldemeekli);
		
		JLabel lblAraToplam = new JLabel("Ara Toplam");
		lblAraToplam.setBounds(268, 683, 70, 20);
		contentPane.add(lblAraToplam);
		
		JLabel lblGenelToplam = new JLabel("Genel Toplam");
		lblGenelToplam.setBounds(268, 724, 94, 20);
		contentPane.add(lblGenelToplam);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(381, 679, 175, 28);
		contentPane.add(textField_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(381, 632, 175, 28);
		contentPane.add(comboBox);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(381, 720, 175, 28);
		contentPane.add(textField_2);
		
		JButton btnNewButton_3 = new JButton("  \u00D6deme Yap");
		btnNewButton_3.addActionListener(new ActionListener() {
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
		btnNewButton_3.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\turkish-lira.png"));
		btnNewButton_3.setForeground(new Color(255, 255, 255));
		btnNewButton_3.setBackground(new Color(0, 204, 153));
		btnNewButton_3.setBounds(605, 654, 161, 78);
		contentPane.add(btnNewButton_3);
		
		JButton btnHesabKapat = new JButton("Hesab\u0131 Kapat");
		btnHesabKapat.addActionListener(new ActionListener() {
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
		btnHesabKapat.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\list.png"));
		btnHesabKapat.setForeground(new Color(255, 255, 255));
		btnHesabKapat.setBackground(new Color(255, 51, 51));
		btnHesabKapat.setBounds(794, 654, 161, 78);
		contentPane.add(btnHesabKapat);
		
		table = new JTable();
		table.setBounds(278, 156, 285, 415);
		contentPane.add(table);
	}
}