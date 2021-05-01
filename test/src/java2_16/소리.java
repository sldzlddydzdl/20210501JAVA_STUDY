package java2_16;

import java.awt.Toolkit;

public class 소리 implements Runnable {
				// 인터페이스 연결
	
	// ctrl + 스페이스바
	@Override // 오버라이딩 : 상속[연결]된 클래스[인터페이스] 내 메소드를 다시 정의
	public void run() {
		
		Toolkit 툴 = Toolkit.getDefaultToolkit();
		for( int i  = 0 ; i < 5; i++) {
			
			툴.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				
			}
			
		}
		
	}
	
	
}
