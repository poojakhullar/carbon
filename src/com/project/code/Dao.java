package com.project.code;

import java.sql.SQLException;

import com.mysql.jdbc.PreparedStatement;

public class Dao {
	
	DBconnection dbconnection = new DBconnection();
	public boolean selectValues(String Pickaname, String Yourregionis, String Youracreageis
			) throws SQLException, ClassNotFoundException{
		
		String PickanameC = "select Pickaname from front where serialno=?";
		String YourregionisC = "select Yourregionis from front where serialno=?";
		String YouracreageisC = "select Youracreageis from front where serialno=?";
		//String PhoneNumberC = "select PhoneNumber from first where serialno=?";
		//String LocationC = "select Location from first where serialno=?";
		//String TimeC = "select Time from first where serialno=?";
		//String NameC = "select Name from first where serialno=?";
		
		
		
		com.mysql.jdbc.Connection connect = (com.mysql.jdbc.Connection) dbconnection.connection();
		
		PreparedStatement pstPickaname = (PreparedStatement) connect.prepareStatement(PickanameC);
		

		PreparedStatement pstYourregionis = (PreparedStatement) connect.prepareStatement(YourregionisC);
		PreparedStatement pstYouracreageis = (PreparedStatement) connect.prepareStatement(YouracreageisC);
		//PreparedStatement pstPhoneNumber = (PreparedStatement) connect.prepareStatement(PhoneNumberC);
		//PreparedStatement pstLocation = (PreparedStatement) connect.prepareStatement(LocationC);
		//PreparedStatement pstTime = (PreparedStatement) connect.prepareStatement(TimeC);
		//PreparedStatement pstName = (PreparedStatement) connect.prepareStatement(NameC);
		
		
                
        pstPickaname.setString(1, Pickaname);
		pstYourregionis.setString(1, Yourregionis);
		pstYouracreageis.setString(1, Youracreageis);
		//pstPhoneNumber.setString(1, PhoneNumber);
		//pstTime.setString(1, Time);
		//pstName.setString(1, Name);
		
           return true;

	}
}
