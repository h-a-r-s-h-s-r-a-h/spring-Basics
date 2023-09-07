package com.harsh.learningspringframework6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.harsh.learningspringframework6.game.GameRunner;
import com.harsh.learningspringframework6.game.GamingConsole;
import com.harsh.learningspringframework6.game.MarioGame;

@Configuration
public class GamingConfiguration {
	@Bean
	public GamingConsole game() {
		var game = new MarioGame();
		return game;
	}
	@Bean
	public GameRunner gameRunner(GamingConsole game) {
		var gamerunner = new GameRunner(game);
		return gamerunner;
	}

}
