package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DoctorRegistrationDao;
import dto.Admin;
import dto.DoctorRegistration;

/**
 * Servlet implementation class Details_to_Update
 */
@WebServlet("/Details_to_Update")
public class Details_to_Update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Details_to_Update() {
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
	 	
	 	DoctorRegistration dr = dao.selectforupdate(a);
	 	
	 	session.setAttribute("drInfo", dr);
	 	
	 	response.sendRedirect("Update_Doctor_Profile_Page.jsp");
	}

}
