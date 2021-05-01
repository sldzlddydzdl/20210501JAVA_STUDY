package day20210501.Thread.ex02;

public class CountTest {
	public static void main(String[] args) {
		CountDown countDown = new CountDown();
		CountUp countUp = new CountUp();
		
//		countDown.printCountDown();
		countDown.start(); // 새로운 쓰레드를 만들어서
		// run()메서드를 호출해 실항하게 됨.
		//countUp.printCountUp();
		countUp.start();
		System.out.println("종료");
		
		
		
	}
}
