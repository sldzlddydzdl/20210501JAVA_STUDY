package java2_16;

public class ��ȭ extends Thread{
	
	boolean stop = true;
	boolean work = true;
	
	@Override
	public void run() {
		
		while(stop) {
			
			if(work) {
				
	
				System.out.println("��ȭ����");

				
			}
			else {
				Thread.yield();
			}
			
		}
		
		System.out.println(" ��ȭ ���� ");
		
	}
	
}
