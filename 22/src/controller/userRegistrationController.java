package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.User_Registrationdao;
import dto.User_registration;

/**
 * Servlet implementation class userRegistrationController
 */
@WebServlet("/userRegistrationController")
public class userRegistrationController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");	
		String fname=request.getParameter("firstname");
		String lname=request.getParameter("lastname");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String address=request.getParameter("address");
		String state=request.getParameter("state");
		String city=request.getParameter("city");
		int pincode=Integer.parseInt(request.getParameter("pincode"));
		String gender=request.getParameter("gender");
		int age=Integer.parseInt(request.getParameter("age"));
		String contact=request.getParameter("contact");
		User_registration user=new User_registration(fname,lname,email,password,address,state,city,pincode,gender,age,contact);
		
		User_Registrationdao udao=new User_Registrationdao();
		int i=udao.RegisterUser(user);
		
		if(i==1) 
		{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('Registration successful');");
			out.println("location='index.jsp';");
			out.println("</script>");
		//	response.sendRedirect("index.jsp");
		}else
		{
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.println("<script type=\"text/javascript\">");
			out.println("alert('email id already exists please select new email');");
			out.println("location='index.jsp';");
			out.println("</script>");
		//	response.sendRedirect("index.jsp");
		}
		

	}

}
