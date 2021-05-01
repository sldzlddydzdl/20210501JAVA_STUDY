package java2_11;

import java.util.Scanner;

import java2_11.*; // 패키지 호출 

public class 관리자 extends 회원 {
	
	public static Scanner scan = new Scanner(System.in);
	// 필드
	String 직급 ; 
	
	// 생성자
	public 관리자( String id , String pw , String name , String 직급 ) {
		
		super(id, pw, name);
		this.직급 = 직급;
		
	}
	public void 회원정보() {
		super.회원정보();
		System.out.println(" 직급 : " + 직급);
	}
	// 회원삭제 메소드 
	public void 회원삭제() {
		for( int i = 0 ; i <main.회원리스트.size(); i++  ) {
			
			System.out.println( i + "번");
			main.회원리스트.get(i).회원정보();
		}
		System.out.println(" 회원삭제할 번호 입력 ");
		int ch = scan.nextInt();
		main.회원리스트.remove(ch);		
	}
	
	@Override
	public void 회원목록() {
		// TODO Auto-generated method stub
		super.회원목록();
	}
	
}
