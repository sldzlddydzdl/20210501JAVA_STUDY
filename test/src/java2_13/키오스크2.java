package java2_13;

import java.util.ArrayList;
import java.util.Scanner;

public class 키오스크2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			else {
				System.out.println(" 1. 아메리카노[ 매진 ] " );
			}
			
			if(스무디.size() != 0) {
				System.out.println(" 2. 스무디[ " + 스무디.size() + " 남음 ]" );
			}
			else {
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
					아메리카노.add("o");
				}
				for(int i = 0 ; i < count2; i++) {
					스무디.add("o");
				}
			}
			
			if(ch1 == 1) {
				System.out.print(" 몇개를 주문하실건가요? : ");
				int count1 = 0;
				count1 = sc.nextInt();
				try {
					for(int i = 0; i < count1; i++) {
						아메리카노.remove(i);
					}
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("아메리카노가 부족합니다.");
				}
			
			}
			
			if(ch1 == 2) {
				System.out.print(" 몇개를 주문하실건가요? : ");
				int count1 = 0;
				count1 = sc.nextInt();
				try {
					for(int i = 0; i < count1; i++) {
						스무디.remove(i);
					}
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("스무디가 부족합니다.");
				}
			
			}
			
		}
		
		
	}

}
