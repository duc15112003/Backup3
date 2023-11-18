package GUI;

import java.awt.Color;
import java.awt.Window;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.border.MatteBorder;
import Controller.*;
import DAO.*;
import DTO.DanhMucDTO;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuanLyGUI {
	
	public static JFrame frame;
	public static JPanel pleft;
	public static  JPanel pntop;
	public static  JLabel lblTitle;
	public static  JLabel lblAvatar;
	public static  JButton btnLogout;
	public static  JButton btnMyseft;
	public static  JPanel pnHoadon;
	public static  JLabel lblHoadon;
	public static  JPanel pnNhanvien;
	public static  JLabel lblnhanvien;
	public static  JPanel pnKhachhang;
	public static  JLabel lblkhachhang;
	public static  JPanel pnSanpham;
	public static  JLabel lblsanpham;
	public static  JPanel pnPhieunhap;
	public static  JLabel lblPhieunhap;
	public static  JLabel lblTurnoff;
	private JPanel pright;
	public static JLabel lblThongke;
	public static JPanel pnThongke;


	
	PNHoadonCTRL ctrl = new PNHoadonCTRL();
	public QuanLyGUI() {
		init();
		ChuyenmanhinhQLDAO control=new ChuyenmanhinhQLDAO(pright);
        control.setView(pnHoadon,lblHoadon );
        List<DanhMucDTO> listItem= new ArrayList<>();        
        listItem.add(new DanhMucDTO("hoadon", pnHoadon,lblHoadon ));
        listItem.add(new DanhMucDTO("phieunhap",pnPhieunhap,lblPhieunhap ));
		listItem.add(new DanhMucDTO("sanpham", pnSanpham,lblsanpham ));
		listItem.add(new DanhMucDTO("nhanvien",pnNhanvien,lblnhanvien ));
		listItem.add(new DanhMucDTO("khachhang",pnKhachhang,lblkhachhang ));
        control.setEventNV(listItem);
	}
	private void init() {
		
//  ---------- tạo frame với fullsize screen-------
		
		frame = new JFrame("Quản Lý");
		frame.setSize(1360,720);
		frame.setResizable(false);
        frame.setUndecorated(true);
		
		frame.getContentPane().setLayout(null);
	
		pleft = new JPanel();
		pleft.setBounds(0, 81, 210, 639);
		pleft.setBackground(new Color(169,159,160));

		frame.getContentPane().add(pleft);
		pleft.setLayout(null);
		
		btnLogout = new JButton("Đăng Xuất");
		btnLogout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i = JOptionPane.showConfirmDialog(null, "Bạn Có Muốn Đăng Xuất?");
				if(i == JOptionPane.YES_OPTION) {
					frame.setVisible(false);
					new LoginGUI();
				}
				
			}
		});
		btnLogout.setBounds(0, 141, 96, 23);
		pleft.add(btnLogout);
		
		btnMyseft = new JButton("Cá Nhân");
		btnMyseft.setBounds(114, 141, 96, 23);
		pleft.add(btnMyseft);
		
		pnHoadon = new JPanel();
		pnHoadon.setBackground(Color.WHITE);
		pnHoadon.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pnHoadon.setBounds(0, 178, 210, 33);
		pleft.add(pnHoadon);
		
		lblHoadon = new JLabel("HÓA ĐƠN");
		lblHoadon.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnHoadon.add(lblHoadon);
		
		pnNhanvien = new JPanel();
		pnNhanvien.setBackground(Color.WHITE);
		pnNhanvien.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pnNhanvien.setBounds(0, 235, 210, 33);
		pleft.add(pnNhanvien);
		
		lblnhanvien = new JLabel("NHÂN VIÊN");
		lblnhanvien.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnNhanvien.add(lblnhanvien);
		
		pnKhachhang = new JPanel();
		pnKhachhang.setBackground(Color.WHITE);
		pnKhachhang.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pnKhachhang.setBounds(0, 292, 210, 33);
		pleft.add(pnKhachhang);
		
		lblkhachhang = new JLabel("KHÁCH HÀNG");
		lblkhachhang.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnKhachhang.add(lblkhachhang);
		
		pnSanpham = new JPanel();
		pnSanpham.setBackground(Color.WHITE);
		pnSanpham.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pnSanpham.setBounds(0, 350, 210, 33);
		pleft.add(pnSanpham);
		
		lblsanpham = new JLabel("SẢN PHẨM");
		lblsanpham.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnSanpham.add(lblsanpham);
		
		pnPhieunhap = new JPanel();
		pnPhieunhap.setBackground(Color.WHITE);
		pnPhieunhap.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pnPhieunhap.setBounds(0, 407, 210, 33);
		pleft.add(pnPhieunhap);
		
		lblPhieunhap = new JLabel("PHIẾU NHẬP");
		lblPhieunhap.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnPhieunhap.add(lblPhieunhap);
		
		lblTurnoff = new JLabel(new ImageIcon(getClass().getResource("/switch.png")));
		lblTurnoff.setBounds(88, 566, 32, 32);
		pleft.add(lblTurnoff);
		
		lblAvatar = new JLabel("96 x 107");
		lblAvatar.setHorizontalAlignment(SwingConstants.LEFT);
		lblAvatar.setBounds(52, 11, 96, 107);
		pleft.add(lblAvatar);
		lblAvatar.setBackground(Color.WHITE);
		
		pnThongke = new JPanel();
		pnThongke.setBackground(Color.WHITE);
		pnThongke.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		pnThongke.setBounds(0, 464, 210, 33);
		pleft.add(pnThongke);
		
		lblThongke = new JLabel("THỐNG KÊ");
		lblThongke.setFont(new Font("Tahoma", Font.PLAIN, 15));
		pnThongke.add(lblThongke);
		lblTurnoff.addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				int i = JOptionPane.showConfirmDialog(null, "bạn có muốn thoát");
				if(i == JOptionPane.YES_OPTION) {
					System.exit(0);
				}
				
			}
		});
		
		pntop = new JPanel();
		pntop.setBounds(0, 0, 1360, 81);
		pntop.setBackground(Color.white);
		frame.getContentPane().add(pntop);
		pntop.setLayout(null);
		
		lblTitle = new JLabel("Shoes Manager Shop");
		lblTitle.setBounds(550, 21, 340, 40);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 30));
		pntop.add(lblTitle);
		
		pright = new JPanel();
		pright.setBackground(new Color(255, 255, 255));
		pright.setBounds(209, 81, 1151, 639);
		frame.getContentPane().add(pright);
	}
	public static void main(String[] args) {
		new QuanLyGUI().frame.setVisible(true);
	}
}
