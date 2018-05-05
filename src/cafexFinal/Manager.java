package cafexFinal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Toolkit;
import javax.swing.JSlider;
import java.awt.FlowLayout;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import java.awt.SystemColor;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Manager extends JFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Manager frame = new Manager();
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
	public Manager() {
		getContentPane().setBackground(new Color(224, 255, 255));
		setTitle("Cafe X Y\u00F6netici");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\2150656046\\eclipse-workspace\\cafexFinal\\icon\\704627-200.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 876, 488);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnAnasayfa = new JMenu("Anasayfa");
		mnAnasayfa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Manager mg = new Manager();
				mg.setVisible(true);
				dispose();
			}
		});
		menuBar.add(mnAnasayfa);
		
		JMenu mnMasalar = new JMenu("Masalar");
		menuBar.add(mnMasalar);
		
		JMenu mnNewMenu = new JMenu("Personel");
		mnNewMenu.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Personal ps = new Personal();
				ps.setVisible(true);
				dispose();
			}
		});
		menuBar.add(mnNewMenu);
		
		JMenu mnNewMenu_1 = new JMenu("Rezervasyon");
		menuBar.add(mnNewMenu_1);
		
		JMenu mnNewMenu_2 = new JMenu("Cari");
		menuBar.add(mnNewMenu_2);
		
		JMenu mnStok = new JMenu("Stok");
		menuBar.add(mnStok);
		
		JMenu mnNewMenu_3 = new JMenu("Men\u00FC");
		menuBar.add(mnNewMenu_3);
		
		JMenu mnOturumuKapat = new JMenu("Oturumu kapat");
		mnOturumuKapat.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				Login ln = new Login();
				ln.setVisible(true);
				dispose();
			}
		});
	
		menuBar.add(mnOturumuKapat);
		getContentPane().setLayout(null);
		getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setVerticalTextPosition(SwingConstants.BOTTOM);
		label.setIcon(new ImageIcon("C:\\Users\\2150656046\\Desktop\\cX\\cafeXk\u00FCc\u00FCk.png"));
		label.setBounds(214, 0, 644, 415);
		getContentPane().add(label);
	}
}
