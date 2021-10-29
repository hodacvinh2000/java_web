package bo;

import bean.LoaiSachbean;
import dao.LoaiSachdao;
import java.util.ArrayList;

public class LoaiSachbo {
	LoaiSachdao ldao = new LoaiSachdao();
	public ArrayList<LoaiSachbean> getloai(){
		return ldao.getloai();
	}
}
