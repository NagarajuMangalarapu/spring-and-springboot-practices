package com.springdemospock.app;

public class Calculator implements Icalculator{

	@Override
	public int add(int input1, int input2) {	
		return input1+input2;
	}

	@Override
	public int substract(int input1, int input2) {
			return input1-input2;
	}

	@Override
	public int divide(int input1, int input2) {
	return input1/input2;
	}

	@Override
	public int multiply(int input1, int input2) {
		return input1*input2;
	}

}
