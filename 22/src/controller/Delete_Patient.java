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
import dto.User_registration;

/**
 * Servlet implementation class Delete_Patient
 */
@WebServlet("/Delete_Patient")
public class Delete_Patient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete_Patient() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pid = request.getParameter("patientId");
		int pi = Integer.parseInt(pid);
		
		AdminDao dao =new AdminDao();
		
		int i=dao.Deletepatient(pi);	
		HttpSession session= request.getSession(false);
	 	
		ArrayList<User_registration> list=dao.getUserRecords();
	 	
	 	session.setAttribute("list", list);
	 	
	 	response.sendRedirect("Admin_Show_Patients_Details.jsp");
	}

}
