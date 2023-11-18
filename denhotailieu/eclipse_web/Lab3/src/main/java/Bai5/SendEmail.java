package Bai5;

	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;
	import jakarta.websocket.Session;

	import java.io.IOException;
	import java.util.Properties;

	import javax.mail.Message;
	import javax.mail.PasswordAuthentication;
	import javax.mail.Transport;
	import javax.mail.internet.InternetAddress;
	import javax.mail.internet.MimeMessage;
	import javax.swing.JOptionPane;

	/**
	 * Servlet implementation class SendEmail
	 */


	public class SendEmail extends HttpServlet {
		private static final long serialVersionUID = 1L;
		
		/**
		 * @see HttpServlet#HttpServlet()
		 */
		public SendEmail() {
			super();
			// TODO Auto-generated constructor stub
		}

		/**
		 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			request.getRequestDispatcher("/Views/Bai5/index.jsp").forward(request, response);
		}

		/**
		 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
		 */
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			String form = request.getParameter("form");
			String to = request.getParameter("to");
			String subject = request.getParameter("subject");
			String body = request.getParameter("body");
			
				Properties p = new Properties();
				p.put("mail.smtp.auth", "true");
				p.put("mail.smtp.starttls.enable", "true");
				p.put("mail.smtp.host", "smtp.gmail.com");
				p.put("mail.smtp.port", 587);
				final String accountName = "phamminhduc15112003dilinh@gmail.com";
				final String accountPassword = "sardyptmvfiigpqy";
				javax.mail.Session s = javax.mail.Session.getInstance(p, new javax.mail.Authenticator() {
					protected PasswordAuthentication getPasswordAuthentication() {
						return new PasswordAuthentication(accountName, accountPassword);
					}
				});
				Message msg = new MimeMessage(s);
				try {
					msg.setFrom(new InternetAddress(accountName));
					msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));
					msg.setSubject(subject);
					msg.setText(body);
					Transport.send(msg);
				} catch (Exception e1) {
					// TODO Auto-generated catch block
					request.setAttribute("mess", "gửi thất bại");
				}
				request.setAttribute("mess", "gửi thành công");
			request.getRequestDispatcher("/Views/Bai5/index.jsp").forward(request, response);
		}

	}
