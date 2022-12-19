package com.lm.test;

import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.mockito.Spy;

public class MockvsSpyTest {
	
	@Spy
	private ArrayList<String> spylist;
	@Test
	public void listtest()
	{
		List<String> mocklist = Mockito.mock(ArrayList.class);
List<String> sublist =Mockito.spy(ArrayList.class);
		List<String> list = new ArrayList<String>();
	// = Mockito.spy(new ArrayList<String>());
	sublist.add("hey");
		//spylist = new ArrayList<String>();
//		 when(spylist.get(0)).thenReturn("foo");

		   //You have to use doReturn() for stubbing
		//   doReturn("foo").when(spylist).get(0);
		mocklist.add("sam");
		mocklist.add("maya");
		list.add("hey");
	//spylist.add("Myth");
	System.out.println(mocklist.size()+" "+list.size()+" ");//+spylist.size());
	System.out.println(list.get(0));
	//spylist.get(0);
	System.out.println(sublist.size());
	System.out.println(sublist.get(0));
	}

}
