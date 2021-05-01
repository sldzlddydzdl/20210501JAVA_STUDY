package java2_15;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static Scanner sc = new Scanner(System.in);
	public static ArrayList<회원> 회원목록 = new ArrayList<>();
	public static ArrayList<글쓰기> 글목록 = new ArrayList<>();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//1. 클래스 : 회원, 게시판[ 방문록 ]
					// [ 필드 : 아이디 , 비밀번호 , 이름]
					// [ 필드 : 내용 , 작성자 , 작성일 ]
		//2. 메소드 
					// [ 인수 , 반환값]
		
		// 회원제 게시판
		
		start();
		
	}

	// public : 전범위
	// static : 우선 메모리 할당
	public static void start() {
		
		boolean 스위치 = true;
		
		while(스위치) { 
		System.out.println(" ======== 회원제 게시판 =========");
		System.out.println(" 1. 로그인 2. 회원가입 3. 종료");
		
		try { // 예외처리 : 오류 발생시 다른 코드로 대체 =>  에러 발생시 catch 로 이동
			int 선택 = sc.nextInt();
			
			
			if(선택 ==1) {
				회원 temp = new 회원();
				temp.로그인();
			}
			else if(선택 ==2) {
				회원 temp = new 회원();
				temp.회원가입();
				if(temp.비밀번호 == null) {
					System.out.println(" ** 알림 : 회원가입 실패 ");
				}
				else {
					회원목록.add(temp);
					System.out.println(" *** 회원가입 성공 *** ");
				}
				
			}
			else if(선택 ==3) {
				//System.exit(0); // 모든 코드 종료
				//return; // 메소드 종료
				//break; // 반복문 종료
				스위치 = false; // 반복문 boolean타입 변수 추가로 반복문 종료
				System.out.println("종료되었습니다.");
			}
			else {
				System.out.println(" ** 1~3번 사이만 입력해주세요 ** ");
			}
		} catch (Exception e) {
			// TODO: handle exception
			sc = new Scanner(System.in); // 오류난 스캔에 메모리할당
			System.out.println(" 메뉴에있는 숫자를 입력해주세요 ");
			
			
			
		}
		
			

		
		
		
		}
		
		
	}

	
	
}
