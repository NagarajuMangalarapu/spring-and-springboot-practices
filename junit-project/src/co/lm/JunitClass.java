package co.lm;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class JunitClass 
{
	@Test
	public void setUp()
	{
		String str = "Hai Junit";
		assertEquals("Hai Junit",str);
	}
	

}
