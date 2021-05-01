package java2_16;

public class 스레드D extends Thread {

	boolean stop = false;
	boolean work = true;
	
	
	@Override
	public void run() {
		
		while( !stop ) {
			
			if( work ) {
			
				System.out.println("스레드D 작업중");
			
			}
			else {
				
				Thread.yield(); // 다른 스레드에게 양보 
				
			}
		}
		
		System.out.println("스레드D 종료");
		
	}
	
}
