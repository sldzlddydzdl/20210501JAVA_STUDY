package java2_14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class java22_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// API 클래스
					// 클래스 : 최상위 클래스 object
						// 모든 클래스는 object 클래스로부터 상속 받는다 !!
				
				// 1. 날짜 / 날짜/시간 관련 클래스
				// 2. SimpleDateFormat 클래스 : 날짜 형식 클래스
				// 3. Calender 클래스 : 달력
				Date 날짜 = new Date();
				System.out.println(날짜.toString());
				
				SimpleDateFormat 형식 = new SimpleDateFormat("yy년 MM월 dd일 hh시 mm분 ss초");
										// y : 연도, M : 월, d : 일, h : 시,  m : 분, s : 초
				
				System.out.println(형식.format(날짜));
				
				Calendar 달력 = Calendar.getInstance(); //  getInstace() : 해당 인스턴스[객체] 얻기
														// 오늘기준으로 달력 가져오기
				
				System.out.println("연도 : " + 달력.get(달력.YEAR)); // 현재 달력의 연도
				System.out.println("월 : " + (달력.get(달력.MONTH)+1)); // 현재 달력의 연도
				System.out.println("일[월] : " + 달력.get(달력.DAY_OF_MONTH)); // 현재 달력의 연도
				System.out.println("일[주] : " + 달력.get(달력.DAY_OF_WEEK));  // 일[1] 월[2] 화[3] 수[4] 
				System.out.println("일[년] : " + 달력.get(달력.DAY_OF_YEAR)); // 년도를 기준으로 365일 기준으로 해서 
				
				int 요일 = 달력.get(달력.DAY_OF_WEEK);
				if(요일 == 1) System.out.println("일요일");
				if(요일 == 2) System.out.println("월요일");
				if(요일 == 3) System.out.println("화요일");
				if(요일 == 4) System.out.println("수요일");
				if(요일 == 5) System.out.println("목요일");
				if(요일 == 6) System.out.println("금요일");
				if(요일 == 7) System.out.println("토요일");
				
				System.out.println(" 오전/오후 : " + 달력.get(달력.AM_PM)); // 0 오전 , 1 오후
				int 전후 = 달력.get(달력.AM_PM);
				if(전후 == 0) {
					System.out.println(" 오전");
				}
				if(전후 == 1) {
					System.out.println(" 오후");
				}
				
				
	}

}
