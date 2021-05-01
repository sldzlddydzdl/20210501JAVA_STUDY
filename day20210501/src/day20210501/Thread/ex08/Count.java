package day20210501.Thread.ex08;

public class Count extends Thread{
	
	@Override
	public void run() {
		while(true) {
			System.out.println("하이");
			try {
				sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
