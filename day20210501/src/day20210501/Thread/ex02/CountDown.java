package day20210501.Thread.ex02;

public class CountDown extends Thread {
	// CountDown 자체가 쓰레드다.
	// 새로운 쓰레드가 생성되어 일하는 부분은
	// run() 메서드 안에 구현해야 한다.
	@Override
	public void run() { // run이 특별하게 새로운 일꾼을만듬
		printCountDown();
	}
	
	public void printCountDown() {
		for(int i = 10; i > 0; i--) {
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i+"초");
		}
	}
}
