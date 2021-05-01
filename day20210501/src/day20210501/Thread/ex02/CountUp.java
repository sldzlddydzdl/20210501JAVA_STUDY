package day20210501.Thread.ex02;

public class CountUp extends Thread{
	
	@Override
	public void run() {
		printCountUp();
	}
	
	public void printCountUp() {
		for(int i = 1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i+"s");
		}
	}
}
