package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.catalina.Session;

import dao.DoctorRegistrationDao;
import dto.Admin;
import dto.PatientIssue;

/**
 * Servlet implementation class ShowAllPatients
 */
@WebServlet("/ShowAllPatients")
public class ShowAllPatients extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ShowAllPatients() {
        super();
       
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		HttpSession session= request.getSession(false);
		Admin a = (Admin)session.getAttribute("data");
		System.out.println(a.getEmail());
	 	DoctorRegistrationDao dao=new DoctorRegistrationDao();
	 	
	 	ArrayList<PatientIssue> list=dao.SelectAllPatients(a);
	 	
	 	session.setAttribute("list", list);
	 	
	 	response.sendRedirect("ShowAllPatients.jsp");
	 	
	 	/*response.setContentType("text/html");
	 	PrintWriter out = response.getWriter();
	 	out.println("<html>");
	 	out.println("");*/
	 	
	 	
	 	
	 	
	}

}
