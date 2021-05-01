package test;

import java.util.ArrayList;
import java.util.Scanner;



public class test01 {

	public static void main(String[] args) {
		/*
		int[] 점수 = {83, 90 , 97};
		System.out.println("배열의 1번째 : " + 점수[0]);
		System.out.println("배열의 2번째 : " + 점수[1]);
		System.out.println("배열의 3번째 : " + 점수[2]);
		
		for(int i = 0 ; i < 점수.length; i++) {
			System.out.println(i + "번째 점수 : " + 점수[i]);
		}
		
		int[] score = new int[] {83,90,87};
		
		int sum = 0;
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		System.out.println(sum);
		
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("열을 입력하세요 : ");
		int N = sc.nextInt();
		System.out.print("행을 입력하세요 : ");
		int M = sc.nextInt();
			
		
		String[][] stu = new String[N][M];
		
		
		
		for( int i = 0; i < N; i++) {
		//	for( int j = 0; j < M; j++) {
				System.out.print(i + "번째 학생의 이름을 입력하세요 : ");
				stu[i][0] = sc.next();
				System.out.print(i + "번째 학생의 국어점수를 입력하세요 : ");
				stu[i][1] = sc.next();
				System.out.print(i + "번째 학생의 영어점수를 입력하세요 : ");
				stu[i][2] = sc.next();
				
		//	}
		}
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int stu[] = null;
		
		while(true) {
			System.out.println(" -------- 메뉴판 ----------");
			System.out.println("1. 학생수");
			System.out.println("2. 점수입력");
			System.out.println("3, 점수리스트");
			System.out.println("4. 분석");
			System.out.println("5. 종료");
			System.out.print("선택 : ");
			int ch = sc.nextInt();
			
			
			if(ch == 1) {
				System.out.println("학생수를 입력하세요 : ");
				n = sc.nextInt();
				
				stu = new int[n];
			}
			
			if(ch == 2) {
				System.out.println("학생 점수를 입력하세요 :");
				for(int i = 0 ; i < stu.length; i ++) {
					stu[i] = sc.nextInt();
				}
			}
			
			if(ch == 3) {
				System.out.println("학생들의 점수 : ");
				for(int i = 0 ; i < stu.length; i++) {
					System.out.println((i+1) + "번째 학생의 점수 : " + stu[i]);
				}
			}
			
			if(ch == 4) {
				int sum = 0;
				int max = 0;
				
				for(int i = 0;  i < stu.length; i ++) {
					sum += stu[i]; 
				}
				System.out.println("전체학생들의 평균 : " + (double)(sum/stu.length));
				
				for(int i = 0;  i < stu.length; i++) {
					if(max < stu[i]) {
						max = stu[i];
					}
				}
				System.out.println("최고점수 : " + max);
			}
			
			if(ch == 5) {
				System.out.println("종료합니다. ");
				break;
			}
		}
		*/
		
		/*
		ArrayList<String> list = new ArrayList<>();
		
		list.add("유재석");
		list.add("강호동");
		System.out.println("리스트 길이 : " + list.size());
		list.remove(0);
		System.out.println("삭제후 리스트 길이 : " + list.size());
		System.out.println("리스트 출력 : " + list.get(0));
		*/
		
		/*
		Scanner sc = new Scanner(System.in);
		
		
		ArrayList<Member> list = new ArrayList<>();
	//	int count = 0;
		
		
		while(true) {
			System.out.println(" *** 회원제 프로그램 ***");
			System.out.println(" 1.회원가입 2.로그인 3.회원탈퇴 4.회원목록");
			System.out.print("선택 : ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				Member temp = new Member();
				System.out.println(" *** 회원가입 창 *** ");
				System.out.print("가입할 아이디 : ");
				temp.id = sc.next();
				System.out.print("가입할 비밀번호 : ");
				temp.pw = sc.next();
				System.out.print("가입할 이름 : ");
				temp.name = sc.next();
				
				list.add(temp);				
			}
			
			if(ch == 2) {
				System.out.print("로그인할 아이디를 입력하세요 : ");
				String logid = sc.next();
				System.out.println("로그인할 비밀번호를 입력하세요 : ");
				String logpw = sc.next();
		
				int count = 0;
				
				for(int i = 0;  i < list.size(); i ++) {
					
					// 확실히하기 list.get(i).id.equals(logid) && list.get(i).pw.equals(logpw)
					if(logid.equals(list.get(i).id) && logpw.equals(list.get(i).pw))
					{
						System.out.println("로그인이 되었습니다.");
						count ++;
						break;
					}
					
					
				}
				if(count == 0) {
					System.out.println("비밀번호혹은 아이디가 틀렸습니다.");
				}
				
			}
			
			if(ch == 3) {
				System.out.println(" *** 회원탈퇴 창 *** ");
				System.out.print("탈퇴할 이름을 입력하세요 : ");
				String outname = sc.next();
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).name.equals(outname)) {
						list.remove(i);
					}
				break;
				}
			}
			
			if(ch == 4) {
				System.out.println(" *** 회원목록창 ***");
				for(int i = 0; i < list.size(); i++) {
					System.out.println(list.get(i).name);
				}
			}
			
		}
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		ArrayList<TellMember> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		String recentname = null;
		String recentnum = null;
		
		
		while(true) {
			System.out.println(" ------ 메뉴 창 -------");
			System.out.println("1. 전화번호 등록");
			System.out.println("2. 전화걸기");
			System.out.println("3. 전화번호부");
			System.out.println("4. 최근전화한 사람");
			System.out.println("5. 종료");
			System.out.print("선택 : ");
			int ch = sc.nextInt();
			
			if(ch == 1) {
				TellMember temp = new TellMember();
				System.out.println("------- 전화번호 등록 창 ---------");
				System.out.print("등록할 이름을 써주세요 : ");
				temp.name = sc.next();
				System.out.print("등록할 전화번호를 써주세요 : ");
				temp.tellnum = sc.next();
				
				list.add(temp);
			}
			
			if(ch == 2) {
				int count = 0;
				System.out.println("전화할 이름을 입력하세요 : ");
				String toname = sc.next();
				System.out.println("전화할 번호를 입력하세요 : ");
				String totellnum = sc.next();
				
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i).name.equals(toname) && list.get(i).tellnum.equals(totellnum)) {
						System.out.println(list.get(i).name + "에게 전화를 겁니다.");
						count++;
						recentname = list.get(i).name;
						recentnum = list.get(i).tellnum;
						break;
					}
				}
				
				if(count == 0) {
					System.out.println("전화를걸 이름이나 전화번호가 없습니다.");
				}
			}
			
			if(ch == 3) {
				System.out.println("이름\t\t전화번호");
				for(int i = 0; i < list.size(); i++) {
					
					System.out.println(list.get(i).name + "\t\t" + list.get(i).tellnum);
				}
			}
			
			if(ch == 4) {
				System.out.println("가장최근에 전화한 이름은 : " + recentname + " 이고 전화번호는 : " + recentnum + " 입니다.");
			}
			
			if(ch == 5) {
				System.out.println("종료합니다. ");
				break;
			}
			
		}
		
		*/
		
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
		int point = 0;
		if(B > C) {
			System.out.println(-1);
		}
		for(int i = 0;  i< 1000; i++) {
			point = A + (i*B) - (i*C);
			if(point < 0) {
				System.out.println(i);
				break;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
		
		





















