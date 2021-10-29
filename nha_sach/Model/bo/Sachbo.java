package bo;

import java.util.ArrayList;

import bean.Sachbean;
import dao.Sachdao;

public class Sachbo {
	Sachdao sdao = new Sachdao();
	public ArrayList<Sachbean> getsach(){
		return sdao.getsach();
	}
	
  public Long DemSach(String maloai) {
	   ArrayList<Sachbean> ds= getsach();
	   Long d=(long)0;
	   for(Sachbean s: ds)
		   if(s.getMaloai().equals(maloai))
			   d++;
	   return d;
   }
  
  public ArrayList<Sachbean> TimLoai(String maloai) {
	   ArrayList<Sachbean> ds= getsach();
	   ArrayList<Sachbean> tam= new ArrayList<Sachbean>();
	   for(Sachbean s: ds)
		   if(s.getMaloai().equals(maloai))
			   tam.add(s);
	   return tam;
  }
  
  public ArrayList<Sachbean> Tim(String key) {
	   ArrayList<Sachbean> ds= getsach();
	   ArrayList<Sachbean> tam= new ArrayList<Sachbean>();
	   for(Sachbean s: ds)
		   if(s.getTensach().trim().toLowerCase().contains(key.trim().toLowerCase())||
				   s.getTacgia().trim().toLowerCase().contains(key.trim().toLowerCase()))
			   tam.add(s);
	   return tam;
  }
}
