package java2_14;

import java.util.Calendar;
import java.util.Scanner;

public class 달력검색3 {

	public static void main(String[] args) { // 두개 연도 검색
		// 기존 달력
		
		java2_14.달력.main(args);
		
		// 검색 달력
		Scanner sc = new Scanner(System.in); // 1. 입력받기
		System.out.print("\n 검색할 연도 : ");
			int inputyear = sc.nextInt();
		System.out.print(" 시작 월 : ");
			int inputmonth = sc.nextInt();
		System.out.print("\n 끝 연도 ");
			int endyear = sc.nextInt();
		System.out.print(" 끝 월 ");
			int endmonth = sc.nextInt();
		
		if(inputyear == endyear) {
			
			for(int j = inputmonth-1; j < endmonth; j++){	
				Calendar cal = Calendar.getInstance();
				cal.set(inputyear, j , 1); // 입력한 날짜의 1일
				
			
				int sDay = cal.get(Calendar.DAY_OF_WEEK); // 입력한 날짜의 1일의 요일
				int eDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 입력한 날짜의 월 마지막 일수
				
				int nowyear = cal.get(Calendar.YEAR);
				int nowmonth = cal.get(Calendar.MONTH);
				
				// 달력 표시
				
						System.out.println("\n==================" + nowyear + "년=======" + (nowmonth+1) + "월======================");
						System.out.println("일\t월\t화\t수\t목\t금\t토");
						System.out.println("=======================================================");
						
						
						int ssDay = sDay; // 8. 공백을 넣어주고
						
						
							for(int i = 1 ; i < sDay; i++) {
								System.out.printf(" \t");
							}
							for(int i =1; i <= eDay; i++) {
								
								
								System.out.printf("%2d\t" , i);
								
								if(ssDay % 7 == 0) System.out.println(); // 8_3. ssDay 7의 배수이면 줄바꿈
																		 // 공백 + 숫자 포함 
								
								
								
								ssDay++; // 8_2. 숫자가 증가할때마다 ssDay 증가
							}
						
						
					
				}
		}
		
		
		else if(inputyear < endyear) {
			
			for(int j = inputmonth-1; j < 12; j++){	
				Calendar cal = Calendar.getInstance();
				cal.set(inputyear, j , 1); // 입력한 날짜의 1일
				
			
				int sDay = cal.get(Calendar.DAY_OF_WEEK); // 입력한 날짜의 1일의 요일
				int eDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 입력한 날짜의 월 마지막 일수
				
				int nowyear = cal.get(Calendar.YEAR);
				int nowmonth = cal.get(Calendar.MONTH);
				
				// 달력 표시
				
						System.out.println("\n==================" + nowyear + "년=======" + (nowmonth+1) + "월======================");
						System.out.println("일\t월\t화\t수\t목\t금\t토");
						System.out.println("=======================================================");
						
						
						int ssDay = sDay; // 8. 공백을 넣어주고
						
						
							for(int i = 1 ; i < sDay; i++) {
								System.out.printf(" \t");
							}
							for(int i =1; i <= eDay; i++) {
								
								
								System.out.printf("%2d\t" , i);
								
								if(ssDay % 7 == 0) System.out.println(); // 8_3. ssDay 7의 배수이면 줄바꿈
																		 // 공백 + 숫자 포함 
								
								
								
								ssDay++; // 8_2. 숫자가 증가할때마다 ssDay 증가
							}
						
						
					
				}
			///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			for(int j = 0; j < endmonth; j++){	
				Calendar cal = Calendar.getInstance();
				cal.set( endyear, j , 1); // 입력한 날짜의 1일
				
			
				int sDay = cal.get(Calendar.DAY_OF_WEEK); // 입력한 날짜의 1일의 요일
				int eDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // 입력한 날짜의 월 마지막 일수
				
				int nowyear = cal.get(Calendar.YEAR);
				int nowmonth = cal.get(Calendar.MONTH);
				
				// 달력 표시
				
						System.out.println("\n==================" + nowyear + "년=======" + (nowmonth+1) + "월======================");
						System.out.println("일\t월\t화\t수\t목\t금\t토");
						System.out.println("=======================================================");
						
						
						int ssDay = sDay; // 8. 공백을 넣어주고
						
						
							for(int i = 1 ; i < sDay; i++) {
								System.out.printf(" \t");
							}
							for(int i =1; i <= eDay; i++) {
								
								System.out.printf("%2d\t" , i);
								
								if(ssDay % 7 == 0) System.out.println(); // 8_3. ssDay 7의 배수이면 줄바꿈
																		 // 공백 + 숫자 포함 
								
								ssDay++; // 8_2. 숫자가 증가할때마다 ssDay 증가
							}
						
				}
		}
		else {
			System.out.println("올바른 날짜 입력 아닙니다.");
		}
			
			
		
				
	}

}
