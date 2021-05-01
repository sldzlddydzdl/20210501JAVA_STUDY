package java2_16;

public class 작업스레드 extends Thread{
	
	@Override
	public void run() {
		
		for(int i = 0 ; i < 20000000; i++) {
			
		}
		
		System.out.println("스레드 끝 : " + getName());
		
	}

}
