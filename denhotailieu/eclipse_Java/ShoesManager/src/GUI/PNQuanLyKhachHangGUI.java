package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PNQuanLyKhachHangGUI extends JPanel {
	
	public static JPanel panel_Bangthongtinkhachhang;
	
	public static 	JPanel panel_Bangkhachhang ;
	public static   JTable table_Bangkhachhang;

	public static JPanel panel_Thongtinkhachhang;
	public static JLabel lbTthongtin_maKh;
	public static JLabel  lbTthongtin_hovaten;
	public static  JLabel lbTthongtin_gioitinh;
	public static JLabel lbTthongtin_Diachi;
	public static JLabel lbTthongtin_Email;
	public static JLabel lbTthongtin_Loai;
	public static JLabel lbTthongtin_TongCT;
	
	
	public static JTextField txtThongtin_maKH;
	public static JTextField txtThongtin_Hovaten;
	public static JTextField txtThongtin_Gioitinh;
	public static JTextField txtThongtin_Diachi;
	public static JTextField txtThongtin_Email;
	public static JTextField txtThongtin_Loai;
	public static JTextField txtThongtin_Tongct;
	
	public static 	JPanel panel_Timkiemkhachhang;
	public static  JLabel lblTimkiem_Makh ;
	public static JLabel lblTimkiem_Hovaten;
	public static 	JLabel lblTimkiem_Gioitinh;
	public static JLabel lblTimkiem_Diachi;
	public static JLabel tblTimkiem_Email;
	public static JLabel tblTimkiem_Loail;
	public static JLabel tblTimkiem_Tongct;
	
	private JTextField txtTimkiemMaKH;
	private JTextField txtTimkiem_Loai;
	private JTextField txtTimkiem_Tongct1;
	private JTextField txtTimkiemTongCT2;

	/**
	 * Create the panel.
	 */
	public PNQuanLyKhachHangGUI() {
		setSize(1151, 639);
		setLayout(null);
		
		JPanel panel_Bangthongtinkhachhang = new JPanel();
		panel_Bangthongtinkhachhang.setBounds(10, 5, 1131, 587);
		add(panel_Bangthongtinkhachhang);
		panel_Bangthongtinkhachhang.setLayout(null);
		
		JPanel panel_Bangkhachhang = new JPanel();
		panel_Bangkhachhang.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 51), new Color(255, 102, 51), new Color(255, 102, 51), new Color(255, 102, 51)), "B\u1EA3ng kh\u00E1ch h\u00E0ng", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_Bangkhachhang.setBounds(10, 5, 1111, 277);
		panel_Bangthongtinkhachhang.add(panel_Bangkhachhang);
		panel_Bangkhachhang.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 22, 1091, 245);
		panel_Bangkhachhang.add(scrollPane);
		
		table_Bangkhachhang = new JTable();
		table_Bangkhachhang.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null},
			},
			new String[] {
				"New column", "New column", "New column", "New column", "New column", "New column", "New column"
			}
		));
		scrollPane.setViewportView(table_Bangkhachhang);
		
		JPanel panel_Thongtinkhachhang = new JPanel();
		panel_Thongtinkhachhang.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 51), new Color(255, 102, 51), new Color(255, 102, 51), new Color(255, 102, 51)), "Th\u00F4ng tin", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_Thongtinkhachhang.setBounds(10, 292, 542, 293);
		panel_Bangthongtinkhachhang.add(panel_Thongtinkhachhang);
		panel_Thongtinkhachhang.setLayout(null);
		
		JLabel lblTthongtin_maKh = new JLabel("Mã KH");
		lblTthongtin_maKh.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTthongtin_maKh.setBounds(31, 37, 59, 13);
		panel_Thongtinkhachhang.add(lblTthongtin_maKh);
		
		txtThongtin_maKH = new JTextField();
		txtThongtin_maKH.setBounds(100, 33, 130, 26);
		panel_Thongtinkhachhang.add(txtThongtin_maKH);
		txtThongtin_maKH.setColumns(10);
		
		JLabel lblTthongtin_hovaten = new JLabel("Họ và tên");
		lblTthongtin_hovaten.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTthongtin_hovaten.setBounds(13, 93, 77, 13);
		panel_Thongtinkhachhang.add(lblTthongtin_hovaten);
		
		txtThongtin_Hovaten = new JTextField();
		txtThongtin_Hovaten.setColumns(10);
		txtThongtin_Hovaten.setBounds(100, 89, 130, 26);
		panel_Thongtinkhachhang.add(txtThongtin_Hovaten);
		
		JLabel lblTthongtin_gioitinh = new JLabel("Giới tính");
		lblTthongtin_gioitinh.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTthongtin_gioitinh.setBounds(24, 149, 66, 13);
		panel_Thongtinkhachhang.add(lblTthongtin_gioitinh);
		
		txtThongtin_Gioitinh = new JTextField();
		txtThongtin_Gioitinh.setColumns(10);
		txtThongtin_Gioitinh.setBounds(100, 145, 130, 26);
		panel_Thongtinkhachhang.add(txtThongtin_Gioitinh);
		
		JLabel lblTthongtin_Diachi = new JLabel("Địa chỉ");
		lblTthongtin_Diachi.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTthongtin_Diachi.setBounds(31, 210, 59, 13);
		panel_Thongtinkhachhang.add(lblTthongtin_Diachi);
		
		txtThongtin_Diachi = new JTextField();
		txtThongtin_Diachi.setColumns(10);
		txtThongtin_Diachi.setBounds(100, 206, 130, 26);
		panel_Thongtinkhachhang.add(txtThongtin_Diachi);
		
		JLabel lblTthongtin_Email = new JLabel("Email");
		lblTthongtin_Email.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTthongtin_Email.setBounds(250, 37, 59, 13);
		panel_Thongtinkhachhang.add(lblTthongtin_Email);
		
		txtThongtin_Email = new JTextField();
		txtThongtin_Email.setColumns(10);
		txtThongtin_Email.setBounds(362, 33, 130, 26);
		panel_Thongtinkhachhang.add(txtThongtin_Email);
		
		JLabel lblTthongtin_Loai = new JLabel("Loại");
		lblTthongtin_Loai.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTthongtin_Loai.setBounds(250, 93, 59, 13);
		panel_Thongtinkhachhang.add(lblTthongtin_Loai);
		
		txtThongtin_Loai = new JTextField();
		txtThongtin_Loai.setColumns(10);
		txtThongtin_Loai.setBounds(362, 89, 130, 26);
		panel_Thongtinkhachhang.add(txtThongtin_Loai);
		
		JLabel lblTthongtin_TongCT = new JLabel("Tổng chi tiêu");
		lblTthongtin_TongCT.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTthongtin_TongCT.setBounds(249, 142, 103, 26);
		panel_Thongtinkhachhang.add(lblTthongtin_TongCT);
		
		txtThongtin_Tongct = new JTextField();
		txtThongtin_Tongct.setColumns(10);
		txtThongtin_Tongct.setBounds(362, 144, 130, 26);
		panel_Thongtinkhachhang.add(txtThongtin_Tongct);
		
		JButton btnThongtin_Them = new JButton("Thêm");
		btnThongtin_Them.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThongtin_Them.setBounds(23, 248, 85, 30);
		panel_Thongtinkhachhang.add(btnThongtin_Them);
		
		JButton btnThongtin_Sua = new JButton("Sửa");
		btnThongtin_Sua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThongtin_Sua.setBounds(162, 248, 85, 30);
		panel_Thongtinkhachhang.add(btnThongtin_Sua);
		
		JButton btnThongtin_Lammoi = new JButton("Làm mới");
		btnThongtin_Lammoi.setBounds(424, 248, 85, 30);
		panel_Thongtinkhachhang.add(btnThongtin_Lammoi);
		
		JButton btnThongtin_Xoa = new JButton("Xóa\r\n");
		btnThongtin_Xoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThongtin_Xoa.setBounds(294, 248, 85, 30);
		panel_Thongtinkhachhang.add(btnThongtin_Xoa);
		
		JPanel panel_Timkiemkhachhang = new JPanel();
		panel_Timkiemkhachhang.setBorder(new TitledBorder(new BevelBorder(BevelBorder.LOWERED, new Color(255, 102, 51), new Color(255, 102, 51), new Color(255, 102, 51), new Color(255, 102, 51)), "T\u00ECm ki\u1EBFm ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel_Timkiemkhachhang.setBounds(562, 293, 559, 292);
		panel_Bangthongtinkhachhang.add(panel_Timkiemkhachhang);
		panel_Timkiemkhachhang.setLayout(null);
		
		JLabel lblTimkiem_Makh = new JLabel("Mã KH");
		lblTimkiem_Makh.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		lblTimkiem_Makh.setBounds(57, 37, 61, 17);
		panel_Timkiemkhachhang.add(lblTimkiem_Makh);
		
		txtTimkiemMaKH = new JTextField();
		txtTimkiemMaKH.setBounds(184, 32, 345, 30);
		panel_Timkiemkhachhang.add(txtTimkiemMaKH);
		txtTimkiemMaKH.setColumns(10);
		
		JButton btnTimkiem = new JButton("Tìm kiếm");
		btnTimkiem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTimkiem.setBounds(184, 239, 90, 26);
		panel_Timkiemkhachhang.add(btnTimkiem);
		setVisible(true);
		
		JLabel tblTimkiem_Loail = new JLabel("Loại");
		tblTimkiem_Loail.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		tblTimkiem_Loail.setBounds(57, 103, 42, 17);
		panel_Timkiemkhachhang.add(tblTimkiem_Loail);
		
		txtTimkiem_Loai = new JTextField();
		txtTimkiem_Loai.setColumns(10);
		txtTimkiem_Loai.setBounds(184, 100, 345, 26);
		panel_Timkiemkhachhang.add(txtTimkiem_Loai);
		
		JLabel tblTimkiem_Tongct = new JLabel("Tổng chi tiêu");
		tblTimkiem_Tongct.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 14));
		tblTimkiem_Tongct.setBounds(57, 172, 102, 17);
		panel_Timkiemkhachhang.add(tblTimkiem_Tongct);
		
		txtTimkiem_Tongct1 = new JTextField();
		txtTimkiem_Tongct1.setColumns(10);
		txtTimkiem_Tongct1.setBounds(184, 169, 130, 26);
		panel_Timkiemkhachhang.add(txtTimkiem_Tongct1);
		
		txtTimkiemTongCT2 = new JTextField();
		txtTimkiemTongCT2.setColumns(10);
		txtTimkiemTongCT2.setBounds(400, 169, 130, 26);
		panel_Timkiemkhachhang.add(txtTimkiemTongCT2);
		
		JButton btnHuy = new JButton("Hủy");
		btnHuy.setBounds(317, 239, 90, 26);
		panel_Timkiemkhachhang.add(btnHuy);
		
		JButton btnLammoiTK = new JButton("Làm mới");
		btnLammoiTK.setBounds(439, 239, 90, 26);
		panel_Timkiemkhachhang.add(btnLammoiTK);
		
		JLabel lblNewLabel = new JLabel("==>");
		lblNewLabel.setBounds(344, 175, 46, 14);
		panel_Timkiemkhachhang.add(lblNewLabel);
		
	
	}
}
