package Controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import bean.GioHangbean;
import bo.GioHangbo;

/**
 * Servlet implementation class xulygiohang
 */
@WebServlet("/xulygiohang")
public class xulygiohang extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public xulygiohang() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=UTF-8");
		request.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		String masach = request.getParameter("masach");
		String tensach = request.getParameter("tensach");
		String tacgia = request.getParameter("tacgia");
		String soluong = request.getParameter("soluong");
		String gia = request.getParameter("gia");
		
		GioHangbo ds = new GioHangbo();
		ArrayList<GioHangbean> dsgh = ds.getds();
		if(request.getParameter("action")!=null) {
			switch(request.getParameter("action")) {
				case "them":
					// Thêm giỏ hàng
					if (masach!=null && tensach!=null && tacgia!=null && gia!=null) {
						ds.Them(masach,tensach,tacgia,1,Long.parseLong(gia));
					}
					break;
				case "suasoluong":
					if (masach!=null && soluong!=null) {
						ds.SuaSoluong(masach, Long.parseLong(soluong));
					}
					break;
				case "xoaall":
					ds.XoaAll();
					break;
				case "tralai":
					if (masach!=null)
						ds.Xoa(masach);
					break;
			}
		}
		response.sendRedirect("giohang");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
