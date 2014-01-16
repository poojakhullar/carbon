package com.project.code;

import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.ResultSetImpl;

public class DaoForm2 {
	BeanForm2 bean2 = new BeanForm2();
	
	DBconnection dbconnection = new DBconnection();
	public BeanForm2 selectValues(String Train, String Prune, String Disc,
			String Emitters, String copper, String nitrogen, String foliar, String weed, String herbicide, String bugs, String remove, String pumped, String irrigate) throws SQLException, ClassNotFoundException{
		
		String TrainC = "select train from carbonf2a where serialno=?";
		String PruneC = "select prune from carbonf2a where serialno=?";
		String DiscC = "select disc from carbonf2a where serialno=?";
		String EmittersC = "select emitters from carbonf2a where serialno=?";
		String copperC = "select copper from carbonf2a where serialno=?";
		String nitrogenC = "select nitrogen from carbonf2a where serialno=?";
		String foliarC = "select foliar from carbonf2a where serialno=?";
		String weedC = "select weed from carbonf2b where serialno=?";
		String herbicideC = "select herbicide from carbonf2b where serialno=?";
		String bugsC = "select bugs from carbonf2b where serialno=?";
		String removeC = "select remove from carbonf2b where serialno=?";
		String pumpedC = "select pumped from carbonf2b where serialno=?";
		String irrigateC = "select irrigate from carbonf2b where serialno=?";
		
		
		
		com.mysql.jdbc.Connection connect = (com.mysql.jdbc.Connection) dbconnection.connection();
		
		PreparedStatement pstTrain = (PreparedStatement) connect.prepareStatement(TrainC);
		PreparedStatement pstPrune = (PreparedStatement) connect.prepareStatement(PruneC);
		PreparedStatement pstDisc = (PreparedStatement) connect.prepareStatement(DiscC);
		PreparedStatement pstEmitters = (PreparedStatement) connect.prepareStatement(EmittersC);
		PreparedStatement pstCopper = (PreparedStatement) connect.prepareStatement(copperC);
		PreparedStatement pstNitrogen = (PreparedStatement) connect.prepareStatement(nitrogenC);
		PreparedStatement pstFoliar = (PreparedStatement) connect.prepareStatement(foliarC);
		PreparedStatement pstWeed = (PreparedStatement) connect.prepareStatement(weedC);
		PreparedStatement pstHerbicide = (PreparedStatement) connect.prepareStatement(herbicideC);
		PreparedStatement pstBugs = (PreparedStatement) connect.prepareStatement(bugsC);
		PreparedStatement pstRemove = (PreparedStatement) connect.prepareStatement(removeC);
		PreparedStatement pstPumped = (PreparedStatement) connect.prepareStatement(pumpedC);
		PreparedStatement pstIrrigate = (PreparedStatement) connect.prepareStatement(irrigateC);
		
                
        pstTrain.setString(1, Train);
		pstPrune.setString(1, Prune);
		pstDisc.setString(1, Disc);
		pstEmitters.setString(1, Emitters);
		pstCopper.setString(1, copper);
		pstNitrogen.setString(1, nitrogen);
		pstFoliar.setString(1, foliar);
		pstWeed.setString(1, weed);
		pstHerbicide.setString(1, herbicide);
		pstBugs.setString(1, bugs);
		pstRemove.setString(1, remove);
		pstPumped.setString(1, pumped);
		pstIrrigate.setString(1, irrigate);
		

        ResultSetImpl rs = (ResultSetImpl) pstTrain.executeQuery();
		while(rs.next())
		{
			bean2.setTrain(rs.getInt(1));			
		}
		ResultSetImpl rs1 = (ResultSetImpl) pstPrune.executeQuery();
		while(rs1.next())
		{
			bean2.setPrune(rs1.getInt(1));
			
		}
		ResultSetImpl rs2 = (ResultSetImpl) pstDisc.executeQuery();
		while(rs2.next())
		{
			bean2.setDisc(rs2.getInt(1));
			
		}
		ResultSetImpl rs3 = (ResultSetImpl) pstEmitters.executeQuery();
		while(rs3.next())
		{
			bean2.setEmitters(rs3.getInt(1));
			
		}
		ResultSetImpl rs4 = (ResultSetImpl) pstCopper.executeQuery();
		while(rs4.next())
		{
			bean2.setCopper(rs4.getInt(1));
			
		}
		ResultSetImpl rs5 = (ResultSetImpl) pstNitrogen.executeQuery();
		while(rs5.next())
		{
			bean2.setNitrogen(rs5.getInt(1));			
		}
		ResultSetImpl rs6 = (ResultSetImpl) pstFoliar.executeQuery();
		while(rs6.next())
		{
			bean2.setFoliar(rs6.getInt(1));
			
		}
		ResultSetImpl rs7 = (ResultSetImpl) pstWeed.executeQuery();
		while(rs7.next())
		{
			bean2.setWeed(rs7.getInt(1));
			
		}
		ResultSetImpl rs8 = (ResultSetImpl) pstHerbicide.executeQuery();
		while(rs8.next())
		{
			bean2.setHerbicide(rs8.getInt(1));
			
		}
		ResultSetImpl rs9 = (ResultSetImpl) pstBugs.executeQuery();
		while(rs9.next())
		{
			bean2.setBugs(rs9.getInt(1));
			
		}
                ResultSetImpl rs10 = (ResultSetImpl) pstRemove.executeQuery();
		while(rs10.next())
		{
			bean2.setRemove(rs10.getInt(1));
			
		}
		ResultSetImpl rs11 = (ResultSetImpl) pstPumped.executeQuery();
		while(rs11.next())
		{
			bean2.setPumped(rs11.getInt(1));
			
		}
		ResultSetImpl rs12 = (ResultSetImpl) pstIrrigate.executeQuery();
		while(rs12.next())
		{
			bean2.setIrrigate(rs12.getInt(1));
			
		}


		return bean2;
		
		
		
		
	}
	
}

