package com.project.code;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;

public class DaoForm1 {

	BeanForm1 bean1 = new BeanForm1();
	
	DBconnection dbconnection = new DBconnection();
	public BeanForm1 selectValues(String landPrep, String stubble, String disc,
			String acre, String survey, String mark, String planttrees,
			String spread, String stake, String bud,
			String train, String drip) throws SQLException, ClassNotFoundException{
		
		String landPrepC = "select landPrep from carbonf1a where serialno=?";
		String stubbleC = "select stubble from carbonf1a where serialno=?";
		String discC = "select disc from carbonf1a where serialno=?";
		String acreC = "select acre from carbonf1a where serialno=?";
		String surveyC = "select survey from carbonf1a where serialno=?";
		String markC = "select mark from carbonf1a where serialno=?";
		String planttreesC = "select planttrees from carbonf1b where serialno=?";
		String spreadC = "select spread from carbonf1b where serialno=?";
		String stakeC = "select stake from carbonf1b where serialno=?";
		String budC = "select bud from carbonf1b where serialno=?";
		String trainC = "select train from carbonf1b where serialno=?";
		String dripC = "select drip from carbonf1b where serialno=?";
			
		
		
		
		com.mysql.jdbc.Connection connect = (com.mysql.jdbc.Connection) dbconnection.connection();
		
		PreparedStatement pstLandPrep = (PreparedStatement) connect.prepareStatement(landPrepC);
		PreparedStatement pstStubble = (PreparedStatement) connect.prepareStatement(stubbleC);
		PreparedStatement pstDisc = (PreparedStatement) connect.prepareStatement(discC);
		PreparedStatement pstAcre = (PreparedStatement) connect.prepareStatement(acreC);
		PreparedStatement pstSurvey = (PreparedStatement) connect.prepareStatement(surveyC);
		PreparedStatement pstMark = (PreparedStatement) connect.prepareStatement(markC);
		PreparedStatement pstPlanttrees = (PreparedStatement) connect.prepareStatement(planttreesC);
		PreparedStatement pstSpread = (PreparedStatement) connect.prepareStatement(spreadC);
		PreparedStatement pstStake = (PreparedStatement) connect.prepareStatement(stakeC);
		PreparedStatement pstBud = (PreparedStatement) connect.prepareStatement(budC);
		PreparedStatement pstTrain = (PreparedStatement) connect.prepareStatement(trainC);
		PreparedStatement pstDrip = (PreparedStatement) connect.prepareStatement(dripC);
		
		
		pstLandPrep.setString(1, landPrep);
		pstStubble.setString(1, stubble);
		pstDisc.setString(1, disc);
		pstAcre.setString(1, acre);
		pstSurvey.setString(1, survey);
		pstMark.setString(1, mark);
		pstPlanttrees.setString(1, planttrees);
		pstSpread.setString(1, spread);
		pstStake.setString(1, stake);
		pstBud.setString(1, bud);
		pstTrain.setString(1, train);
		pstDrip.setString(1, drip);
		
		ResultSetImpl rs = (ResultSetImpl) pstLandPrep.executeQuery();
		while(rs.next())
		{
			bean1.setLandPrep(rs.getInt(1));			
		}
		ResultSetImpl rs1 = (ResultSetImpl) pstStubble.executeQuery();
		while(rs1.next())
		{
			bean1.setStubble(rs1.getInt(1));
			
		}
		ResultSetImpl rs2 = (ResultSetImpl) pstDisc.executeQuery();
		while(rs2.next())
		{
			bean1.setDisc(rs2.getInt(1));
			
		}
		ResultSetImpl rs3 = (ResultSetImpl) pstAcre.executeQuery();
		while(rs3.next())
		{
			bean1.setAcre(rs3.getInt(1));
			
		}
		ResultSetImpl rs4 = (ResultSetImpl) pstSurvey.executeQuery();
		while(rs4.next())
		{
			bean1.setSurvey(rs4.getInt(1));
			
		}
		ResultSetImpl rs5 = (ResultSetImpl) pstMark.executeQuery();
		while(rs5.next())
		{
			bean1.setMark(rs5.getInt(1));			
		}
		ResultSetImpl rs6 = (ResultSetImpl) pstPlanttrees.executeQuery();
		while(rs6.next())
		{
			bean1.setPlanttrees(rs6.getInt(1));
			
		}
		ResultSetImpl rs7 = (ResultSetImpl) pstSpread.executeQuery();
		while(rs7.next())
		{
			bean1.setSpread(rs7.getInt(1));
			
		}
		ResultSetImpl rs8 = (ResultSetImpl) pstStake.executeQuery();
		while(rs8.next())
		{
			bean1.setStake(rs8.getInt(1));
			
		}
		ResultSetImpl rs9 = (ResultSetImpl) pstBud.executeQuery();
		while(rs9.next())
		{
			bean1.setBud(rs9.getInt(1));
			
		}
                ResultSetImpl rs10 = (ResultSetImpl) pstTrain.executeQuery();
		while(rs10.next())
		{
			bean1.setTrain(rs10.getInt(1));
			
		}
		ResultSetImpl rs11 = (ResultSetImpl) pstDrip.executeQuery();
		while(rs11.next())
		{
			bean1.setDrip(rs11.getInt(1));
			
		}
		System.out.println(bean1.getLandPrep());
		return bean1;
		
	}
	
	

}
