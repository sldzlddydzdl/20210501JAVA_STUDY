package day20210501.Thread.ex05;

public class Account {
	
	private int balance;
	
	// 예금
	public void deposit(int amount) {
		balance += amount;
	}

	// 출금
	public void withdraw(int amount) {
		balance -= amount;
	}
	
	// 예금값 반환
	public int getBalance() {
		return balance;
	}
}
