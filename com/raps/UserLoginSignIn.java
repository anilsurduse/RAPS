package com.raps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class UserLoginSignIn {
	
	
	public void signin()
	{Scanner sc = new Scanner(System.in);
		try {
			
			 {
            System.out.println("Enter username : ");
            String line = sc.nextLine();
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps", "root", "Anil@1994");
            Statement myStmt = con.createStatement();
            String sql ="SELECT * FROM logindata WHERE Username='"+line+"'";
             ResultSet rs = myStmt.executeQuery(sql);
            if(rs.next())
            {
            	
            	 {
            			System.out.println("enter your password");
            	String line2 = sc.nextLine();
            	String sql2 ="SELECT * FROM logindata WHERE PassWord='"+line2+"'";
                ResultSet rs1 = myStmt.executeQuery(sql2);
                if(rs1.next())
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
        			
        			
        			
        			
                }else
                {
                	System.out.println("please enter correct password");
                	
                	
                	
                }
            	
            	
            	}
            	}else
            {
            	System.out.println("please enter correct username");
        	
          
          
            }
			 }
 
            } catch (Exception exc) {
                exc.printStackTrace();
           
            }
        }
	
			
}
			
			
			
			
			
			
			
			
			
			
			
			
			
