package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.table.DefaultTableModel;

import DTO.HoaDonDTO;
import DTO.PhieuNhapDTO;

public class ThongKeDAO {
	ResultSet rs ;
	ConnectionSQL cn = new ConnectionSQL();
	
	
	 
	 
	 
//	public  List<PhieuNhapDTO> ShowAll()
//	{
//		  List<PhieuNhapDTO> list = new ArrayList<>();
//	      ResultSet rs = null;
//	      Statement stm = null;
//		try {
//			
//			String sql = "select tblchitietpn.MaPN,SoLuong,SoLuong*GiaNhap as 'TongTien',NgayNhap from tblphieunhap, tblchitietpn where tblphieunhap.MaPN = tblchitietpn.MaPN ";
//			ConnectionSQL conn = new ConnectionSQL();  
//             stm = conn.prepareStatement(sql, list);
//             rs= stm.executeQuery(sql);
//             
//             while(rs.next())
//             {
//            	 PhieuNhapDTO pn = new PhieuNhapDTO();
//            	 pn.setMaPN(rs.getString(1));
//            	 pn.setSoLuong(rs.getInt(2));
//            	 pn.setGiaNhap(rs.getDouble(3));
//            	 pn.setNgayNhap(rs.getString(4));
//            	 list.add(pn);
//             }
//			
//		} catch (Exception e) {
//			 System.out.println("Loi: " +e.toString());
//			// TODO: handle exception
//		}
//	     finally{
//             
//             try {
//                 //conn.close(); 
//                 rs.close();
//                 stm.close();
//                 
//             } catch (Exception e) {
//             }
//         }
//		return list; 
//	}
	
	
	public List<HoaDonDTO> ShowAll() throws SQLException {
		String sql = "use qlcuahanggiaydb;select tblhoadon.MaHD, SoLuong, SoLuong*GiaBan as 'TongTien', NgayBan from tblhoadon, tblchitiethd where tblchitiethd.MaHD = tblhoadon.MaHD";
		List<HoaDonDTO> list = select(sql);
		return list;
	}
	
	
	
	
	
	public HoaDonDTO readData(ResultSet rs) throws SQLException {
	HoaDonDTO hd = new HoaDonDTO();
	 hd.setMaHD(rs.getString(1));
	 hd.setSoLuong(rs.getInt(2));
	 hd.setGiaBan(rs.getDouble(3));
	 hd.setNgayBan(rs.getString(4));

	return hd;
}
	
	
	public List<HoaDonDTO> select(String sql, Object...args) throws SQLException{
		List<HoaDonDTO> list = new ArrayList<>();
		rs = cn.executeQuery(sql, args);
		while (rs.next()) {
			HoaDonDTO hd = readData(rs);
			list.add(hd);
		}
		return list;
		
		
	}
	
	
	
	public List<PhieuNhapDTO> ShowAll2() throws SQLException {
		String sql = "use qlcuahanggiaydb;select tblchitietpn.MaPN,SoLuong,SoLuong*GiaNhap as 'TongTien',NgayNhap from tblphieunhap, tblchitietpn where tblphieunhap.MaPN = tblchitietpn.MaPN ";
		List<PhieuNhapDTO> list = select2(sql);
		return list;
	}
	
	
	public PhieuNhapDTO readData2(ResultSet rs) throws SQLException {
	PhieuNhapDTO pn = new PhieuNhapDTO();
	 pn.setMaPN(rs.getString(1));
	 pn.setSoLuong(rs.getInt(2));
	 pn.setGiaNhap(rs.getDouble(3));
	 pn.setNgayNhap(rs.getString(4));

	return pn;
}
	
	
	public List<PhieuNhapDTO> select2(String sql, Object...args) throws SQLException{
		List<PhieuNhapDTO> list = new ArrayList<>();
		rs = cn.executeQuery(sql, args);
		while (rs.next()) {
			PhieuNhapDTO pn = readData2(rs);
			list.add(pn);
		}
		return list;
		
		
	}
	
	public List<PhieuNhapDTO> Showtiennhapcaonhat() throws SQLException {
		String sql = "use qlcuahanggiaydb; select top 1 GiaNhap from tblchitietpn order by GiaNhap DESC";
		List<PhieuNhapDTO> list = select2(sql);
		return list;
	}
	
	
	public PhieuNhapDTO readData3(ResultSet rs) throws SQLException {
	PhieuNhapDTO pn = new PhieuNhapDTO();
	 pn.setGiaNhap(rs.getDouble(1));
	return pn;
}
	
	
	
	public List<PhieuNhapDTO> select3(String sql, Object...args) throws SQLException{
		List<PhieuNhapDTO> list = new ArrayList<>();
		rs = cn.executeQuery(sql, args);
		while (rs.next()) {
			PhieuNhapDTO pn = readData3(rs);
			list.add(pn);
		}
		return list;
		
		
	}
	

	
	
	
	
	
	
	
//	public List<HoaDonDTO> ShowAll2()
//	{
//		  List<HoaDonDTO> list = new ArrayList<>();
//	      ResultSet rs = null;
//	      Statement stm = null;
//	      
//	      try {
//	    	  
//	    	  String sql ="select tblhoadon.MaHD, SoLuong, SoLuong*GiaBan as 'TongTien', NgayBan from tblhoadon, tblchitiethd where tblchitiethd.MaHD = tblhoadon.MaHD  ";
//	    	  ConnectionSQL conn = new ConnectionSQL();             
//	          stm = conn.prepareStatement(sql, list);
//	          rs= stm.executeQuery(sql);
//	          while(rs.next())
//	          {
//	        	  HoaDonDTO hd = new HoaDonDTO();
//	        	  hd.setMaHD(rs.getString(1));
//	        	  hd.setSoLuong(rs.getInt(2));
//	        	  hd.setGiaBan(rs.getDouble(3));
//	        	  hd.setNgayBan(rs.getString(4));
//	        	  list.add(hd);
//	        	  
//	          }
//	        
//			
//		} catch (Exception e) {
//			// TODO: handle exception
//			 System.out.println("Loi: " +e.toString());
//		}
//	      finally{
//	             
//	             try {
//	             //    conn.close();
//	                 rs.close();
//	                 stm.close();
//	                 
//	             } catch (Exception e) {
//	             }
//	         }
//			return list; 
//	      
//	}
//	
//	

	
	
	
	
}
