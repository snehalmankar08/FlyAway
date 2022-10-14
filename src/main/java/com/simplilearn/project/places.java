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


@WebServlet("/places")
public class places extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
    public places() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con=null;

		PrintWriter out = response.getWriter();
		try
		{
			con=JdbcUtil.getMySqlConnection();
			 PreparedStatement ps = con.prepareStatement("select source,destination from flyawaydb");
			
			 ResultSet rs = ps.executeQuery();
			 out.print("<h1>Master list of Source and Destination</h1>");
			 out.print("<TABLE align='center' BORDER='6' WIDTH='50%' CELLSPACING='2' CELLPADDING='4'");
			 out.print("<tr><td>Source</td>");
			 out.print("<td>Destination</td></tr>");
			 while (rs.next()) {
				 String source=rs.getString(1);
					String destination=rs.getString(2);
				
				out.print("<br>");	
			out.print("<tr><td>"+source+"</td>");
					out.print("<td>"+destination+"</td></tr>");
					
	
	}
		}
		catch (Exception e) {
            e.printStackTrace();


}
	}
}
