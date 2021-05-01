package java1_11;

import java.util.Scanner;

import java1_11.*;

public class 관리자 extends 회원{
	
	public static Scanner sc = new Scanner(System.in);
	
	String 직급;
	
	public 관리자(String id , String pw , String name , String 직급) {
		super(id, pw, name);
		this.직급 = 직급;
	}
	
	@Override
	public void 회원정보() {
		
		super.회원정보();
		System.out.println("등급 : " + 직급);
	}
	
	// 회원 삭제 메소드
	
	@Override
	public void 회원삭제() {
		
		for(int i = 0; i < Main.회원리스트.size(); i++) {
			
			System.out.println( i + "번");
			Main.회원리스트.get(i).회원정보();
		}
		
		System.out.println(" 회원삭제할 번호 입력 ");
		
		int ch = sc.nextInt();
		Main.회원리스트.remove(ch);
	}
	
	@Override
	public void 회원목록() {
		// TODO Auto-generated method stub
		super.회원목록();
	}
	
}
