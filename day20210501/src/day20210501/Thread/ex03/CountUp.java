package day20210501.Thread.ex03;

public class CountUp implements Runnable{
	// CountUp 은 아직 쓰레드라고 할수 없다.
	
	public void printCountUp() {
		System.out.println(Thread.currentThread());
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
	
	@Override
	public void run() {
		printCountUp();
	}
}
