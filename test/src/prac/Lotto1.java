package prac;

import java.util.Random;
import java.util.Scanner;

public class Lotto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ����� 1 ~ 45 �Է¹ް�  6�� �Է¹ޱ� [ �ߺ� ���� ]
		Scanner sc = new Scanner(System.in);
		
		int[][] numbers = new int[3][6]; // 6�� �����Ҽ� �ִ� �迭		
		int number;
		int count = 1;
		
	
		
		while(count <= 6) { 
			
			System.out.println(" 1 ~ 45 ���� �� �Է� ");
			
			number = sc.nextInt();
			if(number > 45 || number < 1) {
				System.out.println(" 1~45 �Է°��� ");
			}
			else {
				for(int i = 0; i < 3; i ++) {
					for( int j = 0; j < 6; j++) {
						if( numbers[i][j] == number ) { // ����x 
							System.out.println(" ������ ���� �ֽ��ϴ� ");
							count--;
							break;
						}
						if( numbers[i][j] == 0 ) {
							numbers[i][j] = number;
							break;
						}
						
						
					}
				}
				count++;
				
			}
	
		}
		
		System.out.print("\n\n ������ �ζ� ��ȣ : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(numbers[i] + "   ");
		}
		
		// ��ǻ�� ���� 1~45 ���� 6�� ���� ���� [ �ߺ����� ]  �Է¹ް�
		int[] lottos = new int[6]; // 6�� �����Ҽ� �ִ� �迭		
		int lotto;
		count = 1;
		Random ra = new Random();
		
		while(count <= 6) { 
			
		//	System.out.println("\n ** ��° ��÷��ȣ ������ ** ");
			
			lotto = ra.nextInt(45) + 1;
			
				for( int i = 0; i < 6; i++) {
					if( lottos[i] == lotto ) { // ����x 
						count--;
						break;
					}
					if( lottos[i] == 0 ) {
						lottos[i] = lotto;
						break;
					}
					
					
				}
				
				count++;
				
			
	
		}
		
		System.out.print("\n\n\n ��÷ �ζ� ��ȣ : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(lottos[i] + "   ");
		}
		
		System.out.println("\n\n");
		
		int count1 = 0;
		// ��÷��� [ 6 �� �� �ؼ� ������ �� üũ ]
		for(int i =0; i < 6; i++) {
			for(int j = 0; j <6; j++) {
				if(numbers[i][j] == lottos[j]) {
					count1++;
				}
			}
		}
			if(count1 == 0) {
				System.out.println(" ��");
			}
		
			if(count1 == 1) {
				System.out.println(" 6�� �Դϴ�");
			}
			
			if(count1 == 2) {
				System.out.println(" 5�� �Դϴ�");
			}

			
			if(count1 == 3) {
				System.out.println(" 4�� �Դϴ�");
			}

			
			if(count1 == 4) {
				System.out.println(" 3�� �Դϴ�");
			}

			if(count1 == 5) {
				System.out.println(" 2�� �Դϴ�");
			}

			if(count1 == 6) {
				System.out.println(" 1�� �Դϴ�");
			}


		
	}
	
		
	// �ζ� �Ǽ� �Է� �ޱ� ---> �Է¼���ŭ ������ �ζ� ��ȣ �̱� 
	
	/*
	 * 
	 * 	1����  ������ �ζ� ��ȣ : 1   2   3   4   5   6
	 *  2����  ������ �ζ� ��ȣ : 1   2   3   4   5   6
	 *  3����  ������ �ζ� ��ȣ : 1   2   3   4   5   6
	 * 
	 *   ��÷ �ζ� ��ȣ : 11   27   9   42   12   39   
	 * 
	 *  1���� : ���
	 *  2���� : ���
	 *  3���� : ���
	 *  
	 *  
	 */
		
}
