package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import dao.User_Registrationdao;
import dto.User_registration;

/**
 * Servlet implementation class userUpdateController
 */
@WebServlet("/userUpdateController")
public class userUpdateController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
				HttpSession session=request.getSession();
				String email=(String)session.getAttribute("email");
				//String fname=request.getParameter("firstname");
				//String lname=request.getParameter("lastname");
				String address=request.getParameter("address");
				String state=request.getParameter("state");
				String city=request.getParameter("city");
				int pincode=Integer.parseInt(request.getParameter("pincode"));
				int age=Integer.parseInt(request.getParameter("age"));
				String contact=request.getParameter("contact");
				User_registration user=new User_registration(address,state,city,pincode,age,contact);
				
				User_Registrationdao udao=new User_Registrationdao();
				int i=udao.updateUser(user,email);
				response.sendRedirect("ShowDataController");
	}

}
