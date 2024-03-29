package org.blog.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.blog.Util.RemarkUtil;

/**
 * Servlet implementation class DeleteRemarkByIdServlet
 */
@WebServlet("/Servlet/DeleteRemarkByIdServlet")
public class DeleteRemarkByIdServlet extends HttpServlet {
	public static RemarkUtil remarkUtil = new RemarkUtil();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int commentid = Integer.parseInt(request.getParameter("commentid")) ;
		
		remarkUtil.deleteRemarkByIdServlet(commentid);
		
		request.getRequestDispatcher("/Servlet/QueryAllRemarksServlet").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
