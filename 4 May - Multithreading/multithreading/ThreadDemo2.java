package com.bmpl.multithreading;

public class ThreadDemo2 extends Thread{

	// new --> runnable --> running --> destroy
	// new --> runnable --> running --> terminate --> runnable --> running
	@Override
	public void run(){
		
		for(int i = 0; i<=10; i++){
			try {
				System.out.println("Thread Running..." + i);
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
	}
	
	public static void main(String[] args) {
	
		ThreadDemo2 t1 = new ThreadDemo2();
		t1.start();
		

	}
}
