package cafexFinal;

import java.sql.*;
import java.util.ArrayList;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import javax.swing.JPasswordField;
import java.awt.Toolkit;

public class Personal extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField nameBox;
	private JTextField surnameBox;
	private JTextField mailBox;
	private JTextField TCBox;
	private JTextField adressBox;
	private JTextField telBox;
	private JPasswordField passBox;
	private JTextField salaryBox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Personal frame = new Personal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public static void GuncelleDB(ResultSet rs,Statement stmt, DefaultTableModel tableModel) throws SQLException {
		
		
	while(rs.next())
	{
		String my_user_data = rs.getString("userName");
		ResultSet ds=stmt.executeQuery("SELECT * FROM duty WHERE dutyID = " + rs.getString("dutyID")); 
		ds.next();
		Object[] objs = {my_user_data,ds.getString("dutyName") };
		
		tableModel.addRow(objs);
		
		
		
		
		
	}
		
		
	}
	
	
	/**
	 * Create the frame. 
	 * @throws SQLException 
	 */
	public Personal() throws SQLException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\2150656046\\eclipse-workspace\\cafexFinal\\icon\\704627-200.png"));
		setTitle("Personel CafeX");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 506);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		

		DefaultTableModel tableModel = new DefaultTableModel();

		tableModel.addColumn("User Name");
		tableModel.addColumn("Görev");
		tableModel.addColumn("TC");
		tableModel.addColumn("Mail");
		tableModel.addColumn("Adres");
		tableModel.addColumn("Tel");
		tableModel.addColumn("Gorev");

		table = new JTable(tableModel);
		table.setEnabled(false);
		
		Connection conn = null;
	 	try {
	           conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
	           
	 		if(conn!=null) {
	 			System.out.println("Connected Succesfully");
	 		}
	 		
	 	}catch(Exception e1) {
	 		System.out.println(e1);
		
	 	}
	 	String duty_name ;
	 	Statement stmt=conn.createStatement(); 
	 	Statement stmt2=conn.createStatement(); 
	 	Statement stmt3=conn.createStatement(); 

	 	

 		String sql="SELECT\r\n" + 
 				"    users.*,\r\n" + 
 				"    duty.dutyName\r\n" + 
 				"FROM\r\n" + 
 				"    users\r\n" + 
 				"INNER JOIN duty ON users.dutyID = duty.dutyID";
		ResultSet rs=stmt.executeQuery(sql); 
		ResultSet rs2=stmt3.executeQuery("SELECT * FROM duty;"); 

		JComboBox dutyBox = new JComboBox();
		dutyBox.setBounds(117, 270, 114, 22);
		contentPane.add(dutyBox);
		
		
		JComboBox IdBox = new JComboBox();
		IdBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
			}
		});
		IdBox.setBounds(117, 39, 114, 22);
		contentPane.add(IdBox);
		
		while (rs2.next()) {
			dutyBox.addItem(rs2.getString("dutyName"));
			
			//where 1 is column index for table retrived by query
			//where 1 is column index for table retrived by query

		}
		


		while(rs.next()){
			
			String my_user_data = rs.getString("userName");
			String my_user_data2 = rs.getString("userSurname");
			String my_user_data3 = rs.getString("userTCno");
			String my_user_data4 = rs.getString("userMail");
			String my_user_data5 = rs.getString("userAdress");
			String my_user_data6 = rs.getString("userTel");
			String my_user_data7 = rs.getString("dutyName");


			Object[] objs = {my_user_data,my_user_data2, my_user_data3, my_user_data4, my_user_data5, my_user_data6, my_user_data7 };
			
			tableModel.addRow(objs);
			IdBox.addItem(rs.getString("userName"));
			
	    }

		
	

		
		//JTable table = new JTable(tableModel);
		

		table.setBounds(264, 13, 638, 433);
		contentPane.add(table);

		
	 	Statement stmt6=conn.createStatement(); 

		JButton btnNewButton = new JButton("Ekle");
		btnNewButton.setBackground(new Color(173, 216, 230));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gorevli_name = nameBox.getText();
				String gorevli_sname = surnameBox.getText();
				String gorevli_TC = TCBox.getText();
				String gorevli_mail = mailBox.getText();
				String gorevli_adres = adressBox.getText();
				String gorevli_tel = telBox.getText();
				String gorevli_pass = passBox.getText();
				int main_pass = Integer.parseInt(gorevli_pass);
				String gorevli_salary = salaryBox.getText();
				
				
				
				
				
				
				Object gorevli_yetki = dutyBox.getSelectedItem();
				System.out.println(gorevli_name);
				System.out.println(gorevli_yetki);
				try {
				 	ResultSet rs6 = stmt6.executeQuery("SELECT * FROM duty WHERE dutyName='"+gorevli_yetki+"'");//join query
				 	if(rs6.next()){
				 		String d_id = rs6.getString(1);
					 	System.out.println(d_id);
					 	stmt6.executeUpdate("INSERT INTO users(userName,userSurname,userTCno,userMail,userAdress,userTel,dutyID,userSalary,userPassword)"+"VALUES('"+gorevli_name +"',"+"'"+ gorevli_sname +"',"+"'"+  gorevli_TC  +"',"+"'"+  gorevli_mail  +"',"+"'"+  gorevli_adres  +"'," +"'"+  gorevli_tel  +"'," +d_id +",'"+gorevli_salary+"'," + main_pass+")");
					
					 	JOptionPane.showMessageDialog(null, "Kayýt baþarýyla eklenmiþtir."); nameBox.setText("");surnameBox.setText("");TCBox.setText("");mailBox.setText("");adressBox.setText("");telBox.setText("");salaryBox.setText("");passBox.setText("");
						
					 	
					 	for(int i = 0;i<tableModel.getRowCount();i++) {
					 		
					 		tableModel.removeRow(i);
					 	}
					 	
							 	
						
					 		
					 		String sql="SELECT\r\n" + 
					 				"    users.userName,\r\n" + 
					 				"    duty.dutyName\r\n" + 
					 				"FROM\r\n" + 
					 				"    users\r\n" + 
					 				"INNER JOIN duty ON users.dutyID = duty.dutyID";
							ResultSet rs=stmt.executeQuery(sql); 
							while(rs.next()){
								
								String my_user_data = rs.getString("userName");
								
								Object[] objs = {my_user_data,rs.getString("dutyName") };
								
								tableModel.addRow(objs);
								
						    }
					 	
				 	}  
				 	
					
				} catch (SQLException e1) {
					JOptionPane.showMessageDialog(null, e1);
					// TODO Auto-generated catch block
				
				}
			}
		});
		btnNewButton.setBounds(12, 384, 114, 36);
		contentPane.add(btnNewButton);
		
		JButton btnGncelle = new JButton("G\u00FCncelle");
		btnGncelle.setBackground(new Color(100, 149, 237));
		btnGncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					Connection conn = null;
					conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/cafex","root","");
					Statement UpdateStatement = conn.createStatement();
					String gorevli_name = nameBox.getText();
					String gorevli_sname = surnameBox.getText();
					String gorevli_TC = TCBox.getText();
					String gorevli_mail = mailBox.getText();
					String gorevli_adres = adressBox.getText();
					String gorevli_tel = telBox.getText();
					String gorevli_pass = passBox.getText();
					
					
						UpdateStatement.execute("UPDATE users SET userName="+gorevli_name+", userSurname="+gorevli_sname+", userTCno="+gorevli_TC+", userMail="+gorevli_mail+", userAdress="+gorevli_adres+", userTel="+gorevli_tel + "WHERE userName = " + gorevli_name);
				
				} catch (SQLException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				
			
				
				Object username = IdBox.getSelectedItem();
				System.out.println(username);
				
				
				
				
			}
		});
		btnGncelle.setBounds(138, 384, 114, 36);
		contentPane.add(btnGncelle);
		
		nameBox = new JTextField();
		nameBox.setBounds(117, 70, 114, 22);
		contentPane.add(nameBox);
		nameBox.setColumns(10);
		
		
		
		
		JLabel lblIsim = new JLabel("\u0130sim");
		lblIsim.setBounds(36, 73, 56, 16);
		contentPane.add(lblIsim);
			
		JLabel lblGrev = new JLabel("TC");
		lblGrev.setBounds(36, 137, 56, 16);
		contentPane.add(lblGrev);
		
		surnameBox = new JTextField();
		surnameBox.setColumns(10);
		surnameBox.setBounds(117, 105, 114, 22);
		contentPane.add(surnameBox);
		
		JLabel lblSoyisim = new JLabel("Soyisim");
		lblSoyisim.setBounds(36, 108, 56, 16);
		contentPane.add(lblSoyisim);
		
		mailBox = new JTextField();
		mailBox.setColumns(10);
		mailBox.setBounds(117, 173, 114, 22);
		contentPane.add(mailBox);
		
		TCBox = new JTextField();
		TCBox.setColumns(10);
		TCBox.setBounds(117, 140, 114, 22);
		contentPane.add(TCBox);
		
		JLabel lblMailAdresi = new JLabel("Mail");
		lblMailAdresi.setBounds(36, 176, 69, 16);
		contentPane.add(lblMailAdresi);
		
		adressBox = new JTextField();
		adressBox.setColumns(10);
		adressBox.setBounds(117, 203, 114, 22);
		contentPane.add(adressBox);
		
		JLabel lblAdres = new JLabel("Adres");
		lblAdres.setBounds(36, 206, 69, 16);
		contentPane.add(lblAdres);
		
		telBox = new JTextField();
		telBox.setColumns(10);
		telBox.setBounds(117, 235, 114, 22);
		contentPane.add(telBox);
		
		JLabel lblTelefon = new JLabel("Telefon");
		lblTelefon.setBounds(36, 238, 69, 16);
		contentPane.add(lblTelefon);
		
		passBox = new JPasswordField();
		passBox.setBounds(117, 334, 114, 22);
		contentPane.add(passBox);
		
		JLabel lblParola = new JLabel("Parola");
		lblParola.setBounds(36, 337, 69, 16);
		contentPane.add(lblParola);
		
		JLabel lblGrevi = new JLabel("G\u00F6revi");
		lblGrevi.setBounds(36, 273, 69, 16);
		contentPane.add(lblGrevi);
		
		salaryBox = new JTextField();
		salaryBox.setColumns(10);
		salaryBox.setBounds(117, 305, 114, 22);
		contentPane.add(salaryBox);
		
		JLabel lblMaa = new JLabel("Maa\u015F");
		lblMaa.setBounds(36, 308, 69, 16);
		contentPane.add(lblMaa);
		
		JLabel IdLabel = new JLabel("Kullan\u0131c\u0131");
		IdLabel.setBounds(36, 42, 56, 16);
		contentPane.add(IdLabel);
		
	
		
		
	
	}
}
