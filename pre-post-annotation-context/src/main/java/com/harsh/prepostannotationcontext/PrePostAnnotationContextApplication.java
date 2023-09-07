package com.harsh.prepostannotationcontext;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass{
	private SomeDepedency someDepedency;

	public SomeClass(SomeDepedency someDepedency) {
		super();
		this.someDepedency = someDepedency;
		System.out.println("All dependencies are ready!! ");
	}
	
	@PostConstruct
	public void initialize() {
		someDepedency.getReady();
	}
	
	@PreDestroy
	public void cleanup() {
		System.out.println("clean up");
	}
	
}

@Component
class SomeDepedency{
	public void getReady() {
		System.out.println("Some logic using SomeDepedency");
		
	}
	
}

@Configuration
@ComponentScan
public class PrePostAnnotationContextApplication {

	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(PrePostAnnotationContextApplication.class)){
			Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
		}
	}
}
