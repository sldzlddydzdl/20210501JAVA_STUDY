package EX;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
//		
//		int a = 0;
//		while(a < 5) {
//			System.out.println("�ȳ��ϼ���" + a);
//			a++;
//		}
//		System.out.println(a);
//		
//		//for ��
//		// for(�ʱⰪ; ���ǽ�; ������){
//		//  ������ ����;
//		// }
//		
//		for( int i = 0 ; i < 5; i++ ) {
//			System.out.println("�ȳ��ϼ���"+i);
//		}
//		
		
//		// 1~10������ ���� ����ϴ� for ��
//		System.out.println("1~10������ ���� ����ϴ� for ��");
//		System.out.print("->\t");
//		for(int i =0 ; i < 10; i++) {
//			System.out.print(i+1 + " ");
//		}
//		System.out.println("\n\n");
//		System.out.println("5~1���� 5 4 3 2 1 �� ����ϴ� for ��");
//		System.out.print("->\t");
//		// 5~1���� 5 4 3 2 1 �� ����ϴ� for ��
//		for(int i = 5; i > 0; i--) {
//			System.out.print(i + " ");
//		}
//		System.out.println("\n\n");
//		// 3,6,9,12,15�� ����ϴ� for ��
//		System.out.println("3,6,9,12,15�� ����ϴ� for ��");
//		System.out.print("->\t");
//		for(int i = 3; i <= 15; i+= 3) {
//			System.out.print(i+ " ");
//		}
//		System.out.println("\n\n");
//		for(int i = 0; i < 5; i++) {
//			System.out.print((i+1)*3 + " ");
//		}
		
//		// 1~100 �� ���� 3�� �����?
//		for(int i = 3; i < 101; i += 3) {
//			System.out.println(i);
//		}
//		
		
		// 1~100�� �� �� 3�ǹ���� 5�� ����� ���
//		for(int i = 1 ; i < 101; i++) {
//			if(i % 3 == 0 || i % 5 == 0) {
//				System.out.println(i);
//			}
//			
//		}
		
		// ������ ���� �Ҽ��ΰ�?
		// Math.random() -> double ������ 0 ~ 0.99999999999999999999
		// 0*100 ~ 99.99999
		// 0 ~ 99
		// 1 ~ 100
		// (int)(Math.random()*������ ����) + �������� ���۰�;
		// 1 ~ 100 ������ ���� �� �ϳ��� ���ڸ� ����ڴ�.
//		while(true) {
//			try{
				int number = (int)(Math.random()*100)+1;
				
				// �Ҽ��� ����� 1�� �ڱ��ڽ� �� ����!!
				// 2(1,2) , 3(1,3), 4(1,2,4)
				// 4%1 == 0? ��
				System.out.println("nubmer :" + number);
				
				int count = 0;
				for(int i = 1 ; i <= number; i++) {
					if(number%i == 0) {
						count++;
					}
				}
				
				if(count == 2) {
					System.out.println(number + " �� �Ҽ� �Դϴ�." );
				}
				else {
					System.out.println(number + " �� �Ҽ��� �ƴմϴ�.");
				}
				
//				Thread.sleep(1000);
//			}
//			catch (Exception e) {
//				// TODO: handle exception
//			}
//		}
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
				System.out.println(start + " �� �Ҽ��� �ƴմϴ�.");
			}
			count2 = 0;
		}
		
		System.out.println(" 1 ~ " + start + " ������ �Ҽ��� �� : " + count3 + " �� �Դϴ�.");
		
		
		
	}
}
