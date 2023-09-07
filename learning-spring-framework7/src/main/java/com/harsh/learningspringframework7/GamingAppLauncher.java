package com.harsh.learningspringframework7;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.harsh.learningspringframework7.game.GameRunner;
import com.harsh.learningspringframework7.game.GamingConsole;
import com.harsh.learningspringframework7.game.MarioGame;

@Configuration
@ComponentScan("com.harsh.learningspringframework7.game")
public class GamingAppLauncher {
	
	public static void main(String[] args) {
		try(var context = new AnnotationConfigApplicationContext(GamingAppLauncher.class)){
			context.getBean(GamingConsole.class).up();
			
			context.getBean(MarioGame.class).up();
			
			context.getBean(GameRunner.class).run();
			
		}
	}
}
