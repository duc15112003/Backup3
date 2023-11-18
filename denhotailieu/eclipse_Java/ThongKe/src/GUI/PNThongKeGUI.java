package GUI;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import com.toedter.calendar.JDateChooser;

import DAO.ConnectionSQL;

import DAO.ThongKeDAO;
import DTO.HoaDonDTO;
import DTO.PhieuNhapDTO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.border.LineBorder;
import javax.swing.border.TitledBorder;
import javax.swing.border.MatteBorder;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import javax.swing.border.EtchedBorder;

public class PNThongKeGUI extends JPanel {

	public static JTable tblbanghoadon;
	public static  JTable tblbangphieunhap;
	public static  JTextField txthdmax;
	public static  JTextField txthdtrungbinh;
	public static  JTextField txtpnmax;
	public static JTextField txtpntb;
	public static  JTable table_2;
	public static  JTable table_3;
	 DefaultTableModel tblModel;
	 Connection conn = null;
	 PreparedStatement  sttm = null;
	 ThongKeDAO dao = new ThongKeDAO();
	 ArrayList<HoaDonDTO> list = new ArrayList<HoaDonDTO>();
	 ArrayList<PhieuNhapDTO> list2 = new ArrayList<PhieuNhapDTO>();
	 public int current = 0;
	 private JTextField txtDoanhthutb;
	 private JLabel lblloinhuan;
	private JLabel lbltongthu;
	private JLabel lbltongchi;
	private JLabel txttongthu;
	private JLabel txttongchi;
	private JButton btnxuatTKe;

	 
	 
//		public void filltotable()
//		{
//			tblModel = (DefaultTableModel) tblbangphieunhap.getModel();
//			tblModel.setRowCount(0);
//			for (PhieuNhapDTO pn : dao.ShowAll2()) {
//				  Object dataRow[] = new Object[4];
//				  dataRow[0]=pn.getMaPN();
//				  dataRow[1]=pn.getSoLuong();
//				  dataRow[2]=pn.getGiaNhap();
//				  dataRow[3]=pn.getNgayNhap();
//				  tblModel.addRow(dataRow);
//			}
//			
//			
//			tblModel = (DefaultTableModel) tblbanghoadon.getModel();
//			tblModel.setRowCount(0);
//			for (HoaDonDTO hd : dao.ShowAll()) {
//				  Object dataRow[] = new Object[4];
//				  dataRow[0]=hd.getMaHD();
//				  dataRow[1]=hd.getSoLuong();
//				  dataRow[2]=hd.getGiaBan();
//				  dataRow[3]=hd.getNgayBan();
//				  tblModel.addRow(dataRow);
//			}
//			
//			
//		}
		
//		
//		public void ShowDataHoaDonbyCalendar(String d1, String d2)
//		{
//			  ResultSet rs = null;
//		      PreparedStatement stm = null;
//		      ConnectionSQL conn = new  ConnectionSQL();    
//		      try {
//				
//		    	  stm = conn.prepareStatement("select tblhoadon.MaHD, SoLuong, SoLuong*GiaBan as 'TongTien', NgayBan from tblhoadon, tblchitiethd where tblchitiethd.MaHD = tblhoadon.MaHD and NgayBan BETWEEN ? and ?");
//		          stm.setString(1, d1);
//		          stm.setString(2, d2);
//		          rs=stm.executeQuery();	
//		    	  
//		          Object[] row;
//		          DefaultTableModel tblModel = (DefaultTableModel) tblbanghoadon.getModel();
//		          while(rs.next())
//		          {
//		        	  row = new Object[4];
//		        	  row[0]=rs.getString(1);
//		        	  row[1]=rs.getInt(2);
//		        	  row[2]=rs.getDouble(3);
//		        	  row[3]=rs.getString(4);
//		        	  
//		        	  tblModel.addRow(row);
//		        	  
//		        	  
//		          }
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//		
//		public void ShowDataPhieuNhapbyCalendar(String d1, String d2)
//		{
//			  ResultSet rs = null;
//		      PreparedStatement stm = null;
//		     ConnectionSQL conn = new  ConnectionSQL();  
//		      try {
//				
//		    	  stm = conn.prepareStatement("select tblchitietpn.MaPN,SoLuong,SoLuong*GiaNhap as 'TongTien',NgayNhap from tblphieunhap, tblchitietpn where tblphieunhap.MaPN = tblchitietpn.MaPN and NgayBan BETWEEN ? and ?");
//		          stm.setString(1, d1);
//		          stm.setString(2, d2);
//		          rs=stm.executeQuery();	
//		    	  
//		          Object[] row;
//		          DefaultTableModel tblModel = (DefaultTableModel) tblbanghoadon.getModel();
//		          while(rs.next())
//		          {
//		        	  row = new Object[4];
//		        	  row[0]=rs.getString(1);
//		        	  row[1]=rs.getInt(2);
//		        	  row[2]=rs.getDouble(3);
//		        	  row[3]=rs.getString(4);
//		        	  
//		        	  tblModel.addRow(row);
//		        	  
//		        	  
//		          }
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
//		
//	
//		
//		public void Showtiennhapcaonhat(String d1, String d2)
//		{
//			  ResultSet rs = null;
//		      PreparedStatement stm = null;
//		      ConnectionSQL conn = new  ConnectionSQL();  
//		      
//		      try {
//		    	  stm=conn.prepareStatement("select top 1 GiaNhap,NgayNhap from tblchitietpn, tblphieunhap where NgayNhap BETWEEN ? and ? order by GiaNhap DESC ");
//		    	  stm.setString(1, d1);
//			      stm.setString(2, d2);
//			      rs=stm.executeQuery();	
//			    	  
//			      Object[] row;
//		      
//			      while(rs.next())
//		          {
//		        	  row = new Object[1];		   
//		        	  row[0]=rs.getDouble(1);
//		        	  txtpnmax.setText(String.valueOf(row));
//		        	  
//		        	 
//		        	  
//		        	  
//		          }
//		      }
//		      catch (Exception e) {
//					// TODO: handle exception
//				}
//
//		}
//		
//		
//		public void Showtiennhaptrungbinh(String d1, String d2)
//		{
//			  ResultSet rs = null;
//		      PreparedStatement stm = null;
//		      ConnectionSQL conn = new  ConnectionSQL();  
//		      
//		      try {
//		    	  stm=conn.prepareStatement("select AVG(Gianhap) from tblchitietpn,tblphieunhap where NgayNhap BETWEEN ? and ? ");
//		    	  stm.setString(1, d1);
//			      stm.setString(2, d2);
//			      rs=stm.executeQuery();	
//			    	  
//			      Object[] row;
//		      
//			      while(rs.next())
//		          {
//		        	  row = new Object[1];		   
//		        	  row[0]=rs.getDouble(1);
//		        	  txtpntb.setText(String.valueOf(row));
//		        	  
//		        	 
//		        	  
//		        	  
//		          }
//		      }
//		      catch (Exception e) {
//					// TODO: handle exception
//				}
//
//		}
//		
		
//		
//		public void Showtienhdcaonhat(String d1, String d2)
//		{
//			  ResultSet rs = null;
//		      PreparedStatement stm = null;
//		      ConnectionSQL conn = new  ConnectionSQL();  
//		      
//		      try {
//		    	  stm=conn.prepareStatement("select top 1 GiaBan,NgayBan from tblchitiethd, tblhoadon where NgayBan BETWEEN ? and ? order by GiaNhap DESC  ");
//		    	  stm.setString(1, d1);
//			      stm.setString(2, d2);
//			      rs=stm.executeQuery();	
//			    	  
//			      Object[] row;
//		      
//			      while(rs.next())
//		          {
//		        	  row = new Object[1];		   
//		        	  row[0]=rs.getDouble(1);
//		        	  txthdmax.setText(String.valueOf(row));
//		        	  
//		        	 
//		        	  
//		        	  
//		          }
//		      }
//		      catch (Exception e) {
//					// TODO: handle exception
//				}
//
//		}
		
		
//		
//		public void Showtienhdtrungbinh(String d1, String d2)
//		{
//			  ResultSet rs = null;
//		      PreparedStatement stm = null;
//		      ConnectionSQL conn = new  ConnectionSQL();  
//		      
//		      try {
//		    	  stm=conn.prepareStatement("select AVG(Giaban) from tblchitiethd,tblhoadon where NgayBan BETWEEN ? and ? ");
//		    	  stm.setString(1, d1);
//			      stm.setString(2, d2);
//			      rs=stm.executeQuery();	
//			    	  
//			      Object[] row;
//		      
//			      while(rs.next())
//		          {
//		        	  row = new Object[1];		   
//		        	  row[0]=rs.getDouble(1);
//		        	  txtpntb.setText(String.valueOf(row));
//		        	  
//		        	 
//		        	  
//		        	  
//		          }
//		      }
//		      catch (Exception e) {
//					// TODO: handle exception
//				}
//
//		}
//		
		
//		public void Showtiendoanhthutrungbinh(String d1, String d2)
//		{
//			  ResultSet rs = null;
//		      PreparedStatement stm = null;
//		      ConnectionSQL conn = new  ConnectionSQL();  
//		      
//		      try {
//		    	  stm=conn.prepareStatement("select AVG(Giaban-GiaNhap) from tblchitiethd,tblhoadon,tblchitietpn where NgayBan BETWEEN ? and ? ");
//		    	  stm.setString(1, d1);
//			      stm.setString(2, d2);
//			      rs=stm.executeQuery();	
//			    	  
//			      Object[] row;
//		      
//			      while(rs.next())
//		          {
//		        	  row = new Object[1];		   
//		        	  row[0]=rs.getDouble(1);
//		        	  txtDoanhthutb.setText(String.valueOf(row));
//		        	  
//		        	 
//		        	  
//		        	  
//		          }
//		      }
//		      catch (Exception e) {
//					// TODO: handle exception
//				}
//
//		}
		
		
		
	/**
	 * Create the panel.
	 */
	public PNThongKeGUI() {
		setLayout(null);
		setSize(1151,639);
		
		JLabel lblNewLabel_1 = new JLabel("Bảng Hóa Đơn (Tiền Thu)");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(477, 70, 308, 27);
		add(lblNewLabel_1);
		
		tblbanghoadon = new JTable();
		tblbanghoadon.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		tblbanghoadon.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
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
		tblbanghoadon.setBounds(466, 130, 382, 160);
		add(tblbanghoadon);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(23, 130, 382, 160);
		add(panel_2);
		panel_2.setLayout(null);
		
		JPanel panel_3 = new JPanel();
		panel_3.setBorder(new TitledBorder(null, "JPanel title", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_3.setBounds(-6, -16, 393, 175);
		panel_2.add(panel_3);
		panel_3.setLayout(null);
		
		tblbangphieunhap = new JTable();
		tblbangphieunhap.setBounds(6, 16, 381, 159);
		panel_3.add(tblbangphieunhap);
		tblbangphieunhap.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ThongKeDAO tkd = new ThongKeDAO();
				try {
					tkd.ShowAll2();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		tblbangphieunhap.setBorder(new MatteBorder(1, 1, 1, 1, (Color) Color.BLACK));
		tblbangphieunhap.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null},
				{null, null, null, null},
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
		
		JLabel lblNewLabel_1_1 = new JLabel("Bảng Phiếu Nhập (Tiền Chi)");
		lblNewLabel_1_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1_1.setBounds(70, 70, 308, 27);
		add(lblNewLabel_1_1);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 0, 0)), "Qu\u1EA3n L\u00FD Xu\u1EA5t", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel_1.setBounds(23, 351, 327, 249);
		add(panel_1);
		panel_1.setLayout(null);
		
		JButton btnNewButton = new JButton("Tìm Kiếm");
		btnNewButton.setBounds(147, 202, 107, 23);
		panel_1.add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("Từ Ngày");
		lblNewLabel_2.setBounds(24, 31, 90, 27);
		panel_1.add(lblNewLabel_2);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JDateChooser JDateChooser11 = new JDateChooser();
		JDateChooser11.setBounds(147, 31, 107, 27);
		panel_1.add(JDateChooser11);
		
		JLabel lblNewLabel_2_1 = new JLabel("Đến Ngày");
		lblNewLabel_2_1.setBounds(24, 71, 90, 27);
		panel_1.add(lblNewLabel_2_1);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		
		JDateChooser JDateChooser12 = new JDateChooser();
		JDateChooser12.setBounds(147, 71, 107, 27);
		panel_1.add(JDateChooser12);
		
		JLabel lblNewLabel_4 = new JLabel("Tiền cao nhất:");
		lblNewLabel_4.setBounds(24, 122, 95, 21);
		panel_1.add(lblNewLabel_4);
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txthdmax = new JTextField();
		txthdmax.setEnabled(false);
		txthdmax.setBounds(146, 122, 108, 20);
		panel_1.add(txthdmax);
		txthdmax.setColumns(10);
		
		JLabel lblNewLabel_3 = new JLabel("Tiền trung bình:");
		lblNewLabel_3.setBounds(24, 158, 95, 27);
		panel_1.add(lblNewLabel_3);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		txthdtrungbinh = new JTextField();
		txthdtrungbinh.setEnabled(false);
		txthdtrungbinh.setBounds(147, 161, 107, 20);
		panel_1.add(txthdtrungbinh);
		txthdtrungbinh.setColumns(10);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 0, 0)), "Qu\u1EA3n L\u00FD Nh\u1EADp", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel_1_1.setLayout(null);
		panel_1_1.setBounds(386, 351, 327, 249);
		add(panel_1_1);
		
		JButton btnTimkiemxuat = new JButton("Tìm Kiếm");
		
		btnTimkiemxuat.setBounds(157, 200, 104, 23);
		panel_1_1.add(btnTimkiemxuat);
		
		JLabel lblNewLabel_2_2 = new JLabel("Từ Ngày");
		lblNewLabel_2_2.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_2.setBounds(24, 35, 90, 27);
		panel_1_1.add(lblNewLabel_2_2);
		
		JDateChooser JDateChooser21 = new JDateChooser();
		JDateChooser21.setBounds(157, 35, 104, 27);
		panel_1_1.add(JDateChooser21);
		
		JLabel lblNewLabel_2_1_1 = new JLabel("Đến Ngày");
		lblNewLabel_2_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1.setBounds(24, 73, 90, 27);
		panel_1_1.add(lblNewLabel_2_1_1);
		
		JDateChooser JDateChooser22 = new JDateChooser();
		JDateChooser22.setBounds(158, 73, 103, 27);
		panel_1_1.add(JDateChooser22);
		
		JLabel lblNewLabel_4_1 = new JLabel("Tiền cao nhất:");
		lblNewLabel_4_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_4_1.setBounds(19, 125, 95, 21);
		panel_1_1.add(lblNewLabel_4_1);
		
		txtpnmax = new JTextField();
		txtpnmax.setEnabled(false);
		txtpnmax.setColumns(10);
		txtpnmax.setBounds(157, 125, 104, 20);
		panel_1_1.add(txtpnmax);
		
		JLabel lblNewLabel_3_1 = new JLabel("Tiền trung bình:");
		lblNewLabel_3_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3_1.setBounds(19, 157, 95, 27);
		panel_1_1.add(lblNewLabel_3_1);
		
		txtpntb = new JTextField();
		txtpntb.setEnabled(false);
		txtpntb.setColumns(10);
		txtpntb.setBounds(157, 156, 104, 20);
		panel_1_1.add(txtpntb);
		
		table_2 = new JTable();
		table_2.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table_2.setModel(new DefaultTableModel(
			new Object[][] {
				{"       M\u00E3 PN", "     S\u1ED1 l\u01B0\u1EE3ng", "    Ti\u1EC1n Nh\u1EADp", "   Ng\u00E0y Nh\u1EADp"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table_2.setBounds(23, 108, 382, 17);
		add(table_2);
		
		table_3 = new JTable();
		table_3.setModel(new DefaultTableModel(
			new Object[][] {
				{"      M\u00E3 H\u0110", "     S\u1ED1 L\u01B0\u1EE3ng", "     Ti\u1EC1n B\u00E1n", "   Ng\u00E0y B\u00E1n"},
			},
			new String[] {
				"New column", "New column", "New column", "New column"
			}
		));
		table_3.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		table_3.setBounds(466, 108, 382, 17);
		add(table_3);
		
		JPanel panel_4 = new JPanel();
		panel_4.setBorder(new TitledBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(255, 0, 0)), "Qu\u1EA3n L\u00FD Doanh Thu", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(255, 0, 0)));
		panel_4.setBounds(754, 351, 368, 249);
		add(panel_4);
		panel_4.setLayout(null);
		
		JLabel lblNewLabel_2_2_1 = new JLabel("Từ Ngày");
		lblNewLabel_2_2_1.setBounds(22, 37, 67, 34);
		lblNewLabel_2_2_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel_4.add(lblNewLabel_2_2_1);
		
		JDateChooser JDateChooser21_1 = new JDateChooser();
		JDateChooser21_1.setBounds(139, 44, 104, 27);
		panel_4.add(JDateChooser21_1);
		
		JDateChooser JDateChooser21_2 = new JDateChooser();
		JDateChooser21_2.setBounds(139, 97, 104, 27);
		panel_4.add(JDateChooser21_2);
		
		JLabel lblNewLabel_2_1_1_1 = new JLabel("Đến Ngày");
		lblNewLabel_2_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_2_1_1_1.setBounds(23, 97, 66, 27);
		panel_4.add(lblNewLabel_2_1_1_1);
		
		JLabel lblNewLabel_3_1_1 = new JLabel("Doanh thu trung bình:");
		lblNewLabel_3_1_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3_1_1.setBounds(22, 148, 143, 27);
		panel_4.add(lblNewLabel_3_1_1);
		
		txtDoanhthutb = new JTextField();
		txtDoanhthutb.setEnabled(false);
		txtDoanhthutb.setColumns(10);
		txtDoanhthutb.setBounds(196, 151, 104, 20);
		panel_4.add(txtDoanhthutb);
		
		JButton btnTimkiemdoanhthu = new JButton("Tìm Kiếm");
		btnTimkiemdoanhthu.setBounds(196, 203, 104, 23);
		panel_4.add(btnTimkiemdoanhthu);
		
		JLabel lblNewLabel = new JLabel("THỐNG KÊ");
		lblNewLabel.setBounds(417, 11, 368, 59);
		add(lblNewLabel);
		lblNewLabel.setForeground(new Color(165, 42, 42));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		
		lbltongthu = new JLabel("Tổng Thu:");
		lbltongthu.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbltongthu.setForeground(Color.BLUE);
		lbltongthu.setBounds(903, 108, 105, 17);
		add(lbltongthu);
		
		lbltongchi = new JLabel("Tổng Chi:");
		lbltongchi.setFont(new Font("Tahoma", Font.BOLD, 16));
		lbltongchi.setForeground(Color.BLUE);
		lbltongchi.setBounds(903, 158, 105, 17);
		add(lbltongchi);
		
		txttongthu = new JLabel("New label");
		txttongthu.setFont(new Font("Tahoma", Font.BOLD, 16));
		txttongthu.setForeground(Color.BLUE);
		txttongthu.setBounds(1018, 108, 90, 14);
		add(txttongthu);
		
		txttongchi = new JLabel("New label");
		txttongchi.setFont(new Font("Tahoma", Font.BOLD, 16));
		txttongchi.setForeground(Color.BLUE);
		txttongchi.setBounds(1018, 161, 90, 14);
		add(txttongchi);
		
		btnxuatTKe = new JButton("Xuất Thống Kê");
		btnxuatTKe.setBounds(903, 267, 205, 23);
		add(btnxuatTKe);
		
		lblloinhuan = new JLabel("Lợi Nhuận:");
		lblloinhuan.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblloinhuan.setForeground(Color.BLUE);
		lblloinhuan.setBounds(903, 212, 105, 17);
		add(lblloinhuan);
		
		JLabel txtloinhuan = new JLabel("New label");
		txtloinhuan.setFont(new Font("Tahoma", Font.BOLD, 16));
		txtloinhuan.setForeground(Color.BLUE);
		txtloinhuan.setBounds(1018, 213, 90, 14);
		add(txtloinhuan);
//		btnNewButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
////				SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
////				String date1_1 = df.format(JDateChooser11.getDate());
////				String date2_2 = df.format(JDateChooser12.getDate());
////				ShowDataPhieuNhapbyCalendar(date1_1, date2_2);
////				Showtienhdtrungbinh(date1_1, date2_2);
////				Showtienhdcaonhat(date1_1, date2_2);
//			}
//			 
//			
//			
//			
//			
//		});
//
//		
//		btnTimkiemxuat.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				SimpleDateFormat df = new SimpleDateFormat("MM-dd-yyyy");
//				String date1 = df.format(JDateChooser21.getDate());
//				String date2 = df.format(JDateChooser22.getDate());
//				ShowDataHoaDonbyCalendar(date1, date2);
//				Showtiennhaptrungbinh(date1, date2);
//				Showtiennhapcaonhat(date1, date2);
//				
//			}
//		});
	}
}
