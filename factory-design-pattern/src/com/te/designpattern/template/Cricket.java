package com.te.designpattern.template;

public class Cricket extends Game {

	@Override
	void start() {
		System.out.println("Cricket Game Started...\n");

	}

	@Override
	void play() {
		System.out.println("Cricket Game Playing...\n");

	}

	@Override
	void end() {
		System.out.println("Cricket Game Ended...\n");

	}

}
