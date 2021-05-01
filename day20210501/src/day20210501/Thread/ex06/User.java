package day20210501.Thread.ex06;

public class User extends Thread{
	private Account account;
	private String name;
	public User(Account account, String name) {
		this.account = account;
		this.name = name;
	}
	
	public void doSomeThing() {
		for(int i = 0 ; i < 100 ; i++) {
			// 10만원 입금
			account.deposit(100000);
			
			try {
				Thread.sleep(5);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			// 10만원 출금
			account.withdraw(100000);
			
			// 계좌 조회
			System.out.println(name+"의 잔금 : " + account.getBalance());
			
		}
	}
	
	@Override
	public void run() {
		doSomeThing();
	}
	
}
