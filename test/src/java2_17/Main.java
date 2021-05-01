package java2_17;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	
	
	public static Scanner sc = new Scanner(System.in);
//	public static 카드사<String, Integer, Integer> 카드 = new 카드사<>(sc.next() ,sc.nextInt() , s );
	
	public static void main(String[] args) {
		
		회원목록<신한카드> 신한카드명단 = new 회원목록<>("신한카드" , 5);
		회원목록<국민카드> 국민카드명단 = new 회원목록<>("국민카드" , 5);
		회원목록<롯데카드> 롯데카드명단 = new 회원목록<>("롯데카드" , 5);
		
		카드사 card = new 카드사();
		
		Random ra = new Random();
		int count = 0;
		int count1= 0; 
		int count2 = 0;
		while(true) {
			System.out.println(" ***** 카드사 회원관리 프로그램 *****");
			System.out.println("========= 회원명단 ========");
			
				Object[] temp1 = 신한카드명단.회원목록;
				Object[] temp2 = 신한카드명단.회원목록;
				Object[] temp3 = 신한카드명단.회원목록;
				if(temp1[0] == null && temp2[0] == null && temp3[0] == null) {
					System.out.println("\n      현재명단이 없습니다     ");
				}
				else {
					회원명단(신한카드명단);	
					회원명단(국민카드명단);
					회원명단(롯데카드명단);	
				}
			
			System.out.println();
			System.out.println("===========메뉴===========");
			System.out.println("1. 등록  2.탈퇴  3.종료");
			System.out.print(" 선택 : ");
			int ch = sc.nextInt();
			if(ch == 1) { // 카드 등록
		
				System.out.println(" 1.모든연령[신한카드] 2. 연령별카드[국민카드(성인) , 롯데카드(청소년) ");
				
				int choice = sc.nextInt();
				
				System.out.println(" 이름을 입력해주세요 : ");
					String 이름 = sc.next();
				System.out.println(" 나이를 입력해주세요 : ");
					int 나이 = sc.nextInt();
					
					int 카드번호 = ra.nextInt(5) + 1;
								
				
			//	temp.카드등록(sc.next(), sc.nextInt(), s);
							
				if(choice == 1) {
					
					신한카드명단.회원추가(new 신한카드(이름, 나이, 카드번호));
					
					Object[] 신한temp = 신한카드명단.회원목록;
					
					count++;
					if(count >= 2) {
						
						for(int i = count-1; i > 0; i--) {
							신한카드 sinhan1 = (신한카드)신한temp[0];
							for(int j  = i -1 ; j > 1; j--) {
								신한카드 sinhan2 = (신한카드)신한temp[j]; 
								while(sinhan1.카드번호 == sinhan2.카드번호) {
									sinhan2.카드번호 = ra.nextInt(5) +1;
									System.out.println("중복된 카드번호입니다.");
									System.out.println("중복된번호 : " + sinhan2.카드번호);
								}
							}
						}
						
						
						for(int i = 0 ; i < count-1; i++) {
							신한카드 sinhan1 = (신한카드)신한temp[i];
							for(int j = i+1; j < count; j++) {
								신한카드 sinhan2 = (신한카드)신한temp[j]; 
								while(sinhan1.카드번호 == sinhan2.카드번호) {
									sinhan2.카드번호 = ra.nextInt(5) +1;
									System.out.println("중복된 카드번호입니다.");
									System.out.println("중복된번호 : " + sinhan2.카드번호);
								}
							}						
							
						}
						
						
						
						
						
						if(count == 신한temp.length) {
							신한카드 sinhan1 = (신한카드)신한temp[0];
							신한카드 sinhan2 = (신한카드)신한temp[count-1];
							if(sinhan1.카드번호 == sinhan2.카드번호) {
								
								sinhan2.카드번호 = ra.nextInt(5) + 1;
								
							}
						}
						
						

					
						
						
					
						
						
						
					}	
					
					
					
					
				}
				
				
				if(choice == 2) {
					
					if( 나이 <= 19) {
						
						국민카드명단.회원추가(new 국민카드(이름, 나이 , 카드번호));
						
						Object[] 국민temp = 국민카드명단.회원목록;
						count1++;
						if(count1 >= 2) {
							for(int i = 0 ; i < count1-1;  i++) {
								국민카드 kook1 = (국민카드)국민temp[i];
								for(int j = i + 1; j < count1; j++) {
									국민카드 kook2 = (국민카드)국민temp[j];
									while(kook1.카드번호 == kook2.카드번호) {
										kook2.카드번호 = ra.nextInt(5)+1;
										System.out.println("중복된 카드번호입니다.");
										System.out.println("중복된번호 : " + kook2.카드번호);
									}
								}
							}
						}
						
					}
					else {
						
						롯데카드명단.회원추가(new 롯데카드(이름, 나이 , 카드번호));
						
						Object[] 롯데temp = 롯데카드명단.회원목록;
						count2++;
						if(count2 >= 2) {
							for(int i = 0 ; i < count2-1;  i++) {
								롯데카드 lotte1 = (롯데카드)롯데temp[i];
								for(int j = i + 1; j < count2; j++) {
									롯데카드 lotte2 = (롯데카드)롯데temp[j];
									while(lotte1.카드번호 == lotte2.카드번호) {
										lotte2.카드번호 = ra.nextInt(5)+1;
										System.out.println("중복된 카드번호입니다.");
										System.out.println("중복된번호 : " + lotte2.카드번호);
									}
								}
							}
						}
						
					}
					
				}
			}
			
			if(ch ==2) { // 카드 탈퇴
				
				System.out.println("탈퇴하실 카드사를 입력하세요 : ");
				System.out.println("1.신한카드 2. 국민카드 3. 롯데카드");
				int out1 = sc.nextInt();
				System.out.print(" 탈퇴하실 카드번호를 입력하세요 : ");
				int out2 = sc.nextInt();
				
				
				if(out1 == 1) {
					Object[] 신한temp = 신한카드명단.회원목록;
						
					for(int i = 0 ; i < 신한temp.length; i++) {
						
						신한카드 temp = (신한카드)신한temp[i];
						
						if(신한temp[i] == null) {
							break;
						}
						
						if(temp.카드번호  == out2) {
							신한temp[i] = null;
							
							break;
						}
					}
				}
				
				if(out1 == 2) {
					
					Object[] 국민temp = 국민카드명단.회원목록;
					
					for(int i = 0 ; i < 국민temp.length; i++) {
						
						국민카드 temp = (국민카드)국민temp[i];
						
						if(temp.카드번호  == out2) {
							국민temp[i] = null;
							break;
						}
					}
					
				}
				
				if(out1 == 3) {
					
					Object[] 롯데temp = 롯데카드명단.회원목록;
					
					for(int i = 0 ; i < 롯데temp.length; i++) {
						
						롯데카드 temp = (롯데카드)롯데temp[i];
						
						if(temp.카드번호 == out2) {
							롯데temp[i] = null;
							break;
						}
					}
				}
				
				// 1.국민카드가 2명이상에서 탈퇴하면 첫번째만 탈퇴되어야하는데 나머지 뒤에사람도 제거되는거 예외처리하기
				// 2.카드번호 중복값 제거
				
				
				
			}
			
			if(ch == 3) { // 종료
				
				break;
			}
			
			
		}
	
		
	}
	
	
	public static void 회원명단(회원목록<?> course) {
		
		System.out.println("카드사명 : " + course.카드사명 +
				Arrays.toString(course.회원목록));
		
		
	}
	

}
