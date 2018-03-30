package com.bmpl.interfacedemo;

// java --> 1.7 --> all interfaces are 100% abstract
// java --> 1.8 --> all interfaces are not 100% abstract

public interface ScoreBoard {

	public static final int value = 90;
	
	public abstract int score(int value);
	
}
