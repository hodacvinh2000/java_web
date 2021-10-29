package Controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.LoaiSachbean;
import bean.Sachbean;
import bo.LoaiSachbo;
import bo.Sachbo;

/**
 * Servlet implementation class HtSachController
 */
@WebServlet("/HtSach")
public class HtSachController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HtSachController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		
		LoaiSachbo lbo = new LoaiSachbo();
		ArrayList<LoaiSachbean> dsloai = lbo.getloai();
		Sachbo sbo = new Sachbo();
		ArrayList<Sachbean> dssach = sbo.getsach();		
		// Xử lý tìm kiếm sách
		if(request.getParameter("ml")!=null) {
			dssach = sbo.TimLoai(request.getParameter("ml"));
		}
		request.setAttribute("tim", request.getParameter("txtTim"));
		if(request.getParameter("txtTim")!=null) {
			dssach = sbo.Tim(request.getParameter("txtTim"));
		}
		request.setAttribute("dsloaisach", dsloai);
		request.setAttribute("dssach", dssach);

		RequestDispatcher requestDispatcher = request.getRequestDispatcher("menu.jsp");
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
