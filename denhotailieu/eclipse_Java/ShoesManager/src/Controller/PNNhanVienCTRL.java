package Controller;

import javax.swing.JOptionPane;

import DAO.NhanVienDAO;
import DTO.*;
import GUI.PNNhanvienGUI;

import java.sql.SQLException;
import java.util.*;

public class PNNhanVienCTRL {
	
	NhanVienDAO nv = new NhanVienDAO();
	
	public void DeleteNV() throws SQLException {
		String ID = JOptionPane.showInputDialog("Nhập Vào Nhân Viên Cần Xóa");
		if(CheckID(ID)==true) {
			nv.DeleNhanvien(ID);
			JOptionPane.showMessageDialog(null, "Xóa Thành Công");
			new PNNhanvienGUI();
		}else {
			JOptionPane.showMessageDialog(null, "Không Có Nhân Viên Trong Danh Sách");
		}
	}
	
	public Boolean CheckID(String ID) throws SQLException {
		List<NhanVienDTO> list = new ArrayList<>();
		list = nv.FindDataByID(ID);
		if(list.size()>0) {
			return true;
		}else {
			return false;
		}
	}

}
