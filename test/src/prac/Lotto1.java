package prac;

import java.util.Random;
import java.util.Scanner;

public class Lotto1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사용자 1 ~ 45 입력받고  6개 입력받기 [ 중복 제거 ]
		Scanner sc = new Scanner(System.in);
		
		int[][] numbers = new int[3][6]; // 6개 저장할수 있는 배열		
		int number;
		int count = 1;
		
	
		
		while(count <= 6) { 
			
			System.out.println(" 1 ~ 45 까지 수 입력 ");
			
			number = sc.nextInt();
			if(number > 45 || number < 1) {
				System.out.println(" 1~45 입력가능 ");
			}
			else {
				for(int i = 0; i < 3; i ++) {
					for( int j = 0; j < 6; j++) {
						if( numbers[i][j] == number ) { // 저장x 
							System.out.println(" 동일한 수가 있습니다 ");
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
		
		System.out.print("\n\n 선택한 로또 번호 : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(numbers[i] + "   ");
		}
		
		// 컴퓨터 난수 1~45 랜덤 6개 랜덤 저장 [ 중복제거 ]  입력받고
		int[] lottos = new int[6]; // 6개 저장할수 있는 배열		
		int lotto;
		count = 1;
		Random ra = new Random();
		
		while(count <= 6) { 
			
		//	System.out.println("\n ** 번째 추첨번호 생성중 ** ");
			
			lotto = ra.nextInt(45) + 1;
			
				for( int i = 0; i < 6; i++) {
					if( lottos[i] == lotto ) { // 저장x 
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
		
		System.out.print("\n\n\n 당첨 로또 번호 : ");
		for(int i = 0; i < 6; i++) {
			System.out.print(lottos[i] + "   ");
		}
		
		System.out.println("\n\n");
		
		int count1 = 0;
		// 추첨결과 [ 6 개 비교 해서 동일한 수 체크 ]
		for(int i =0; i < 6; i++) {
			for(int j = 0; j <6; j++) {
				if(numbers[i][j] == lottos[j]) {
					count1++;
				}
			}
		}
			if(count1 == 0) {
				System.out.println(" 꽝");
			}
		
			if(count1 == 1) {
				System.out.println(" 6등 입니다");
			}
			
			if(count1 == 2) {
				System.out.println(" 5등 입니다");
			}

			
			if(count1 == 3) {
				System.out.println(" 4등 입니다");
			}

			
			if(count1 == 4) {
				System.out.println(" 3등 입니다");
			}

			if(count1 == 5) {
				System.out.println(" 2등 입니다");
			}

			if(count1 == 6) {
				System.out.println(" 1등 입니다");
			}


		
	}
	
		
	// 로또 판수 입력 받기 ---> 입력수만큼 선택한 로또 번호 뽑기 
	
	/*
	 * 
	 * 	1게임  선택한 로또 번호 : 1   2   3   4   5   6
	 *  2게임  선택한 로또 번호 : 1   2   3   4   5   6
	 *  3게임  선택한 로또 번호 : 1   2   3   4   5   6
	 * 
	 *   당첨 로또 번호 : 11   27   9   42   12   39   
	 * 
	 *  1게임 : 결과
	 *  2게임 : 결과
	 *  3게임 : 결과
	 *  
	 *  
	 */
		
}
