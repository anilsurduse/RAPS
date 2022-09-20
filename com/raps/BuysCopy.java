package com.raps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BuysCopy {
	public void method() throws SQLException
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps","root","Anil@1994");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}

}
