package com.harsh.learningspringframework7.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SuperContraGame implements GamingConsole {
	public void up() {
		System.out.println("Shoot Up");
	}
	public void down() {
		System.out.println("Shoot Down");
	}
	public void left() {
		System.out.println("Shoot Left");
	}
	public void right() {
		System.out.println("Shoot Right");
	}
}
