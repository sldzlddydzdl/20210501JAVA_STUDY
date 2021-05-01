package EX;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		// 하트찍기
		// ♡
		System.out.println();
		System.out.println("1----------------");
		System.out.println();
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		
		for(int i = 0 ; i< 9; i++) {
			System.out.print((i+1)+"번째줄 ");
			for(int j =0 ; j < 10; j++) {
				System.out.print("♡");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("2----------------");
		System.out.println();
		for(int i = 1 ; i <= 5; i++) {
			
			for(int j =0 ; j < i; j++) {
				System.out.print("♡");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("3----------------");
		System.out.println();
		for(int i = 5 ; i > 0; i--) {
			
			for(int j = 1; j <= i; j++ ) {
				System.out.print("♡");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("4----------------");
		System.out.println();
		
		int ans = 0;
		for(int i = 1; i <= 25; i+=5) {
			for(int j =i; j <= i+4; j++) {
				System.out.print(j+ " ");
				ans += j;
			}
			System.out.println();
		}
		System.out.println(ans);
		
		System.out.println();
		System.out.println("5----------------");
		System.out.println();
		
		for(int i = 1; i <= 25; i+=5) {
			for(int j =i; j <= i+4; j++) {
				System.out.print(j+ " ");
			}
			System.out.println();
			if(i < 20) {
			for(int j = (i+9); j > i; j-- ) {
				System.out.print(j + " ");
				i++;
			}
				System.out.println();
			}
			else {
				break;
			}
		}
		
		System.out.println();
		System.out.println("6----------------");
		System.out.println();
		
		
//		86 95 최대 공약수
		int a = 3;
		int b = 7;
		int max = Math.max(a, b);
		int maxnumber = 1;

		int q = 2;
		while(q <= max) {
			if(a%q == 0 && b%q == 0) {
				maxnumber = maxnumber * q;
				a = a/q;
				b = b/q;
				q = 2;
			}
			else if(a%q != 0 || b%q != 0) {
				q++;
			}
		}
		
		System.out.println(" 최대 공약수 : " + maxnumber);
		
		System.out.println();
		System.out.println("7----------------");
		System.out.println();
		
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
//				System.out.println(start + " 는 소수가 아닙니다.");
			}
			count2 = 0;
		}
		
		System.out.println(" 1 ~ " + start + " 까지의 소수는 총 : " + count3 + " 개 입니다.");
		
		
	}
}

