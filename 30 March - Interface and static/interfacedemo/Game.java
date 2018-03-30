package com.bmpl.interfacedemo;

// 100 % abstract

public interface Game extends ScoreBoard {

	public static final int MAXLIFE =5;
	public static final int MINLIFE = 1;
	
	void idle();	// public abstract
	
	void jump();
	
	void attack();
	
	int score();
	
}
