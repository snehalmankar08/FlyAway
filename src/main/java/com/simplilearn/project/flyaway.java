package com.simplilearn.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.JDBCUtil.JdbcUtil;


@WebServlet("/flyaway")
public class flyaway extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public flyaway() {
        super(); 
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	
		Connection con=null;
		String username=(String) request.getParameter("username");
		String password=(String) request.getParameter("password");
		
			
		try {
			con=JdbcUtil.getMySqlConnection();
			 PreparedStatement ps = con.prepareStatement("select username,password from adminlogin where username=? and password=?");
			 ps.setString(1, username);
	         ps.setString(2, password);
	         ResultSet rs = ps.executeQuery();
	         System.out.println(username);
	         System.out.println(password);
	         while (rs.next()) {
	        	 response.sendRedirect("AdminPage.jsp");
	                return;
	            }
	         PrintWriter out = response.getWriter();
	 		out.print("<html><body>");
	 		out.print("<h3>Please provide valid username and password<h3>");
	 		out.print("</html></body>");
	 		
		
			}
		catch (Exception e) {
            e.printStackTrace();

			}
		
	}

}
