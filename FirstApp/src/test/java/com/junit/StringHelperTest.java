package com.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	@Test
	public void test() {
		assertEquals("nagaraju", "nagaraju");
	}

}
//expected:<[NAGARAJU]> but was:<[nagaraju]>
