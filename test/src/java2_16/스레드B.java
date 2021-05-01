package java2_16;

public class 스레드B extends Thread{

	
	@Override
	public void run() {
		
		for(int i = 0 ; i < 10; i++) {
			
			System.out.println(getName() + " 실행중");
		}
		
	}
	
}
