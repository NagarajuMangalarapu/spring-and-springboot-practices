package com.springdemospock

import com.springdemospock.pojo.CItyInfo

import spock.lang.Specification

class CityInfotest extends Specification{
	def "setupSpec"(){
		println "setupspec method once for a class"
	}
	
	def "setup"(){
		println "setup method"
	}
	
	
	def "cityInfo"(){		
		given:
		def cityList = new LinkedList<CItyInfo>();
		
		when:
		cityList.add(new CItyInfo("Hyd",240000))
		cityList.add(new CItyInfo("Scd",230000))
		cityList.add(new CItyInfo("Upl",210000))
		
		then:
		cityList*.cityName == ["Hyd","Scd","Upl"]
		
	}
	
	def "cityInf"(){
		given:
		def cityList = new LinkedList<CItyInfo>();
		
		when:
		cityList.add(new CItyInfo("Hyd",240000))
		cityList.add(new CItyInfo("Scd",230000))
		cityList.add(new CItyInfo("Upl",210000))
		
		then:
		cityList*.population == [240000,230000,210000]
		
	}
	
	def "cleanup"(){
		println "cleanup method"
		
	}
	def "cleanupSpec"(){
		println "cleanupspec method once for a class"
	}
}
