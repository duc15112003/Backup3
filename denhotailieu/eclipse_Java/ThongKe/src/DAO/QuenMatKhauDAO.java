package DAO;

import java.net.PasswordAuthentication;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;

import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.JOptionPane;

import javax.swing.JOptionPane;

import DTO.NhanVienDTO;
import DTO.TaiKhoanDTO;

public class QuenMatKhauDAO {
	 
	String name;
	 String pass;
	 String loai;
	 PreparedStatement ps;
	 ResultSet rs;
	 int index = 0;
	
	ConnectionSQL cn = new ConnectionSQL();
	List<TaiKhoanDTO> listTk = new ArrayList<>();
	List<NhanVienDTO> listnv = new ArrayList<>();
	NhanVienDAO nvDao = new NhanVienDAO();
	DoiMatKhauDAO dmkDAO = new DoiMatKhauDAO();
	
	public void Update(TaiKhoanDTO tk) {
		String sql = "use qlcuahanggiaydb; update tblnhanvien set matkhau = ? where tendangnhap = ?";
		cn.executeQuery(sql,tk.getMatkhau(),tk.getTendangnhap());
	}
	
	
	public int SendCode(String email) throws SQLException {
		int so = (int) (Math.random() * 999999);
		if (CheckEmail(email) == false) {
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
					protected javax.mail.PasswordAuthentication getPasswordAuthentication() {
						return new javax.mail.PasswordAuthentication(accountName, accountPassword);
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
	
	
	public boolean CheckEmail(String email) throws SQLException {
		listnv = nvDao.FindDataByEmail(email);
		if (listnv.size() > 0) {
			return true;
		} else {
			return false;
		}
	}
	
	
	
	
	
	public void quenmatkhau() throws SQLException {
		String matkhaumoi = GUI.PNdoimatkhau.txtPassmoi.getText();
		
		TaiKhoanDTO tk = new TaiKhoanDTO();
		if(GUI.PNquenmatkhau.txtMaOTP.getText()==String.valueOf(SendCode(GUI.PNquenmatkhau.txtEmail.getText()))&& CheckEmail(GUI.PNquenmatkhau.txtEmail.getText())==true)
		{
			Update(tk);
		}
	
		
		
	}

public List<TaiKhoanDTO> select(String sql, Object...args) throws SQLException{
	List<TaiKhoanDTO> list = new ArrayList<>();
	rs = cn.executeQuery(sql, args);
	while (rs.next()) {
		TaiKhoanDTO tk = readdata(rs);
		list.add(tk);
	}
	return list;
	
}

public TaiKhoanDTO readdata(ResultSet rs) throws SQLException {
	TaiKhoanDTO tk = new TaiKhoanDTO();
	tk.setTendangnhap(rs.getString(1));
	tk.setMatkhau(rs.getString(2));
	tk.setCapbac(rs.getString(3));
	return tk;
}

	
	
}
