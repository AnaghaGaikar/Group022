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
import dto.Patientissuedto;
import dto.User_registration;

/**
 * Servlet implementation class MedicalHistoryController
 */
@WebServlet("/MedicalHistoryController")
public class MedicalHistoryController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		String email=(String)session.getAttribute("email");
		
		if(email!=null){
			System.out.println("medical"+ email);
			User_Registrationdao udao=new User_Registrationdao();
			ArrayList<Patientissuedto> list=udao.getMedicalHistory(email);
			System.out.println("servlet "+list);
			RequestDispatcher rd= request.getRequestDispatcher("medicalHistory.jsp");
			request.setAttribute("arraylist", list);
			//session.setAttribute("list", list);
			rd.forward(request, response);}
			else
			{
				response.sendRedirect("login.jsp");
			}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
