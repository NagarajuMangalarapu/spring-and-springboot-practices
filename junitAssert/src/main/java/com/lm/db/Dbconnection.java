package com.lm.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnection 
{
	public Connection getCon()
	{
		Connection con=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","nagaraju","LMlp0142#");
		} catch (Exception e)
		{
			e.printStackTrace();
		}
return con;
	}

}
