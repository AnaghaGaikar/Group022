package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DoctorRegistrationDao;
import dto.Admin;
import dto.PatientIssue;

/**
 * Servlet implementation class ShowTreatingPatientsServlet
 */
@WebServlet("/ShowTreatingPatientsServlet")
public class ShowTreatingPatientsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowTreatingPatientsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session= request.getSession(false);
		Admin a = (Admin)session.getAttribute("data");
		System.out.println(a.getEmail());
	 	DoctorRegistrationDao dao=new DoctorRegistrationDao();
	 	
	 	ArrayList<PatientIssue> list=dao.SelectTreatingPatients(a);
	 	
	 	
	 	session.setAttribute("list", list);
	 	
	 	response.sendRedirect("ShowTreatingPatients.jsp");
	 	
	 	
	 	
	}

}
