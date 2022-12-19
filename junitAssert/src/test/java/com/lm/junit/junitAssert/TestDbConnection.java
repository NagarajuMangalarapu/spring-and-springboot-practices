package com.lm.junit.junitAssert;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.lm.db.Dbconnection;

public class TestDbConnection {
	
	@Test
	public void testGetCon()
	{
		Dbconnection dbc = new Dbconnection();
		Connection con = dbc.getCon();
		System.out.println();
		//Expected con is not a null
		assertNotNull(con);
	}

}
