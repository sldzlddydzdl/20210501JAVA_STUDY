package day20210501.Thread.ex03;

import java.util.*;

public class CountTest {
	public static void main(String[] args) {
		Runnable countDown = new CountDown();
		Thread t1 = new Thread(countDown);
		t1.start();
		
		Thread t2 = new Thread(new CountUp());
		t2.start();
		
		System.out.println(Thread.currentThread() + "종료");
	}
}
