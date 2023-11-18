package GUI;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import DAO.DoiMatKhauDAO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;
import javax.swing.JCheckBox;
public class PNdoimatkhau {
	public JFrame frame;
	public static JPasswordField txtPasshientai;
	public static JPasswordField txtPassmoi;
	public static JPasswordField txtXacnhanpass;
	
	public PNdoimatkhau() {
		init();
	}
	 public void init() {
		 frame = new JFrame();
		 frame.setSize(450,450);
		 frame.getContentPane().setLayout(null);
		 
		 JPanel panel = new JPanel();
		 panel.setBounds(10, 10, 416, 409);
		 frame.getContentPane().add(panel);
		 panel.setLayout(null);
		 
		 JLabel lblNewLabel = new JLabel("Đổi mật khẩu");
		 lblNewLabel.setForeground(Color.BLUE);
		 lblNewLabel.setBounds(150, 37, 157, 28);
		 lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 23));
		 panel.add(lblNewLabel);
		 
		 JLabel lblNewLabel_1 = new JLabel("Mật khẩu hiện tại :");
		 lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 lblNewLabel_1.setBounds(10, 103, 119, 27);
		 panel.add(lblNewLabel_1);
		 
		 JLabel lblNewLabel_1_1 = new JLabel("Mật khẩu mới:");
		 lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 lblNewLabel_1_1.setBounds(10, 165, 119, 27);
		 panel.add(lblNewLabel_1_1);
		 
		 JLabel lblNewLabel_1_1_1 = new JLabel("Xác nhận mật khẩu :");
		 lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 lblNewLabel_1_1_1.setBounds(0, 226, 131, 27);
		 panel.add(lblNewLabel_1_1_1);
		 
		 JButton btnXacnhan = new JButton("Xác nhận");
		 btnXacnhan.setBackground(Color.BLUE);
		 btnXacnhan.setForeground(Color.WHITE);
		 btnXacnhan.setFont(new Font("Tahoma", Font.BOLD, 15));
		 btnXacnhan.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		DoiMatKhauDAO dmkDAO = new DoiMatKhauDAO();
		 		try {
					dmkDAO.doimatkhau();
				} catch (Exception e2) {
					// TODO: handle exception
				}
		 	}
		 });
		 btnXacnhan.setBounds(10, 331, 396, 37);
		 panel.add(btnXacnhan);
		 
		 txtPasshientai = new JPasswordField();
		 txtPasshientai.setBounds(141, 102, 265, 28);
		 panel.add(txtPasshientai);
		 
		 
		 
		 txtPassmoi = new JPasswordField();
		 txtPassmoi.setBounds(139, 164, 267, 28);
		 panel.add(txtPassmoi);
		 
		 txtXacnhanpass = new JPasswordField();
		 txtXacnhanpass.setBounds(141, 225, 265, 28);
		 panel.add(txtXacnhanpass);
		 
		 JCheckBox checkPass = new JCheckBox("Hiện mật khẩu");
		 checkPass.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 checkPass.setBounds(127, 280, 143, 21);
		 panel.add(checkPass);
		 frame.setVisible(true);
		 
		 
	
	 }

	 public static void main(String[] args) {
		new PNdoimatkhau();
	}
}
