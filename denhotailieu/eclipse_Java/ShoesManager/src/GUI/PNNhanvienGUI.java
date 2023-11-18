package GUI;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import DAO.NhanVienDAO;
import DTO.NhanVienDTO;
import Controller.*;
import javax.swing.ScrollPaneConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PNNhanvienGUI extends JPanel {
	private JTextField txtMa;
	private JTextField txtHo;
	private JTextField txtTen;
	private JTextField txtGioiTinh;
	private JTextField txtDiaChi;
	private JTextField txtSoDT;
	private JTextField txtEmail;
	private JTextField txtLuong;
	JPanel panel;
	NhanVienDAO dt = new NhanVienDAO();
	List<NhanVienDTO> list = new ArrayList();
	PNNhanVienCTRL ctrl = new PNNhanVienCTRL();
	public PNNhanvienGUI() throws SQLException {
		// TODO Auto-generated constructor stub
		
		setBackground(Color.WHITE);
		setSize(1151, 639);

		panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(1, 56, 1151, 620);
		panel.setLayout(new GridLayout(0, 1, 0, 10));

		hamtao();
		setLayout(null);
		JScrollPane scrollPane = new JScrollPane(panel);
		scrollPane.setBounds(0, 21, 1151, 620);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		add(scrollPane);

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		panel_1.setBounds(0, 0, 1136, 21);
		add(panel_1);
		panel_1.setLayout(null);

		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 1136, 22);
		panel_1.add(menuBar);

		JMenu MenuCongcu = new JMenu("Công Cụ");
		MenuCongcu.setIcon(new ImageIcon(getClass().getResource("/tools.png")));
		menuBar.add(MenuCongcu);

		JMenuItem ItemThem = new JMenuItem("Thêm");
		ItemThem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThemsuaNVGUI nv = new ThemsuaNVGUI();
				nv.btnSua.setEnabled(false);

			}
		});
		ItemThem.setIcon(new ImageIcon(getClass().getResource("/add.png")));
		MenuCongcu.add(ItemThem);

		JMenuItem ItemSua = new JMenuItem("Sửa");
		ItemSua.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ThemsuaNVGUI nv = new ThemsuaNVGUI();
				nv.btnThem.setEnabled(false);
			}
		});
		ItemSua.setIcon(new ImageIcon(getClass().getResource("/updated.png")));
		MenuCongcu.add(ItemSua);

		JMenuItem ItemXoa = new JMenuItem("Xóa");
		ItemXoa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// an id
				try {
					ctrl.DeleteNV();
					panel.removeAll();
					panel.revalidate();
					hamtao();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		ItemXoa.setIcon(new ImageIcon(getClass().getResource("/delete.png")));
		MenuCongcu.add(ItemXoa);

		JMenu MenuTimkiem = new JMenu("Tìm Kiếm");
		MenuTimkiem.setIcon(new ImageIcon(getClass().getResource("/find.png")));
		menuBar.add(MenuTimkiem);

		JMenu MenuLamMoi = new JMenu("Làm Mới");
		MenuLamMoi.setIcon(new ImageIcon(getClass().getResource("/reload.png")));
		menuBar.add(MenuLamMoi);

		JMenuItem ItemLammoi = new JMenuItem("Làm Mới");
		ItemLammoi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				try {
					panel.removeAll();
					panel.revalidate();
					hamtao();
				} catch (Exception e2) {
					// TODO: handle exception
				}
			}
		});
		ItemLammoi.setIcon(new ImageIcon(getClass().getResource("/reload.png")));
		MenuLamMoi.add(ItemLammoi);

	}

	public void hamtao() throws SQLException {
		list.clear();
		list = dt.select();
		for (int i = 0; i < list.size(); i++) {
			JPanel panel1 = createPanel(i); // Tạo một JPanel mới
			panel1.setPreferredSize(new Dimension(1106, 153)); // Đặt kích thước cho JPanel
			panel.add(panel1); // Thêm JPanel vào JFrame

		}
	}

	public JPanel createPanel(int index) throws SQLException {
		JPanel pnNhanvien = new JPanel();
		pnNhanvien.setBackground(new Color(255, 255, 255));
		pnNhanvien.setBorder(new LineBorder(Color.RED, 1, true));
		pnNhanvien.setBounds(35, 32, 1106, 153);
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
		txtMa.setText(list.get(index).getMaNV());
		pnNhanvien.add(txtMa);
		txtMa.setColumns(10);

		txtHo = new JTextField();
		txtHo.setColumns(10);
		txtHo.setBounds(398, 26, 86, 20);
		txtHo.setText(list.get(index).getHo());
		pnNhanvien.add(txtHo);

		JLabel lblTen = new JLabel("Tên");
		lblTen.setBounds(507, 22, 39, 29);
		pnNhanvien.add(lblTen);

		txtTen = new JTextField();
		txtTen.setColumns(10);
		txtTen.setBounds(556, 26, 86, 20);
		txtTen.setText(list.get(index).getTen());
		pnNhanvien.add(txtTen);

		JLabel lblGioiTinh = new JLabel("Giới Tính");
		lblGioiTinh.setBounds(675, 11, 59, 47);
		pnNhanvien.add(lblGioiTinh);

		txtGioiTinh = new JTextField();
		txtGioiTinh.setColumns(10);
		txtGioiTinh.setBounds(754, 26, 86, 20);
		txtGioiTinh.setText(list.get(index).getGioiTinh());
		pnNhanvien.add(txtGioiTinh);

		JLabel lblDiachi = new JLabel("Địa Chỉ");
		lblDiachi.setBounds(870, 11, 59, 47);
		pnNhanvien.add(lblDiachi);

		txtDiaChi = new JTextField();
		txtDiaChi.setColumns(10);
		txtDiaChi.setBounds(939, 26, 86, 20);
		txtDiaChi.setText(list.get(index).getDiaChi());
		pnNhanvien.add(txtDiaChi);

		txtSoDT = new JTextField();
		txtSoDT.setColumns(10);
		txtSoDT.setBounds(246, 77, 93, 20);
		txtSoDT.setText(list.get(index).getDienThoai());
		pnNhanvien.add(txtSoDT);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(360, 75, 39, 24);
		pnNhanvien.add(lblEmail);

		txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(398, 77, 86, 20);
		txtEmail.setText(list.get(index).getEmai());
		pnNhanvien.add(txtEmail);

		JLabel lblLuong = new JLabel("Lương");
		lblLuong.setBounds(507, 75, 50, 24);
		pnNhanvien.add(lblLuong);

		txtLuong = new JTextField();
		txtLuong.setColumns(10);
		txtLuong.setBounds(556, 77, 86, 20);
		txtLuong.setText(String.valueOf(list.get(index).getLuong()));
		pnNhanvien.add(txtLuong);

		JLabel lblChucVu = new JLabel("Chức Vụ:");
		lblChucVu.setBounds(148, 119, 59, 24);
		pnNhanvien.add(lblChucVu);

		JLabel lblWriteChucvu = new JLabel("Quản Lý");
		lblWriteChucvu.setBounds(246, 119, 59, 24);
		lblWriteChucvu.setText(list.get(index).getChucVu());
		pnNhanvien.add(lblWriteChucvu);

		pnNhanvien.addMouseListener(new MouseListener() {

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub

			}

			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stu
				JOptionPane.showMessageDialog(null, "Mã Nhân Viên" + list.get(index).getMaNV());

			}
		});

		return pnNhanvien;
	}

}
