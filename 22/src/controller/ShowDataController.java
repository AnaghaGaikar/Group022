package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.User_Registrationdao;
import dto.User_registration;

/**
 * Servlet implementation class ShowDataController
 */
@WebServlet("/ShowDataController")
public class ShowDataController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("in controller");
		HttpSession session=request.getSession();
		String email=(String)session.getAttribute("email");
		if(email!=null){
		System.out.println(email);
		User_Registrationdao udao=new User_Registrationdao();
		ArrayList<User_registration> list=udao.selectUser(email);
		System.out.println("servlet "+list);
		RequestDispatcher rd= request.getRequestDispatcher("update.jsp");
		request.setAttribute("arraylist", list);
		session.setAttribute("list", list);
		rd.forward(request, response);}
		else
		{
			response.sendRedirect("index.jsp");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
	}

}
