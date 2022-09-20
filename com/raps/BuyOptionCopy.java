package com.raps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;


public class BuyOptionCopy  {
	
	Scanner sc= new Scanner(System.in);
//random method
	public void washinmachine() throws SQLException {
		
		try {
			System.out.println("please enter your username for confirm");
			String next = sc.next();
			
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps", "root", "Anil@1994");
            Statement myStmt = con.createStatement();
            String sql ="SELECT * FROM registation WHERE Username='"+next+"'";
            ResultSet rs = myStmt.executeQuery(sql);
			if(rs.next())
			{
				String custemer = rs.getString("sql");
				System.out.println(custemer);
				String str ="SELECT * FROM raps.custemerdata where ProductId=245";
			 ResultSet set = myStmt.executeQuery(str);
			 while(set.next()){
			String str1 = set.getString("NameProduct");
			String str3 = set.getString("Price");
			String str4 = set.getString("Quantity");
			
				
				
			}
			
			
			
			}
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps","root","Anil@1994");
		String str ="SELECT * FROM raps.custemerdata where ProductId=245";
		Statement statement = connection.createStatement();
		 ResultSet set = statement.executeQuery(str);
		 while(set.next()){
		String str1 = set.getString("NameProduct");
		String str2 = set.getString("Desciption");
		String str3 = set.getString("Price");
		String str4 = set.getString("Quantity");
		System.out.format("%s%s%s%s\n\n",str1+"\nDesciption :-",str2+"\nPrice :-",str3+"\nQuantity :-",str4);
		
		
		
		
		 }
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	public void camera()throws SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps","root","Anil@1994");
	String str ="SELECT * FROM raps.custemerdata where ProductId=1005";
	Statement statement = connection.createStatement();
	 ResultSet set = statement.executeQuery(str);
	 while(set.next()){
	String str1 = set.getString("NameProduct");
	String str2 = set.getString("Desciption");
	String str3 = set.getString("Price");
	String str4 = set.getString("Quantity");
	System.out.format("%s%s%s%s\n\n",str1+"\nDesciption :-",str2+"\nPrice :-",str3+"\nQuantity :-",str4);
	
	
	 }
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}}
	public void hometheooter()throws SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps","root","Anil@1994");
	String str ="SELECT * FROM raps.custemerdata where ProductId=1244";
	Statement statement = connection.createStatement();
	 ResultSet set = statement.executeQuery(str);
	 while(set.next()){
	String str1 = set.getString("NameProduct");
	String str2 = set.getString("Desciption");
	String str3 = set.getString("Price");
	String str4 = set.getString("Quantity");
	System.out.format("%s%s%s%s\n\n",str1+"\nDesciption :-",str2+"\nPrice :-",str3+"\nQuantity :-",str4);
	
	 }
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void refrigeratot()throws SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps","root","Anil@1994");
	String str ="SELECT * FROM raps.custemerdata where ProductId=1455";
	Statement statement = connection.createStatement();
	 ResultSet set = statement.executeQuery(str);
	 while(set.next()){
	String str1 = set.getString("NameProduct");
	String str2 = set.getString("Desciption");
	String str3 = set.getString("Price");
	String str4 = set.getString("Quantity");
	System.out.format("%s%s%s%s\n\n",str1+"\nDesciption :-",str2+"\nPrice :-",str3+"\nQuantity :-",str4);
	
	 }
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void headphone()throws SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps","root","Anil@1994");
	String str ="SELECT * FROM raps.custemerdata where ProductId=1633";
	Statement statement = connection.createStatement();
	 ResultSet set = statement.executeQuery(str);
	 while(set.next()){
	String str1 = set.getString("NameProduct");
	String str2 = set.getString("Desciption");
	String str3 = set.getString("Price");
	String str4 = set.getString("Quantity");
	System.out.format("%s%s%s%s\n\n",str1+"\nDesciption :-",str2+"\nPrice :-",str3+"\nQuantity :-",str4);
	
	 }
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void laptop() throws SQLException{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps","root","Anil@1994");
	String str ="SELECT * FROM raps.custemerdata where ProductId=1788";
	Statement statement = connection.createStatement();
	 ResultSet set = statement.executeQuery(str);
	 while(set.next()){
	String str1 = set.getString("NameProduct");
	String str2 = set.getString("Desciption");
	String str3 = set.getString("Price");
	String str4 = set.getString("Quantity");
	System.out.format("%s%s%s%s\n\n",str1+"\nDesciption :-",str2+"\nPrice :-",str3+"\nQuantity :-",str4);
	
	 }
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void projector()throws SQLException {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps","root","Anil@1994");
	String str ="SELECT * FROM raps.custemerdata where ProductId=1911";
	Statement statement = connection.createStatement();
	 ResultSet set = statement.executeQuery(str);
	 while(set.next()){
	String str1 = set.getString("NameProduct");
	String str2 = set.getString("Desciption");
	String str3 = set.getString("Price");
	String str4 = set.getString("Quantity");
	System.out.format("%s%s%s%s\n\n",str1+"\nDesciption :-",str2+"\nPrice :-",str3+"\nQuantity :-",str4);
	
	 }
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void printer() throws SQLException{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps","root","Anil@1994");
	String str ="SELECT * FROM raps.custemerdata where ProductId=1977";
	Statement statement = connection.createStatement();
	 ResultSet set = statement.executeQuery(str);
	 while(set.next()){
	String str1 = set.getString("NameProduct");
	String str2 = set.getString("Desciption");
	String str3 = set.getString("Price");
	String str4 = set.getString("Quantity");
	System.out.format("%s%s%s%s\n\n",str1+"\nDesciption :-",str2+"\nPrice :-",str3+"\nQuantity :-",str4);
	
	 }
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void oven() throws SQLException{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps","root","Anil@1994");
	String str ="SELECT * FROM raps.custemerdata where ProductId=2045";
	Statement statement = connection.createStatement();
	 ResultSet set = statement.executeQuery(str);
	 while(set.next()){
	String str1 = set.getString("NameProduct");
	String str2 = set.getString("Desciption");
	String str3 = set.getString("Price");
	String str4 = set.getString("Quantity");
	System.out.format("%s%s%s%s\n\n",str1+"\nDesciption :-",str2+"\nPrice :-",str3+"\nQuantity :-",str4);

	 }
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	}
	public void mobile() throws SQLException{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps","root","Anil@1994");
	String str ="SELECT * FROM raps.custemerdata where ProductId=3015";
	Statement statement = connection.createStatement();
	 ResultSet set = statement.executeQuery(str);
	 while(set.next()){
	String str1 = set.getString("NameProduct");
	String str2 = set.getString("Desciption");
	String str3 = set.getString("Price");
	String str4 = set.getString("Quantity");
	System.out.format("%s%s%s%s\n\n",str1+"\nDesciption :-",str2+"\nPrice :-",str3+"\nQuantity :-",str4);

	
	 }
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}finally
		{
		
		}
	}
	
	
	public static void main(String[] args) throws SQLException {
		
		BuyOptionCopy m= new BuyOptionCopy();
		m.washinmachine();
//		m.camera();
//		m.refrigeratot();
//		m.mobile();m.oven();
//		m.headphone();
//		m.laptop();
//		m.hometheooter();
//		m.oven();
//		m.printer();
//		m.projector();
	}}

