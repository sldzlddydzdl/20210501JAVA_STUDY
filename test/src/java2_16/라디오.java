package java2_16;

public class ���� implements Runnable{
	
	boolean stop = true;
	boolean work = true;
	
	@Override
	public void run() {
		
		while(stop) {

			
			if(work) {

				System.out.println("��������");
				
				
			}
			else {
				Thread.yield();
			}
			
		}
		
		System.out.println(" ���� ����");
		
	}
}
