package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class IndexJava
 */
@WebServlet("/indexjava")
public class IndexJava extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexJava() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		request.getSession();

		 
//	    	Cookie[] cookie = request.getCookies();
//	    	for(Cookie c : cookie) {
//			String cScore = c.getValue().toString();
//			request.getSession().setAttribute("score", cScore);
//		}
//		
		
		
		
		//legge lo score dal databse in caso il db è vuoto torna 0
		try {
			Class.forName("org.postgresql.Driver");
			
			
			String nm="db";
			String ps="falsarone";
			String url="jdbc:postgresql://localhost:5432/usr_lgn";
			
			
			Connection conn = DriverManager.getConnection(url, nm, ps); 
			
			Statement st = conn.createStatement();
			
			String sql = "SELECT jscore FROM "+ "js"+Login.getName;
			
			ResultSet rs = st.executeQuery(sql);
			
			if(rs.next()) {
				
				int score = rs.getInt("jscore");
				request.getSession().setAttribute("score", score);
			}else {
				int score = 0 ;
				request.getSession().setAttribute("score", score);
			}
			
			
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		RequestDispatcher rd = request.getRequestDispatcher("indexjava.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
