package java2_16;

public class ���������� extends Thread {

	public ����������() {
		setName("����������");
	}
	
	@Override
	public void run() {

		for(int i = 0 ; i< 3; i++) {
			System.out.println("�������� [ ������ �̸� : " + Thread.currentThread().getName() + "]");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
		}
		
	}
	
}
