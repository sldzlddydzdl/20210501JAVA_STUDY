package java2_17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class java2_2 {

	public static void main(String[] args) {
		
		// 제네릭
			// < 파라미터(변수) > 
			// 사용하는 이유?? : **** 1. 형변환 자유롭다 ****
						//		2. 자료형을 변수화  
		
		List list = new ArrayList();
		// java.util
		// List 인터페이스 에 arraylist클래스 를 메모리할당
		
		list.add("java");
	//	String 문자 = list.get(0); 
			// !!문제 : string 클래스에 arraylist 자료를 담을수 없다
				// [ arraylist ] -> [ String ]
			// 아래와같은이유로 위와같은 문제가생긴다
		String 문자 = (String)list.get(0);
			// 해결방법
			// 1. 동일한 자료형으로 강제형변환
		
	//	int 숫자 = (int)list.get(1);
		
		
		
			// 자료형 크기
				int 정수 = 10;
				double 실수 = 1.5;
				//int 정수2 = 실수; // 큰상자 -> 작은상자 [ 자료형 다르다 ]
				int 정수2 = (int)실수; //강제 형변환
				
	////////////////////////////////////////////////////////////////////////////////////////
				
		List<String> list2 = new ArrayList<>();
		
		list2.add("java");
		String 문자2 = list2.get(0);
		
	///////////////////////////////////////////////////////////////////////////////////////
		
		// 예제1 : 제네릭 사용
				
		박스<String> box1 = new 박스<>();
		
		box1.t = "java"; // box1 : 박스클래스로 만들어졌지만 string 
		System.out.println("box1 출력 : " + box1.t);
				
		박스<Integer> box2 = new 박스<>();
		box2.t = 123;
		System.out.println("box2 출력 : " + box2.t);
		
		// 예제2 : 멀티 제네릭 사용
		
		멀티박스<String, Integer> box3 = new 멀티박스<String, Integer>();
													// 생략 가능
		
		box3.t = "삼성TV";
		box3.t2 = 123;
		
		System.out.println("box2 출력 : " + box3.t );
		System.out.println("box2 출력 : " + box3.t2 );
		
		//예제 3 : 와일드 카드 : ? : 모든 자료형 < 클래스 > 대응
		
		코스<사람> 일반인코스 = new 코스<>("일반인코스", 5);
		
//		list3.학생명단[0].add( new 사람("java"));
		

		
		일반인코스.학생추가(new 사람("일반인"));
		일반인코스.학생추가(new 직장인("직장인"));
		일반인코스.학생추가(new 학생("학생"));
		일반인코스.학생추가(new 고등학생("고등학생"));
		
		코스<직장인> 직장인코스 = new 코스<>("직장인코스", 5);
		
	
	//	직장인코스.학생추가(new 사람("일반인"));		오류
			// 오류 : 코스는 직장인 클래스로 선언 [ 위로 클래스 접근 x ]
		
	
		
		직장인코스.학생추가(new 직장인("직장인"));
	//	직장인코스.학생추가(new 학생("학생"));			오류
	//	직장인코스.학생추가(new 고등학생("고등학생"));	오류
		
		코스<학생> 학생코스 = new 코스<>("학생코스", 5);
		

		
	//	학생코스.학생추가(new 사람("일반인"));			오류
	//	학생코스.학생추가(new 직장인("직장인"));		오류
			// 오류 : 코스는 학생 클래스 선언 [ 슈퍼 클래스는 접근 x ]
		학생코스.학생추가(new 학생("학생"));
		학생코스.학생추가(new 고등학생("고등학생"));
			// 현재 선언된 클래스 기준으로 하위 클래스는 접근 가능
		
		코스<고등학생> 고등학생코스 = new 코스<>("고등학생코스", 5);
		
	//	고등학생코스.학생추가(new 사람("일반인"));
	//	고등학생코스.학생추가(new 직장인("직장인"));
	//	고등학생코스.학생추가(new 학생("학생"));
			// 오류 : 현재 코스는 고등학생 코스로 선언되서 슈퍼클래스로 접근 못한다.
		고등학생코스.학생추가(new 고등학생("고등학생"));
		
		// 클래스가 같거나 하위 클래스는 담을수있다.
		// 클래스는 같으나 상위클래스로 접근할수는 없다.
		
		System.out.println();
		System.out.println(" 코스<?> 코스 명단");
		
		학생명단(일반인코스);
		학생명단(직장인코스);
		학생명단(학생코스);
		학생명단(고등학생코스);
		System.out.println();
		System.out.println(" 코스<학생> 코스 명단");
		
	//	학생명단2(일반인코스);
	//	학생명단2(직장인코스);
		학생명단2(학생코스);
	//	학생명단2(고등학생코스);
		System.out.println();
		System.out.println(" 코스<? extends 학생> 코스 명단");
		
	//	학생명단3(일반인코스);
	//	학생명단3(직장인코스);
		학생명단3(학생코스);
		학생명단3(고등학생코스);
		System.out.println();
		System.out.println(" 코스<? super 직장인> 코스 명단");
		
		학생명단4(일반인코스);
		학생명단4(직장인코스);
	//	학생명단4(학생코스);
	//	학생명단4(고등학생코스);
		
		
	}
	
							// ? : < 모든 클래스 >
	public static void 학생명단( 코스<?> course) {
		
		System.out.println("과정명 : " + course.과정명 +
				Arrays.toString(course.학생명단));
		
	}
	
	public static void 학생명단2( 코스<학생> course) {
		
		System.out.println("과정명 : " + course.과정명 +
				Arrays.toString(course.학생명단));
		
	}
						
							// 학생클래스로 상속받은애들만 받을수 있다.
	public static void 학생명단3( 코스<? extends 학생> course) {
		
		System.out.println("과정명 : " + course.과정명 +
				Arrays.toString(course.학생명단));
		
	}
	
public static void 학생명단4( 코스<? super 직장인> course) {
		
		System.out.println("과정명 : " + course.과정명 +
				Arrays.toString(course.학생명단));
		
	}
	
	
	
	
	
	
}
