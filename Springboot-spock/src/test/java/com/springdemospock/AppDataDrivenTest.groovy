package com.springdemospock

import com.springdemospock.app.Calculator
import spock.lang.Specification

class AppDataDrivenTest extends Specification{
	
	
	def "calculator test"(){
		given:
		def app = new Calculator();
		
		when:
		def result = app.add(input1,input2)
		//def result1 = app.divide(input1,input2)
		
		then:
		result == expectedoutput
		//result1 == expectedoutput
		
		
		where:
		//data-driven testing
//		input1|input2|expectedoutput
//		21|10|31
//		10|10|20
		
		input1<<[10,30]
		input2<<[31,45]
		expectedoutput<<[41,75]
		
	}
}
