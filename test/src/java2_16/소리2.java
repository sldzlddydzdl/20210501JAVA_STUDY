package java2_16;

import java.awt.Toolkit;

public class �Ҹ�2 extends Thread {
	
	@Override
	public void run() {
		
		Toolkit �� = Toolkit.getDefaultToolkit();
		
		for(int i = 0 ; i < 5; i ++) {
			��.beep();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
		
		
	}

}
