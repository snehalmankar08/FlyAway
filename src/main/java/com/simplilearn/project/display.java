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


@WebServlet("/display")
public class display extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public display() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection con=null;
		
		PrintWriter out = response.getWriter();
		String name=(String) request.getParameter("name");
		String dob=(String) request.getParameter("dob");
		String flightno=(String) request.getParameter("flightno");
		
		
		//int persons=Integer.parseInt(request.getParameter("adhaar"));
		try
		{
			con=JdbcUtil.getMySqlConnection();
			 PreparedStatement ps = con.prepareStatement("select * from flyawaydb where flightno=?");
			 ps.setString(1, flightno);
			 ResultSet rs = ps.executeQuery();
			
			
			
			while (rs.next()) {
				
				String flno=rs.getString(1);
				String source=rs.getString(2);
				String destination=rs.getString(3);
				String airline=rs.getString(4);
				String dot=rs.getString(5);
				int price=rs.getInt(6);
				 out.print("<h1>Congrass.... Your payment is seccessful</h1>");
				 out.print("<h3>Details of Booked Flight</h3>");
				out.print("<p>"+"Name:"    +name+"</p>");
				out.print("<p>"+"Flight No:        "+flno+"</p>");
				out.print("<p>"+"Source:        "+source+"</p>");
				out.print("<p>"+"Destination:        "+destination+"</p>");
				out.print("<p>"+"Airline:        "+airline+"</p>");
				out.print("<p>"+"date of travel:        "+dot+"</p>");
				out.print("<p>"+"Prie:        "+price+"</p>");
				
				
				
				
				
				
			}
			
	}

		catch (Exception e) {
            e.printStackTrace();

			}
	
}
}
