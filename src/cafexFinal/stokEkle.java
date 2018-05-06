package cafexFinal;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.Panel;
import java.awt.Label;
import java.awt.FlowLayout;
import java.awt.ComponentOrientation;
import java.awt.Button;
import java.awt.ScrollPane;
import javax.swing.JLabel;

import javax.swing.JEditorPane;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.DropMode;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JSeparator;
import java.awt.TextArea;
import java.awt.TextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class stokEkle extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_6;
	private JTextField textField_9;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					stokEkle frame = new stokEkle();
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
	public stokEkle() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 877, 328);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.control);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Label label = new Label("\u00DCR\u00DCN NO");
		label.setBounds(26, 56, 62, 22);
		label.setBackground(SystemColor.control);
		label.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		contentPane.add(label);
		
		Label label_1 = new Label("\u00DCR\u00DCN ADI");
		label_1.setBounds(26, 94, 68, 22);
		label_1.setBackground(SystemColor.control);
		label_1.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		contentPane.add(label_1);
		
		Label label_2 = new Label("ALI\u015E F\u0130YATI");
		label_2.setBounds(26, 133, 80, 22);
		label_2.setBackground(SystemColor.control);
		label_2.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		contentPane.add(label_2);
		
		Label label_3 = new Label("SATI\u015E F\u0130YATI");
		label_3.setBounds(26, 175, 90, 22);
		label_3.setBackground(SystemColor.control);
		label_3.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		contentPane.add(label_3);
		
		Label label_4 = new Label("KDV ORANI %");
		label_4.setBounds(264, 56, 90, 22);
		label_4.setBackground(SystemColor.control);
		label_4.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		contentPane.add(label_4);
		
		Label label_5 = new Label("EKLENECEK M\u0130KTAR");
		label_5.setBounds(264, 94, 137, 22);
		label_5.setBackground(SystemColor.control);
		label_5.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		contentPane.add(label_5);
		
		Label label_6 = new Label("B\u0130R\u0130M");
		label_6.setBounds(264, 133, 62, 22);
		label_6.setBackground(SystemColor.control);
		label_6.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		contentPane.add(label_6);
		
		textField_1 = new JTextField();
		textField_1.setBounds(128, 94, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField = new JTextField();
		textField.setBounds(128, 133, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(128, 177, 86, 20);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(427, 58, 86, 20);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(427, 96, 86, 20);
		contentPane.add(textField_4);
		textField_4.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(427, 133, 86, 20);
		contentPane.add(comboBox);
		
		textField_5 = new JTextField();
		textField_5.setBounds(128, 58, 86, 20);
		contentPane.add(textField_5);
		textField_5.setColumns(10);
		
		Label label_7 = new Label("YETK\u0130L\u0130 K\u0130\u015E\u0130");
		label_7.setBounds(550, 56, 90, 22);
		label_7.setBackground(SystemColor.control);
		label_7.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		contentPane.add(label_7);
		
		Label label_8 = new Label("F\u0130RMA ADI");
		label_8.setBounds(550, 94, 80, 22);
		label_8.setBackground(SystemColor.control);
		label_8.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		contentPane.add(label_8);
		
		Label label_9 = new Label("TELEFON NO");
		label_9.setBounds(550, 133, 90, 22);
		label_9.setBackground(SystemColor.control);
		label_9.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		contentPane.add(label_9);
		
		Label label_10 = new Label("ADRES");
		label_10.setBounds(550, 175, 62, 22);
		label_10.setBackground(SystemColor.control);
		label_10.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		contentPane.add(label_10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(704, 56, 86, 20);
		contentPane.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(704, 96, 86, 20);
		contentPane.add(textField_8);
		
		textField_6 = new JTextField();
		textField_6.setBounds(704, 135, 86, 20);
		contentPane.add(textField_6);
		textField_6.setColumns(10);
		
		textField_9 = new JTextField();
		textField_9.setBounds(704, 177, 86, 20);
		contentPane.add(textField_9);
		textField_9.setColumns(10);
		
		JButton btnNewButton = new JButton("TEM\u0130ZLE");
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setIcon(new ImageIcon("C:\\Users\\gozde\\Desktop\\CafexFinal\\icon\\cancel"));
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton.setBounds(704, 227, 118, 51);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("EKLE");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.setBackground(new Color(0, 128, 0));
		btnNewButton_1.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnNewButton_1.setIcon(new ImageIcon("C:\\Users\\gozde\\Desktop\\CafexFinal\\icon\\ok-mark (1).png"));
		btnNewButton_1.setBounds(550, 227, 119, 51);
		contentPane.add(btnNewButton_1);
		
		JButton btnGeri = new JButton("GER\u0130");
		btnGeri.setBackground(new Color(255, 140, 0));
		btnGeri.setFont(new Font("Segoe UI", Font.BOLD, 12));
		btnGeri.setForeground(new Color(255, 255, 255));
		btnGeri.setIcon(new ImageIcon("C:\\Users\\gozde\\Desktop\\CafexFinal\\icon\\left (1).png"));
		btnGeri.setBounds(26, 228, 119, 51);
		contentPane.add(btnGeri);
		
		JLabel lblrnBilgisi = new JLabel("\u00DCR\u00DCN B\u0130LG\u0130S\u0130");
		lblrnBilgisi.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblrnBilgisi.setBounds(26, 11, 119, 14);
		contentPane.add(lblrnBilgisi);
		
		JLabel lblFirmaBilgisi = new JLabel("F\u0130RMA B\u0130LG\u0130S\u0130");
		lblFirmaBilgisi.setFont(new Font("Segoe UI Black", Font.BOLD, 13));
		lblFirmaBilgisi.setBounds(550, 12, 119, 14);
		contentPane.add(lblFirmaBilgisi);
	}
}