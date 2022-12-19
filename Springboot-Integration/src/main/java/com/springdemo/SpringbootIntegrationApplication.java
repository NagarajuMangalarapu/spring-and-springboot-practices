package com.springdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.springdemo.marshal.AccountJAXB;

@SpringBootApplication
public class SpringbootIntegrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootIntegrationApplication.class, args);
//		AccountJAXB.Marshaller();
//	AccountJAXB.Unmarshaller();

		
	}
  
}
