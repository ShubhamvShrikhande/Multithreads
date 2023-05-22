package com.runable_thread;

public class Demo implements Runnable {
	public static void main(String[] args) {
		Demo demo = new Demo();
		Thread t = new Thread(demo);
		t.start();
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
		}
	}

}
