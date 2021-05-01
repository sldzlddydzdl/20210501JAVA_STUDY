package EX;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
//		1. 56827원짜리 건물이 있다 이 물건을 지불하기 위하여 
//		만원 , 천원 ,백원 ,십원 일원짜리가 몇 개씩 
//		필요한지 알아내어 출력하시오
//		
		int manwon = 0;
		int chunwon =0;
		int backwon = 0;
		int sipwon = 0;
		int ylwon = 0;
		int money = 56827;
		manwon = money / 10000; // 만원의 개수 // 5
		chunwon = (money - manwon)/1000; // 6
		backwon = (money%1000)/100; // 8
		sipwon = (money%100)/10; // 2
		ylwon = (money%10); // 7
		
//		2. 밑변과 높이를 담을수 있는 변수를 선언하고
//		밑변과 높이에 값을 넣은 후 삼각형의 넓이를 출력하시오.

		int width = 20; // 밑변
		int height = 10; // 높이
		System.out.println("삼각형의 넓이 : " + ( width * height / 2 ) );	
		
//		3. 가로와 세로를 담을 수 있는 변수를 선언하고
//		가로와 세로의 값을 넣은 후 사각형의 둘레를 구하여 출력하시오.

		width = 30; // 밑변
		height = 15; // 높이
		System.out.println("사각형의 둘레 : " + ((width*2) + (height*2)));
		
		/****************** 선택과 반복 ********************/
		// 선택구조 : 여러가지 선택지에서 하나를 고르는거!
		// 조건식은 결과가 boolean 으로 나온다!
		
		// 비가 오지 않으면 테니스를 친다 -> 비가 오면 테니스를 안친다.
//									 
//									 ||
//									 ||
//								   __||__
//								   \    /
//		                            \  /  
//		                             \/
						 
		// 				조건식 if
		// 				형식 : 
		// 				if( 조건식 ) { 
//							참일 때 실행하려는 문장1;
//							참일 때 실행하려는 문장2;
		// 				}
		// 				조건식의 결과는 true , false 가 나온다.
		
		int age = 15;
		if(age >= 20) { // age 가 15 라서 --> false
			System.out.println("성인입니다.");
		}
		
		if(age < 20) { // age가 15 라서 --> true
			System.out.println("미성년입니다");
		}
		
		// if - else
		// 조건식이 참이 아니면 else 를 실행한다.
		// if - else 는 둘중 하나는 무조건 실행한다.
		// if(조건식){
		// 		실행할 문장1;
		// }else{
		// 		실행할 문장2;
		// }
		System.out.println("-------------------------------");
		if(age < 20) {
			System.out.println("미성년입니다.");
		}else {
			System.out.println("성인입니다.");
		}
		
		// 사용자 ( 콘솔 ) 로 부터 숫자를 입력받아보자.
		// Scanner 를 입력하고 Ctrl + Space 를 한 후, 
		// Scanner 옆에 java.util 이라고 있는 애를 선택
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자를 입력해주세요.");
		// 사용자로부터 숫자를 입력받는다.
		int number = sc.nextInt(); // 콘솔로부터 정수를 입력받는다. 
								   // 변수 number에 대입한다.
		
		System.out.println("입력받은 숫자는 : " + number);
		
		System.out.println("종료");
		
		
	}
}
