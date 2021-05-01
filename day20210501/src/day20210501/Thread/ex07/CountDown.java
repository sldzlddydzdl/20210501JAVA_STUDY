package day20210501.Thread.ex07;

public class CountDown implements Runnable{
	// 인터페이스는 항상 구현을 강요함
	
	public void printCountDown() {
		System.out.println(Thread.currentThread());
		for(int i = 1000; i > 0; i--) {
			System.out.println(i+"초");
		}
	}

	@Override
	public void run() { // Runnable 안에 정의된 메서드
		// 쓰레드로 실행할 내용을 작성
		printCountDown();		
	}
	
	
}
