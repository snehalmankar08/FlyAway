package com.simplilearn.project;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.simplilearn.JDBCUtil.JdbcUtil;


@WebServlet("/cpassword")
public class cpassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public cpassword() {
        super();
        
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con=null;
		PrintWriter out = response.getWriter();
		String newp=(String) request.getParameter("npassword");
		String oldp=(String) request.getParameter("cpassword");
		try
		{
			if(newp.equals(oldp))
			{
			con=JdbcUtil.getMySqlConnection();
			 PreparedStatement ps = con.prepareStatement("update adminlogin set password=?");
			 ps.setString(1,newp);
			 ps.executeUpdate();
			 out.print("<h1>password updateded successfully</h1>");
			}
			else
			{
				out.print("<h1>Password does not match</h1>");
			}
			
	}
		catch (Exception e) {
            e.printStackTrace();

			}
	
	
	}

}
