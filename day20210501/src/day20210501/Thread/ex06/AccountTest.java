package day20210501.Thread.ex06;

public class AccountTest {
	
	// 두 쓰레드가 동시에 account를 접근하다보니
	// 연산이 겹쳐서 누락되는 상황이 발생한다.!!!
	
	static Account account = new Account();
	
	public static void main(String[] args) {
		User u1 = new User(account, "만수르");
		User u2 = new User(account, "주커버그");
		
//		u1.doSomeThing();
//		u2.doSomeThing();
		
		u1.start();
		u2.start();
		
	}
}
