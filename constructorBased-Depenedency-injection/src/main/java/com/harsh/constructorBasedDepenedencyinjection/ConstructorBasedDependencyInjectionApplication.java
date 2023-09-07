package com.harsh.constructorBasedDepenedencyinjection;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
class YourBusinessClass{
	
	Dependency1 dependency1;
	Dependency2 dependency2;
	
	// @Autowired is not necessary in Constructor based dependency injection;;
	
	@Autowired
	public YourBusinessClass(Dependency1 dependency1,Dependency2 dependency2) {
		super();
		System.out.println("Constructor Injection - YourBusinessClass ");
		this.dependency1 = dependency1;
		this.dependency2 = dependency2;
	}
	

	public String toString() {
		return "Using " + dependency1 +" and " + dependency2;
	}
	
}

@Component
class Dependency1{
	
}

@Component
class Dependency2{
	
}


@Configuration
@ComponentScan
public class ConstructorBasedDependencyInjectionApplication {
	
	

	public static void main(String[] args) {
		
		try(var context = new AnnotationConfigApplicationContext(ConstructorBasedDependencyInjectionApplication.class)){
			
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
			
			System.out.println(context.getBean(YourBusinessClass.class));
		}
	}

}
