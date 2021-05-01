package java2_15;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class 회원 {
	
	public static ArrayList<String> 비교생일  = new ArrayList<>();
	
	public static Scanner sc = new Scanner(System.in);
	
	// 필드 = 저장소[메모리] = 변수 / 객체 등
	String 아이디;
	String 비밀번호;
	String 이름;
	String 생일;
	
	// 생성자 = 객체의 초기값
	
	
	
	// 메소드 = 코드 묶음
	public void 회원가입() {
		System.out.println(" ==== 회원가입 ====");
		System.out.println("아이디 : ");
			아이디 = sc.next();
			
			// 중복제거
			for(int i = 0 ; i < Main.회원목록.size(); i++) {
				if( Main.회원목록.get(i).아이디.equals(아이디)) {
					System.out.println(" 존재하는 아이디 입니다 ");
					return; // 메소드 끝
				}
			}
			
			
		System.out.println("비밀번호 : ");
			비밀번호 = sc.next();
		System.out.println("이름 : ");
			이름 = sc.next();
		System.out.println(" *** 주민번호앞자리 6자리를 입력해주세요 *** ");
		System.out.println("주민앞자리 : ");
			생일 = sc.next();
		
		
			
	}
	public void 로그인() {
		System.out.println(" ==== 로그인 ====");
		System.out.println("아이디 : ");
			아이디 = sc.next();
		System.out.println("비밀번호 : ");
			비밀번호 = sc.next();		
		
		
		for(int i = 0 ; i < Main.회원목록.size(); i++) {
			if(Main.회원목록.get(i).아이디.equals(아이디) && Main.회원목록.get(i).비밀번호.equals(비밀번호)){
					System.out.println("로그인 성공 ");
					int log = i;
					로그인메뉴(log); // 로그인성공시 성공한 i값을 인수로 보내기
					return;
			}
			else {
				System.out.println("** 알림 : 회원정보가 없습니다");
			}
		}
		
		
	}
	
	public void 로그인메뉴(int log) {
		
		System.out.println(" ** 알림 : " +Main.회원목록.get(log).이름 + " 님 안녕하세요");
		
		while(true) {
		System.out.println(" ====================계시판[방문록]====================== ");
		System.out.println("\t번호\t내용\t\t작성자\t작성일");
		if(Main.글목록.size() != 0) {
			for(int i = 0 ; i < Main.글목록.size(); i++) {
				System.out.println("\t" + (i) + "\t" + Main.글목록.get(i).글내용 
						+ "\t\t" + Main.글목록.get(i).작성자 + "\t" + Main.글목록.get(i).작성일);
			}
			
			
		}
		else {
			System.out.println(" ** 알림 :  게시물이 없습니다.");
		}
		
		
		Calendar cal = Calendar.getInstance();
		String 비교생일1 = "";		
				
		for(int j = 0 ; j < Main.회원목록.size(); j++) {
			for(int i = 2 ; i < Main.회원목록.get(log).생일.length()-2; i++) {
				비교생일1 += Main.회원목록.get(j).생일.charAt(i);
				
			}	
			비교생일.add(비교생일1);
			비교생일1 = "";
		}
		
		int[] 월 = new int[비교생일.size()];
		
		for(int i = 0 ; i < 비교생일.size(); i++) {
			 월[i] = Integer.parseInt(비교생일.get(i));
		}
		
		int month = cal.get(Calendar.MONTH);
		
		System.out.println(" ================== " + (month+1)  + "월 생일자 ===================== ");
		for(int i = 0 ;i < Main.회원목록.size(); i++) {
			if(month+1 == 월[i]) {
				System.out.println(Main.회원목록.get(i).이름 );
			}
		}
		System.out.println("======================================================");
		
		
		System.out.println("1.글쓰기 2.글삭제 3.글수정 4.로그아웃");
		
		try {
			int 선택 = sc.nextInt();
			if(선택 == 1) {
				글쓰기 temp = new 글쓰기();
				temp.write(log);
				Main.글목록.add(temp);
			}
			else if(선택 == 2) {
				글쓰기 temp = new 글쓰기();
				temp.remove(log);
				
			}
			else if(선택 == 3) {
				글쓰기 temp = new 글쓰기();
				temp.modify(log);
				
			}
			else if(선택 == 4) {
				System.out.println("로그아웃 합니다");
				return;
			}
			else {
				System.out.println(" 1~4번 사이만 입력해주세요 ");
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			sc = new Scanner(System.in); // 오류난 스캔에 메모리할당
			System.out.println(" 메뉴에있는 숫자를 입력해주세요 ");
			
		}
		
		
		}
	}
	
}
