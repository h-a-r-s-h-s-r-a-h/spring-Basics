package com.harsh.learningspringframework3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		var myAge = context.getBean("age");
		var myName = context.getBean("name");
		var person = context.getBean("person");
		
		System.out.println("My name :- "+myName);
		System.out.println("My age :- "+myAge);
		System.out.println("Person's record by return value :- "+person);
		
		context.close();

	}
}
