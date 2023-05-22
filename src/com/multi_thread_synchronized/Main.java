package com.multi_thread_synchronized;

public class Main {
	public static void main(String[] args) {

		AccountDetails accountDetails = new AccountDetails();
		Thread thread1 = new Thread(accountDetails);
		Thread thread2 = new Thread(accountDetails);
		thread1.setName("Jeevan");
		thread2.setName("soham");
		thread1.start();
		thread2.start();
	}
}
