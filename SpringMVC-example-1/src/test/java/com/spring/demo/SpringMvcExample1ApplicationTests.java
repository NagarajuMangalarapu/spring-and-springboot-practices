package com.spring.demo;


import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.RequestBuilder;


@SpringBootTest
@AutoConfigureMockMvc
//@WebMvcTest()
class SpringMvcExample1ApplicationTests {

	@Autowired
	private MockMvc mock;
	
	@Test
	void contextLoads() {
	}
		
	@Test
	public void shouldReturnDefaultMessage() throws Exception {
		RequestBuilder request = MockMvcRequestBuilders.get("/").accept(MediaType.APPLICATION_JSON);
		
		this.mock.perform(request).andExpectAll(status().isOk());//.andExpect(content().string(containsString("Hello, World")));

//andDo(print()).andExpect(status().isOk())
//				.andExpect(content().string(containsString("Hello, World")));
//		
		
		
	}
}
	


