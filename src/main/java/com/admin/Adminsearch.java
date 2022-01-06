package com.admin;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;  

import javax.servlet.RequestDispatcher;
public class Adminsearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Adminsearch() {
        super();
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String str1=request.getParameter("username");
		String str2=request.getParameter("password");
		RequestDispatcher rd=null;
		if (str1.equalsIgnoreCase("admin")&&str2.equals("12345")) {
			response.sendRedirect(request.getContextPath() + "/homepage3.jsp");
		}else {
			rd=request.getRequestDispatcher("homepage2.html");
			out=response.getWriter();
			rd.include(request, response);
			out.println("<center><span style='color:red'>Invalid Credentials</span></center>");
		/*	String str=config.getServletName();//Working of ServletName method of ServletConfig 
			out.print("</br>"+str); */
		}
		}

}
