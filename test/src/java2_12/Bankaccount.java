package java2_12;

import java.util.ArrayList;
import java.util.Scanner;

public class Bankaccount {

	// ATM기 [ 은행별로 입금 , 출금 ]
	
	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<계좌> 계좌리스트 = new ArrayList<>();
	public static ATM 편의점ATM; // 1. 인터페이스 먼저
	
	
	public static void main(String[] args) {
	
		while(true) {
			System.out.println("============ ATM ==============");
			System.out.println("1.국민은행  2.신한은행  3.카카오 4.종료 5. 모든은행 계좌");
			System.out.println("===============================");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				
				편의점ATM = new 국민은행(); // 2. 인터페이스에 클래스 메모리할당먼저 객체생성
				
				편의점ATM.뱅크메뉴();
				
			}
			
			if(ch == 2) {
				
				편의점ATM = new 신한은행();
			
				편의점ATM.뱅크메뉴();
				
			}
			
			if(ch == 3) {
				
				편의점ATM = new 카카오();
			
				편의점ATM.뱅크메뉴();
				
			}
			if(ch ==4) {
				return;
			}
			if(ch ==5) {
				
				국민은행 temp1 = new 국민은행(); // 객체생성
				편의점ATM = temp1; // 임의로 인터페이스에 객체저장
				편의점ATM.계좌목록(); // 객체가 국민은행 클래스 생성햇으므로 계좌목록() 메소드 호출;
				
				신한은행 temp2 = new 신한은행();
				편의점ATM = temp2;
				편의점ATM.계좌목록();
				
				
				카카오 temp3 = new 카카오();
				편의점ATM = temp3;
				편의점ATM.계좌목록();
				
			}
		}
		
	}
	
	
}
