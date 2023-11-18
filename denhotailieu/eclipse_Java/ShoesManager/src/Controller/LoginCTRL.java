package Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

import DAO.ConnectionSQL;
import DAO.LoginDAO;
import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import DTO.TaiKhoanDTO;
import GUI.*;

public class LoginCTRL {
	List<TaiKhoanDTO> listTk = new ArrayList<>();
	List<NhanVienDTO> listnv = new ArrayList<>();
	LoginDAO lg = new LoginDAO();
	NhanVienDAO nvDAO = new NhanVienDAO();

	public void Islogin() throws SQLException {
		String user = GUI.LoginGUI.tfName.getText();
		String pass = GUI.LoginGUI.pfPass.getText();
		String sql = "use qlcuahanggiaydb;select * from tbltaikhoan where tendangnhap = ? and matkhau = ?";
		listTk = lg.select(sql, user, pass);
		if (listTk.size() > 0) {
			if (listTk.get(0).getCapbac().equals("QL")) {
				JOptionPane.showMessageDialog(null, "tư cách Quản Lý");
				LoginGUI.frame.setVisible(false);
				QuanLyGUI ql = new QuanLyGUI();
				ql.frame.setVisible(true);

			} else {
				JOptionPane.showMessageDialog(null, "tư cách Nhân viên");
				LoginGUI.frame.setVisible(false);
				QuanLyGUI ql = new QuanLyGUI();
				ql.frame.setVisible(true);
				ql.pleft.remove(ql.pnThongke);
				ql.pleft.remove(ql.lblThongke);
			}
		} else {
			JOptionPane.showMessageDialog(null, "sai tài khoản hoặc mật khẩu");
		}
	}

	public void fogotPass() throws SQLException {
		String input = JOptionPane.showInputDialog("Nhập vào email bạn muốn gửi code");
		List<NhanVienDTO> list = nvDAO.FindDataByEmail(input);
		if (list.size() > 0) {
			SendCode(input);
		} else {
			JOptionPane.showMessageDialog(null, "Email không có trong danh sách");
		}
	}

	public void SendCode(String email) {

		try {
			int so = (int) Math.random() * 999999;
			Properties p = new Properties();
			p.put("mail.smtp.auth", "true");
			p.put("mail.smtp.starttls.enable", "true");
			p.put("mail.smtp.host", "smtp.gmail.com");
			p.put("mail.smtp.port", 587);
			final String accountName = "phamminhduc15112003dilinh@gmail.com";
			final String accountPassword = "sardyptmvfiigpqy";
			String textsubject = "Thay Đổi Mật Khẩu Tài Khoản";
			String textcontent = "Bạn Đang Yêu Cầu đổi mật khẩu cho email " + email + " Mã code kích hoạt thay đổi là: "
					+ so;
			Session s = Session.getInstance(p, new javax.mail.Authenticator() {
				protected PasswordAuthentication getPasswordAuthentication() {
					return new PasswordAuthentication(accountName, accountPassword);
				}
			});
			Message msg = new MimeMessage(s);
			try {
				msg.setFrom(new InternetAddress(accountName));// laays email từ input dialog
				msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));// nhận từ inputdialog
				msg.setSubject("CC");
				msg.setText(textcontent);
				Transport.send(msg);
				JOptionPane.showMessageDialog(null, "Gui thanh cong");
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			String checkma = JOptionPane.showInputDialog("Nhap ma code: ");

		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	public boolean IsEmail(String email) throws SQLException {
		listnv = nvDAO.FindDataByEmail(email);
		if (listnv.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

	public int LoginWithEmail(String email) throws SQLException {
		int so = (int) (Math.random() * 999999);
		if (IsEmail(email) == false) {
			JOptionPane.showMessageDialog(null, "Không có email trong danh sách");
		} else {

			try {
				Properties p = new Properties();
				p.put("mail.smtp.auth", "true");
				p.put("mail.smtp.starttls.enable", "true");
				p.put("mail.smtp.host", "smtp.gmail.com");
				p.put("mail.smtp.port", 587);
				final String accountName = "phamminhduc15112003dilinh@gmail.com";
				final String accountPassword = "sardyptmvfiigpqy";
				String textsubject = "Thay Đổi Mật Khẩu Tài Khoản";
				String textcontent = "Bạn Đang Yêu Cầu đăng nhập cho email " + email + " Mã code đăng nhập là: " + so;
				Session s = Session.getInstance(p, new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(accountName, accountPassword);
					}
				});
				Message msg = new MimeMessage(s);
				try {
					msg.setFrom(new InternetAddress(accountName));// laays email từ input dialog
					msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(email));// nhận từ inputdialog
					msg.setSubject("CC");
					msg.setText(textcontent);
					Transport.send(msg);
					JOptionPane.showMessageDialog(null, "Gui thanh cong");
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

			} catch (Exception e) {
				// TODO: handle exception
			}
		}
		return so;
	}

	public void isLoginByEmail(String email) throws SQLException {

		int code = LoginWithEmail(email);
		if (code != 0) {
			String check = JOptionPane.showInputDialog("Nhập mã code đăng nhập");
			if (code == Integer.parseInt(check)) {
				String sql = "use qlcuahanggiaydb;select * from tblnhanvien where Email = ?";
				listnv.clear();
				listTk.clear();
				listnv = nvDAO.select(sql, email);
				String sql2 = "use qlcuahanggiaydb; select * from tbltaikhoan where tendangnhap = ?";
				listTk = lg.select(sql2, listnv.get(0).getMaNV());
				if (listTk.size() > 0) {
					if (listTk.get(0).getCapbac().equals("QL")) {
						JOptionPane.showMessageDialog(null, "tư cách Quản Lý");
						LoginGUI.frame.setVisible(false);
						QuanLyGUI ql = new QuanLyGUI();
						ql.frame.setVisible(true);

					} else {
						JOptionPane.showMessageDialog(null, "tư cách Nhân viên");
						LoginGUI.frame.setVisible(false);
						QuanLyGUI ql = new QuanLyGUI();
						ql.frame.setVisible(true);
						ql.pleft.remove(ql.pnThongke);
						ql.pleft.remove(ql.lblThongke);
					}
				} else {
					JOptionPane.showMessageDialog(null, "Không có tài khoản ứng với email");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Sai code");
			}
		}
	}
}
