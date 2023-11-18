package Bai4;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Login
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = CookieUtils.get("username", req);
		String password = CookieUtils.get("password", req);
		req.setAttribute("username", username);
		req.setAttribute("password", password);
		req.getRequestDispatcher("/Views/Bai4/bai4.jsp").forward(req, resp);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String remember = req.getParameter("remember");
		// kiểm tra tài khoản đăng nhập
		if(!username.equalsIgnoreCase("poly")) {
		req.setAttribute("message", "Sai tên đăng nhập!");
		}
		else if(password.length() < 6) {
		req.setAttribute("message", "Sai mật khẩu!");
		}
		else {
		req.setAttribute("message", "Đăng nhập thành công!");
		// ghi nhớ hoặc xóa tài khoản đã ghi nhớ bằng cookie
		int hours = (remember == null) ? 0 : 30*24; // 0 = xóa
		CookieUtils.add("username", username, hours, resp);
		CookieUtils.add("password", password, hours, resp);
		req.getRequestDispatcher("/Views/Bai4/bai4.jsp").forward(req, resp);
	}
	}
}
