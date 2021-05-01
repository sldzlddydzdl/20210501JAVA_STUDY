package day20210501.Thread.ex03;

public class RaceTest {
	public static void main(String[] args) {
		
		Thread t1 = new Thread(new Horse("1번"));
		Thread t2 = new Thread(new Horse("2번"));
		Thread t3 = new Thread(new Horse("3번"));
		Thread t4 = new Thread(new Horse("4번"));
		Thread t5 = new Thread(new Horse("5번"));
		
		System.out.println("땅!******************");
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		
		
	
	}
}
