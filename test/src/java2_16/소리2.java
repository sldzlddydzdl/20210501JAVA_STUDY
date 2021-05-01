package java2_16;

import java.awt.Toolkit;

public class 소리2 extends Thread {
	
	@Override
	public void run() {
		
		Toolkit 툴 = Toolkit.getDefaultToolkit();
		
		for(int i = 0 ; i < 5; i ++) {
			툴.beep();
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
		
		
	}

}
