package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.*;
import dto.*;
/**
 * The Class AdminLoginServlet.
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String username = request.getParameter("email");
		String password = request.getParameter("password");
		Admin admin1 = new Admin(username,password);
		HttpSession session= request.getSession();
		session.setAttribute("data",admin1);
		String selectedvalue = request.getParameter("usertype");
		
		System.out.println(selectedvalue);

		if (selectedvalue.equals("admin")) {
			
			Admin admin = LoginDao.adminValidate(username, password);
			if (admin.getEmail() == null) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Username or Password is incorrect');");
				out.println("location='index.jsp';");
				out.println("</script>");
			} else 
			{
				session.setAttribute("email", username);
				System.out.println(session.getAttribute("admin"));
				response.sendRedirect("AdminHome.jsp");
				}
			
		}

		else if (selectedvalue.equals("doctor")) {
			DoctorRegistration doctor = LoginDao.doctorValidate(username, password);

			if (doctor.getEmail() == null) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Username or Password is incorrect');");
				out.println("location='index.jsp';");
				out.println("</script>");
			} else {
				session.setAttribute("email", username);
				System.out.println(session.getAttribute("doctor"));
				response.sendRedirect("home.jsp");
			}
		}

		else if (selectedvalue.equals("user")) {
			User_registration user = LoginDao.userValidate(username, password);

			if (user.getEmail() == null) {
				out.println("<script type=\"text/javascript\">");
				out.println("alert('Username or Password is incorrect');");
				out.println("location='index.jsp';");
				out.println("</script>");
			} else {
				session.setAttribute("email", username);
				System.out.println(session.getAttribute("user"));
				response.sendRedirect("userHome.jsp");
			}
		}

	}

}