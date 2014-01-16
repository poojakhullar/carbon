package com.project.code;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
	
//	public static void main(String args[]) throws ClassNotFoundException, SQLException{
//		Class.forName("com.mysql.jdbc.Driver");
//		System.out.println("Driver is Loaded");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carbon","root","" );
//		System.out.println("Connection created");
//	}
	
	
	public com.mysql.jdbc.Connection connection() throws ClassNotFoundException, SQLException{
		
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Driver is Loaded");
			com.mysql.jdbc.Connection con = (com.mysql.jdbc.Connection) DriverManager.getConnection("jdbc:mysql://localhost:3307/carbonfinal","root","root" );
			System.out.println("Connection created");
			
			return con;
			
			
			
		
	}

}
