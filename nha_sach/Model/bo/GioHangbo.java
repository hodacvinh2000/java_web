package bo;

import java.util.ArrayList;
import bean.GioHangbean;

public class GioHangbo {
	public static ArrayList<GioHangbean> ds = new ArrayList<GioHangbean>();
	public ArrayList<GioHangbean> getds(){
		return ds;
	}
	public void Them(String masach, String tensach, String tacgia, long slmua, long gia) {
		boolean ktr = false;
		for (GioHangbean gh : ds) {
			if(gh.getMaSach().equals(masach)) {
				SuaSoluong(masach,gh.getSlmua()+1);
				ktr = true;
			}
		}
		if (ktr == false) ds.add(new GioHangbean(masach,tensach,tacgia,slmua,gia));	
	}
	public void Xoa(String masach) {
		for (GioHangbean gh : ds) {
			if (gh.getMaSach().equals(masach)) {
				ds.remove(gh);
				break;
			}
		}
	}
	public long TongTien() {
		long tongtien = 0;
		for (GioHangbean gh: ds) {
			tongtien += gh.getGia()*gh.getSlmua();
		}
		return tongtien;
	}
	public void SuaSoluong(String masach, long soluong) {
		for (GioHangbean gh : ds) {
			if (gh.getMaSach().equals(masach)) {
				gh.setSlmua(soluong);
				break;
			}
		}
	}
	public void XoaAll() {
		ds.removeAll(ds);
	}
}

