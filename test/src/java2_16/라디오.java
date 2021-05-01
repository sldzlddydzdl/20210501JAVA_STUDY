package java2_16;

public class 라디오 implements Runnable{
	
	boolean stop = true;
	boolean work = true;
	
	@Override
	public void run() {
		
		while(stop) {

			
			if(work) {

				System.out.println("라디오실행");
				
				
			}
			else {
				Thread.yield();
			}
			
		}
		
		System.out.println(" 라디오 종료");
		
	}
}
