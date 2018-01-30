package controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import connection.*;


/**
 * A servlet that takes message details from user and send it as a new e-mail
 * through an SMTP server. The e-mail message may contain attachments which
 * are the files uploaded from client.
 * 
 * @author www.codejava.net
 * 
 */
@WebServlet("/docregi")
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, 	// 2MB
				maxFileSize = 1024 * 1024 * 10, 		// 10MB
				maxRequestSize = 1024 * 1024 * 50)		// 50MB
public class DoctorRegistrationServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String host;
	private String port;
	private String user;
	private String pass;

	public void init() {
		// reads SMTP server setting from web.xml file
		ServletContext context = getServletContext();
		host = context.getInitParameter("host");
		port = context.getInitParameter("port");
		user = context.getInitParameter("user");
		pass = context.getInitParameter("pass");
	}
	/**
	 * handles form submission
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		String name=request.getParameter("name");
		String recipient=request.getParameter("email");  
		String password=request.getParameter("password");
		String contact=request.getParameter("contact");
		String district=request.getParameter("district");
		String city=request.getParameter("city");  
		String pincode=request.getParameter("pincode");
		String degree=request.getParameter("degree");

		
		try {
			Connection con=DB_Conn.getConnection();
			Statement st = (Statement) con.createStatement();

			ResultSet rs = st.executeQuery("SELECT * from doctor where email='" + recipient + "'");

			String duplicate = null;

			while(rs.next()){
			duplicate = rs.getString(2);
			}

			if(duplicate == null){

			}
			else{
			String errmail = "Email id is already registered";
			request.setAttribute("errmail", errmail);
			request.getRequestDispatcher("admin-doctor-register.jsp").forward(request,response);
			}
			    
			PreparedStatement ps=con.prepareStatement("insert into doctor(name,email,password,contact,district,city,pincode,degree) values(?,?,?,?,?,?,?,?)");
			ps.setString(1, name); 
			ps.setString(2,recipient);  
			ps.setString(3,password);
			ps.setString(4,contact);
			ps.setString(5, district); 
			ps.setString(6,city);  
			ps.setString(7,pincode);
			ps.setString(8,degree);

			int i=ps.executeUpdate();  
			String message = null;
			if(i>0)  
				message = "Doctor Registration Successfull.";
			request.setAttribute("message", message);
			request.getRequestDispatcher("admin-doctor-register.jsp").forward(request,response);

			}catch (Exception e2) {System.out.println(e2);}
	}
}