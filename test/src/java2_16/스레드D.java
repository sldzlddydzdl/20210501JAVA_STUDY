package java2_16;

public class ������D extends Thread {

	boolean stop = false;
	boolean work = true;
	
	
	@Override
	public void run() {
		
		while( !stop ) {
			
			if( work ) {
			
				System.out.println("������D �۾���");
			
			}
			else {
				
				Thread.yield(); // �ٸ� �����忡�� �纸 
				
			}
		}
		
		System.out.println("������D ����");
		
	}
	
}
