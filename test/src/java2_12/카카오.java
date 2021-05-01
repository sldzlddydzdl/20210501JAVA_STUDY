package java2_12;

import java.util.Scanner;

public class 카카오 extends 계좌 implements ATM {
	
public static Scanner sc = new Scanner(System.in);
	
	public 카카오(String 계좌, String 비밀번호, String 계좌주 , int 은행코드) {
		
		super(계좌, 비밀번호, 계좌주 , 은행코드);
		
	}
	
	public void 계좌목록() {
		for(int i = 0; i < Bankaccount.계좌리스트.size(); i++) {
				if( Bankaccount.계좌리스트.get(i).은행코드 == 3 ) {
					System.out.println("[카카오은행] :  " + Bankaccount.계좌리스트.get(i).계좌 + " 의 잔액은 : " 
										+ Bankaccount.계좌리스트.get(i).입금액 + "입니다.");
				}
			}
	}
	
	public 카카오() {
		
	}
	
	public int 인증( int 은행코드 ) {
		if(은행코드 == 3) {
			System.out.println(" 카카오 인증 성공 ");
			return 3;
		}
		else {
			System.out.println("카카오은행이 아닙니다.");
			return 0;
		}
		
		
	}
	
	public void 뱅크메뉴() {
	
		while(true) {
			System.out.println(" ========== 카카오은행 ===========");
			System.out.println("1.계좌생성");
			System.out.println("2.입금");
			System.out.println("3.출금");
			System.out.println("4.잔고");
			System.out.println("5.종료");
			System.out.println("6.목록");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				
				계좌생성();
			}
			
			if(ch == 2) {
				입금();
			}
			if(ch == 3) {
				출금();
			}
			if(ch == 4) {
				잔고();
			}
			if(ch == 5) {
				break;
				
			}
			if(ch == 6) {
				계좌목록();
			}
		}
	}
	
	
	public void 입금() {
		
		System.out.println("** 입금 **");
		System.out.print("계좌번호 : ");
		String 계좌 = sc.next();
		System.out.print("비밀번호 : ");
		String 비밀번호 = sc.next();
		
		
		for(int i = 0 ; i < Bankaccount.계좌리스트.size(); i++) {
			if(Bankaccount.계좌리스트.get(i).계좌.equals(계좌) && 
					Bankaccount.계좌리스트.get(i).비밀번호.equals(비밀번호)&& 
						Bankaccount.계좌리스트.get(i).은행코드 == 3) {
					System.out.print("입금액 : ");
					int 입금액 = sc.nextInt();
					Bankaccount.계좌리스트.get(i).입금액 += 입금액;
					System.out.println(Bankaccount.계좌리스트.get(i).계좌주 + " 님 카카오은행 입금 성공");
					return;
			}
		}	
		
		System.out.println(" 동일한 계좌 혹은 비밀번호가 다릅니다.");
		
	}
	
	public void 출금() {
		System.out.println("** 출금 **");
		System.out.print("계좌번호 : ");
		String 계좌 = sc.next();
		System.out.print("비밀번호 : ");
		String 비밀번호 = sc.next();
		
		
		for(int i = 0 ; i < Bankaccount.계좌리스트.size(); i++) {
			if(Bankaccount.계좌리스트.get(i).계좌.equals(계좌) && 
					Bankaccount.계좌리스트.get(i).비밀번호.equals(비밀번호)&& 
					Bankaccount.계좌리스트.get(i).은행코드 == 3) {
					System.out.print("출금액 : ");
					int 출금액 = sc.nextInt();
					
					if(Bankaccount.계좌리스트.get(i).입금액 < 출금액) {
						System.out.println(" 출금액이 부족합니다. [ 출금실패 ]");
						return;
					}
					else {
						Bankaccount.계좌리스트.get(i).입금액 -= 출금액;
						System.out.println(" 카카오은행 출금 성공");
						return;
					}
			}
		}	
		
		System.out.println(" 동일한 계좌 혹은 비밀번호가 다릅니다.");
		
	}
	
	public void 잔고() {
		// TODO Auto-generated method stub
		System.out.println("** 잔고 **");
		System.out.print("계좌번호 : ");
		String 계좌 = sc.next();
		System.out.print("비밀번호 : ");
		String 비밀번호 = sc.next();
		
		for(int i = 0; i < Bankaccount.계좌리스트.size(); i++) {
			if(Bankaccount.계좌리스트.get(i).계좌.equals(계좌) &&
					Bankaccount.계좌리스트.get(i).비밀번호.equals(비밀번호)&& 
					Bankaccount.계좌리스트.get(i).은행코드 == 3 ) {
				System.out.println("[카카오은행] :  " + Bankaccount.계좌리스트.get(i).계좌 + " 의 잔액은 : " 
									+ Bankaccount.계좌리스트.get(i).입금액 + "입니다.");
			}
			else {
				System.out.println(" 동일한 계좌 혹은 비밀번호가 다릅니다.");
			}
		}
		
		
		
	}
	
	public void 계좌생성() {
		System.out.println(" 카카오은행 계좌생성 ");
		System.out.print(" 계좌번호 생성 : ");
		String 계좌 = sc.next();
		System.out.print(" 비밀번호 입력 :");
		String 비밀번호 = sc.next();
		System.out.print(" 계좌주 입력 : ");
		String 계좌주 = sc.next();
		
		카카오 temp = new 카카오(계좌, 비밀번호 ,계좌주 , 3);
		
		Bankaccount.계좌리스트.add(temp);
	}
}
