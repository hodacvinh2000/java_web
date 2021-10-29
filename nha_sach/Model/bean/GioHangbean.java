package bean;

public class GioHangbean {
	private String MaSach, TenSach, TacGia;
	private long slmua, Gia;
	public GioHangbean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public GioHangbean(String maSach, String tenSach, String tacGia, long slmua, long gia) {
		super();
		MaSach = maSach;
		TenSach = tenSach;
		TacGia = tacGia;
		this.slmua = slmua;
		Gia = gia;
	}
	public String getMaSach() {
		return MaSach;
	}
	public void setMaSach(String maSach) {
		MaSach = maSach;
	}
	public String getTenSach() {
		return TenSach;
	}
	public void setTenSach(String tenSach) {
		TenSach = tenSach;
	}
	public String getTacGia() {
		return TacGia;
	}
	public void setTacGia(String tacGia) {
		TacGia = tacGia;
	}
	public long getSlmua() {
		return slmua;
	}
	public void setSlmua(long slmua) {
		this.slmua = slmua;
	}
	public long getGia() {
		return Gia;
	}
	public void setGia(long gia) {
		Gia = gia;
	}
	
	
}	
