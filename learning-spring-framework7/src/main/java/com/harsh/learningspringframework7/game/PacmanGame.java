package com.harsh.learningspringframework7.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("PacmanGameQualifier")
public class PacmanGame implements GamingConsole{
	public void up() {
		System.out.println("pacman up");
	}
	public void down() {
		System.out.println("pacman down");
	}
	public void left() {
		System.out.println("pacman left");
	}
	public void right() {
		System.out.println("pacman right");
	}
}
