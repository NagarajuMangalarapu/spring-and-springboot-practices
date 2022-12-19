package com.lm.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import com.lm.dao.ILoginDAO;
import com.lm.service.ILoginMgmtService;
import com.lm.service.LoginMgmtService;

public class LoginMgmtServiceTest {
	
	
	private static ILoginMgmtService loginService ;
	private static ILoginDAO loginDAOMock;
	
	@BeforeAll
	public static void setUpOnce()
	{
		//creates the mock/dummy/fake object 
		loginDAOMock = Mockito.mock(ILoginDAO.class);
		//mock(,) generates InMemory class implementing ILoginDAO(I) 
		//having null method definations for authenticate(,) method
	
		//create a service class object
		loginService = new LoginMgmtService(loginDAOMock);
	}
	@AfterAll
	public static void clearOnce()
	{
		loginService = null;
		loginDAOMock = null;
	}
	//test Methods
	@Test
	public void testLginwithValidCredentials()
	{
		//provide stub(temperory  for functionalities) for DAO Methods
		Mockito.when(loginDAOMock.authenticate("sam","mas")).thenReturn(1);
	    //Unit testing
		
		assertTrue(loginService.login("sam","mas"));
	}
	
	
	

}
