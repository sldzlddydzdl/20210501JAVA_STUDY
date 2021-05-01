package day0417.dateEx;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
		
		System.out.println(now.getYear()+"년");
		System.out.println(now.getMonth());
		System.out.println(now.getMonthValue()+"월");
		System.out.println(now.getDayOfMonth()+"일");
		
		System.out.println(now.getHour()+"시");
		System.out.println(now.getMinute()+"분");
		System.out.println(now.getSecond()+"초");
		System.out.println(now.getNano()+"나노초");
		
		// 특정 일의 날짜는?
		LocalDate theDay = LocalDate.parse("2021-12-25");
//		LocalDateTime theDayTime = LocalDateTime.parse("2021-12-25T10:10:10");
		LocalDateTime theDayTime = LocalDateTime.parse("2021-12-25 10:10:10", DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
//		System.out.println(theDay);
//		if(theDay.plus(100) == true) {
//			
//		}
//		System.out.println(theDayTime);
		System.out.println(theDayTime.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
		
		//https://docs.oracle.com/javase/7/docs/api/
	}
}
