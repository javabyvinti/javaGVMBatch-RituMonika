package com.bmpl.interfacedemo;

// implements

// class --> class --> extends
// class --> interface --> implements
// interface --> interface --> extends

abstract public class InterfaceDemo1 implements Game{

	public static void main(String[] args) {
		
	}


	@Override
	public void jump() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void attack() {
		int remainingLife = MAXLIFE;
		remainingLife--;
	}

	@Override
	public int score() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int score(int value) {
		// TODO Auto-generated method stub
		return 0;
	}

}
