package java2_17;

import java.util.Scanner;

public class 카드사  {
	
	String 이름; 
	int 나이;
	int 카드번호;
	
	
	public 카드사(String 이름, int 나이 , int 카드번호) {
		// TODO Auto-generated constructor stub
		this.이름 = 이름;
		this.나이 = 나이;
		this.카드번호 = 카드번호;
		
	}
	
	public 카드사() {
		// TODO Auto-generated constructor stub
	}
	
	@Override // 재정의 // toString : object 클래스 존재하는 메소드
	public String toString() {
		
		
		return "카드번호 : " + 카드번호 + "[회원명 :" + 이름 + "]" 
					+ "[나이 :" + 나이 +"]" + "\n";
	}
	
	
}
