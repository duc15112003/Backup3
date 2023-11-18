package Bai1;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class TinhToan
 */
public class TinhToan extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TinhToan() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/View/chunhat/chunhat.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String chieurong = request.getParameter("chieurong");
		String chieudai = request.getParameter("chieudai");
		Double dientich = Double.parseDouble(chieurong) * Double.parseDouble(chieudai);
		Double chuvi = (Double.parseDouble(chieurong) + Double.parseDouble(chieudai))*2;
		request.setAttribute("dientich", dientich);
		request.setAttribute("chuvi", chuvi);
		request.getRequestDispatcher("/View/chunhat/ketqua.jsp").forward(request, response);
		
		
	}


}
