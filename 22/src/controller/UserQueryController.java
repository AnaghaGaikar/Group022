package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.UserQuery;
import dto.Patientissuedto;

/**
 * Servlet implementation class UserQueryController
 */
@WebServlet("/UserQueryController")
public class UserQueryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession(false);
		String email=(String)session.getAttribute("email");
		System.out.println(email);
		String disease=request.getParameter("disease");
		String symptoms=request.getParameter("symptoms");
		
		
		Patientissuedto pdto=new Patientissuedto(disease,symptoms);
		UserQuery udao=new UserQuery();
		int i=udao.Register_User_Query(pdto, email);
		if(i>0) {

			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Your Problem Register Successfully');");
			out.println("location='NewQuery.jsp';");
			out.println("</script>");
		
		}else 
		{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Some problem with server please Re-enter your problem');");
			out.println("location='NewQuery.jsp';");
			out.println("</script>");
		}
	}

}
