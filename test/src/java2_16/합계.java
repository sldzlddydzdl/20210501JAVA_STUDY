package java2_16;

public class �հ� extends Thread {

	int sum;
	
	@Override
	public void run() {
		
		for(int i = 1 ; i <= 100; i++) {
			sum += i;
		}
		
	}
	
}
