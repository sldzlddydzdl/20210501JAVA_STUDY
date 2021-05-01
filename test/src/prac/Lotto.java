package prac;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ����� 1 ~ 45 �Է¹ް�  6�� �Է¹ޱ� [ �ߺ� ���� ]
		Scanner sc = new Scanner(System.in);
		
		int[][] numbers = new int[3][6]; // 6�� �����Ҽ� �ִ� �迭		
		int number;
		int count = 1;
		
	
		
		for(int i = 0 ; i < 3; i++) {
			System.out.println(" 1 ~ 45 ���� �� �Է� ");
			
			for(int j = 0; j < 6; j++) {
					number = sc.nextInt();
					
					if( number > 45 || number < 1) {
						System.out.println(" 1 ~45 �������� �Է� ���� " );
					}
					else {
						if(numbers[i][j] == number) {
							System.out.println(" ������ ���� �ֽ�");
						}
						if(numbers[i][j] == 0) {
							numbers[i][j] = number;
							
						}
					}
				
			}
		}
		
		
		/*
		while(count <= 18) { 
			
			System.out.println(" 1 ~ 45 ���� �� �Է� ");
			
			number = sc.nextInt();
			
			if(number > 45 || number < 1) {
				System.out.println(" 1~45 �Է°��� ");
			}
			
			else {
				for(int j = 0; j < 3; j++) {	
					for( int i = 0; i < 6; i++) {
						if( numbers[j][i] == number ) { // ����x 
							System.out.println(" ������ ���� �ֽ��ϴ� ");
							count--;
							break;
						}
						if( numbers[j][i] == 0 ) {
							numbers[j][i] = number;
							break;
						}
						
						
					}
				}
				
				count++;
				
			}
		}
		*/
		
		for(int j =0; j <3; j ++) {
			System.out.print("\n\n ������ �ζ� ��ȣ : ");
			for(int i = 0; i < 6; i++) {
				System.out.print(numbers[j][i] + "   ");
			}
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
		int count2 = 0;
		int count3 = 0;
		// ��÷��� [ 6 �� �� �ؼ� ������ �� üũ ]
		for(int i =0; i < 6; i++) {
			for(int j = 0; j <6; j++) {
				if(numbers[0][i] == lottos[j]) {
					count1++;
				}
				if(numbers[1][i] == lottos[j]) {
					count2++;
				}
				if(numbers[2][i] == lottos[j]) {
					count3++;
				}
			}
		}
			if(count1 == 0) {
				System.out.println("1���� ��� : ��");
			}
		
			if(count1 == 1) {
				System.out.println("1���� ��� : 6�� �Դϴ�");
			}
			
			if(count1 == 2) {
				System.out.println("1���� ��� : 5�� �Դϴ�");
			}

			
			if(count1 == 3) {
				System.out.println("1���� ��� : 4�� �Դϴ�");
			}

			
			if(count1 == 4) {
				System.out.println("1���� ��� : 3�� �Դϴ�");
			}

			if(count1 == 5) {
				System.out.println("1���� ��� : 2�� �Դϴ�");
			}

			if(count1 == 6) {
				System.out.println("1���� ��� : 1�� �Դϴ�");
			}

////////////////////////////////////////////////////////////////////////////////
			
			if(count2 == 0) {
				System.out.println("2���� ��� : ��");
			}
			
			if(count2 == 1) {
				System.out.println("2���� ��� : 6�� �Դϴ�");
			}
			
			if(count2 == 2) {
				System.out.println("2���� ��� : 5�� �Դϴ�");
			}

			
			if(count2 == 3) {
				System.out.println("2���� ��� : 4�� �Դϴ�");
			}

			
			if(count2 == 4) {
				System.out.println("2���� ��� : 3�� �Դϴ�");
			}

			if(count2 == 5) {
				System.out.println("2���� ��� : 2�� �Դϴ�");
			}

			if(count2 == 6) {
				System.out.println("2���� ��� : 1�� �Դϴ�");
			}
			
////////////////////////////////////////////////////////////////////////////////
			
			if(count3 == 0) {
				System.out.println("3���� ��� : ��");
			}
		
			if(count3 == 1) {
				System.out.println("3���� ��� : 6�� �Դϴ�");
			}
			
			if(count3 == 2) {
				System.out.println("3���� ��� : 5�� �Դϴ�");
			}

			
			if(count3 == 3) {
				System.out.println("3���� ��� : 4�� �Դϴ�");
			}

			
			if(count3 == 4) {
				System.out.println("3���� ��� : 3�� �Դϴ�");
			}

			if(count3 == 5) {
				System.out.println("3���� ��� : 2�� �Դϴ�");
			}

			if(count3 == 6) {
				System.out.println("3���� ��� : 1�� �Դϴ�");
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