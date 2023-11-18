package DTO;

public class HoaDonDTO {
public String MaHD;
public int SoLuong;
public double GiaBan;
public String NgayBan;

public HoaDonDTO(String maHD, int soLuong, double giaBan, String ngayBan) {
	super();
	MaHD = maHD;
	SoLuong = soLuong;
	GiaBan = giaBan;
	NgayBan = ngayBan;
}

public HoaDonDTO() {
	
}

public String getMaHD() {
	return MaHD;
}

public void setMaHD(String maHD) {
	MaHD = maHD;
}

public int getSoLuong() {
	return SoLuong;
}

public void setSoLuong(int soLuong) {
	SoLuong = soLuong;
}

public double getGiaBan() {
	return GiaBan;
}

public void setGiaBan(double giaBan) {
	GiaBan = giaBan;
}

public String getNgayBan() {
	return NgayBan;
}

public void setNgayBan(String ngayBan) {
	NgayBan = ngayBan;
}

 

}
