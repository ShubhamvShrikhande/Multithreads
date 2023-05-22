package com.multi_thread;

public class Demo extends Thread {
	public void run() {
		for (int i = 1; i <= 6; i++) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
 
		}
	}

	public static void main(String[] args) {
		Demo demo1 = new Demo();
		Demo demo2 = new Demo();
		demo1.start();
		demo2.start();

	}

}
