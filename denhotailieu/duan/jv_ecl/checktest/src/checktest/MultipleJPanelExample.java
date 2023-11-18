package checktest;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.LineBorder;

import java.awt.*;
import javax.swing.*;

public class MultipleJPanelExample extends JFrame {
    private static final int NUM_PANELS = 7;

    public MultipleJPanelExample() {
        // Thiết lập thuộc tính của JFrame
    	JScrollBar scr = new JScrollBar();
        setTitle("Multiple JPanel Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(0, 1, 0, 1)); // 2 cột, khoảng cách 10px giữa các cột và hàng

        // Sử dụng vòng lặp for để tạo và thêm JPanel vào JFrame
        for (int i = 0; i < NUM_PANELS; i++) {
            JPanel panel = createPanel(i); // Tạo một JPanel mới
            panel.setPreferredSize(new Dimension(1131, 168)); // Đặt kích thước cho JPanel
            add(panel); // Thêm JPanel vào JFrame
        }

        pack();
        setLocationRelativeTo(null); // Đặt JFrame ở chính giữa màn hình
    }

    private JPanel createPanel(int index) {
    	JPanel pnNhanvien = new JPanel();
		pnNhanvien.setLayout(null);
		pnNhanvien.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		
		JLabel lblMa = new JLabel("Mã Nhân Viên");
		lblMa.setBounds(182, 37, 74, 14);
		pnNhanvien.add(lblMa);
		
		JLabel lblLuong = new JLabel("Lương");
		lblLuong.setBounds(685, 81, 46, 14);
		pnNhanvien.add(lblLuong);
		
		JLabel lblTen = new JLabel("Ten");
		lblTen.setBounds(533, 37, 46, 14);
		pnNhanvien.add(lblTen);
		
		JLabel lblHo = new JLabel("Họ");
		lblHo.setBounds(375, 37, 46, 14);
		pnNhanvien.add(lblHo);
		
		JLabel lblChucVu = new JLabel("Chức Vụ:");
		lblChucVu.setBounds(260, 129, 46, 14);
		pnNhanvien.add(lblChucVu);
		
		JLabel lblDiachi = new JLabel("Địa Chỉ");
		lblDiachi.setBounds(182, 81, 46, 14);
		pnNhanvien.add(lblDiachi);
		
		JLabel lblDienthoai = new JLabel("Điện Thoại");
		lblDienthoai.setBounds(375, 81, 64, 14);
		pnNhanvien.add(lblDienthoai);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setBounds(533, 81, 46, 14);
		pnNhanvien.add(lblEmail);
		
		JLabel lblGioiTinh = new JLabel("Gioi Tinh");
		lblGioiTinh.setBounds(685, 37, 46, 14);
		pnNhanvien.add(lblGioiTinh);
		
		JPanel pnImage = new JPanel();
		pnImage.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		pnImage.setBounds(20, 24, 104, 119);
		pnNhanvien.add(pnImage);
		pnImage.setLayout(null);
		
		JLabel lblImage = new JLabel("New label");
		lblImage.setBounds(29, 7, 46, 101);
		pnImage.add(lblImage);
		
		JTextField txtMa = new JTextField();
		txtMa.setBounds(260, 34, 86, 20);
		pnNhanvien.add(txtMa);
		txtMa.setColumns(10);
		
		JTextField txtDiachi = new JTextField();
		txtDiachi.setColumns(10);
		txtDiachi.setBounds(260, 78, 86, 20);
		pnNhanvien.add(txtDiachi);
		
		JTextField txtHo = new JTextField();
		txtHo.setColumns(10);
		txtHo.setBounds(409, 34, 86, 20);
		pnNhanvien.add(txtHo);
		
		JTextField txtDienthoai = new JTextField();
		txtDienthoai.setColumns(10);
		txtDienthoai.setBounds(432, 78, 86, 20);
		pnNhanvien.add(txtDienthoai);
		
		JTextField txtTen = new JTextField();
		txtTen.setColumns(10);
		txtTen.setBounds(567, 34, 86, 20);
		pnNhanvien.add(txtTen);
		
		JTextField txtEmail = new JTextField();
		txtEmail.setColumns(10);
		txtEmail.setBounds(567, 78, 86, 20);
		pnNhanvien.add(txtEmail);
		
		JTextField txtGioiTinh = new JTextField();
		txtGioiTinh.setColumns(10);
		txtGioiTinh.setBounds(741, 34, 86, 20);
		pnNhanvien.add(txtGioiTinh);
		
		JTextField txtLuong = new JTextField();
		txtLuong.setColumns(10);
		txtLuong.setBounds(741, 78, 86, 20);
		pnNhanvien.add(txtLuong);
		
		JTextField txtChucVu = new JTextField();
		txtChucVu.setColumns(10);
		txtChucVu.setBounds(330, 126, 86, 20);
		pnNhanvien.add(txtChucVu);
        return pnNhanvien;
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                MultipleJPanelExample example = new MultipleJPanelExample();
                example.setVisible(true);
            }
        });
    }
}







