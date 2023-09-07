package com.harsh.lazyinitialization;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
class ClassA {
	
}

@Component
@Lazy
class ClassB {
	private ClassA classA;
	
	@Autowired
	public ClassB(ClassA classA) {
		System.out.println("Some initialization logic");
		this.classA = classA;
	}
	
	public void doSomething() {
		System.out.println("Do Something");
	}
}

@Configuration
@ComponentScan
public class LazyInitializationApplication {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(LazyInitializationApplication.class)){
			System.out.println("Initialization of context is completed");
			
			//if u remove this("context.getBean(ClassB.class).doSomething()") line of code then nothing will comes in output;;
			//if u remove @Lazy from classB then classB is automatically run after removing "context.getBean(ClassB.class).doSomething()";;
			context.getBean(ClassB.class).doSomething();
		}
	}

}
