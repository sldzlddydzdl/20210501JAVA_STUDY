package java2_14;

import java.util.Calendar;

public class 달력 {   // 현재 날짜 달력

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); 			// 1. 달력 인스턴스 얻기
		
		int today = cal.get(Calendar.DAY_OF_MONTH); 	// 2. 오늘 날짜의 일수
		int nowyear = cal.get(Calendar.YEAR); 			// 3. 오늘 날짜의 연도
		int nowmonth = cal.get(Calendar.MONTH); 		// 4. 오늘 날짜의 월
		
		cal.set(nowyear , nowmonth, 1); 				// 5. 현재 달의 1일로 설정
		int sDay = cal.get(Calendar.DAY_OF_WEEK); 		// 6. 현재 1일의 요일 
		int eDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);		// 7. 현재 달의 마지막 날
		
		// 달력 표시
		System.out.println("==================" + nowyear + "년=======" + (nowmonth+1) + "월======================");
		System.out.println("=======================================================");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		
		int ssDay = sDay; // 8. 공백을 넣어주고
		
		
		for(int i = 1 ; i < sDay; i++) {
			System.out.printf(" \t");
		}
		for(int i =1; i <= eDay; i++) {
			
			if( i == today )System.err.printf("%2d\t" , i);
			else System.out.printf("%2d\t" , i);
			if(ssDay % 7 == 0) System.out.println(); // 8_3. ssDay 7의 배수이면 줄바꿈
													 // 공백 + 숫자 포함 
			
			
			
			ssDay++; // 8_2. 숫자가 증가할때마다 ssDay 증가
		}
		
		
		

	}

}
