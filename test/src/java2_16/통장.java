package java2_16;

public class ���� {

	int �ݾ�;
	
	public int get�ݾ�() {
		return this.�ݾ�;
	}
	
	public synchronized void set�ݾ�(int �ݾ�) {
		
		this.�ݾ� = �ݾ�;
		//(���� Ŭ������ ����) = �μ��� ���� ����
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
		}
		
		System.out.println(Thread.currentThread().getName() + " : " + this.�ݾ�);
		
		
	
	}
	
}
