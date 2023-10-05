package com.admin;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;  

import javax.servlet.RequestDispatcher;
public class Adminsearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private  static  int memoryFlag=0;
    public Adminsearch() {
        super();
    }
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int charsToAdd = 5_000_000;
		String str1 = request.getParameter("username");
		if(str1.equalsIgnoreCase("stop"))
		{
			memoryFlag = 1;
		}
		else
		{
			memoryFlag=0;
		}
		while (true)
		{
			StringBuilder sb = new StringBuilder();
			for (int i = 0; i < 10; i++)
			{
				for (int j = 0; j < charsToAdd; j++)
				{
					sb.append('a');
				}
			}
			if (memoryFlag == 1) {
				sb = null;
				break;
			}
		}
		}

}
