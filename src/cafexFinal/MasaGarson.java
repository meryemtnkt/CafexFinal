package cafexFinal;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.UIManager;
import javax.swing.border.SoftBevelBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JToggleButton;
import javax.swing.JEditorPane;
import javax.swing.JMenuBar;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;

import javax.swing.JTable;

public class MasaGarson extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField adet;
	private JTable table;
	private JTable menu_icerik;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MasaGarson frame = new MasaGarson();
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
	public MasaGarson() {
		setTitle("GARSON / MASA S\u0130PAR\u0130\u015E");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1240, 721);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		JButton btnGeriDn = new JButton("         GER\u0130 D\u00D6N");
		btnGeriDn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnGeriDn.setBackground(new Color(255, 102, 0));
		btnGeriDn.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\Masa\\icon\\left (1).png"));
		btnGeriDn.setBounds(996, 12, 198, 43);
		contentPane.add(btnGeriDn);
		
		JLabel lblGarson = new JLabel("Garson");
		lblGarson.setBounds(706, 32, 70, 20);
		contentPane.add(lblGarson);
		
		textField = new JTextField();
		textField.setBounds(815, 29, 135, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btnMasa = new JButton("      Masa-21");
		btnMasa.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\Masa\\icon\\dining-table (1).png"));
		btnMasa.setBackground(new Color(255, 102, 0));
		btnMasa.setBounds(12, 17, 285, 43);
		contentPane.add(btnMasa);
		
		JLabel lblNewLabel = new JLabel("------------MEN\u00DC-------------");
		lblNewLabel.setBounds(12, 98, 183, 14);
		contentPane.add(lblNewLabel);
		
		JButton btnFastFood = new JButton("   FAST FOOD");
		
		btnFastFood.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\hamburger.png"));
		btnFastFood.setForeground(new Color(255, 255, 255));
		btnFastFood.setBackground(new Color(51, 204, 51));
		btnFastFood.setBounds(12, 141, 225, 74);
		contentPane.add(btnFastFood);
		
		JButton btnTatllar = new JButton("   TATLILAR");
		btnTatllar.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\muffin.png"));
		btnTatllar.setForeground(new Color(255, 255, 255));
		btnTatllar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTatllar.setBackground(new Color(255, 0, 255));
		btnTatllar.setBounds(12, 228, 225, 74);
		contentPane.add(btnTatllar);
		
		JButton btnDondurma = new JButton("   DONDURMA");
		btnDondurma.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\ice-cream.png"));
		btnDondurma.setForeground(new Color(255, 255, 255));
		btnDondurma.setBackground(new Color(255, 204, 51));
		btnDondurma.setBounds(12, 312, 225, 74);
		contentPane.add(btnDondurma);
		
		JButton btnScakIecekler = new JButton("   SICAK \u0130\u00C7ECEKLER");
		btnScakIecekler.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\cup (1).png"));
		btnScakIecekler.setForeground(new Color(255, 255, 255));
		btnScakIecekler.setBackground(new Color(0, 102, 204));
		btnScakIecekler.setBounds(12, 486, 225, 74);
		contentPane.add(btnScakIecekler);
		
		JButton btnSoukIecekler = new JButton("   SO\u011EUK \u0130\u00C7ECEKLER");
		btnSoukIecekler.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\cola (2).png"));
		btnSoukIecekler.setForeground(new Color(255, 255, 255));
		btnSoukIecekler.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSoukIecekler.setBackground(new Color(255, 0, 51));
		btnSoukIecekler.setBounds(12, 399, 225, 74);
		contentPane.add(btnSoukIecekler);
		
		JLabel lblmenIerik = new JLabel("------------MEN\u00DC \u0130\u00C7ER\u0130K-------------");
		lblmenIerik.setBounds(281, 85, 336, 41);
		contentPane.add(lblmenIerik);
		
		JLabel lblsipariler = new JLabel("------------S\u0130PAR\u0130\u015ELER-------------");
		lblsipariler.setBounds(651, 85, 336, 41);
		contentPane.add(lblsipariler);
		
		JLabel lbladet = new JLabel("------------ADET-------------");
		lbladet.setBounds(996, 102, 336, 41);
		contentPane.add(lbladet);
		
		adet = new JTextField();
		adet.setBounds(1026, 141, 156, 40);
		contentPane.add(adet);
		adet.setColumns(10);
		
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
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adet.setText(adet.getText()+"6");
			}
		});
		btn6.setBounds(1138, 245, 44, 40);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adet.setText(adet.getText()+"7");
			}
		});
		btn7.setBounds(1026, 294, 44, 40);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				adet.setText(adet.getText()+"8");
			}
		});
		btn8.setBounds(1082, 294, 44, 40);
		contentPane.add(btn8);
		
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
		btn0.setBounds(1138, 346, 44, 40);
		contentPane.add(btn0);
		
		JButton btnC = new JButton("C");
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
		
		
		btnC.setBounds(1026, 346, 100, 40);
		contentPane.add(btnC);
		
		JButton btnSipariOnay = new JButton("         Sipari\u015F Onay");
		btnSipariOnay.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\ok-mark (1).png"));
		btnSipariOnay.setBackground(new Color(51, 153, 0));
		btnSipariOnay.setBounds(996, 430, 198, 53);
		contentPane.add(btnSipariOnay);
		
		JButton btnSipariIptal = new JButton("         Sipari\u015F \u0130ptal");
		btnSipariIptal.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\cancel"));
		btnSipariIptal.setBackground(new Color(255, 0, 0));
		btnSipariIptal.setBounds(996, 508, 198, 53);
		contentPane.add(btnSipariIptal);
		
		JButton btnAdisyonYazdr = new JButton("   Adisyon Yazd\u0131r");
		btnAdisyonYazdr.setIcon(new ImageIcon("C:\\Users\\TANKUT\\Desktop\\CafexFinal\\icon\\103514-32.png"));
		btnAdisyonYazdr.setBackground(new Color(0, 204, 153));
		btnAdisyonYazdr.setBounds(651, 583, 336, 78);
		contentPane.add(btnAdisyonYazdr);
		
		menu_icerik = new JTable();
		menu_icerik.setModel(new DefaultTableModel(
			new Object[][] {
				{null},
			},
			new String[] {
				"\u00DCr\u00FCnler"
			}
		));
		menu_icerik.getColumnModel().getColumn(0).setPreferredWidth(89);
		menu_icerik.getColumnModel().getColumn(0).setMinWidth(40);
		menu_icerik.setBounds(264, 142, 239, 331);
		contentPane.add(menu_icerik);
		DefaultTableModel model = new DefaultTableModel();
		JTable table = new JTable(model);
		table.setBounds(281, 141, 200, 413);
		
		
		btnFastFood.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				//baglanti basladi
				Connection conn = null;
			 	try {
			 			Class.forName("com.mysql.jdbc.Driver");
			           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
			           
			 		if(conn!=null) {
			 			System.out.println("Connected Succesfully");
			 		}
			 		
			 	}catch(Exception e1) {
			 		System.out.println(e1);
				
			 	}
			 		try {
				
				
				Statement stmt=conn.createStatement(); 
				String sql="Select ProductName from product where ProductTypeID = 3";
				ResultSet rs=stmt.executeQuery(sql);
				
				
				while(rs.next()){
					
					String urun_adi = rs.getString("ProductName");
					System.out.println(urun_adi);
					Object[] objs = {urun_adi};
					
					
					model.addRow(objs);
					
					
			    }
			 		}
			 		catch (SQLException e1) {
						JOptionPane.showMessageDialog(null, e1);
						// TODO Auto-generated catch block
					
					}
				
			}
		});
	 	
	 	}
	}
	 	
	


