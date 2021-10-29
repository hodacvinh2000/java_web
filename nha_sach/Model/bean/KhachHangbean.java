package bean;

public class KhachHangbean {
	private String MaKH;
	private String HoTen;
	private String DiaChi;
	private String MatKhau;
	public KhachHangbean(String maKH, String hoTen, String diaChi, String matKhau) {
		super();
		MaKH = maKH;
		HoTen = hoTen;
		DiaChi = diaChi;
		MatKhau = matKhau;
	}
	public KhachHangbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getMaKH() {
		return MaKH;
	}
	public void setMaKH(String maKH) {
		MaKH = maKH;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String hoTen) {
		HoTen = hoTen;
	}
	public String getDiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String diaChi) {
		DiaChi = diaChi;
	}
	public String getMatKhau() {
		return MatKhau;
	}
	public void setMatKhau(String matKhau) {
		MatKhau = matKhau;
	}
	
	
}
