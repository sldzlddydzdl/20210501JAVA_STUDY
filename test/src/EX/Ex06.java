package EX;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// 성적을 표현하기는???
		// 100은 "만점입니다"
		// 90~99 "A학점"
		// 80~89 "B학점"
		// 70~79 "C학점"
		// 그 외 "F학점"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를입력하세요");
		int score = sc.nextInt();
		
		switch (score/10) {
			case 10:
				System.out.println("만점");
				break;
			case 9:
				System.out.println("A학점");
				break;
			case 8:
				System.out.println("B학점");
				break;
			case 7: 
				System.out.println("C학점");
				break;
			default:
				System.out.println("F학점");
		}
		
		System.out.println("-------------------------------");
		
		switch (score) {
			case 100:
				System.out.println("만점");
				break;
			case 90: case 91: case 92: case 93: case 94:
			case 95: case 96: case 97: case 98: case 99: // 이렇게도가능하다
				System.out.println("A학점");
				break;
			case 80: case 81: case 82: case 83: case 84:
			case 85: case 86: case 87: case 88: case 89:	
				System.out.println("B학점");
				break;
			case 70: case 71: case 72: case 73: case 74:
			case 75: case 76: case 77: case 78: case 79: 
				System.out.println("C학점");
				break;
			default:
				System.out.println("F학점");
		}
		
		
	}
}
