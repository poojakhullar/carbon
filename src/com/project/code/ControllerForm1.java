package com.project.code;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ControllerForm1
 */
public class ControllerForm1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerForm1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)  {
		// TODO Auto-generated method stub
		//HttpSession session=request.getSession();
		
				//RequestDispatcher requestDispatcher=null;
				
					String landPrep=request.getParameter("Land Prep");
					String stubble=request.getParameter("Land Prep:Stubble Disc 1X");
					String disc=request.getParameter("Land Prep:Disc & Float 2X");
					String acre=request.getParameter("Trees:135 Per Acre");
					
					String survey=request.getParameter("Plant:Survey");
					
					String mark=request.getParameter("Plant:Mark");
					String planttrees=request.getParameter("Plant:Plant Trees");
					String spread=request.getParameter("Plant:Spread Stakes");
					String stake=request.getParameter("Plant:Stake Trees");
					String bud=request.getParameter("Bud:Field Bud Trees");
					String train=request.getParameter("Train:Notch & Tip Root Stock");
					String drip=request.getParameter("Drip Irrigation System & Hoses");
					

					
					
					DaoForm1 DAO1 = new DaoForm1();
					try {
						BeanForm1 bean1 = DAO1.selectValues(landPrep, stubble, disc, acre , survey, mark, planttrees, spread, stake, bud, train, drip);
						HttpSession session = request.getSession();
						System.out.println("pooja");
						System.out.println(bean1.getLandPrep());
						session.setAttribute("b1", bean1);
						if(true)
							
							response.sendRedirect("form2.html");
						else
							response.sendRedirect("failure.html");
					} catch ( SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (ClassNotFoundException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					} catch (IOException e) {
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
