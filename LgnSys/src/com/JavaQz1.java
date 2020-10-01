package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class JavaQz1
 */
@WebServlet("/javaqz1")
public class JavaQz1 extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    static int rx2;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public JavaQz1() {
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
		 rx2 = Integer.parseInt(request.getParameter("rx2"));
			
			if(rx2 == 10) {
				
				System.out.println("corretto");
			}else if(rx2 == 2) {
				System.out.println("sbagliato");
			}else if(rx2 == 5) {
				System.out.println("sbagliato");
			}
			
			
			response.sendRedirect("java2.jsp");
		
	}

}
