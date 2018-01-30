package controller;

import java.io.File;
import java.io.IOException;
import java.util.List;
 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import dao.UserQuery;
 
/**
 * Servlet implementation class Uploadservlet
 */
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final String UPLOAD_DIRECTORY = "C:/Users/user/Desktop/22/uploads";
 
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("hello upload servlet");
		HttpSession session=request.getSession(false);
		String email=(String)session.getAttribute("email");
		if (ServletFileUpload.isMultipartContent(request)) {
			try {
				String fname = null;
				String fsize = null;
				String ftype = null;
				String file=null;
				String filePath = "C:/Users/user/Desktop/22/uploads";
				List<FileItem> multiparts = new ServletFileUpload(
						new DiskFileItemFactory()).parseRequest(request);
				for (FileItem item : multiparts) {
					if (!item.isFormField()) {
						fname = new File(item.getName()).getName();
						fsize = new Long(item.getSize()).toString();
						ftype = item.getContentType();
						 file=new File(item.getName()).getAbsolutePath();
						item.write(new File(UPLOAD_DIRECTORY + File.separator
								+ fname));
					}
				}
				// File uploaded successfully
				request.setAttribute("message", "File Uploaded Successfully");
				request.setAttribute("name", fname);
				request.setAttribute("size", fsize);
				request.setAttribute("type", ftype);
				request.setAttribute("file path", file);
				UserQuery udao=new UserQuery();
				udao.upload(file, email);
			} catch (Exception ex) {
				request.setAttribute("message", "Please select the file "
					);
			}
 
		} else {
			request.setAttribute("message",
					"Sorry this Servlet only handles file upload request");
		}
 
		request.getRequestDispatcher("/result.jsp").forward(request, response);
		
	}
	// TODO Auto-generated method stub
}