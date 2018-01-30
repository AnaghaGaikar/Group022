package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.AdminDao;
import dto.DoctorRegistration;
import dto.PatientIssue;

/**
 * Servlet implementation class AdminPatientIssueServ
 */
@WebServlet("/AdminPatientIssueServ")
public class AdminPatientIssueServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminPatientIssueServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session= request.getSession(false);
		AdminDao dao=new AdminDao();
	 	
	 	ArrayList<PatientIssue> list=dao.getPatientIssue();
	 	
	 	session.setAttribute("list", list);
	 	
	 	response.sendRedirect("Admin_Show_Patient_issue.jsp");
	 	
	}

	

}
