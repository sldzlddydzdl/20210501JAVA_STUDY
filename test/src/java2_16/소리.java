package java2_16;

import java.awt.Toolkit;

public class �Ҹ� implements Runnable {
				// �������̽� ����
	
	// ctrl + �����̽���
	@Override // �������̵� : ���[����]�� Ŭ����[�������̽�] �� �޼ҵ带 �ٽ� ����
	public void run() {
		
		Toolkit �� = Toolkit.getDefaultToolkit();
		for( int i  = 0 ; i < 5; i++) {
			
			��.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			
		}
		
	}
	
	
}
