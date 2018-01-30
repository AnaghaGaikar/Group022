package controller;

import java.io.IOException;
import java.io.PrintWriter;

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
 * Servlet implementation class Update_doctor_profile_servlet
 */
@WebServlet("/Update_doctor_profile_servlet")
public class Update_doctor_profile_servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Update_doctor_profile_servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String fname = request.getParameter("firstName");
		System.out.println("name"+fname);
		String lname = request.getParameter("lastName");
		String email = request.getParameter("email");
		System.out.println("name"+email);
		String password = request.getParameter("password");
		String contactNo = request.getParameter("contactNo");
		
		String address = request.getParameter("address");
		String city = request.getParameter("city");
		String pincode = request.getParameter("pinCode");
		int pno = Integer.parseInt(pincode);
		String degree = request.getParameter("degree");
		String specialization = request.getParameter("specialization");
	
		DoctorRegistration updateprofile = new DoctorRegistration(fname,lname,email,password,contactNo,address,city,pno,degree,specialization);
		
		DoctorRegistrationDao ddao = new DoctorRegistrationDao();
		int i = ddao.UpdateDoctorProfile(updateprofile);
		HttpSession session= request.getSession(false);
		Admin a = (Admin)session.getAttribute("data");
		DoctorRegistration dr = ddao.selectforupdate(a);
	 	
	 	session.setAttribute("drInfo", dr);
	 	
	 	/*response.setContentType("text/html;charset=UTF-8");
	 	PrintWriter out = response.getWriter();
	 	 out.println("<script type=\"text/javascript\">");
	     out.println("alert('User or password incorrect');");
	     out.println("</script>");*/
	 	
	 	response.sendRedirect("Update_Doctor_Profile_Page.jsp");
	}

}
