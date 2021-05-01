package EX;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
//			배열(array) : 같은 자료형(타입) 의 변수들의 모임
//			배열이라는 아이를 왜 쓰지?
//			반복문을 쓰기 위해서
		
//			int 자료형의 변수 10개를 만들어서
//			각각 1씩 대입을 하고 출력해보세요
		

//			System.out.println("n1  : " + n1);
//			System.out.println("n2  : " + n2);
//			System.out.println("n3  : " + n3);
//			System.out.println("n4  : " + n4);
//			System.out.println("n5  : " + n5);
//			System.out.println("n6  : " + n6);
//			System.out.println("n7  : " + n7);
//			System.out.println("n8  : " + n8);
//			System.out.println("n9  : " + n9);
//			System.out.println("n10 : " + n10);
			
			// 위 변수에
			// n1 = 1
			// n2 = 2
			// n3 = 3
						
//			System.out.println("--------------------");
//			
//			System.out.println("n1  : " + n1);
//			System.out.println("n2  : " + n2);
//			System.out.println("n3  : " + n3);
//			System.out.println("n4  : " + n4);
//			System.out.println("n5  : " + n5);
//			System.out.println("n6  : " + n6);
//			System.out.println("n7  : " + n7);
//			System.out.println("n8  : " + n8);
//			System.out.println("n9  : " + n9);
//			System.out.println("n10 : " + n10);
			
			int n1 = 1;
			int n2 = 1;
			int n3 = 1;
			int n4 = 1;
			int n5 = 1;
			int n6 = 1;
			int n7 = 1;
			int n8 = 1;
			int n9 = 1;
			int n10 = 1;

			// 반복문이라는걸 배웠으니 이걸 써볼까?
			// 1 ~ 10 까지 값을 넣어보자 !
			
			n1 = 1;
			n2 = 2;
			n3 = 3;
			n4 = 4;
			n5 = 5;
			n6 = 6;
			n7 = 7;
			n8 = 8;
			n9 = 9;
			n10 = 10;
			// 변수가 다 다른 애들이기 때문에 반복문으로 쓸 수 없다.
			
			// 배열
			// 자로형[] 변수명 : 배열변수의 선언
			// 변수명 = new 자료형[개수];
			// 숫자 10개를 담을 수 있는 배열을 생성.
			
//			int[] numbers;
//			numbers = new int[10]; // 10개짜리 배열 객체를 생성하여 numbers 에 담음.
			
			int[] numbers = new int[10];
			
			// 변수명[index번호] : index는 0부터 시작한다.
			// numbers 배열의 모든 공간에 1씩 담아보자
			
//			numbers[0] = 1;
//			numbers[1] = 1;			
//			numbers[2] = 1;
//			numbers[3] = 1;			
//			numbers[4] = 1;
//			numbers[5] = 1;			
//			numbers[6] = 1;
//			numbers[7] = 1;			
//			numbers[8] = 1;
//			numbers[9] = 1;			
			
			// 반복문을 이용해서 1씩 넣어보자
			for(int i = 0; i < 10; i++)
				numbers[i] = 1;
			
			// 변수는 stack 값은 heap
			// new 는 무조건 heap메모리에 올라간다.
			
			//[1,1,1,1,1,1,1,1,1,1,]
//			System.out.println(numbers);
			
//			for(int i = 0; i < 10; i++) {
//				System.out.println("numbers["+i+"] : " + numbers[i]);
//			}
			
			// 10개의 공간에 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 값으로 담자
//			numbers[0] = 1;
//			numbers[1] = 2;
//			numbers[2] = 3;
//			numbers[3] = 4;
//			numbers[4] = 5;
//			numbers[5] = 6;
//			numbers[6] = 7;
//			numbers[7] = 8;
//			numbers[8] = 9;
//			numbers[9] = 10;
		
//			System.out.println("------------------------------------");
			
			for(int i = 0; i < 10; i++) {
				numbers[i] = i+1;
			}
			
//			for(int i = 0 ; i< 10; i++) {
//				//%d 정수를 대입, \n 은 개행을 의미
//				System.out.printf("numbers[%d] : %d \n", i , numbers[i]);
//			}
//			
			// 크기가 5개인 문자열을 담을 수 있는 배열을 만들어
			// 좋아하는 음식 이름 5개를 넣고
			// 출력하세요.
			
			
			String[] food = new String[5];
			food[0] = "피자";
			food[1] = "팥죽";
			food[2] = "치킨";
			food[3] = "방어회";
			food[4] = "참치회";
			
				
//			System.out.println("제가 좋아하는 음식 : ");
//			System.out.print("-> " + food[0] + " "
//								   + food[1] + " "
//								   + food[2] + " "
//								   + food[3] + " "
//								   + food[4] + " 입니다.");
			
			// index 2번에 떡볶이
			System.out.println();
			food[2] = "떡볶이";
//			System.out.println("************ index 2번을 변경 한 후 *****************");
//			for(int i = 0 ; i < 5; i++) {
//				System.out.println("food["+i+"] : " + food[i]);
//			}
//			
			// 배열을 만드는 방법
			int[] array1 = new int[5];// [0,0,0,0,0]
			
			// 요 아이만 처음 초기화(변수생성과 값을 동시에 넣음) 할 때만 가능.
			int[] array2 = {10,7,4,3,2}; // heap 으로 들어간다.
						
			
			
			int[] array3 = new int[] {10 , 7 ,4 ,3, 2}; // [10,7,4,3,2]
			
			int[] arrays;
			arrays = new int[5]; // [0,0,0,0,0]
			
//			int[] arrays2;
//			arrays2 = {10, 7 , 4 ,3 , 2}; 안되!!!!!!!!!!!!
			
			int[] arrays3;
			arrays3 = new int[] { 10 , 7 , 4 , 3 , 2 }; // [10,7,4,3,2]
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}
	
}
