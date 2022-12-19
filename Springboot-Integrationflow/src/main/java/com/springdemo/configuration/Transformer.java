package com.springdemo.configuration;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.springframework.stereotype.Component;

@Component
public class Transformer {

	public String transform(String filepath) throws IOException
	{
		System.out.println("In transformer");
		String file = new String(Files.readAllBytes(Paths.get(filepath)));
		System.out.println(""+file);
		return file+" Integration flow is success";
		
	}
}
