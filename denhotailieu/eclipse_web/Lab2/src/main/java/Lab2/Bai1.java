package Lab2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Bai1
 */
@WebServlet({ "/tamgiac", "/dientich", "/chuvi" })
public class Bai1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Bai1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/views/bai1index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		double a = Double.parseDouble(request.getParameter("a"));
		double b = Double.parseDouble(request.getParameter("b"));
		double c = Double.parseDouble(request.getParameter("c"));
		if ((a + b > c) && (a + c > b) && (b + c > a)) {
			double chuVi = (a + b + c);
			String uri = request.getRequestURI();
			if (uri.contains("dientich")) { // [Tính diện tích].Click
				double dienTich = Math.sqrt(chuVi * (a + b - c) * (a + c - b) * (b + c - a)) / 4;
				request.setAttribute("message", "Diện tích của tam giác là " + dienTich);
			} else { 
				request.setAttribute("message", "Chu vi của tam giác là " + chuVi);
			}
		} else {
			request.setAttribute("message", "Không thỏa mãn các cạnh của một tam giác!");
		}
		request.getRequestDispatcher("/views/bai1index.jsp").forward(request, response);
	}

}
