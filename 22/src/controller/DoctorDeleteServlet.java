package controller;

import java.io.IOException;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;  
import javax.servlet.http.HttpServletRequest;  
import javax.servlet.http.HttpServletResponse;

import dao.*;  
@WebServlet("/doctorDelete") 
public class DoctorDeleteServlet extends HttpServlet {  
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)   
             throws ServletException, IOException {  
    	String id=request.getParameter("id");  
    	int cid=Integer.parseInt(id); 
        DoctorDao.delete(cid); 
        String deleteMessage = "This Doctor is delete from our Doctor Team Successfully...!!!";
        request.setAttribute("deleteMessage", deleteMessage);
        request.getRequestDispatcher("adminviewdoctor.jsp").forward(request,response);
    }  
}  