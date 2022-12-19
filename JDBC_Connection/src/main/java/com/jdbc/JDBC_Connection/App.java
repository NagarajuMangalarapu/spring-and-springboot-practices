package com.jdbc.JDBC_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class App 
{
    public static void main( String[] args )
    {
      try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "nagaraju", "LMlp0142#");
		  System.out.println("Connection Established...");
	
	} catch (Exception e) {
		
		e.printStackTrace();
	}
  
    
}
}
