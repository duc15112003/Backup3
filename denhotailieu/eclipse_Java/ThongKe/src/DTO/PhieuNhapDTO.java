package DTO;

public class PhieuNhapDTO {
public String MaPN;
public int SoLuong;
public double GiaNhap;
public String NgayNhap;
public PhieuNhapDTO(String maPN, int soLuong, double giaNhap, String ngayNhap) {
	super();
	MaPN = maPN;
	SoLuong = soLuong;
	GiaNhap = giaNhap;
	NgayNhap = ngayNhap;
}
public PhieuNhapDTO() {
	
}
public String getMaPN() {
	return MaPN;
}
public void setMaPN(String maPN) {
	MaPN = maPN;
}
public int getSoLuong() {
	return SoLuong;
}
public void setSoLuong(int soLuong) {
	SoLuong = soLuong;
}
public double getGiaNhap() {
	return GiaNhap;
}
public void setGiaNhap(double giaNhap) {
	GiaNhap = giaNhap;
}
public String getNgayNhap() {
	return NgayNhap;
}
public void setNgayNhap(String ngayNhap) {
	NgayNhap = ngayNhap;
}



}
