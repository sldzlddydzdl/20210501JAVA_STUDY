package day20210501.Thread.ex08;

public class Test {
	public static void main(String[] args) {
		Count c = new Count();
		c.setDaemon(true);
		c.start();

		try {
			Thread.sleep(5000);
			System.out.println("종료");
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
