package com.raps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLNonTransientConnectionException;
import java.util.Scanner;

public class RapsP {

	public void method() throws ClassNotFoundException, SQLException  {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/raps","root","Anil@1994");
			PreparedStatement statement = connection.prepareStatement("insert into custemerData (ProductId ,NameProduct,Desciption,Price ,Quantity)"+"values(?,?,?,?,?)");
			statement.setString(1, "1005");
			statement.setString(2, "camera-sony");
			statement.setString(3, "SONY ILCE-6100Y/B IN5 Mirrorless Camera with 16-50 mm & 55-210 mm Zoom Lenses  (Black)");
			statement.setString(4, "100000");
			statement.setString(5, "10");
			statement.execute();
			statement.setString(1, "2045");
			statement.setString(2, "Microwave Oven-SAMSUNG");
			statement.setString(3, "SAMSUNG 23 L Solo Microwave Oven  (MS23A301TAK, Black)");
			statement.setString(4, "10000");
			statement.setString(5, "10");
			statement.execute();
			statement.setString(1, "3015");
			statement.setString(2, "realme Narzo 20");
			statement.setString(3, "(Glory Silver, 128 GB)  (4 GB RAM),battery-6000mah,octa core,gorila screen,display-6.5 inch");
			statement.setString(4, "25000");
			statement.setString(5, "10");
			statement.execute();
			statement.setString(1, "245");
			statement.setString(2, "wash-in machine");
			statement.setString(3, "(Whirlpool 7 kg with Hard Water Wash Fully Automatic Top Load Grey  (WM Royal 7.0 GENX Grey 5YMW)");
			statement.setString(4, "20000");
			statement.setString(5, "10");
			statement.execute();
			statement.setString(1, "1455");
			statement.setString(2, "Refrigerator");
			statement.setString(3, "SAMSUNG244 L Frost Free Double Door 3 Star Refrigerator with Curd Maestro  (Elegant Inox, RT28T3523S8/HL)");
			statement.setString(4, "27000");
			statement.setString(5, "10");
			statement.execute();
			statement.setString(1, "1244");
			statement.setString(2, "Home-Theater");
			statement.setString(3, "Wrapadore 10W Bluetooth YST Speaker Laptop/Desktop Speaker Compatible With All SmartPhones 10 W Bluetooth Home Theatre  (Black, 5.1 Channel)");
			statement.setString(4, "12000");
			statement.setString(5, "10");
			statement.execute();
			statement.setString(1, "1977");
			statement.setString(2, "Printer-HP");
			statement.setString(3, "HP 315 Multi-function Color Printer (Color Page Cost: 20 Paise | Black Page Cost: 10 Paise)  (Black, Ink Tank)");
			statement.setString(4, "10000");
			statement.setString(5, "10");
			statement.execute();
			statement.setString(1, "1911");
			statement.setString(2, "Projector-Egate");
			statement.setString(3, "Egate K9 Pro-Max Android Full HD| 4K Support | Android 9.0 |4D Keystone | Home Cinema (5400 lm / 1 Speaker / Wireless / Remote Controller) Portable Projector  (White)");
			statement.setString(4, "20000");
			statement.setString(5, "10");
			statement.execute();
			statement.setString(1, "1788");
			statement.setString(2, "Laptop");
			statement.setString(3, "ASUS Vivobook 15 Core i5 11th Gen - (8 GB/1 TB HDD/256 GB SSD/Windows 10 Home/2 GB Graphics) X515EP-BQ512TS Thin and Light Laptop  (15.6 inch, Transparent Silver, With MS Office");
			statement.setString(4, "45000");
			statement.setString(5, "10");
			statement.execute();
			statement.setString(1, "1633");
			statement.setString(2, "HeadPhone");
			statement.setString(3, "boAt Rockerz 450 Pro with Upto 70 Hours Playback Bluetooth Headset  (Luscious Black, On the Ear)");
			statement.setString(4, "1999");
			statement.setString(5, "10");
	
			statement.execute();
			connection.close();
			statement.close();
			
			System.out.println("done.....");
		
	
		}catch (SQLNonTransientConnectionException e) {
			
			e.printStackTrace();
		}
	
	}

public static void main(String[] args) throws SQLException, Exception
{
	RapsP obj= new RapsP();
	obj.method();
	
	}
}