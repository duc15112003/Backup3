package DAO;

import java.awt.Color;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JTextField;


import DTO.TaiKhoanDTO;

public class DoiMatKhauDAO {
	
	 PreparedStatement ps;
	 ResultSet rs;
	 int index = 0;
	
	ConnectionSQL cn = new ConnectionSQL();
	List<TaiKhoanDTO> listTk = new ArrayList<>();
	DoiMatKhauDAO dmkDAO = new DoiMatKhauDAO();
	
	
	

	   
		public void Update(TaiKhoanDTO tk) {
			String sql = "use qlcuahanggiaydb; update tblnhanvien set matkhau = ? where tendangnhap = ?";
			cn.executeQuery(sql,tk.getMatkhau(),tk.getTendangnhap());
		}
		

		public void doimatkhau() throws SQLException {
			String matkhaumoi = GUI.PNdoimatkhau.txtPassmoi.getText();
			String xacnhanmatkhau = GUI.PNdoimatkhau.txtXacnhanpass.getText();
			TaiKhoanDTO tk = new TaiKhoanDTO();
			if(matkhaumoi.equalsIgnoreCase(xacnhanmatkhau))
			{
				Update(tk);
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Mật khẩu không khớp");
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
