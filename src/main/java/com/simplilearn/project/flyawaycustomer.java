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

@WebServlet("/flyawaycustomer")
public class flyawaycustomer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public flyawaycustomer() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 PrintWriter out = response.getWriter();
		Connection con=null;
		String from=(String) request.getParameter("from");
		String to=(String) request.getParameter("to");
		String date=(String) request.getParameter("date");
		int persons=Integer.parseInt(request.getParameter("persons"));
		System.out.println(persons);
	try
		{
        response.sendRedirect("Book.jsp");
			con=JdbcUtil.getMySqlConnection();
			 PreparedStatement ps = con.prepareStatement("select * from flyawaydb where source=? and destination=? and dod=?");
			 ps.setString(1, from);
	         ps.setString(2, to);
	        ps.setString(3, date);
	       // ps.setInt(4, persons);
	       //System.out.println(from);
	         ResultSet rs = ps.executeQuery();
	         out.print("<h1>Avaibale Flights with price</h1>");
	         out.print("<TABLE align='center' BORDER='6' WIDTH='50%' CELLSPACING='2' CELLPADDING='4'");
			 out.print("<tr><td>Flight No</td>");
			 out.print("<td>Price</td></tr>");
	         
	         while (rs.next()) {
	        	 String FlightNo = rs.getString("flightno");
					String Source = rs.getString("source");
					String Destination = rs.getString("destination");
					String Airline = rs.getString("airline");
					String dod = rs.getString("dod");
					int Price = rs.getInt("price");
					int Persons = rs.getInt("persons");
					out.print("<tr><td>"+FlightNo+"</td>");
					out.print("<td>"+Price+"</td>");
					out.print("<td><a href='Book.jsp'>book</a></td></tr>");
					//out.print("<td><input type='submit' value='Book'></td></tr></a>");
					//out.print("<button onclick='Book.jsp'>Click me</button>");
		
					
					
					
	                return;
	            }
	        
	         
	        
	 		out.print("<html><body>");
	 		out.print("<h3 color='red'>Enter valid Information<h3>");
	 		out.print("</html></body>");
	 		
	            return;
		
	         

			
		}
		catch (Exception e) {
            e.printStackTrace();

			}
		
		
	}

	
	}


