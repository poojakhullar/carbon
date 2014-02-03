package com.project.code;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Controller2
 */
public class Controller2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String Pickaname=request.getParameter("Pickaname");
		String Yourregionis=request.getParameter("Yourregionis");
		String Youracreageis=request.getParameter("Youracreageis");
		//String PhoneNumber=request.getParameter("Phone Number");
		//String Location=request.getParameter("location");
		
		//String Time=request.getParameter("Time");
        //String Name=request.getParameter("Name");
        
        Dao DAO = new Dao();
		try {
			boolean bool = DAO.selectValues(Pickaname,Yourregionis,Youracreageis);
			//HttpSession session = request.getSession();
			//System.out.println("pooja");
			//System.out.println(bean2.getTrain());
			//session.setAttribute("b2", bean2);
			if(bool)
				response.sendRedirect("form1.html");
			else
				response.sendRedirect("failure.html");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	
}
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
