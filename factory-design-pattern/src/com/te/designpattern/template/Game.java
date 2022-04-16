package com.te.designpattern.template;

public abstract class Game {
	abstract void start();

	abstract void play();

	abstract void end();

	public final void template() {
		System.out.println("Game Execution Template:\n");
		start();
		play();
		end();
	}
}
