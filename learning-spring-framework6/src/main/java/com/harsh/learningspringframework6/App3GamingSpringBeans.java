package com.harsh.learningspringframework6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.harsh.learningspringframework6.game.GameRunner;
import com.harsh.learningspringframework6.game.GamingConsole;

public class App3GamingSpringBeans {
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingConfiguration.class)){
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
			
		}
	}
}
