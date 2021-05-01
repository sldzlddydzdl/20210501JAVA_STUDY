package java2_13;

public class java1_13_2 {

	public static void main(String[] args) {
		
		// 예외 던지기 : 해당 메소드에서 처리 못한 오류를 호출한곳으로 예외 주기
				
		try {
			findclass();
		}
		catch (Exception e) {
			System.out.println("해당 클래스를 찾을수 없습니다");
			System.out.println("오류 이유 : " + e);
		}
	}
	
	public static void findclass() throws Exception { 
		// throws Exception => 함수안에서 발생한 에러를 메인에서 메소드를 호출할때 에러가 발생하도록 에러를 던졌다
		
		
		// 한글로 된 클래스는 없다 => 예외 발생함
		Class class1 = Class.forName("java.lang.문자");
		
		
		// 만약에 해당 클래스가 있으면 출력
		System.out.println( class1 );
						
		
	}

}
