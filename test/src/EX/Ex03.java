package EX;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		// 사용자로부터 0 ~ 100 의 점수를 입력받아서
		// 100점이면 "만점입니다"
		// 90~99점이면 "A학점"
		// 80~89점이면 "B학점"
		// 70~79점이면 "C학점"
		// 나머지는 "F학점"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력해주세요");
		
		// 입력받아 변수에 넣기
		int score = sc.nextInt();
		if(score == 100) {
			System.out.println("만점입니다");
		}else if(score >= 90) {
			System.out.println("A학점");
		}else if(score >= 80) {
			System.out.println("B학점");
		}else if(score >= 70) {
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		}
		
		if(score == 100) {
			System.out.println("만점입니다");
		}if(score <= 99 && score >= 90) {
			System.out.println("A학점");
		}if(score <= 89 && score >= 80) {
			System.out.println("B학점");
		}if(score <= 79 && score >= 70) {
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		}
		
		if(score == 100) {
			System.out.println("만점입니다");
		}else if(score <= 99 && score >= 90) {
			System.out.println("A학점");
		}else if(score <= 89 && score >= 80) {
			System.out.println("B학점");
		}else if(score <= 79 && score >= 70) {
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		}
		
		
		
		
	}

}
