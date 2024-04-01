package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Employee65 
{
     public static void main(String[] args) 
     {
	   try
	   {
		 //  Class.forName("oracle.jdbc.driver.OracleDriver");
		   Scanner sc=new Scanner(System.in);
		   System.out.println("Enter the Employee65 id");
		   String eId=sc.nextLine();
		   System.out.println("Enter the Employee65 Name");
		   String eName=sc.nextLine();
		   System.out.println("Enter the Employee65 Depatement");
		   String edesg=sc.nextLine();
		   System.out.println("Enter the Employee65 Basic salary");
		   float Bsal=sc.nextFloat();
		   float Tsal=Bsal+(0.63f*Bsal)+(0.93f*Bsal);
		//   Connection con=DriverManager.getConnection
		//			  ("jdbc:oracle:thin:@localhost:1521:orcl","system","abc");
		   
		   Connection con=DriverManager.getConnection
					  ("jdbc:oracle:thin:@localhost:1521:orcl","system","abc");       
		   
		   PreparedStatement ps=con.prepareStatement
				   ("insert into Employee65 values(?,?,?,?,?)");// it is not Query Compilation
		   ps.setString(1,eId);
		   ps.setString(2, eName);
		   ps.setString(3, edesg);
		   ps.setFloat(4, Bsal);
		   ps.setFloat(5,Tsal);
		   int k=ps.executeUpdate();
		   if(k>0)
		   {
			    System.out.println("Employee65 data is Update successfully...");
			    
		   }
		  
		  // sc.close(); 
	   }catch(Exception e) {e.printStackTrace();}
	}
}
 