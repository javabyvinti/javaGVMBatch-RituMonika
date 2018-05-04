package com.bmpl.multithreading;

// inherit Thread class

public class CreateThread extends Thread{

	@Override
	public void run(){	// Runnable --> Running state
		System.out.println("Thread is running..." + Thread.currentThread().getName());
	}
	
	public static void main(String[] args) {
		
		// Thread-0
		CreateThread t1 = new CreateThread(); // a new thread is created --> new state
		t1.start(); // new state --> runnable state
		
		//Thread-1
		CreateThread t2 = new CreateThread(); // a new thread is created --> new state
		t2.start(); // new state --> runnable state
		
		//Thread-2
		CreateThread t3 = new CreateThread(); // a new thread is created --> new state
		t3.start(); // new state --> runnable state
		
		//step-1: New State --> new thread created
		// classname threadname = new classcons();
		
		// step-2: move thread from new to runnable state -->
		// call the predefined start method
	}

}
