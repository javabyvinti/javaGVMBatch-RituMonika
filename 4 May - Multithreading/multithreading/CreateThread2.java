package com.bmpl.multithreading;

public class CreateThread2 implements Runnable{

	// Runnable interface
	public static void main(String[] args) {
		
		//System.out.println(args[0]);
		
		CreateThread2 t1 = new CreateThread2();
		Thread thread1 = new Thread(t1);
		thread1.setName("t1");
		thread1.start();
		System.out.println(thread1.getPriority());

		CreateThread2 t2 = new CreateThread2();
		Thread thread2 = new Thread(t2);
		thread2.setName("t2");
		thread2.setPriority(3);
		thread2.start();
		System.out.println(thread2.getPriority());
		
		System.out.println("Normal Priority = " +Thread.NORM_PRIORITY);
		System.out.println("Max Priority = " +Thread.MAX_PRIORITY);
		System.out.println("Min Priority = " +Thread.MIN_PRIORITY);
		
		CreateThread2 t3 = new CreateThread2();
		Thread thread3 = new Thread(t3);
		thread3.setName("t3");
		thread3.start();
		System.out.println(thread3.getPriority());
	}

	@Override
	public void run() {
		System.out.println("Thread is Running..." + Thread.currentThread().getName());
		
	}

	// 1-10
	
}
