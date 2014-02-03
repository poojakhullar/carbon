package com.project.code;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
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
public class ControllerFinal extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControllerFinal() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session=request.getSession();
		
				//RequestDispatcher requestDispatcher=null;
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

		
		return chart;
	}
}
