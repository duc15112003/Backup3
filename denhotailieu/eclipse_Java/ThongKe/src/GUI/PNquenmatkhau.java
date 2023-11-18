package GUI;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;

import DAO.QuenMatKhauDAO;

import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PNquenmatkhau {
	public JFrame frame;
	public static JTextField txtEmail;
	public static JTextField txtMaOTP;
	public static JPasswordField PFPassnew;
	public PNquenmatkhau() {
		init();
	}
	private void init() {
		 frame = new JFrame();
		 frame.getContentPane().setBackground(Color.WHITE);
		 frame.setSize(400,400);
		 frame.getContentPane().setLayout(null);
		 
		 JLabel lbltLiMt = new JLabel("Đặt lại mật khẩu");
		 lbltLiMt.setForeground(Color.BLUE);
		 lbltLiMt.setFont(new Font("Tahoma", Font.BOLD, 23));
		 lbltLiMt.setBounds(98, 43, 203, 28);
		 frame.getContentPane().add(lbltLiMt);
		 
		 JLabel lblNewLabel_1_1 = new JLabel("Email :");
		 lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 lblNewLabel_1_1.setBounds(51, 113, 43, 21);
		 frame.getContentPane().add(lblNewLabel_1_1);
		 
		 JLabel lblNewLabel_1_1_1 = new JLabel("Mã OTP :");
		 lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 lblNewLabel_1_1_1.setBounds(51, 159, 69, 21);
		 frame.getContentPane().add(lblNewLabel_1_1_1);
		 
		 JLabel lblNewLabel_1_1_2 = new JLabel("Mật khẩu mới :");
		 lblNewLabel_1_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		 lblNewLabel_1_1_2.setBounds(51, 205, 96, 21);
		 frame.getContentPane().add(lblNewLabel_1_1_2);
		 
		 txtEmail = new JTextField();
		 txtEmail.setToolTipText("");
		 txtEmail.setBounds(122, 112, 226, 22);
		 frame.getContentPane().add(txtEmail);
		 txtEmail.setColumns(10);
		 
		 txtMaOTP = new JTextField();
		 txtMaOTP.setBounds(122, 160, 118, 23);
		 frame.getContentPane().add(txtMaOTP);
		 txtMaOTP.setColumns(10);
		 
		 JButton BtnMaOTP = new JButton("Nhận OTP");
		 BtnMaOTP.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		QuenMatKhauDAO qmkDAO = new QuenMatKhauDAO();
		 		try {
		 			qmkDAO.SendCode(txtEmail.getText());
				} catch (Exception e2) {
					// TODO: handle exception
				}
		 	}
		 });
		 BtnMaOTP.setForeground(Color.WHITE);
		 BtnMaOTP.setBackground(Color.BLUE);
		 BtnMaOTP.setFont(new Font("Tahoma", Font.BOLD, 12));
		 BtnMaOTP.setBounds(250, 159, 98, 23);
		 frame.getContentPane().add(BtnMaOTP);
		 
		 PFPassnew = new JPasswordField();
		 PFPassnew.setBounds(157, 208, 191, 19);
		 frame.getContentPane().add(PFPassnew);
		 
		 JButton btnCapnhap = new JButton("Cập nhập");
		 btnCapnhap.addActionListener(new ActionListener() {
		 	public void actionPerformed(ActionEvent e) {
		 		QuenMatKhauDAO qmkDAO = new QuenMatKhauDAO();
		 		try {
		 			qmkDAO.quenmatkhau();
				} catch (Exception e2) {
					// TODO: handle exception
				}
		 	}
		 });
		 btnCapnhap.setForeground(Color.WHITE);
		 btnCapnhap.setBackground(new Color(0, 0, 205));
		 btnCapnhap.setFont(new Font("Tahoma", Font.BOLD, 14));
		 btnCapnhap.setBounds(51, 299, 297, 35);
		 frame.getContentPane().add(btnCapnhap);
		 
		 JLabel lblNewLabel = new JLabel("Mã xác thực sẽ được gửi đến Email mà bạn dùng ");
		 lblNewLabel.setBounds(49, 243, 299, 21);
		 frame.getContentPane().add(lblNewLabel);
		 
		 JLabel lblNewLabel_1 = new JLabel("đăng ký tài khoản");
		 lblNewLabel_1.setBounds(49, 264, 140, 13);
		 frame.getContentPane().add(lblNewLabel_1);
		 frame.setVisible(true);
	 }
	 public static void main(String[] args) {
		new PNquenmatkhau();
	}	
}
