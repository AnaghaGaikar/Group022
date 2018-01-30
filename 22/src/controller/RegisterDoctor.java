package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DoctorRegistrationDao;
import dto.DoctorRegistration;

/**
 * Servlet implementation class RegisterDoctor
 */
@WebServlet("/RegisterDoctor")
public class RegisterDoctor extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterDoctor() {
        super();
    
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
	
		DoctorRegistration doctorregister = new DoctorRegistration(fname,lname,email,password,contactNo,address,city,pno,degree,specialization);
		
		DoctorRegistrationDao ddao = new DoctorRegistrationDao();
		int i = ddao.RegisterDoctor(doctorregister);
		response.sendRedirect("index.jsp");
		
	}

}
