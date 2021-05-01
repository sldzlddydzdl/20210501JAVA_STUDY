package day0417.dateEx;

import java.util.Calendar;
import java.util.Date;

public class CarendarEx {
	public static void main(String[] args) {
		// 날짜, 달력 관련한 클래스
		Date date = new Date(); // 잘 안씀!!
		System.out.println(date);
		
		Calendar now = Calendar.getInstance();
		
		int year = now.get(Calendar.YEAR);
		int month = now.get(Calendar.MONTH); // 0~11월
		int day = now.get(Calendar.DAY_OF_MONTH);
		
		System.out.println(year+"년");
		System.out.println((month+1)+"월");
		System.out.println(day+"일");
		
		int week = now.get(Calendar.DAY_OF_WEEK);
		switch (week) {
			case Calendar.SUNDAY:
				System.out.println("일요일");
				break;
				
			case Calendar.MONDAY:
				System.out.println("월요일");
				break;
				
			case Calendar.TUESDAY:
				System.out.println("화요일");
				break;
				
			case Calendar.WEDNESDAY:
				System.out.println("수요일");
				break;
				
			case Calendar.THURSDAY:
				System.out.println("목요일");
				break;
				
			case Calendar.FRIDAY:
				System.out.println("금요일");
				break;
				
			case Calendar.SATURDAY:
				System.out.println("토요일");
				break;
		}
		
		// 오전 오후
		int amPm = now.get(Calendar.AM_PM);
		if(amPm == Calendar.AM) System.out.println("오전");
		else System.out.println("오후");
		
		int hour = now.get(Calendar.HOUR);
		int minute = now.get(Calendar.MINUTE);
		int second = now.get(Calendar.SECOND);
		
		System.out.println(hour+"시");
		System.out.println(minute+"분");
		System.out.println(second+"초");
		
		
		
	}
}
