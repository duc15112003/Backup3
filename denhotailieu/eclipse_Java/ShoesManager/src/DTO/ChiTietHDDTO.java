package DTO;

public class ChiTietHDDTO {
     String MaGiay, MaHD;
    int SoLuong, GiaBan;
//    private 

    public ChiTietHDDTO() {
    }

    public ChiTietHDDTO(String MaGiay, String MaHD, int SoLuong, int GiaBan) {
       this.MaGiay = MaGiay;
       this.MaHD = MaHD;
       this.SoLuong = SoLuong;
       this.GiaBan = GiaBan;
    }

    
    
    public String getMaGiay() {
		return MaGiay;
	}

	public void setMaGiay(String maGiay) {
		MaGiay = maGiay;
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

	public int getGiaBan() {
		return GiaBan;
	}

	public void setGiaBan(int giaBan) {
		GiaBan = giaBan;
	}
}
