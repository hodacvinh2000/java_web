package dao;

import java.util.ArrayList;
import bean.KhachHangbean;

public class KhachHangdao {
	public ArrayList<KhachHangbean> getkh(){
		ArrayList<KhachHangbean> ds= new ArrayList<KhachHangbean>();
 	   ds.add(new KhachHangbean("kh1", "Hồ Đắc Vinh", "Huế", "123"));
 	   ds.add(new KhachHangbean("kh2", "Nguyá»…n Tin", "Huáº¿", "123"));
 	   ds.add(new KhachHangbean("kh3", "Huá»³nh TrÆ°ng", "Huáº¿", "123"));
 	   ds.add(new KhachHangbean("kh4", "HoÃ ng VÄƒn Viá»‡t", "Huáº¿", "123"));
 	   return ds;
	}
}
