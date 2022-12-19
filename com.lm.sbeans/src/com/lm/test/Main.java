package com.lm.test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException
	{
	Class c1 = null;
	//Load the class
	c1 = Class.forName(args[0]); 
	//get access to all constructor of loaded class
	Constructor cons[] = c1.getDeclaredConstructors();
	//instantiate the class using the 2-parameter constructor
	Object obj1 = cons[1].newInstance(10,21);
	System.out.println(obj1);
	System.out.println(obj1.toString());
	}

}
