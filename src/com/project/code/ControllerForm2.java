package com.project.code;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ControllerForm2
 */
public class ControllerForm2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerForm2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//HttpSession session=request.getSession();
		
				//RequestDispatcher requestDispatcher=null;
				
					String Train=request.getParameter("Train");
					String Prune=request.getParameter("Prune");
					String Disc=request.getParameter("Disk Prunning");
					String Emitters=request.getParameter("Boron Emitters");
					
					String copper=request.getParameter("copper defoliation");
		            String nitrogen=request.getParameter("Nitrogen");
		            String foliar=request.getParameter("Foliar Spraying");
		            String weed=request.getParameter("Weed");
		            String herbicide=request.getParameter("Herbicide Applications");
		            String bugs=request.getParameter("Plant bugs");
		            String remove=request.getParameter("Remove Stakes");
		            String pumped=request.getParameter("Water Pumped");
		            String irrigate=request.getParameter("Irrigate");
					
					
					
					
					DaoForm2 DAO2 = new DaoForm2();
					try {
						BeanForm2 bean2 = DAO2.selectValues(Train, Prune, Disc, Emitters, copper, nitrogen, foliar, weed, herbicide, bugs, remove, pumped, irrigate);
						HttpSession session = request.getSession();
						System.out.println("pooja");
						System.out.println(bean2.getTrain());
						session.setAttribute("b2", bean2);
						if(true)
							response.sendRedirect("form3.html");
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
