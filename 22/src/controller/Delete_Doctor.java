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

/**
 * Servlet implementation class Delete_Patient
 */
@WebServlet("/Delete_Doctor")
public class Delete_Doctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Delete_Doctor() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String pid = request.getParameter("doctorId");
		int pi = Integer.parseInt(pid);
		
		AdminDao dao =new AdminDao();
		
		int i=dao.DeleteDoctor(pi);	
		HttpSession session= request.getSession(false);
	 	
		ArrayList<DoctorRegistration> list=dao.getDoctorsRecords();
	 	
	 	session.setAttribute("list", list);
	 	
	 	response.sendRedirect("Admin_Show_Doctor_Details.jsp");	
	}

	

}
