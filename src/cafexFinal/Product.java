package cafexFinal;

import java.sql.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.awt.event.ActionEvent;

public class Product extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField proName;
	private JTextField proPurch;
	private JTextField proSell;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Product frame = new Product();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	
	
	
	

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Product() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 805, 474);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		
		
		
		
		DefaultTableModel tableModel = new DefaultTableModel();

		tableModel.addColumn("Ürün Adý");
		tableModel.addColumn("Ürün Türü");
		tableModel.addColumn("Stok");
		tableModel.addColumn("Alýþ Fiyatý");
		tableModel.addColumn("Satýþ Fiyatý");
		tableModel.addColumn("Tedarikçi");
		
		
		table = new JTable(tableModel);
		table.setBounds(408, 33, 379, 381);
		contentPane.add(table);
		
		
		
		
		proName = new JTextField();
		proName.setBounds(110, 40, 116, 22);
		contentPane.add(proName);
		proName.setColumns(10);
		
		proPurch = new JTextField();
		proPurch.setColumns(10);
		proPurch.setBounds(110, 108, 116, 22);
		contentPane.add(proPurch);
		
		JLabel lblrnAd = new JLabel("\u00DCr\u00FCn Ad\u0131");
		lblrnAd.setBounds(23, 43, 56, 16);
		contentPane.add(lblrnAd);
		
		JLabel lblTr = new JLabel("T\u00FCr\u00FC");
		lblTr.setBounds(23, 76, 56, 16);
		contentPane.add(lblTr);
		
		JLabel lblAlFiyat = new JLabel("Al\u0131\u015F fiyat\u0131");
		lblAlFiyat.setBounds(23, 111, 56, 16);
		contentPane.add(lblAlFiyat);
		
		JLabel lblSatFiyat = new JLabel("Sat\u0131\u015F fiyat\u0131");
		lblSatFiyat.setBounds(23, 146, 71, 16);
		contentPane.add(lblSatFiyat);
		
		proSell = new JTextField();
		proSell.setColumns(10);
		proSell.setBounds(110, 143, 116, 22);
		contentPane.add(proSell);
		
		JComboBox proComp = new JComboBox();
		proComp.setBounds(110, 178, 116, 22);
		contentPane.add(proComp);
		
		JLabel lblFirma = new JLabel("Firma");
		lblFirma.setBounds(23, 184, 71, 16);
		contentPane.add(lblFirma);
		
		JComboBox proType = new JComboBox();
		proType.setBounds(110, 75, 116, 22);
		contentPane.add(proType);
		
		
		Connection conn = null;
		
	 	try {
	           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
	           
	 		if(conn!=null) {
	 			System.out.println("Connected Succesfully");
	 		}
		}catch(Exception e1) {
	 		System.out.println(e1);
		
	 	}
	
	 	Statement stmt=conn.createStatement(); 
	 	Statement stmt2=conn.createStatement();
	 	Statement stmt3=conn.createStatement();
	 	
	    String ProSql ="SELECT * FROM product";
	    ResultSet rs3=stmt3.executeQuery(ProSql);
	 	
	 	String TypeSql = "SELECT TypeName FROM producttype";
	 	ResultSet rs=stmt.executeQuery(TypeSql);
	    
	 	String CompSql = "SELECT CompanyName FROM company";
	    ResultSet rs2=stmt2.executeQuery(CompSql);
	    
	    while (rs2.next()) {
	    	proComp.addItem(rs2.getString("CompanyName"));
	    }
	    		
	 	while (rs.next()) {
	 		proType.addItem(rs.getString("TypeName"));
		}
	 	
	 	while (rs3.next()) {
	 		String product_data1 = rs3.getString("ProductName");
	 		String product_data5 = rs3.getString("ProductCount");
			String product_data2 = rs3.getString("ProductTypeID");
			String product_data3 = rs3.getString("ProductPurchasePrice");
			String product_data4 = rs3.getString("ProductSellPrice");
			String product_data6 = rs3.getString("CompanyID");
			
			Object[] objs = {product_data1, product_data2, product_data3, product_data4, product_data5, product_data6,  };
			tableModel.addRow(objs);
	 	}
	 	
	 	
		Statement stmt4=conn.createStatement(); 
		
		JButton btnEkle = new JButton("Ekle");
		btnEkle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String urun_adi = proName.getText();
				Object urun_turu = proType.getSelectedItem();
				String urun_afiyat = proPurch.getText();
				String urun_sfiyat = proSell.getText();
				Object urun_tedarik = proComp.getSelectedItem();
				
				
				
				
				
				
				
				
			}
		});
		btnEkle.setBounds(12, 235, 97, 25);
		contentPane.add(btnEkle);
		
		JButton btnFastFood = new JButton("FAST FOOD");
		btnFastFood.setBounds(276, 39, 120, 50);
		contentPane.add(btnFastFood);
		
		JButton btnSoukIecekler = new JButton("SO\u011EUK \u0130\u00C7ECEK");
		btnSoukIecekler.setBounds(276, 107, 120, 50);
		contentPane.add(btnSoukIecekler);
		
		JButton btnScakIecek = new JButton("SICAK \u0130\u00C7ECEK");
		btnScakIecek.setBounds(276, 177, 120, 50);
		contentPane.add(btnScakIecek);
		
		JButton btnTatl = new JButton("TATLI");
		btnTatl.setBounds(276, 252, 120, 50);
		contentPane.add(btnTatl);
		
		JButton btnDondurma = new JButton("DONDURMA");
		btnDondurma.setBounds(276, 328, 120, 50);
		contentPane.add(btnDondurma);
		
		JLabel lblrnAd_1 = new JLabel("\u00DCr\u00FCn Ad\u0131");
		lblrnAd_1.setBounds(408, 13, 56, 16);
		contentPane.add(lblrnAd_1);
		
		JLabel label = new JLabel("T\u00FCr\u00FC");
		label.setBounds(476, 13, 56, 16);
		contentPane.add(label);
		
		JLabel label_1 = new JLabel("Al\u0131\u015F fiyat\u0131");
		label_1.setBounds(531, 13, 56, 16);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("Sat\u0131\u015F fiyat\u0131");
		label_2.setBounds(595, 13, 71, 16);
		contentPane.add(label_2);
		
		JLabel label_3 = new JLabel("Firma");
		label_3.setBounds(734, 13, 71, 16);
		contentPane.add(label_3);
		
		JLabel lblMiktar = new JLabel("Miktar");
		lblMiktar.setBounds(668, 13, 71, 16);
		contentPane.add(lblMiktar);
	}
}
