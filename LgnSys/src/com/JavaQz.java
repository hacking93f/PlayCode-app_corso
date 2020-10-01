package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JavaQz
 */
@WebServlet("/javaqz")
public class JavaQz extends HttpServlet {
	private static final long serialVersionUID = 1L;
	static int rx1;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JavaQz() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	
		 rx1 =Integer.parseInt(request.getParameter("rx1")) ;
	
		if(rx1 == 5) {
			System.out.println("sbagliato");
		}else if(rx1 == 10) {
			System.out.println("corretto");

		}else if(rx1 == 2){
			System.out.println("sbagliato");
			
		}
		//qui ti salvi la variabile rx1 e continui con i quiz e poi fai un conteggio finale di tutte le variabili easy peasy!

		
		response.sendRedirect("java1.jsp");
		
		
	}

}
