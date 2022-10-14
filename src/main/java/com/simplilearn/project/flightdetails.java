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

@WebServlet("/flightdetails")
public class flightdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public flightdetails() {
        super();
 
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con=null;

		PrintWriter out = response.getWriter();
		try
		{
			con=JdbcUtil.getMySqlConnection();
			 PreparedStatement ps = con.prepareStatement("select flightno,source,destination,airline,price from flyawaydb");
			
			 ResultSet rs = ps.executeQuery();
			 out.print("<h1>Master list of Source and Destination</h1>");
			 out.print("<TABLE ALIGNMENT='center' BORDER='6' WIDTH='50%' CELLSPACING='2' CELLPADDING='4'");
			 out.print("<tr><td>Flight No</td>");
			 out.print("<td>Source</td>");
			 out.print("<td>Destination</td>");
			 out.print("<td>Airline</td>");
			 out.print("<td>Price</td></tr>");
			 
			 while (rs.next()) {
				 String flightno=rs.getString(1);
				 String source=rs.getString(2);
					String destination=rs.getString(3);
					 String airline=rs.getString(4);
					int price=rs.getInt(5);
				
					
				out.print("<tr><td>"+flightno+"</td>");
			out.print("<td>"+source+"</td>");
					out.print("<td>"+destination+"</td>");
					out.print("<td>"+airline+"</td>");
					out.print("<td>"+price+"</td></tr>");
			 }
	}

		catch (Exception e) {
            e.printStackTrace();
	

}
	}
}
