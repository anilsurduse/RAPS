package com.raps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Login {
	String user = "ANIL";
	String pass = "Anil@123";

public void login() throws SQLException
	{
	Scanner obj= new Scanner(System.in);
		try {
			System.out.println("enter your username");
			String ps = obj.next();
			System.out.println("enter your password");
		String ps2 = obj.next();
		if(ps.equals(user))
				{
			if(ps2.equals(pass))
		       {
			System.out.println("welcome to RAPS portal ");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps","root","Anil@1994");
		String quary="SELECT * FROM raps.registation";
		Statement stm1 = connection.createStatement();
		ResultSet set = stm1.executeQuery(quary);
		while(set.next())
		{
			
			int id=set.getInt("id");
			String firstname=set.getString("FirstName");
			String LastName1=set.getString("LastName");
			String Emailid1=set.getString("Emailid");
			String Gender1=set.getString("Gender");
			String MobileNum1=set.getString("MobileNum");
			String Username1=set.getString("Username");
			String PassWord1=set.getString("PassWord");
			
			
			System.out.format("%s,%s,%s,%s,%s,%s,%s,%s\n",id,firstname,LastName1,Emailid1,Gender1,MobileNum1,Username1,PassWord1);
		
		}
	
		       }else
		       {
		    	   System.out.println("please enter correct username password ");
		    	   Login on=new Login();
		   		on.login();
		   		}
		       }else
		    	   
		{
		System.out.println("please enter correct username");
		Login on=new Login();
		on.login();
		
		}
	
		}catch (ClassNotFoundException e) {
		
		e.printStackTrace();
		
		
}
		}

	public static void main(String[] args) throws SQLException {

		Login on = new Login();
		on.login();

	}
}
