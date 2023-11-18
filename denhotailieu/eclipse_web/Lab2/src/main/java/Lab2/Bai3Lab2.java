package Lab2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

/**
 * Servlet implementation class Bai3Lab2
 */
public class Bai3Lab2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Bai3Lab2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("/views/ttcn/form.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");
		String username = request.getParameter("username");
		boolean gender = Boolean.parseBoolean(request.getParameter("gender"));
		boolean married = (request.getParameter("married") != null);
		String country = request.getParameter("country");
		String[] hobbies = request.getParameterValues("hobbies");
		System.out.println(">>hobbies: " + Arrays.toString(hobbies));
		System.out.println(">>username: " + username);
		System.out.println(">>gender: " + gender);
		System.out.println(">>married: " + married);
		System.out.println(">>country: " + country);
		request.getRequestDispatcher("/views/ttcn/result.jsp").forward(request, response);
	}

}
