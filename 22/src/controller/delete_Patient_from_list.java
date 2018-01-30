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
 * Servlet implementation class delete_Patient_from_list
 */
@WebServlet("/delete_Patient_from_list")
public class delete_Patient_from_list extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public delete_Patient_from_list() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pid = request.getParameter("patientId");
		int pi = Integer.parseInt(pid);
		
		HttpSession session= request.getSession(false);
		
		Admin a=(Admin)session.getAttribute("data");
		System.out.println(a.getEmail());
		DoctorRegistrationDao dao=new DoctorRegistrationDao();
		int i = dao.DeletePatientFromList(pi);
		
		ArrayList<PatientIssue> list=dao.SelectTreatingPatients(a);	
	 	
	 	session.setAttribute("list", list);
	 	
	 	response.sendRedirect("ShowTreatingPatients.jsp");
	 	
	}

}
