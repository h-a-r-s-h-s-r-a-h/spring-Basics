package com.harsh.learningspringframework5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {

	public static void main(String[] args) {
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		var myPerson = context.getBean(Person.class);
		System.out.println(myPerson);
		System.out.println(context.getBean("person3"));
		context.close();
	}

}
