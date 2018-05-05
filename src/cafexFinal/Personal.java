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
import javax.swing.JComboBox;

public class Personal extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField nameBox;

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

	/**
	 * Create the frame.
	 * @throws SQLException 
	 */
	public Personal() throws SQLException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 932, 506);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(224, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		String col[] = {"User Name","Görev"};
		DefaultTableModel tableModel = new DefaultTableModel(col, 0);
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

	 	
		String sql="Select * from users ";
		ResultSet rs=stmt.executeQuery(sql); 
		ResultSet rs2=stmt3.executeQuery("SELECT * FROM duty;"); 

		JComboBox dutyBox = new JComboBox();
		dutyBox.setBounds(171, 110, 114, 22);
		contentPane.add(dutyBox);
		
		while (rs2.next()) {
			dutyBox.addItem(rs2.getString("dutyName"));//where 1 is column index for table retrived by query
		}
		
		int i = 0;

		while(rs.next()){
			
			String my_user_data = rs.getString("userName");
			ResultSet ds=stmt2.executeQuery("SELECT * FROM duty WHERE dutyID = " + rs.getString("dutyID")); 
			ds.next();
			Object[] objs = {my_user_data,ds.getString("dutyName") };
			
			tableModel.addRow(objs);
			
	    }

		
	

		
		//JTable table = new JTable(tableModel);
		

		table.setBounds(440, 13, 462, 433);
		contentPane.add(table);

		
	 	Statement stmt5=conn.createStatement(); 
		JButton btnNewButton = new JButton("Ekle");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String gorevli_name = nameBox.getText();
				Object gorevli_yetki = dutyBox.getSelectedItem();
				System.out.println(gorevli_name);
				System.out.println(gorevli_yetki);
				try {
				 	ResultSet rs5 = stmt5.executeQuery("SELECT dutyID FROM duty WHERE dutyName='"+gorevli_yetki+"'");
				 	String d_id = rs5.getString("dutyID");
				 	System.out.println(d_id);
					
					
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		btnNewButton.setBounds(171, 155, 114, 36);
		contentPane.add(btnNewButton);
		
		JButton button = new JButton("New button");
		button.setBounds(171, 336, 114, 36);
		contentPane.add(button);
		
		JButton button_1 = new JButton("New button");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

			}
		});
		button_1.setBounds(297, 336, 114, 36);
		contentPane.add(button_1);
		
		nameBox = new JTextField();
		nameBox.setBounds(171, 75, 114, 22);
		contentPane.add(nameBox);
		nameBox.setColumns(10);
		
		
		
		
		JLabel lblIsim = new JLabel("\u0130sim");
		lblIsim.setBounds(38, 78, 56, 16);
		contentPane.add(lblIsim);
		
		JLabel lblGrev = new JLabel("G\u00F6rev");
		lblGrev.setBounds(36, 113, 56, 16);
		contentPane.add(lblGrev);
		
		
	
	}
}
