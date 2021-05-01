package java2_19;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;




public class 회원제포인트관리프로그램 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<회원> 회원트리 = new TreeSet<>();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println(" ** 회원제 프인트관리 **");
			System.out.println(" 회원명단 : " + 회원트리);
			System.out.println(" 1. 회원가입 2.로그인");
			int 선택 = sc.nextInt();
			
			if(선택 ==1) {
			
				System.out.println("*** 회원가입 ***");
				System.out.println(" 아이디 : ");
					String 아이디 = sc.next();
				System.out.println(" 비밀번호 : ");
					String 비밀번호 = sc.next();
				System.out.println(" 이름 : ");
					String 이름 = sc.next();
					
				회원 temp = new 회원(아이디 ,비밀번호 ,이름 ,10);
				회원트리.add(temp);
			}
			
			if(선택 ==2) {
				
				System.out.println(" ** 로그인 **");
				System.out.println(" 아이디 : ");
				 String id = sc.next();
				System.out.println(" 비밀번호 : ");
				 String pw = sc.next();
				 
				 Iterator<회원> iterator = 회원트리.iterator();
				 while( iterator.hasNext()) {
					 
					 회원 temp = iterator.next();
					 
					 if(temp.아이디.equals(id) &&
							 temp.비밀번호.equals(pw)) {
						 while(true) {
							 System.out.println(" 로그인성공");
							 temp.포인트 += 5;
							 System.out.println("*** 포인트 관리 ***");
							 System.out.println(" 1. 포인트 순으로 ");
							 System.out.println(" 2. 이름순으로 ");
							 System.out.println(" 3. 종료 ");
							 int 선택2 = sc.nextInt();
							 
							 if(선택2 == 1) {
								 
								 TreeSet<회원> 포인트정렬 = new TreeSet<회원>(new 포인트정렬());
								 
								 System.out.println(" 포인트별 회원목록 [ 내림차순 ] ");
								 System.out.println(" 아이디\t이름\t포인트 ");
								 
								 NavigableSet<회원> 이름정렬 = 회원트리.descendingSet();								 
								 
								 for(회원 temp2 : 이름정렬)
									 	System.out.println(temp2.아이디 + "\t" + temp2.이름 + "\t" + temp2.포인트);	 
								 
								 System.out.println(" 포인트별 회원목록 [ 오름차순 ] ");
								 System.out.println(" 아이디\t이름\t포인트 ");
								 
								 이름정렬 = 회원트리.descendingSet().descendingSet();
								 for(회원 temp2 : 이름정렬)
									 	System.out.println(temp2.아이디 + "\t" + temp2.이름 + "\t" + temp2.포인트);
								 
								 
							 }
							 if(선택2 == 2) {
								 System.out.println(" 이름별 회원목록 [ 내림차순 ] ");
								 System.out.println(" 아이디\t이름\t포인트 ");
								 
								 NavigableSet<회원> 이름정렬 = 회원트리.descendingSet();
								 for(회원 temp2 : 이름정렬)
									 	System.out.println(temp2.아이디 + "\t" + temp2.이름 + "\t" + temp2.포인트);	 
								 
								 System.out.println(" 이름별 회원목록 [ 오름차순 ] ");
								 System.out.println(" 아이디\t이름\t포인트 ");
								 
								 이름정렬 = 회원트리.descendingSet().descendingSet();
								 for(회원 temp2 : 이름정렬)
									 	System.out.println(temp2.아이디 + "\t" + temp2.이름 + "\t" + temp2.포인트);	 
								  
							 }
							 if(선택2 == 3) {
								 break;
								 
							 }
						 }
						 break;
					 }
					 
				 }
				 /*
				 회원 temp = new 회원();
				 
				 
				 if(id.equals(temp.아이디)) {
					 if(pw.equals(temp.비밀번호)) {
						 System.out.println(" 로그인성공");
						 temp.포인트 += 5;
						 
						 System.out.println("*** 포인트 관리 ***");
						 System.out.println(" 1. 포인트 순으로 ");
						 System.out.println(" 2. 이름순으로 ");
						 System.out.println(" 3. 종료 ");
						 int 선택2 = sc.nextInt();
						 
						 if(선택2 == 1) {
							 NavigableSet<회원> 점수정렬 = 회원트리.descendingSet();
							 for(회원 temp2 : 점수정렬)
								 	System.out.print(temp2.포인트 + " ");
							 
							 점수정렬 = 회원트리.descendingSet().descendingSet();
							 for(회원 temp3 : 점수정렬)
								 System.out.println(temp3.포인트 + " ");
						 }
						 if(선택2 == 2) {
							 NavigableSet<회원> 이름정렬 = 회원트리.descendingSet();
							 for(회원 temp2 : 이름정렬)
								 	System.out.print(temp2.이름 + " ");
							 
							 이름정렬 = 회원트리.descendingSet().descendingSet();
							 for(회원 temp3 : 이름정렬)
								 System.out.println(temp3.이름 + " ");
							 
						 }
						 if(선택2 == 3) {
							 break;
							 
						 }
						 
						 
						 
						 
						 
						 
					 }
					 else {
						 System.out.println("비밀번호가 틀렸습니다.");
					 }
				 }
				 else {
					System.out.println("아이디가 틀렸습니다.");
				 }
				*/
				
			}
		}
		
	}

}
