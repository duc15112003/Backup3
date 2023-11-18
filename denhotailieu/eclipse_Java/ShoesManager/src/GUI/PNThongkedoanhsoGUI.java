package GUI;
import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import DTO.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

public class PNThongkedoanhsoGUI extends JPanel{
	private JTextField txtMa;
	private JTextField txtHo;
	private JTextField txtTen;
	private JTextField txtGioiTinh;
	private JTextField txtDiaChi;
	private JTextField txtSoDT;
	private JTextField txtEmail;
	private JTextField txtLuong;
	
	public PNThongkedoanhsoGUI() {
		setBorder(new LineBorder(new Color(0, 0, 0)));
		// TODO Auto-generated constructor stub
		setBackground(Color.WHITE);
		setSize(1151,639);
		setLayout(null);
		
		JPanel pnNhanvien = new JPanel();
		pnNhanvien.setBackground(new Color(255, 255, 255));
		pnNhanvien.setBorder(new LineBorder(Color.RED, 1, true));
		pnNhanvien.setBounds(35, 32, 1106, 153);
		add(pnNhanvien);
		pnNhanvien.setLayout(null);
		
		JPanel pnAnh = new JPanel();
		pnAnh.setBorder(new LineBorder(new Color(0, 0, 0)));
		pnAnh.setBounds(10, 11, 128, 132);
		pnNhanvien.add(pnAnh);
		
		JLabel lblAnh = new JLabel("Image");
		pnAnh.add(lblAnh);
		
		JLabel lblMaNV = new JLabel("Mã Nhân Viên");
		lblMaNV.setBounds(148, 24, 86, 24);
		pnNhanvien.add(lblMaNV);
		
		JLabel lblSoDT = new JLabel("Số Điện Thoại");
		lblSoDT.setBounds(148, 75, 78, 24);
		pnNhanvien.add(lblSoDT);
		
		JLabel lblHo = new JLabel("Họ");
		lblHo.setBounds(360, 24, 39, 24);
		pnNhanvien.add(lblHo);
		
		txtMa = new JTextField();
		txtMa.setBounds(246, 26, 96, 20);
		pnNhanvien.add(txtMa);
		txtMa.setColumns(10);
		
		txtHo = new JTextField();
		txtHo.setColumns(10);
		txtHo.setBounds(398, 26, 86, 20);
		pnNhanvien.add(txtHo);
		
		JLabel lblTen = new JLabel("Tên");
		lblTen.setBounds(507, 22, 39, 29);
		pnNhanvien.add(lblTen);
		
		txtTen = new JTextField();
		txtTen.setColumns(10);
		txtTen.setBounds(556, 26, 86, 20);
		pnNhanvien.add(txtTen);
		
		JLabel lblGioiTinh = new JLabel("Giới Tính");
		lblGioiTinh.setBounds(675, 11, 59, 47);
		pnNhanvien.add(lblGioiTinh);
		
		txtGioiTinh = new JTextField();
		txtGioiTinh.setColumns(10);
		txtGioiTinh.setBounds(754, 26, 86, 20);
		pnNhanvien.add(txtGioiTinh);
		
		JLabel lblDiachi = new JLabel("Địa Chỉ");
		lblDiachi.setBounds(870, 11, 59, 47);
		pnNhanvien.add(lblDiachi);
		
		txtDiaChi = new JTextField();
		txtDiaChi.setColumns(10);
		txtDiaChi.setBounds(939, 26, 86, 20);
		pnNhanvien.add(txtDiaChi);
		
		txtSoDT = new JTextField();
		txtSoDT.setColumns(10);
		txtSoDT.setBounds(246, 77, 93, 20);
		pnNhanvien.add(txtSoDT);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(360, 75, 39, 24);
		pnNhanvien.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(398, 77, 86, 20);
		pnNhanvien.add(txtEmail);
		
		JLabel lblLuong = new JLabel("Lương");
		lblLuong.setBounds(507, 75, 50, 24);
		pnNhanvien.add(lblLuong);
		
		txtLuong = new JTextField();
		txtLuong.setColumns(10);
		txtLuong.setBounds(556, 77, 86, 20);
		pnNhanvien.add(txtLuong);
		
		JLabel lblChucVu = new JLabel("Chức Vụ:");
		lblChucVu.setBounds(148, 119, 59, 24);
		pnNhanvien.add(lblChucVu);
		
		JLabel lblWriteChucvu = new JLabel("Quản Lý");
		lblWriteChucvu.setBounds(246, 119, 59, 24);
		pnNhanvien.add(lblWriteChucvu);
		
	}
}
