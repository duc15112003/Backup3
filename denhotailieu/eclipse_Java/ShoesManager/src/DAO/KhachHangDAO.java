package DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import DTO.*;

public class KhachHangDAO {
	ResultSet rs;
	PreparedStatement ps;

	List<KhachHangDTO> list = new ArrayList<>();
	ConnectionSQL cn = new ConnectionSQL();

	public void insert(KhachHangDTO kh) {
		String sql = "use qlcuahanggiaydb;insert into tblkhachhang values(?,?,?,?,?,?,?,?)";
		cn.executeQuery(sql, kh.getMaKH(), kh.getHo(), kh.getTen(), kh.getGioiTinh(), kh.getDiaChi(), kh.getEmail(),
				kh.getLoai(), kh.getTongChiTieu());
	}
	
	public void Delete(KhachHangDTO kh) {
		String query = "use qlcuahanggiaydb; Delete from tblkhachhang where MaKH =?";
		cn.executeUpdate(query, kh.getMaKH());
	}
	
	public List<KhachHangDTO> FindByID(String id) throws SQLException{
		String sql = "use qlcuahanggiaydb; select * from tblkhachhang where MaKH = ?";
		return select(sql,id);
	}
	
	
	
	public void Update(KhachHangDTO kh) {
		String sql = "use qlcuahanggiaydb; Update tblkhachhang set Ho =?,Ten = ?,GioiTinh = ?,DiaChi=?,Email = ?,Loai = ?,TongChiTieu = ? where MaKH =?";
		cn.executeUpdate(sql,kh.getHo(), kh.getTen(), kh.getGioiTinh(), kh.getDiaChi(), kh.getEmail(),kh.getLoai(), kh.getTongChiTieu(), kh.getMaKH());
	}

	public List<KhachHangDTO> select(String sql, Object... args) throws SQLException {
		List<KhachHangDTO> list = new ArrayList<>();
		rs = cn.executeQuery(sql, args);
		while (rs.next()) {

			KhachHangDTO kh = readData(rs);
			list.add(kh);

		}
		return list;
	}

	public List<KhachHangDTO> select() throws SQLException {
		String sql = "use qlcuahanggiaydb; select * from tblkhachhang;";
		return select(sql);
	}

	public KhachHangDTO readData(ResultSet rs) throws SQLException {
		KhachHangDTO kh = new KhachHangDTO();
		kh.setMaKH(rs.getString(1));
		kh.setHo(rs.getString(2));
		kh.setTen(rs.getString(3));
		kh.setGioiTinh(rs.getString(4));
		kh.setDiaChi(rs.getString(5));
		kh.setEmail(rs.getString(6));
		kh.setLoai(rs.getString(7));
		kh.setTongChiTieu(rs.getString(8));

		return kh;
	}

}
