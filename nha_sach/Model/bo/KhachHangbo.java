package bo;

import java.util.ArrayList;

import bean.KhachHangbean;
import dao.KhachHangdao;

public class KhachHangbo {
	KhachHangdao khdao = new KhachHangdao();
	public ArrayList<KhachHangbean> getkh(){
		return khdao.getkh();
	}
	
	public KhachHangbean ktr_dn(String username, String password) {
		ArrayList<KhachHangbean> lkh = this.getkh();
		for(KhachHangbean kh : lkh) {
			if (kh.getMaKH().equals(username) && kh.getMatKhau().equals(password)) {
				return kh;
			}
		}
		return null;
	}
	
}
