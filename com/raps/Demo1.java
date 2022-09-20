package com.raps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Demo1 {

	
	public void method()throws SQLException
	{
		Scanner sc= new Scanner(System.in);
	try {
		
		System.out.println("\t\t\t ****WELCOME TO RAPS PORTAL FOR REGISTRATION***");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
	Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps","root","Anil@1994");
	Statement stm = connection.createStatement();
	System.out.print("Enter your id :-");
	int x = sc.nextInt();
	System.out.print("Enter your FirstName :-");
	String FirstName = sc.next();
	System.out.print("Enter your LastName :-");
	String LastName = sc.next();
	System.out.print("Enter your Emailid :-");
	String Emailid = sc.next();
	System.out.print("Enter your Gender :-");
	String Gender = sc.next();
	System.out.print("Enter your MobileNum :-");
	String MobileNum = sc.next();
	System.out.print("Enter your Address :-");
	String Address = sc.next();
	System.out.print("Set your Username :-");
	String Username = sc.next();
	System.out.print("Set ur PassWord :-");
	String PassWord = sc.next();
	stm.executeUpdate("insert into registation value('"+x+"','"+FirstName+"','"+LastName+"','"+Emailid+"','"+Gender+"','"+MobileNum+"','"+Address+"','"+Username+"','"+PassWord+"')");
	Statement stm1 = connection.createStatement();
	stm.executeUpdate("insert into logindata value('"+x+"','"+Username+"','"+PassWord+"')");
	connection.close();
	stm1.close();
	
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}
	}
	public void register() throws SQLException {
		

		
		
	}
	public static void main(String[] args) throws SQLException{
		//Demo1 om= new Demo1();
		//om.method();
	

		
	}

}
