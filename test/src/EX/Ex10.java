package EX;

import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		
		// ��Ʈ���
		// ��
		System.out.println();
		System.out.println("1----------------");
		System.out.println();
		int sum = 0;
		for(int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		
		
		for(int i = 0 ; i< 9; i++) {
			System.out.print((i+1)+"��°�� ");
			for(int j =0 ; j < 10; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("2----------------");
		System.out.println();
		for(int i = 1 ; i <= 5; i++) {
			
			for(int j =0 ; j < i; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("3----------------");
		System.out.println();
		for(int i = 5 ; i > 0; i--) {
			
			for(int j = 1; j <= i; j++ ) {
				System.out.print("��");
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
		
		
//		86 95 �ִ� �����
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
		
		System.out.println(" �ִ� ����� : " + maxnumber);
		
		System.out.println();
		System.out.println("7----------------");
		System.out.println();
		
		Scanner sc = new Scanner(System.in);
		System.out.print(" ���° ������ �Ҽ��� ã�� ���� �Է����ּ��� : ");
		int number23 = sc.nextInt();
		System.out.println();
		int start =1;
		int count2= 0;
		int count3= 0;
		System.out.println("********** 1~" +number23+ "���� �Ҽ��� ���� ã�� *********");
		while(start < number23) {
			start++;
			for(int i = 1; i <= start; i++) {
				if(start % i == 0) {
					count2++;
				}
			}
			if(count2 == 2) {
				System.out.println(start + " �� �Ҽ� �Դϴ�." );
				count3++;
			}
			else {
//				System.out.println(start + " �� �Ҽ��� �ƴմϴ�.");
			}
			count2 = 0;
		}
		
		System.out.println(" 1 ~ " + start + " ������ �Ҽ��� �� : " + count3 + " �� �Դϴ�.");
		
		
	}
}

