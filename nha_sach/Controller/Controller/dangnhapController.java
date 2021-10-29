package Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.KhachHangbean;
import bo.KhachHangbo;

/**
 * Servlet implementation class dangnhapController
 */
@WebServlet("/dangnhap")
public class dangnhapController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public dangnhapController() {
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
		HttpSession session = request.getSession();
		if (request.getParameter("logout")!=null) {
			session.removeAttribute("nguoidung");
			session.removeAttribute("giohang");
			response.sendRedirect("menu.jsp");
		}
		else {
			String un = request.getParameter("txtun");
			String pass = request.getParameter("txtpass");
			KhachHangbo khbo = new KhachHangbo();
			KhachHangbean kh = khbo.ktr_dn(un, pass);
			if (un!=null && pass!=null) {
				if (kh!=null) {
					session.setAttribute("nguoidung", kh);
				}
				else {
					request.setAttribute("thongbaodangnhap", "Đăng nhập sai");
				}
			}
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("HtSach");
			requestDispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
