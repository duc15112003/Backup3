package sualayoutnhanvien;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.Font;

public class layout {
	
	public static JFrame frame;
	
	
	public layout() {
		// TODO Auto-generated constructor stub
		init();
	}
	
	private void init() {
		frame = new JFrame();
		frame.getContentPane().setLayout(null);
		frame.setSize(1366,720);
		frame.setVisible(true);
		
		JPanel pnNhanvien = new JPanel();
		pnNhanvien.setBackground(new Color(255, 255, 255));
		pnNhanvien.setBorder(new LineBorder(new Color(255, 0, 0), 2, true));
		pnNhanvien.setBounds(35, 32, 1106, 153);
		pnNhanvien.setLayout(null);
		
		JPanel pnAnh = new JPanel();
		pnAnh.setBounds(10, 11, 128, 132);
		pnAnh.setBackground(Color.white);
		pnNhanvien.add(pnAnh);
		
		JLabel lblAnh = new JLabel();
		pnAnh.add(lblAnh);
		lblAnh.setIcon(new ImageIcon(list.get(index).getAnh()));
		
		JLabel lblMaNV = new JLabel("Mã Nhân Viên:");
		lblMaNV.setBounds(148, 24, 91, 24);
		pnNhanvien.add(lblMaNV);
		
		JLabel lblSoDT = new JLabel("Số Điện Thoại:");
		lblSoDT.setBounds(148, 75, 91, 24);
		pnNhanvien.add(lblSoDT);
		
		JLabel lblHo = new JLabel("Họ:");
		lblHo.setBounds(345, 24, 39, 24);
		pnNhanvien.add(lblHo);
		
		JLabel txtMa = new JLabel("new lbl");
		txtMa.setForeground(new Color(0, 0, 255));
		txtMa.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtMa.setBounds(249, 20, 86, 31);
		txtMa.setText(list.get(index).getMaNV());
		pnNhanvien.add(txtMa);
		
		JLabel txtHo = new JLabel("new lbl");
		txtHo.setForeground(new Color(0, 0, 255));
		txtHo.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtHo.setBounds(381, 20, 109, 31);
		txtHo.setText(list.get(index).getHo());
		pnNhanvien.add(txtHo);
		
		JLabel lblTen = new JLabel("Tên:");
		lblTen.setBounds(500, 22, 31, 29);
		pnNhanvien.add(lblTen);
		
		JLabel txtTen = new JLabel("new lbl");
		txtTen.setForeground(new Color(0, 0, 255));
		txtTen.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtTen.setBounds(541, 17, 109, 31);
		txtTen.setText(list.get(index).getTen());
		pnNhanvien.add(txtTen);
		
		JLabel lblGioiTinh = new JLabel("Giới Tính:");
		lblGioiTinh.setBounds(685, 13, 59, 47);
		pnNhanvien.add(lblGioiTinh);
		
		JLabel txtGioiTinh = new JLabel("new lbl");
		txtGioiTinh.setForeground(new Color(0, 0, 255));
		txtGioiTinh.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtGioiTinh.setBounds(754, 17, 69, 31);
		txtGioiTinh.setText(list.get(index).getGioiTinh());
		pnNhanvien.add(txtGioiTinh);
		
		JLabel lblDiachi = new JLabel("Địa Chỉ:");
		lblDiachi.setBounds(866, 11, 50, 47);
		pnNhanvien.add(lblDiachi);
		
		JLabel txtDiaChi = new JLabel("new lbl");
		txtDiaChi.setForeground(new Color(0, 0, 255));
		txtDiaChi.setVerticalAlignment(SwingConstants.TOP);
		txtDiaChi.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtDiaChi.setBounds(926, 11, 170, 57);
		txtDiaChi.setText(list.get(index).getDiaChi());
		pnNhanvien.add(txtDiaChi);
		
		JLabel txtSoDT = new JLabel("new lbl");
		txtSoDT.setForeground(new Color(0, 0, 255));
		txtSoDT.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtSoDT.setBounds(247, 72, 152, 31);
		txtSoDT.setText(list.get(index).getDienThoai());
		pnNhanvien.add(txtSoDT);
		
		JLabel lblEmail = new JLabel("Email:");
		lblEmail.setBounds(453, 75, 39, 24);
		pnNhanvien.add(lblEmail);
		
		JLabel txtEmail = new JLabel("new lbl");
		txtEmail.setForeground(new Color(0, 0, 255));
		txtEmail.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtEmail.setBounds(502, 68, 211, 31);
		txtEmail.setText(list.get(index).getEmai());
		pnNhanvien.add(txtEmail);
		
		JLabel lblLuong = new JLabel("Lương:");
		lblLuong.setBounds(723, 75, 50, 24);
		pnNhanvien.add(lblLuong);
		
		JLabel txtLuong = new JLabel("new lbl");
		txtLuong.setForeground(new Color(0, 0, 255));
		txtLuong.setFont(new Font("Tahoma", Font.BOLD, 12));
		txtLuong.setBounds(771, 72, 134, 31);
		txtLuong.setText(String.valueOf(list.get(index).getLuong()));
		pnNhanvien.add(txtLuong);
		
		JLabel lblChucVu = new JLabel("Chức Vụ:");
		lblChucVu.setBounds(148, 119, 59, 24);
		pnNhanvien.add(lblChucVu);
		
		JLabel lblWriteChucvu = new JLabel("Quản Lý");
		lblWriteChucvu.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblWriteChucvu.setForeground(new Color(0, 0, 255));
		lblWriteChucvu.setBounds(246, 119, 304, 24);
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


	}
	public static void main(String[] args) {
		new layout();
	}
}
