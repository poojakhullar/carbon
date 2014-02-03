package com.project.code;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.ImageIcon;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.ui.Align;

/**
 * Servlet implementation class ControllerForm3
 */
public class ControllerForm3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerForm3() {
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
				
					String hand=request.getParameter("Prune:Hand");
					String brush=request.getParameter("Brush:Stack");
					String pole=request.getParameter("Pole");
					String rake=request.getParameter("Rake");
					
					String blow=request.getParameter("Blow");
		            String chop=request.getParameter("Chop");
		            String shredded=request.getParameter("Shredded Prunning");
		            String bot=request.getParameter("Bot/Botrysis");
		            String disease=request.getParameter("Disease Applications");
		            String labor=request.getParameter("Irrigate:Labor");
		            String water=request.getParameter("Irrigate:Water");
		            String pest=request.getParameter("Pest:Plant Bugs");
		            String gopher=request.getParameter("Gopher");
					
					
					
					
					DaoForm3 DAO3 = new DaoForm3();
					try {
						BeanForm3 bean3 = DAO3.selectValues(hand, brush, pole, rake, blow, chop, shredded, bot, disease, labor, water, pest, gopher);
						HttpSession session = request.getSession();
						System.out.println("pooja");
						System.out.println(bean3.getHand());
						session.setAttribute("b3", bean3);
						if(true)
						{
							response.sendRedirect("chart.jsp");
						}
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
