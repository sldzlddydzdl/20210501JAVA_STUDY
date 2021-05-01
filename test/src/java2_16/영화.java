package java2_16;

public class 영화 extends Thread{
	
	boolean stop = true;
	boolean work = true;
	
	@Override
	public void run() {
		
		while(stop) {
			
			if(work) {
				
	
				System.out.println("영화실행");

				
			}
			else {
				Thread.yield();
			}
			
		}
		
		System.out.println(" 영화 종료 ");
		
	}
	
}
