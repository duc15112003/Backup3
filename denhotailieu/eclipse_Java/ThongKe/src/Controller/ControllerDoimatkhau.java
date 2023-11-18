package Controller;

import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;
import DTO.NhanVienDTO;
import DTO.TaiKhoanDTO;
import DAO.ConnectionSQL;
import DAO.DoiMatKhauDAO;
import DAO.NhanVienDAO;
import GUI.PNdoimatkhau;

public class ControllerDoimatkhau {
	String name;
	 String pass;
	 String loai;
	 PreparedStatement ps;
	 
	 ResultSet rs;
	 int index = 0;
	
    public static boolean Checknull(JTextField txtField, StringBuilder str, String message) {
        String strField = txtField.getText();
        if (strField.equals("")) {
            str.append(message);
            txtField.setBackground(Color.yellow);
            return false;
        }
        txtField.setBackground(Color.white);
        return true;
    }

	
		
	}

