package GUI;

import javax.swing.JPanel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollPane;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;

public class PNPhieunhapGUI extends JPanel {
	
	public static  JPanel pnphieunhap;
	public static  JPanel pnphieunhapchitiet;
	public static  JLabel lblInfo;
	public static  JLabel lblSearch;
	public static  JLabel lblMaphieunhap;
	public static  JLabel lblManhacungcap;
	public static  JLabel lblManhanvien;
	public static  JLabel lblNgaynhap;
	public static  JLabel lblTongtien;
	public static  JTextField txtMaphieunhap;
	public static  JTextField txtManhanvien;
	public static  JTextField txtTongtien;
	public static  JPanel pnBangphieunhap;
	public static  JTable tblBangphieunhap;
	public static  JLabel lblChitietMasanpham;
	public static  JLabel lblChitietMaPN;
	public static  JLabel lblChitietSoluong;
	public static  JLabel lblGianhap;
	public static  JTextField txtChitietmasanpham;
	public static  JTextField txtChitietmapn;
	public static  JTextField txtChitietsoluong;
	public static  JTextField txtChitietgianhap;
	public static  JPanel pnTimkiem;
	public static  JLabel lblMaspTimkiem;
	public static  JTextField txtMasanphamtimkiem;
	public static  JLabel lblSoluongtimkiem;
	public static  JTextField txtSoluongdau;
	public static  JLabel lblNewLabel_9;
	public static  JTextField txtSoluongcuoi;
	public static  JButton btnThemchitiet;
	public static  JButton btnSuachitiet;
	public static  JButton btnXoachitiet;
	public static  JButton btnLammoichitiet;
	public static  JButton btnTimkiem;
	public static  JButton btnHuy;
	public static  JButton btnLammoitimkiem;
	public static  JPanel pnBangphieunhapchitiet;
	public static  JTable tblBangphieunhapchitiet;
	public static  JLabel lblTieude;
	public static  JComboBox comManhacungcap;
	public static  JButton btnThem;
	public static  JButton btnLammoi;
	public static  JButton btnSua;
	public static  JButton btnXoa;
	public static JDateChooser dateNgaynhap;


	public PNPhieunhapGUI() {
		setBackground(Color.WHITE);
		setSize(1151,639);
		setLayout(null);
		
		pnphieunhap = new JPanel();
		pnphieunhap.setBackground(Color.WHITE);
		pnphieunhap.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2), "Phiếu Nhập", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		pnphieunhap.setBounds(10, 11, 447, 617);
		add(pnphieunhap);
		pnphieunhap.setLayout(null);
		
		lblInfo = new JLabel(new ImageIcon(getClass().getResource("/thongtinne.png")));
		lblInfo.setBounds(53, 46, 95, 33);
		pnphieunhap.add(lblInfo);
		
		lblSearch = new JLabel(new ImageIcon(getClass().getResource("/searchlbl.png")));
		lblSearch.setBounds(286, 46, 95, 33);
		pnphieunhap.add(lblSearch);
		
		lblMaphieunhap = new JLabel("Mã Phiếu Nhập");
		lblMaphieunhap.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblMaphieunhap.setBounds(62, 138, 132, 14);
		pnphieunhap.add(lblMaphieunhap);
		
		lblManhacungcap = new JLabel("Mã Nhà Cung Cấp");
		lblManhacungcap.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblManhacungcap.setBounds(62, 175, 142, 14);
		pnphieunhap.add(lblManhacungcap);
		
		lblManhanvien = new JLabel("Mã Nhân viên");
		lblManhanvien.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblManhanvien.setBounds(62, 217, 132, 14);
		pnphieunhap.add(lblManhanvien);
		
		lblNgaynhap = new JLabel("Ngày Nhập");
		lblNgaynhap.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblNgaynhap.setBounds(62, 253, 132, 14);
		pnphieunhap.add(lblNgaynhap);
		
		lblTongtien = new JLabel("Tổng Tiền");
		lblTongtien.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTongtien.setBounds(62, 288, 123, 14);
		pnphieunhap.add(lblTongtien);
		
		
		txtMaphieunhap = new JTextField();
		txtMaphieunhap.setBounds(206, 135, 158, 20);
		pnphieunhap.add(txtMaphieunhap);
		txtMaphieunhap.setColumns(10);
		
		comManhacungcap = new JComboBox();
		comManhacungcap.setBounds(206, 173, 158, 22);
		pnphieunhap.add(comManhacungcap);
		
		txtManhanvien = new JTextField();
		txtManhanvien.setColumns(10);
		txtManhanvien.setBounds(206, 216, 158, 20);
		pnphieunhap.add(txtManhanvien);
		
		txtTongtien = new JTextField();
		txtTongtien.setColumns(10);
		txtTongtien.setBounds(206, 287, 158, 20);
		pnphieunhap.add(txtTongtien);
		
		btnThem = new JButton("Thêm");
		btnThem.setBounds(28, 332, 89, 23);
		pnphieunhap.add(btnThem);
		
		btnLammoi = new JButton("Làm Mới");
		btnLammoi.setBounds(325, 332, 89, 23);
		pnphieunhap.add(btnLammoi);
		
		btnSua = new JButton("Sửa");
		btnSua.setBounds(127, 332, 89, 23);
		pnphieunhap.add(btnSua);
		
		btnXoa = new JButton("Xóa");
		btnXoa.setBounds(226, 332, 89, 23);
		pnphieunhap.add(btnXoa);
		
		pnBangphieunhap = new JPanel();
		pnBangphieunhap.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Bảng Phiếu Nhập", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		pnBangphieunhap.setBounds(10, 385, 422, 221);
		pnphieunhap.add(pnBangphieunhap);
		pnBangphieunhap.setLayout(null);
		
		tblBangphieunhap = new JTable();
		tblBangphieunhap.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
				{null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column"
			}
		));
		tblBangphieunhap.setBounds(12, 22, 400, 188);
		pnBangphieunhap.add(tblBangphieunhap);
		
		dateNgaynhap = new JDateChooser();
		dateNgaynhap.setBounds(204, 253, 160, 20);
		pnphieunhap.add(dateNgaynhap);
		
		pnphieunhapchitiet = new JPanel();
		pnphieunhapchitiet.setBackground(Color.WHITE);
		pnphieunhapchitiet.setBorder(new TitledBorder(new LineBorder(new Color(255, 0, 0), 2), "Chi Tiết Phiếu Nhập", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		pnphieunhapchitiet.setBounds(467, 11, 674, 617);
		add(pnphieunhapchitiet);
		pnphieunhapchitiet.setLayout(null);
		
		lblChitietMasanpham = new JLabel("Mã Sản Phẩm");
		lblChitietMasanpham.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblChitietMasanpham.setBounds(21, 135, 112, 14);
		pnphieunhapchitiet.add(lblChitietMasanpham);
		
		lblChitietMaPN = new JLabel("Mã Phiếu Nhập");
		lblChitietMaPN.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblChitietMaPN.setBounds(21, 172, 112, 14);
		pnphieunhapchitiet.add(lblChitietMaPN);
		
		lblChitietSoluong = new JLabel("Số Lượng");
		lblChitietSoluong.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblChitietSoluong.setBounds(21, 214, 82, 14);
		pnphieunhapchitiet.add(lblChitietSoluong);
		
		lblGianhap = new JLabel("Giá Nhập");
		lblGianhap.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblGianhap.setBounds(21, 250, 82, 14);
		pnphieunhapchitiet.add(lblGianhap);
		
		txtChitietmasanpham = new JTextField();
		txtChitietmasanpham.setColumns(10);
		txtChitietmasanpham.setBounds(143, 134, 158, 20);
		pnphieunhapchitiet.add(txtChitietmasanpham);
		
		txtChitietmapn = new JTextField();
		txtChitietmapn.setColumns(10);
		txtChitietmapn.setBounds(143, 171, 158, 20);
		pnphieunhapchitiet.add(txtChitietmapn);
		
		txtChitietsoluong = new JTextField();
		txtChitietsoluong.setColumns(10);
		txtChitietsoluong.setBounds(143, 213, 158, 20);
		pnphieunhapchitiet.add(txtChitietsoluong);
		
		txtChitietgianhap = new JTextField();
		txtChitietgianhap.setColumns(10);
		txtChitietgianhap.setBounds(143, 249, 158, 20);
		pnphieunhapchitiet.add(txtChitietgianhap);
		
		pnTimkiem = new JPanel();
		pnTimkiem.setBackground(Color.WHITE);
		pnTimkiem.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Tìm Kiếm", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		pnTimkiem.setBounds(385, 100, 279, 196);
		pnphieunhapchitiet.add(pnTimkiem);
		pnTimkiem.setLayout(null);
		
		lblMaspTimkiem = new JLabel("Mã Sản Phẩm");
		lblMaspTimkiem.setBounds(10, 32, 93, 17);
		lblMaspTimkiem.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		pnTimkiem.add(lblMaspTimkiem);
		
		txtMasanphamtimkiem = new JTextField();
		txtMasanphamtimkiem.setColumns(10);
		txtMasanphamtimkiem.setBounds(113, 32, 158, 20);
		pnTimkiem.add(txtMasanphamtimkiem);
		
		lblSoluongtimkiem = new JLabel("Số Lượng");
		lblSoluongtimkiem.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblSoluongtimkiem.setBounds(10, 72, 82, 14);
		pnTimkiem.add(lblSoluongtimkiem);
		
		txtSoluongdau = new JTextField();
		txtSoluongdau.setColumns(10);
		txtSoluongdau.setBounds(10, 107, 93, 20);
		pnTimkiem.add(txtSoluongdau);
		
		lblNewLabel_9 = new JLabel("==>");
		lblNewLabel_9.setBounds(113, 110, 31, 14);
		pnTimkiem.add(lblNewLabel_9);
		
		txtSoluongcuoi = new JTextField();
		txtSoluongcuoi.setColumns(10);
		txtSoluongcuoi.setBounds(156, 107, 93, 20);
		pnTimkiem.add(txtSoluongcuoi);
		
		btnTimkiem = new JButton("Tìm Kiếm");
		btnTimkiem.setBounds(10, 157, 76, 23);
		pnTimkiem.add(btnTimkiem);
		
		btnHuy = new JButton("Hủy");
		btnHuy.setBounds(96, 157, 82, 23);
		pnTimkiem.add(btnHuy);
		
		btnLammoitimkiem = new JButton("Làm Mới");
		btnLammoitimkiem.setBounds(188, 157, 82, 23);
		pnTimkiem.add(btnLammoitimkiem);
		
		btnThemchitiet = new JButton("Thêm");
		btnThemchitiet.setBounds(10, 307, 76, 23);
		pnphieunhapchitiet.add(btnThemchitiet);
		
		btnSuachitiet = new JButton("Sửa");
		btnSuachitiet.setBounds(96, 307, 82, 23);
		pnphieunhapchitiet.add(btnSuachitiet);
		
		btnXoachitiet = new JButton("Xóa");
		btnXoachitiet.setBounds(188, 307, 82, 23);
		pnphieunhapchitiet.add(btnXoachitiet);
		
		btnLammoichitiet = new JButton("Làm Mới");
		btnLammoichitiet.setBounds(280, 307, 82, 23);
		pnphieunhapchitiet.add(btnLammoichitiet);
		
		pnBangphieunhapchitiet = new JPanel();
		pnBangphieunhapchitiet.setLayout(null);
		pnBangphieunhapchitiet.setBorder(new TitledBorder(new LineBorder(new Color(0, 0, 0), 2), "Bảng Phiếu Nhập Chi Tiết", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 0, 0)));
		pnBangphieunhapchitiet.setBounds(10, 385, 654, 221);
		pnphieunhapchitiet.add(pnBangphieunhapchitiet);
		
		tblBangphieunhapchitiet = new JTable();
		tblBangphieunhapchitiet.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
				{null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		tblBangphieunhapchitiet.setBounds(10, 22, 634, 188);
		pnBangphieunhapchitiet.add(tblBangphieunhapchitiet);
		
		lblTieude = new JLabel("Chi Tiết Phiếu Nhập");
		lblTieude.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 18));
		lblTieude.setBounds(208, 30, 196, 33);
		pnphieunhapchitiet.add(lblTieude);
		
	}
}
