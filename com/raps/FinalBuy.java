package com.raps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class FinalBuy  {

	
	public void method() throws SQLException
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps","root","Anil@1994");
		BuyOptionCopy mp = new BuyOptionCopy();
	int i;
	do {
		System.out.println("1:-wash-in machine");
		System.out.println("2:-camera");
		System.out.println("3:- Home-Theoter");
		System.out.println("4:-Refrigerator");
		System.out.println("5:-Head-Phone");
		System.out.println("6:-Laptop");
		System.out.println("7:-Projector");
		System.out.println("8:-Printer");
		System.out.println("9:-Oven");
		System.out.println("10:-Mobile");
System.out.println("enter the number of item");
		Scanner obj= new Scanner(System.in);
		
		
		 i = obj.nextInt();
		switch(i)
		{
		case 1:
		{
			
			mp.washinmachine();
			

			
			
		
		}
		break;
		case 2:
		{
			mp.camera();;
		}
		break;
		case 3:
		{
			mp.hometheooter();;
		}
		break;
		case 4:
		{
			mp.refrigeratot();
		}
		break;
		case 5:
		{
			mp.headphone();;
		}
		break;
		case 6:
		{
			mp.laptop();
		}
		break;
		case 7:
		{
			mp.projector();
		}
		break;
		case 8:
		{
			mp.printer();
		}
		break;
		case 9:
		{
			mp.oven();
		}
		break;
		case 10:
		{
			mp.mobile();
		}
		break;
		
		}
	}while(i >=11);
	
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
	}
	public static void main(String[] args) throws SQLException {
		FinalBuy obj= new FinalBuy();
		obj.method();
		
		
	}

}
