package com.harsh.learningspringframework3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name, int age) {};

@Configuration
public class HelloWorldConfiguration {
	
	@Bean
	public String name() {
		return "Harsh Choudhary";
	}
	
	@Bean
	public int age() {
		return 19;
	}
	
	@Bean
	public Person person() {
		var firstPerson = new Person("Ravi",20);
		System.out.println("Person's name and age by ( .name() and .age() method ):- ");
		System.out.println(firstPerson.name());
		System.out.println(firstPerson.age());
		
		return firstPerson;
	}
}
