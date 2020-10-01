package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JavaQz2
 */
@WebServlet("/javaqz2")
public class JavaQz2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    int total;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JavaQz2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Sessione scaduta effetua di nuovo il login per favore :)  ").append(request.getContextPath());
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
		int rx3 = Integer.parseInt(request.getParameter("rx3"));
		
		
		int rx1 = JavaQz.rx1;
		int rx2 = JavaQz1.rx2;
		
		
		total = rx1 + rx2 + rx3;
		
		try {
	        Class.forName("org.postgresql.Driver");
			
			
			String nm="db";
			String ps="falsarone";
			String url="jdbc:postgresql://localhost:5432/usr_lgn";
			
			
			Connection conn = DriverManager.getConnection(url, nm, ps); 
			
			
			 String sql = "INSERT INTO "+"js"+Login.getName+" VALUES(?)";
			
			 PreparedStatement pss = conn.prepareStatement(sql);
			 
			 pss.setInt(1, total);

			int a = pss.executeUpdate();
			
			if (a >= 0) {
				
				String sql1 = "UPDATE "+"js"+Login.getName+" SET jscore=?";
				
				PreparedStatement upstatemente = conn.prepareStatement(sql1);
				upstatemente.setInt(1, total);
				
				upstatemente.executeUpdate();
			}
			
			
			
			 response.sendRedirect("indexjava");
			//qui condizione if rs next sara update e non insert 
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

			
		
	
		
	}
}
