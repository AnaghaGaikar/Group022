<%@page import="dao.MailDao"%>
<jsp:useBean id="mail" class="dto.MailDto"></jsp:useBean>
<jsp:setProperty property="*" name="mail"></jsp:setProperty>

<%
	MailDao m = new MailDao();
	int k = m.sendMail(mail);
	if (k == 0) {
		out.write("<script>alert('Message Has Been Sent Successfully')</script>");
		RequestDispatcher rd = request.getRequestDispatcher("EmailForm.jsp");
		rd.include(request, response);
	}
	else{
		out.write("<script>alert('Something Went Wrong')</script>");
		RequestDispatcher rd = request.getRequestDispatcher("siteUnderMaintainance.jsp");
		rd.include(request, response);
	}
%>

