package java2_16;

public class 스레드이름 {
	
	public static void main(String[] args) {
							// main 메소드 : 하나의 main 스레드 존재
		
		Thread thread = Thread.currentThread(); // 현재스레드 갖고오는거
		
		System.out.println(" 현재 main 메소드내 스레드 이름 : " + thread.getName());
			
		스레드A 스레드a = new 스레드A();
		System.out.println(" 곧 실행될 스레드 : " + 스레드a.getName());
		스레드a.start();
		
		스레드B 스레드b = new 스레드B();
		System.out.println(" 곧 실행될 스레드 : " + 스레드b.getName());
		스레드b.start();
		
	
		
		
	}

}
