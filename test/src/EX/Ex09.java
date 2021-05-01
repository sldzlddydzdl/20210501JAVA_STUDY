package EX;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
//		
//		int a = 0;
//		while(a < 5) {
//			System.out.println("안녕하세요" + a);
//			a++;
//		}
//		System.out.println(a);
//		
//		//for 문
//		// for(초기값; 조건식; 증감식){
//		//  실행할 문장;
//		// }
//		
//		for( int i = 0 ; i < 5; i++ ) {
//			System.out.println("안녕하세요"+i);
//		}
//		
		
//		// 1~10까지의 수를 출력하는 for 문
//		System.out.println("1~10까지의 수를 출력하는 for 문");
//		System.out.print("->\t");
//		for(int i =0 ; i < 10; i++) {
//			System.out.print(i+1 + " ");
//		}
//		System.out.println("\n\n");
//		System.out.println("5~1까지 5 4 3 2 1 로 출력하는 for 문");
//		System.out.print("->\t");
//		// 5~1까지 5 4 3 2 1 로 출력하는 for 문
//		for(int i = 5; i > 0; i--) {
//			System.out.print(i + " ");
//		}
//		System.out.println("\n\n");
//		// 3,6,9,12,15를 출력하는 for 문
//		System.out.println("3,6,9,12,15를 출력하는 for 문");
//		System.out.print("->\t");
//		for(int i = 3; i <= 15; i+= 3) {
//			System.out.print(i+ " ");
//		}
//		System.out.println("\n\n");
//		for(int i = 0; i < 5; i++) {
//			System.out.print((i+1)*3 + " ");
//		}
		
//		// 1~100 의 수중 3의 배수는?
//		for(int i = 3; i < 101; i += 3) {
//			System.out.println(i);
//		}
//		
		
		// 1~100의 수 중 3의배수와 5의 배수를 출력
//		for(int i = 1 ; i < 101; i++) {
//			if(i % 3 == 0 || i % 5 == 0) {
//				System.out.println(i);
//			}
//			
//		}
		
		// 임의의 수는 소수인가?
		// Math.random() -> double 형으로 0 ~ 0.99999999999999999999
		// 0*100 ~ 99.99999
		// 0 ~ 99
		// 1 ~ 100
		// (int)(Math.random()*정수의 개수) + 랜덤수의 시작값;
		// 1 ~ 100 까지의 숫자 중 하나의 숫자를 만들겠다.
//		while(true) {
//			try{
				int number = (int)(Math.random()*100)+1;
				
				// 소수는 약수가 1과 자기자신 인 아이!!
				// 2(1,2) , 3(1,3), 4(1,2,4)
				// 4%1 == 0? 참
				System.out.println("nubmer :" + number);
				
				int count = 0;
				for(int i = 1 ; i <= number; i++) {
					if(number%i == 0) {
						count++;
					}
				}
				
				if(count == 2) {
					System.out.println(number + " 는 소수 입니다." );
				}
				else {
					System.out.println(number + " 는 소수가 아닙니다.");
				}
				
//				Thread.sleep(1000);
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
		Scanner sc = new Scanner(System.in);
		System.out.print(" 몇번째 까지의 소수를 찾을 수를 입력해주세요 : ");
		int number23 = sc.nextInt();
		System.out.println();
		int start =1;
		int count2= 0;
		int count3= 0;
		System.out.println("********** 1~" +number23+ "까지 소수인 정수 찾기 *********");
		while(start < number23) {
			start++;
			for(int i = 1; i <= start; i++) {
				if(start % i == 0) {
					count2++;
				}
			}
			if(count2 == 2) {
				System.out.println(start + " 는 소수 입니다." );
				count3++;
			}
			else {
				System.out.println(start + " 는 소수가 아닙니다.");
			}
			count2 = 0;
		}
		
		System.out.println(" 1 ~ " + start + " 까지의 소수는 총 : " + count3 + " 개 입니다.");
		
		
		
	}
}
