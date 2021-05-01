package java2_18;

import java.util.*;

public class 회원제게시판 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in); // 입력
		Map<String, String> 회원 = new HashMap<>(); // map 컬렉션
		Set<게시물> 게시판 = new HashSet<>(); // set 컬렉션
		
		while(true) {
			
			System.out.println(" ** 회원제 게시판 **");
			System.out.println("1.회원가입");
			System.out.println("2.로그인");
			int 선택 = sc.nextInt();
			
			if(선택 == 1) {
				System.out.println(" ** 회원가입 ** ");
				System.out.println(" 아이디 ");
					String 아이디 = sc.next();
				System.out.println(" 비밀번호 ");
					String 비밀번호 = sc.next();
					
				회원.put(아이디, 비밀번호); // 동일한 아이디 제거 // 동일한 키 받을수 없다.	
					
			}
			
			if(선택 == 2) {
				
				System.out.println(" ** 로그인 ** ");
				System.out.println(" 아이디 ");
					String 아이디 = sc.next();
				System.out.println(" 비밀번호 ");
					String 비밀번호 = sc.next();
				
				if(회원.containsKey(아이디)) {
					
					if(회원.get(아이디).equals(비밀번호)) {
						System.out.println(" *** 로그인 성공 *** ");
						
						while(true) {
						System.out.println(" 제목\t\t내용\t\t작성자");
							Iterator<게시물> iterator = 게시판.iterator();
							if(!iterator.hasNext()) { // 만약에 다음요소가 없으면
								System.out.println("해당 게시물이 없습니다");
							}
							while(iterator.hasNext()) {
								
								게시물 temp = iterator.next();
								
								System.out.println(temp.제목+"\t\t"+temp.내용+"\t\t"+temp.작성자);
								
							}
							System.out.println("1. 게시물 작성 2. 종료");
							int 선택2 = sc.nextInt();
							
							if(선택2 ==1) {
								System.out.println(" 제목 ");
								String 제목 = sc.next();
								System.out.println(" 내용 ");
								String 내용 = sc.next();
								
								게시물 temp2 = new 게시물(제목, 내용, 아이디);
								
								게시판.add(temp2);
							}
							if(선택2 ==2) {
								break;
							}
							
						}
						
					}
					else {
						System.out.println("패스워드 다릅니다"); // 키에 해당하는 값이 일치 않음
					}
					
				}
				else {
					System.out.println("아이디가 존재하지 않습니다"); // 키 없음
				}
			}
		}
		
	}

}
