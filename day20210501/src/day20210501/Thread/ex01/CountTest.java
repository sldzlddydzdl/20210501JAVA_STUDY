package day20210501.Thread.ex01;

public class CountTest {
	public static void main(String[] args) {
//		1~10까지 1초마다 출력하는 코드
		for(int i = 1; i <= 10; i++) {
			try {
				System.out.println(i+"s");
				Thread.sleep(1000); // 1초씩 쉼
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		for(int i = 10; i > 0; i--) {
			try {
				Thread.sleep(1000);
				System.out.println(i+"초");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println("종료");
	}
}
