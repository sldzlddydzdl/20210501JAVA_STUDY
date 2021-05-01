package java2_11;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
	
	public static Scanner scan = new Scanner(System.in);
	public static ArrayList<회원> 회원리스트 = new ArrayList<>();
	
	public static void main(String[] args) {
		
		// 회원제 => 로그인 // 회원가입
			// 회원 클래스 [ 슈퍼클래스 ] 상속 
				// 일반회원 [ 서브 클래스 ]
				// VIP회원 [ 서브 클래스 ]
				// 관리자 [ 서브 클래스 ] 
		int i = -1 ;
		
		while( true ) {
			
			System.out.println(" 등급 회원제 ");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			System.out.println("3.회원삭제[ 로그인시 관리자가능 ]");
			System.out.println("4.회원목록[ 로그인시 VIP가능");
			
			int ch = scan.nextInt();
			
			if( ch == 1) {
				join();
			}
			if( ch ==2 ) {
				i = login();

			}
			if( i!=-1 && ch ==3 ) {
				
				회원리스트.get(i).회원삭제();
	
			}
			
			if( i!=-1 && ch ==4 ) {
				
				회원리스트.get(i).회원목록();
	
			}
		}
		
		
	} // main 끝 
	
	public static void join() {
		
		System.out.println("1.회원 2.VIP 3.관리자");
		int ch = scan.nextInt();
		
		if( ch == 1 ) {
			System.out.println(" 아이디 , 비밀번호 , 성명 순으로 입력 : ");
			회원 temp = new 회원( scan.next() ,  scan.next()  ,  scan.next() );	
			temp.회원정보();
			회원리스트.add(temp);
			
		}
		if( ch== 2) {
			System.out.println(" 아이디 , 비밀번호 , 성명 , 혜택 순으로 입력 : ");
			VIP회원 temp = new VIP회원( scan.next() ,  scan.next()  ,  scan.next() , scan.next() );	
			temp.회원정보();
			회원리스트.add(temp);
		}
		if( ch== 3 ) {
			System.out.println(" 아이디 , 비밀번호 , 성명 , 직급 순으로 입력 : ");
			관리자 temp = new 관리자( scan.next() ,  scan.next()  ,  scan.next() , scan.next() );	
			temp.회원정보();
			회원리스트.add(temp);
		}
	}
	public static int login() {
		System.out.println(" 로그인 ");
		System.out.print(" 아이디 ");
		String logid = scan.next();
	
		System.out.print(" 비밀번호 ");
		String logpw = scan.next();
		
		for( int i = 0 ; i<회원리스트.size() ;i ++ ) {
			
			if( logid.equals(회원리스트.get(i).id ) ) {
				if( logpw.equals( 회원리스트.get(i).pw)) {
					System.out.println("로그인 성공");
					
					return i;
					
				}
				
			}
			
		}
		return -1;
	}
	

}
