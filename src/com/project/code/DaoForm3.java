package com.project.code;

import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;

public class DaoForm3 {
	BeanForm3 bean3 = new BeanForm3();
	
	DBconnection dbconnection = new DBconnection();
	
	public BeanForm3 selectValues(String hand, String brush, String pole,
			String rake, String blow, String chop, String shredded, String bot, String disease, String labor, String water, String pest, String gopher) throws SQLException, ClassNotFoundException{
		
		String handC = "select hand from carbonf3a where serialno=?";
		String brushC = "select brush from carbonf3a where serialno=?";
		String poleC = "select pole from carbonf3a where serialno=?";
		String rakeC = "select rake from carbonf3a where serialno=?";
		String blowC = "select blow from carbonf3a where serialno=?";
		String chopC = "select chop from carbonf3a where serialno=?";
		String shreddedC = "select shredded from carbonf3a where serialno=?";
		String botC = "select bot from carbonf3b where serialno=?";
		String diseaseC = "select disease from carbonf3b where serialno=?";
		String laborC = "select labor from carbonf3b where serialno=?";
		String waterC = "select water from carbonf3b where serialno=?";
		String pestC = "select pest from carbonf3b where serialno=?";
		String gopherC = "select gopher from carbonf3b where serialno=?";
		
		
		
		com.mysql.jdbc.Connection connect = (com.mysql.jdbc.Connection) dbconnection.connection();
		
		PreparedStatement pstHand = (PreparedStatement) connect.prepareStatement(handC);
		PreparedStatement pstBrush = (PreparedStatement) connect.prepareStatement(brushC);
		PreparedStatement pstPole = (PreparedStatement) connect.prepareStatement(poleC);
		PreparedStatement pstRake = (PreparedStatement) connect.prepareStatement(rakeC);
		PreparedStatement pstBlow = (PreparedStatement) connect.prepareStatement(blowC);
		PreparedStatement pstChop = (PreparedStatement) connect.prepareStatement(chopC);
		PreparedStatement pstShredded = (PreparedStatement) connect.prepareStatement(shreddedC);
		PreparedStatement pstBot = (PreparedStatement) connect.prepareStatement(botC);
		PreparedStatement pstDisease = (PreparedStatement) connect.prepareStatement(diseaseC);
		PreparedStatement pstLabor = (PreparedStatement) connect.prepareStatement(laborC);
		PreparedStatement pstWater = (PreparedStatement) connect.prepareStatement(waterC);
		PreparedStatement pstPest = (PreparedStatement) connect.prepareStatement(pestC);
		PreparedStatement pstGopher = (PreparedStatement) connect.prepareStatement(gopherC);
		
                
        pstHand.setString(1, hand);
		pstBrush.setString(1, brush);
		pstPole.setString(1, pole);
		pstRake.setString(1, rake);
		pstBlow.setString(1, blow);
		pstChop.setString(1, chop);
		pstShredded.setString(1, shredded);
		pstBot.setString(1, bot);
		pstDisease.setString(1, disease);
		pstLabor.setString(1, labor);
		pstWater.setString(1, water);
		pstPest.setString(1, pest);
		pstGopher.setString(1, gopher);
		

        ResultSetImpl rs = (ResultSetImpl) pstHand.executeQuery();
		while(rs.next())
		{
			bean3.setHand(rs.getInt(1));			
		}
		ResultSetImpl rs1 = (ResultSetImpl) pstBrush.executeQuery();
		while(rs1.next())
		{
			bean3.setBrush(rs1.getInt(1));
			
		}
		ResultSetImpl rs2 = (ResultSetImpl) pstPole.executeQuery();
		while(rs2.next())
		{
			bean3.setPole(rs2.getInt(1));
			
		}
		ResultSetImpl rs3 = (ResultSetImpl) pstRake.executeQuery();
		while(rs3.next())
		{
			bean3.setRake(rs3.getInt(1));
			
		}
		ResultSetImpl rs4 = (ResultSetImpl) pstBlow.executeQuery();
		while(rs4.next())
		{
			bean3.setBlow(rs4.getInt(1));
			
		}
		ResultSetImpl rs5 = (ResultSetImpl) pstChop.executeQuery();
		while(rs5.next())
		{
			bean3.setChop(rs5.getInt(1));			
		}
		ResultSetImpl rs6 = (ResultSetImpl) pstShredded.executeQuery();
		while(rs6.next())
		{
			bean3.setShredded(rs6.getInt(1));
			
		}
		ResultSetImpl rs7 = (ResultSetImpl) pstBot.executeQuery();
		while(rs7.next())
		{
			bean3.setBot(rs7.getInt(1));
			
		}
		ResultSetImpl rs8 = (ResultSetImpl) pstDisease.executeQuery();
		while(rs8.next())
		{
			bean3.setDisease(rs8.getInt(1));
			
		}
		ResultSetImpl rs9 = (ResultSetImpl) pstLabor.executeQuery();
		while(rs9.next())
		{
			bean3.setLabor(rs9.getInt(1));
			
		}
                ResultSetImpl rs10 = (ResultSetImpl) pstWater.executeQuery();
		while(rs10.next())
		{
			bean3.setWater(rs10.getInt(1));
			
		}
		ResultSetImpl rs11 = (ResultSetImpl) pstPest.executeQuery();
		while(rs11.next())
		{
			bean3.setPest(rs11.getInt(1));
			
		}
		ResultSetImpl rs12 = (ResultSetImpl) pstGopher.executeQuery();
		while(rs12.next())
		{
			bean3.setGopher(rs12.getInt(1));
			
		}


		return bean3;
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}

