package prac;

import java.util.Random;
import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 사용자 1 ~ 45 입력받고  6개 입력받기 [ 중복 제거 ]
		Scanner sc = new Scanner(System.in);
		
		int[][] numbers = new int[3][6]; // 6개 저장할수 있는 배열		
		int number;
		int count = 1;
		
	
		
		for(int i = 0 ; i < 3; i++) {
			System.out.println(" 1 ~ 45 까지 수 입력 ");
			
			for(int j = 0; j < 6; j++) {
					number = sc.nextInt();
					
					if( number > 45 || number < 1) {
						System.out.println(" 1 ~45 수까지만 입력 가능 " );
					}
					else {
						if(numbers[i][j] == number) {
							System.out.println(" 동일한 수가 있슴");
						}
						if(numbers[i][j] == 0) {
							numbers[i][j] = number;
							
						}
					}
				
			}
		}
		
		
		/*
		while(count <= 18) { 
			
			System.out.println(" 1 ~ 45 까지 수 입력 ");
			
			number = sc.nextInt();
			
			if(number > 45 || number < 1) {
				System.out.println(" 1~45 입력가능 ");
			}
			
			else {
				for(int j = 0; j < 3; j++) {	
					for( int i = 0; i < 6; i++) {
						if( numbers[j][i] == number ) { // 저장x 
							System.out.println(" 동일한 수가 있습니다 ");
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
			System.out.print("\n\n 선택한 로또 번호 : ");
			for(int i = 0; i < 6; i++) {
				System.out.print(numbers[j][i] + "   ");
			}
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
		int count2 = 0;
		int count3 = 0;
		// 추첨결과 [ 6 개 비교 해서 동일한 수 체크 ]
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
				System.out.println("1게임 결과 : 꽝");
			}
		
			if(count1 == 1) {
				System.out.println("1게임 결과 : 6등 입니다");
			}
			
			if(count1 == 2) {
				System.out.println("1게임 결과 : 5등 입니다");
			}

			
			if(count1 == 3) {
				System.out.println("1게임 결과 : 4등 입니다");
			}

			
			if(count1 == 4) {
				System.out.println("1게임 결과 : 3등 입니다");
			}

			if(count1 == 5) {
				System.out.println("1게임 결과 : 2등 입니다");
			}

			if(count1 == 6) {
				System.out.println("1게임 결과 : 1등 입니다");
			}

////////////////////////////////////////////////////////////////////////////////
			
			if(count2 == 0) {
				System.out.println("2게임 결과 : 꽝");
			}
			
			if(count2 == 1) {
				System.out.println("2게임 결과 : 6등 입니다");
			}
			
			if(count2 == 2) {
				System.out.println("2게임 결과 : 5등 입니다");
			}

			
			if(count2 == 3) {
				System.out.println("2게임 결과 : 4등 입니다");
			}

			
			if(count2 == 4) {
				System.out.println("2게임 결과 : 3등 입니다");
			}

			if(count2 == 5) {
				System.out.println("2게임 결과 : 2등 입니다");
			}

			if(count2 == 6) {
				System.out.println("2게임 결과 : 1등 입니다");
			}
			
////////////////////////////////////////////////////////////////////////////////
			
			if(count3 == 0) {
				System.out.println("3게임 결과 : 꽝");
			}
		
			if(count3 == 1) {
				System.out.println("3게임 결과 : 6등 입니다");
			}
			
			if(count3 == 2) {
				System.out.println("3게임 결과 : 5등 입니다");
			}

			
			if(count3 == 3) {
				System.out.println("3게임 결과 : 4등 입니다");
			}

			
			if(count3 == 4) {
				System.out.println("3게임 결과 : 3등 입니다");
			}

			if(count3 == 5) {
				System.out.println("3게임 결과 : 2등 입니다");
			}

			if(count3 == 6) {
				System.out.println("3게임 결과 : 1등 입니다");
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