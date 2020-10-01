package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 * Register system coded by neo0hacker All right reserved 
 */


/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection conn;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		
		String uname = request.getParameter("uname");
		String psw = request.getParameter("psw");
		
		try {
			Class.forName("org.postgresql.Driver");
		
		
		String nm="db";
		String ps="falsarone";
		String url="jdbc:postgresql://localhost:5432/usr_lgn";
		
		conn = DriverManager.getConnection(url, nm, ps);
		
		conn.setAutoCommit(false);
		
		String sql = "INSERT INTO usr_lgn VALUES (?,?)";
		
		PreparedStatement st= conn.prepareStatement(sql);
		st.setString(1, uname);
		st.setString(2, psw);
		int a = st.executeUpdate();
		
		if(a > 0 ) {
			
			  
	           String createTable = "CREATE TABLE " +"js"+uname +"( \n"
	        		    +"JScore int"+
	        		");";
	         Statement stt = conn.createStatement();
	         stt.execute(createTable);
	           

			conn.commit();
			
			

			RequestDispatcher rq = request.getRequestDispatcher("index.jsp");
			rq.forward(request, response);
		} //qui inserisci che c'� stato un errore ;)
		
		//naturalmente se cattura gli errori class not foun e sql excpetion va nel blocco catch 
		//quindi per l errore usernm gia esistente � stato sufficente fare csi ;)
		
		
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			if(conn != null) {
				try {
					
					//creare una pagina apposta per l'errore username e password gia esistenti?? 
					//cmq vabb� per adesso ti lascio questo 
					response.sendRedirect("Errore.jsp");

					conn.rollback();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		}
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
