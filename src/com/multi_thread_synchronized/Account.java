package com.multi_thread_synchronized;

public class Account {
	private int balance=5000;

	public int getBalance() {
		return balance;
	}

	public int withdraw(int amount) {
		balance= balance-amount;
		return balance;
	}
}
