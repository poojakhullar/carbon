package com.project.code;

import java.awt.BasicStroke;
import java.awt.Color;
import java.io.IOException;
import java.io.OutputStream;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.data.general.DefaultPieDataset;

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
							BeanForm1 beanA;
							beanA = (BeanForm1)session.getAttribute("b1");
							BeanForm2 beanB;
							beanB = (BeanForm2)session.getAttribute("b2");
							BeanForm3 beanC;
							beanC = (BeanForm3)session.getAttribute("b3");
						
						
							response.setContentType("image/png");
							OutputStream outputStream = response.getOutputStream();
							JFreeChart chart = getChart(beanA,beanB,beanC);
							int width = 500;
							int height = 350;
							ChartUtilities.writeChartAsPNG(outputStream, chart, width, height);
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
	public JFreeChart getChart(BeanForm1 beanA,BeanForm2 beanB,BeanForm3 beanC) {
		DefaultPieDataset dataset = new DefaultPieDataset();
		
		int landprep = beanA.getLandPrep();
		int stubble = beanA.getStubble();
		int disc = beanA.getDisc();
		int acre = beanA.getAcre();
		int survey = beanA.getSurvey();
		int train = beanB.getTrain();
		int prune = beanB.getPrune();
		int bdisk = beanB.getDisc();
		int emitters = beanB.getEmitters();
		int copper = beanB.getCopper();
		int hand = beanC.getHand();
		int brush = beanC.getBrush();
		int pole = beanC.getPole();
		int rake = beanC.getRake();
		int blow = beanC.getBlow();
		int chop = beanC.getChop();
			
		dataset.setValue("Land Prep", landprep);
		dataset.setValue("Land Prep:Stubble Disc 1X", stubble);
		dataset.setValue("Land Prep:Disc & Float 2X", disc);
		dataset.setValue("Trees:135 Per Acre", acre);
		dataset.setValue("Plant:Survey", survey);
		dataset.setValue("Train", train);
		dataset.setValue("Prune", prune);
		dataset.setValue("Disk Prunning", bdisk);
		dataset.setValue("Boron emitters", emitters);
		dataset.setValue("Copper defoliation", copper);
		dataset.setValue("Prune:Hand", hand);
		dataset.setValue("Brush:Stack", brush);
		dataset.setValue("Pole", pole);
		dataset.setValue("Rake", rake);
		dataset.setValue("Blow", blow);
		dataset.setValue("Chop", chop);
	
		boolean legend = true;
		boolean tooltips = false;
		boolean urls = false;

		JFreeChart chart = ChartFactory.createPieChart("Carbon Values", dataset, legend, tooltips, urls);

		chart.setBorderPaint(Color.GREEN);
		chart.setBorderStroke(new BasicStroke(5.0f));
		chart.setBorderVisible(true);

		return chart;
	}
}
