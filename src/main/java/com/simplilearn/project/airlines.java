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




@WebServlet("/airlines")
public class airlines extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public airlines() {
        super();
      
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Connection con=null;

		PrintWriter out = response.getWriter();
		try
		{
			con=JdbcUtil.getMySqlConnection();
			 PreparedStatement ps = con.prepareStatement("select airline from flyawaydb");
			 ResultSet rs = ps.executeQuery();
			 out.print("<h1>Master list of Airlines</h1>");
			 out.print("<TABLE ALIGNMENT='center' BORDER='6' WIDTH='20%' CELLSPACING='2' CELLPADDING='4'");
			 out.print("<tr><td>Airlines</td></tr>");
			 while (rs.next()) {
				 String airlines=rs.getString(1);
				 out.print("<tr><td>"+airlines+"</td></tr>");
		
	}
		}
			 
		catch (Exception e) {
            e.printStackTrace();


}

	
	}
	}

