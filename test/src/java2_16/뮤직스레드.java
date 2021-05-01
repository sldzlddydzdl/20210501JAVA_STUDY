package java2_16;

public class 뮤직스레드 extends Thread {

	public 뮤직스레드() {
		setName("뮤직스레드");
	}
	
	@Override
	public void run() {

		for(int i = 0 ; i< 3; i++) {
			System.out.println("뮤직실행 [ 쓰레드 이름 : " + Thread.currentThread().getName() + "]");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
	}
	
}
