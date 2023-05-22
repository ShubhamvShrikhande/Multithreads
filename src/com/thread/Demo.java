package com.thread;

public class Demo extends Thread {
	public void run() {
		for (int i = 0; i <= 5; i++) {
			System.out.println(i);
			try {
				Thread.sleep(400);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		Demo demo = new Demo();
		demo.start();
	}

}
