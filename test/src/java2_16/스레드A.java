package java2_16;

public class 스레드A extends Thread {

	
	public 스레드A() { 
		setName("스레드A"); // 이름안지어주면 thread - 0 으로 들어감
	}
	
	
	@Override
	public void run() {
		
		for(int i = 0 ; i < 10; i++) {
			
			System.out.println(getName() + " 실행중");
		}
		
	}
	
}
