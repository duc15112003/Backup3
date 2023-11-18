package GUI;

import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Panel;
import java.sql.Connection;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;



public class FrameThongKeGUI extends JFrame {

	private JPanel contentPane;
	private Component PanelLichHoc;
	public JFrame frame;

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public FrameThongKeGUI() {
		frame = new JFrame("JF_BangThongKe");
		frame.setVisible(true);
		frame.setResizable(false);
		frame.getContentPane().setFont(new Font("Times New Roman", Font.PLAIN, 13));
		frame.getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1200, 650);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().setLayout(null);
		frame.setSize(1200, 650);
		setContentPane(contentPane);
		JPanel PanelTK = new PNThongKeGUI();
		PanelTK.setSize(1184, 653);
		PanelTK.setLocation(0, 0);
		frame.getContentPane().add(PanelTK);
		
		
	}
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new FrameThongKeGUI();
				
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
