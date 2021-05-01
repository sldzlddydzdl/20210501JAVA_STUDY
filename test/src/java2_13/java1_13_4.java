package java2_13;

import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.Scanner;

public class java1_13_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.키오스크 // 배열사용
				// [대기명단] : 1팀 : 5명 // 2팀 : 6명 ~~~~~~~~
				// 1.[대기추가] : 배열 5팀만 // 예외 발생 => 대기명단 다 찼습니다 
				// 2.[대기삭제] : 
		
		// 2. 키오스크 // 리스트 사용
				// [r관리자]
				// 0. 설정메뉴 [ 오늘 판매할 갯수 ] : 입력한 갯수만큼 남은개수에 표시
				// [사용자]
				// 1. 아메리카노 [ 남은개수 : 3개 ] : 주문갯수만큼 차감 => 0 이되면 => 예외 발생 => 매진
				// 2. 스무디 [ 남은개수 : 10개 ] : 주문갯수만큼 차감 => 0 이되면 => 예외 발생 => 매진
		/*
		Scanner sc = new Scanner(System.in);
		Integer[] 대기팀 = new Integer[5];
		
		while(true) {
			System.out.println(" ===== 대기 프로그램 =======");
			System.out.println("1.명단추가");
			System.out.println("2.명단삭제");
			System.out.println("=== 대기 현황 ===");
			
			for(int i = 0; i < 대기팀.length; i++) {
				if(대기팀[i] == null) {
					System.out.println((i+1) + "팀" + 0 + "명");
				}
				else {
					System.out.println((i+1) + "팀 : " + 대기팀[i] + "명");
				}
			}
		
		
			System.out.print("선택 : ");
			int ch = sc.nextInt();
			
			if(ch ==1) { // 배열 추가
			
					for(int i = 0 ; i< 10; i++) {
						try {
							if( 대기팀[i] == null) {
								System.out.print("몇명을 배정하시겠습니까?");
								대기팀[i] = sc.nextInt();
								System.out.println("대기 번호 : " + (i+1));
								break;
							}
						}
						catch (Exception e) {
							// TODO: handle exception
							System.out.println(" 오류발생 : 최대 대기줄 입니다 [기다려주세요] ");
							break;
						}
					}
			}
			
			if(ch ==2) { // 배열 삭제
				
				for(int i = 0 ; i< 대기팀.length; i++) {
					
					if(i == 대기팀.length-1) { // 마지막번호
						대기팀[i] = null;
						break;
					}
					
					대기팀[i] = 대기팀[i+1];
					
				}

				
	
			}
			
		}
		*/
		
		Scanner sc = new Scanner(System.in);	
		ArrayList<String> 아메리카노 = new ArrayList<>();
		ArrayList<String> 스무디 = new ArrayList<>();
		
		while(true) {
			System.out.println("=== 설정메뉴 ===");
			System.out.println("0.제품 판매할 갯수");
			System.out.println("==== 메뉴 ====");
			
		
			if(아메리카노.size() != 0) {
				System.out.println(" 1. 아메리카노[ " + 아메리카노.size() + " 남음 ]" );
			}
			else if(아메리카노.size() == 0){
				System.out.println(" 1. 아메리카노[ 매진 ] " );
			}
			
			if(스무디.size() != 0) {
				System.out.println(" 2. 스무디[ " + 스무디.size() + " 남음 ]" );
			}
			else{
				System.out.println(" 2. 스무디[ 매진 ] " );
			}
			
			System.out.print(" 메뉴 선택 : ");
			int ch1 = sc.nextInt();
			
			
			if(ch1 == 0) {
				System.out.print(" 아메리카노를 몇개 판매하실건가요? ");
				int count1 = sc.nextInt();
			
				System.out.print(" 스무디를 몇개 판매하실건가요 ? ");
				int count2 = sc.nextInt();
		
				for(int i = 0 ; i < count1; i++) {
					아메리카노.add(" ");
				}
				for(int i = 0 ; i < count2; i++) {
					스무디.add(" ");
				}
			}
			
			if(ch1 == 1) {
				System.out.print(" 몇개를 주문하실건가요? : ");
				int count1 = 0;
				count1 = sc.nextInt();
				
				if(아메리카노.size() < count1) {
					System.out.println("아메리카노가 부족합니다");
				}
				else {
					try {
						for(int i = 0; i < count1; i++) {
							아메리카노.remove(0);
						}
					}
					catch (Exception e) {
						// TODO: handle exception
						System.out.println("아메리카노가 부족합니다.");
						count1 = 0;
						/*
						for(int i = 0 ; i < count1; i++) {
							아메리카노.add("o");
						}
						*/
					}
				}
			}
			
			if(ch1 == 2) {
				System.out.print(" 몇개를 주문하실건가요? : ");
				int count1 = 0;
				count1 = sc.nextInt();
				
				if(스무디.size() < count1 ) {
					System.out.println("스무디가 부족합니다.");
				}
				else {
					try {
						for(int i = 0 ; i < count1; i++) {
							스무디.remove(0);
						}
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("스무디가 부족합니다.");
						count1 = 0;
					}
				}
			
			}
			
		}
		
	}
		
		
}


