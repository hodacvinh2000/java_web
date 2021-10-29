package dao;

import java.util.ArrayList;
import bean.Sachbean;

public class Sachdao {
	public ArrayList<Sachbean> getsach(){
		   ArrayList<Sachbean> ds= new ArrayList<Sachbean>();
		   ds.add(new Sachbean("s1", "Tìm lại chính mình", "a", (long)1, (long)1000,"b11.jpg", "cntt"));
		   ds.add(new Sachbean("s2", "Recovering", "a", (long)110, (long)1000,"b12.jpg", "cntt"));
		   ds.add(new Sachbean("s3", "Hạt giống tâm hồn","a", (long)120, (long)1000,"b14.jpg", "cntt"));
		   ds.add(new Sachbean("s11", "ádasd", "a", (long)120, (long)1000,"b21.jpg", "cntt"));
		   ds.add(new Sachbean("s22", "sdaga", "a", (long)130, (long)1000,"b22.jpg", "cntt"));
		   ds.add(new Sachbean("s33", "gadff", "a", (long)10, (long)1000,"b24.jpg", "cntt"));
		   ds.add(new Sachbean("s4", "ádfadsf", "a", (long)110, (long)1000,"b16.jpg", "dia"));
		   ds.add(new Sachbean("s5", "adfadsf", "a", (long)150, (long)1000,"b11.jpg", "dia"));
		   return ds;
	   }
}
