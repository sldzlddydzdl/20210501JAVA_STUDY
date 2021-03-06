package day20210501.Thread.ex06;

public class Account {
	
	private int balance;
	
	// 예금
	public synchronized void deposit(int amount) {
		balance += amount;
	}

	// 출금
	// synchronized 쓰레드가 하나씩만 접근 가능하도록 동기화한다.
	public synchronized void withdraw(int amount) {
		balance -= amount;
	}
	
	// 예금값 반환
	public int getBalance() {
		return balance;
	}
}
