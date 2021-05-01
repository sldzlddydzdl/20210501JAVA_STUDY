package test;

import java.util.ArrayList;
import java.util.Scanner;

public class test1234 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		ArrayList<Member> memberlist = new ArrayList<>();
		
		while(true) {
			System.out.println(" ** 회원제 프로그램 **");
			System.out.println(" 1.회원가입 2.로그인 3.회원탈퇴 4.회원목록 ");
			System.out.print(" 선택 : ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				// member 설계로 temp 객체 생성
				Member temp = new Member();
				System.out.println(" **회원가입 창** ");
				System.out.print(" 가입할 아이디 ");
				temp.id = sc.next();
				System.out.print(" 가입할 비밀번호 ");
				temp.pw = sc.next();
				System.out.print(" 가입할 이름 ");
				temp.name = sc.next();
				
				// 객체 리스트에 담기
				memberlist.add(temp);
			}
			
			if(ch == 2) {
				System.out.println(" ** 로그인 창 ** ");
				System.out.print(" 아이디 : ");
				String logid = sc.next();
				System.out.print(" 비밀번호 :  ");
				String logpw = sc.next();
				
				int count = 0;
				
				for(int i = 0; i < memberlist.size(); i ++) {
					if(memberlist.get(i).id.equals(logid) && memberlist.get(i).pw.equals(logpw)) {
						System.out.println(" ** 로그인 성공 **");
						count ++;
						break;
					}
				}
				
				
				
			}
			
			if(ch == 3) {
				
			}
			
			if(ch == 4) {
				
			}
		}

	}
	
	

}
