package java2_16;

public class ������C extends Thread{

	boolean stop = false;
	boolean work = true;
	
	
	@Override
	public void run() {
		
		while( !stop ) {
			
			if( work ) {
			
				System.out.println("������C �۾���");
			
			}
			else {
				
				Thread.yield(); // �ٸ� �����忡�� �纸 
				
			}
		}
		
		System.out.println("������C ����");
		
	}
	
}
