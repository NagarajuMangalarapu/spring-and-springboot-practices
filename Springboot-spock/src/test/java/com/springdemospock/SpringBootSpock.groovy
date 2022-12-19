package com.springdemospock

import spock.lang.Specification

class SpringBootSpock extends Specification{


	def "validateStringConcatenation"(){

		given:
		def string1="Hello"
			def string2 = "world"

		when:
		def concatenation=string1.concat(string2)
		
		then:
		concatenation=="Helloworld"
		
	}
	def "CityTest"()
	{
		given:
		def city
	}
}
