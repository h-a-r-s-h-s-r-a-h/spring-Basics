package com.harsh.learningspringframework2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppHelloWorldSpring {

	public static void main(String[] args) {
		// 1:: Launch a Spring Context;;
		
		var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		
		// 2:: Configure the things we want to manage;;;
		
		// 3:: Retrieving Beans managed by Spring;;
		
		var my = context.getBean("name");
		
		System.out.println(my);
		context.close();
	}
}
