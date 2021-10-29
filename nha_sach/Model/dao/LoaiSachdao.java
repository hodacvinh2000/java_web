package dao;

import java.util.ArrayList;
import bean.LoaiSachbean;

public class LoaiSachdao {
	public ArrayList<LoaiSachbean> getloai(){
    	ArrayList<LoaiSachbean> ds= new ArrayList<LoaiSachbean>();
 	   ds.add(new LoaiSachbean("cntt", "Công nghệ thông tin"));
 	   ds.add(new LoaiSachbean("yte", "Y tế"));
 	   ds.add(new LoaiSachbean("sinh", "Sinh học"));
 	   ds.add(new LoaiSachbean("vatly", "Vật lý"));
 	   ds.add(new LoaiSachbean("dia", "Địa lý"));
 	   return ds;
    }
}