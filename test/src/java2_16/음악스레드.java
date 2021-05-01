package java2_16;

public class 음악스레드 implements Runnable{

	/*
	public 음악스레드() {
		setName("무비스레드");
	}
	*/
	
	@Override
	public void run() {
		
		for(int i = 0 ; i< 3; i++) {
			System.out.println("무비실행 [ 쓰레드 이름 : " + Thread.currentThread().getName() + "]");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
	
}
