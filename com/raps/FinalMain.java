package com.raps;

import java.sql.SQLException;
import java.util.Scanner;

public class FinalMain {
	Scanner sc= new Scanner(System.in);
public void mainMethod() throws SQLException {
		System.out.println("\t\t\t ****WELCOME TO RAPS ***");
		System.out.println("DO YOU WANT TO SEE OUR PRODUCT LIST ");
		System.out.println("1***:-YES");
		System.out.println("2***:-NO");
		
		int i = sc.nextInt();
		switch(i)
		{
		case 1:
		{
			BuyOption m= new BuyOption();
			m.washinmachine();
			m.camera();
			m.refrigeratot();
			m.mobile();m.oven();
			m.headphone();
			m.laptop();
			m.hometheooter();
			m.oven();
			m.printer();
			m.projector();
			System.out.println("\t\t\t ******DO YOU WANT TO BUY******");
	System.out.println("1:- yes");
	System.out.println("2:- no");
	int j = sc.nextInt();
	
	switch(j)
	{
	case 1:
	{
		System.out.println("YOU ARE NOT REGISTER ......");
		System.out.println("PLEASE REGISTER ON OUR PORTAL ......");
		Demo1 om= new Demo1();
		om.method();
		System.out.println("\t\t\t ***YOU ARE SUCCESSFULLY REGISTER ON RAPS***");
		System.out.println("\t\t\t 1:- **** LOGIN ***");
		System.out.println(" ********************************************************************");
		System.out.println("\t\t\t 2:- **** EXIT ****");
		int k = sc.nextInt();
		switch(k)
		{
		case 1:
		{
			UserLoginSignIn obj = new UserLoginSignIn();
			obj.signin();
			System.out.println("\t\t\t *** WHAT DO YOU WANT TO BUY***");
			System.out.println("\n");
			System.out.println("\t\t\t *** PLEASE SELECT CORRECT PRODUCT***");
			FinalBuy pm= new FinalBuy();
			pm.method();
			
			
			
			System.out.println("\t\t\t*** DO YOU WANT TO AGAIN BUY ANOTHER PRODUCT");
			System.out.println("1:- yes");
			System.out.println("2:- no");
			int g = sc.nextInt();
			switch(g)
			{
			case 1:
			{
				FinalBuy pm1= new FinalBuy();
			pm1.method();	
			System.out.println("\t\t\t*** DO YOU WANT TO AGAIN BUY ANOTHER PRODUCT");
			System.out.println("1:- yes");
			System.out.println("2:- no");
			int g1 = sc.nextInt();
			switch(g1)
			{
			case 1:
			{
				FinalBuy pm3= new FinalBuy();
			pm1.method();	
			
			System.out.println("\t\t\t*** DO YOU WANT TO AGAIN BUY ANOTHER PRODUCT");
			System.out.println("1:- yes");
			System.out.println("2:- no");
			int g2 = sc.nextInt();
			switch(g2)
			{
			case 1:
			{
				FinalBuy pm2= new FinalBuy();
			pm1.method();	
			
			
			
			
				
			}break;
			case 2:
			{
				System.out.println("\t\t\t ****THANK YOU ****");
			}
			
			
			}	
			}break;
			case 2:
			{
				System.out.println("\t\t\t ****THANK YOU ****");
			}
			
			
			}
				
			}break;
			case 2:
			{
				System.out.println("\t\t\t ****THANK YOU ****");
			}
			
			
			}
			
			
			
			
			
		}break;
		case 2:
		{
			System.out.println("\t\t\t ***THANKS FOR VISITING ***");
		}break;
		}
		
	}
	}
	}
		case 2:
		{
			System.out.println("THANKS FOR VISIT");
			
		}break;
		}

	}public static void main(String[] args) throws SQLException {
		FinalMain on=new FinalMain();
		on.mainMethod();
}
}