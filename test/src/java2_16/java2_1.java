package java2_16;

import java.awt.*;


public class java2_1 {

	// 스레드 ????
		// 코드[명령어] : java 코드 
		// 프로세스[프로그램] : 코드 집합
			// 스레드 : 코드 처리
				// main 메소드 : main 쓰레드 존재 // 단일 작업 // 직렬 작업
	
			// 멀티스레드[ 멀티작업 ] : 병렬 작업
				// 벙렬?????? (컴퓨터는 병렬 모름) : 여러개의 스레드를 하나씩 돌아가면서 코드 처리
					// 누구 먼저 처리?? => CPU 스케줄링 : JAVA에서 우선순위 를 정할수 없다. (정할수 잇는 메소드가 잇긴한데)
															// 일반적으로는 우선순의를 정할수 없다.
															// 따라서 CPU가 알아서 무작위로 일처리순서를 정함
	
			// 스레드 선언방법
				// 1. Thread : 클래스 사용
				// 2. Runnable : 인터페이스 사용
					// 차이 [ 연결 갯수 ] : extends 1개 상속 가능 // implements 여러개 상속 가능 
					// 일반적으로 Runnable 인터페이스를 많이 사용!!
	
			// 스레드 실행방식
				// 1. run 메소드 오버라이딩 [ 멀티스레드에서 실행할 코드 정의 ]
				// 2. start 메소드 : start() 메소드는 run() 메소드를 호출하는 메소드이다.
				
			// 스레드 이름확인 [ 오류 발생시 오류 발생한 스레드의 위치를 찾아야해서 스레드 이름을 확인한다 ]
				// 1. 스레드명.getName()
	
		// 예제6
			// 동기화 : synchronized <- 멀티스레드에서 사용 ( 단일스레드에서는 상식적으로 쓸일이없음 )
				// synchronized : 동시 접근 제한 [ 1개의 스레드씩 처리 ]
					// 자원[메모리] 효율적[동일성] 으로 관리하기 위해서
	
		// 예제7
			// 스레드 대기상태로 돌리기
				// Thread.yield()
	
		// 예제8
			// 해당 스레드의 실행 종료까지 기다리기
					// .join()
	
	public static void main(String[] args) {
		
		/*
		// 예제 1 : 단일 스레드 : 위에서 아래로 코드 순서대로 처리
		System.out.println("단일스레드 실행");
		Toolkit 툴 = Toolkit.getDefaultToolkit();
		
		for(int  i = 0 ; i < 5 ; i++) {
			툴.beep(); // 비프음 발생 
			
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {

			}
					// Thread.sleep( 밀리초 ) : 밀리초동안 일시정지
		}
		
		for(int i = 0 ; i < 5 ; i ++) {
			System.out.println("띵");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
		
			}
		}
	
		// 예제 2 : 멀티 스레드 : 병렬작업 // Runnable : 인터페이스를사용
			System.out.println("멀티스레드 실행");
		Runnable 소리 = new 소리();
		Thread 멀티스레드 = new Thread(소리);
		
		멀티스레드.start();
		
		for(int i = 0 ; i < 5; i++) {
			
			System.out.println("띵");
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {

			}
			
		}
		
		// 예제 3 : 멀티 스레드 : 병렬 작업  // Thread클래스 사용해서 extends
		System.out.println(" 멀티스레드2 실행");
		
		Thread 멀티스레드2 = new 소리2();
		멀티스레드2.start();
		
		for(int i = 0 ; i < 5; i++) {
			System.out.println("띵2");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
		
		*/
		// 예제 4 : 스레드 이름
		
		
		// 과제1 
		
		/*
			// 스레드 클래스 선언 , 실행
		Thread thread = new 뮤직스레드();
		thread.start();
	
			
			// Runnable 인터페이스 선언 , 실행
		Runnable 음 = new 음악스레드();
		Thread 스레드 = new Thread(음);
		스레드.start();
		
		Thread thread3 = new Thread(new 음악스레드());
		thread3.start();
		
		Runnable runnable2 = new  Runnable() {
			public void run() {
			
				for(int i = 0 ; i < 3; i++) {
					System.out.println("스레드4실행");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
					}
				}
			}
		};
		
		Thread thread4 = new Thread(runnable2);
		thread4.start();
		
		System.out.println(" ===== main 끝 ==== ");
		*/
		
		
		
		// 예제 5 : 스레드 우선순위
			// 일처리순서 : cpu 스케줄링 이 정한다. 우리가 정하는게 아니다.
		
		/*
		for(int i = 0 ; i < 10; i++) {
			
			Thread thread = new 작업스레드();
		
			// 우리가 임의로 우선순이를 정할수도있다.
			// Thread.MIN_PRIORITY => 스레드를 최우선으로 실행
			// Thread.MAX_PRIORITY => 스레드를 최후로 실행
			if( i != 9) {
				thread.setPriority(Thread.MIN_PRIORITY);
			}
			else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			
			thread.start();
			
			
		}
		
		
		// 예제 6 : 동기화 ???
			// synchronized (중요!!) : 한개의 스레드만 접근 가능한 메소드
							// 하나의 스레드가 끝날때까지 다음 스레드는 기달리게해서 다른스레드가 접근못하게함
		
		
		통장 통장 = new 통장();
		
		유저1 유저1 = new 유저1();
		유저1.set통장(통장);
		유저1.start();
		
		유저2 유저2 = new 유저2();
		유저2.set통장(통장);
		유저2.start();
		
		*/
		
		// 예제 7 : 양보 [ 양보보다는 실제로 스레드를 대기상태로 돌리기 ] : Thread.yield()
		
		/*
		스레드C 스레드C = new 스레드C();
		스레드D 스레드D = new 스레드D();
		
		스레드C.start();
		스레드D.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		스레드C.work = false;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		
		스레드C.work = true;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {

		}
		
		스레드C.stop = true;
		스레드D.stop = true;
		*/
		
		
		// 예제 8 : 종료 기다림
			// 다른 스레드 실행되기전에 main 끝나므로 
			// Thread를 상속받은 합계에 join을 호출하면 main스레드를 일시정지한다
		
		/*
		합계 합계 = new 합계();
		합계.start();
		
		try {
			합계.join(); // main 스레드 일시정지 
						// 합계 스레드가 끝날때 까지 기달려준다
						// 일시정지의 개념도 맞지만 main + 합계스레드 = 두개다 실행후 다음 넘어간다는 뜻이다.
						// 그래서 함수의 이름이 join() 이다.
		} catch (InterruptedException e) {

		}
		
		System.out.println("1 ~ 100 까지 의 합 : " + 합계.sum);
		*/
		
		/*
		Runnable 라디오 = new 라디오();
		Thread thread1 =  new Thread(라디오);
		영화 영화 = new 영화();
		*/
		
		라디오 라디오 = new 라디오();
		Runnable runnable = new 라디오();
		Thread thread =  new Thread( runnable );
		
		
		영화 thread2 = new 영화();
		
		thread.start();
		thread2.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
	
		라디오.work = false;
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		라디오.work = true;
		thread2.stop = false;
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
		}
		
		thread.stop(); // 스레드 종료 : 권장x => 메모리가 안날라간다
		
		
		thread2.stop = false;
		
		System.out.println("main 종료");
		
		/*
		try {
			Thread.sleep(6000);
		} catch (InterruptedException e) {
		}
		
		thread2.start();
		thread2.stop = false;
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
		
		
}
