package java2_13;

public class java1_13 {

	public static void main(String[] args) {
			// 오류 이유 : 1.오타(사용자입력에대한 오타) 2. 타입 3. 배열, 리스트 넘칠경우 등등등.........
		// 예외처리 : 오류 발생 했을때 다른 코드로 이동
			// try{ 실행코드[만일오류이면 catch로 이동] }  ~ catch( 예외클래스 객체명 ) { 실행코드2 } ~
				// ~ finally{ 오류가 있든 없든 무조건 실행되는 코드 }
		
			// 1. Exception : 예외 슈퍼 클래스
				// NullPointerException
				// ArrayIndexOutOfBoundsException
				// NumberFormatException
				//         ..........  등등
			
		
		// 예제1 : 정보가 null인경우 예외발생
		try {
			String 문자 = null;
			System.out.println(문자.toString());
									// 객체정보 메소드: toString()
			}
		catch (Exception 예외객체) {
			
			System.out.println("문자열이 공백입니다");
			System.out.println(" 오류 이유 : " + 예외객체);
			
		}
		
		
		// 예제2 : 배열 오류
		try {
			String[] 문자열 = new String[2];
				문자열[0] = "유재석";
				문자열[1] = "유재석";
				문자열[3] = "유재석";
			}
		catch (Exception 예외객체2) {
			// TODO: handle exception
			
			System.out.println("배열의 크기가 부족합니다.");
			System.out.println(" 오류 이유 : " + 예외객체2);
		}
		
		
		// 예제3 : 문자 => 숫자열 변환 오류
		try {
			String 문자열1 = "100";
			String 문자열2 = "a100";
			// 문자열 => 숫자열
			int 정수1 = Integer.parseInt(문자열1); // "100" => 100 변환 가능
			int 정수2 = Integer.parseInt(문자열2); // "a100" => 숫자 변환 불가능
		}
		catch (Exception 예외객체3) {
			// TODO: handle exception
			
			System.out.println("해당 문자열을 숫자열로 변환 할수 없습니다.");
			System.out.println("오류 이유 : " + 예외객체3);
		}
		
		
		// 예제4 : 다중 캐치
		try {
			String 문자열3 = null;
			System.out.println(문자열3.toString());
				// 예외 발생 => catch 로 이동 
				// 밑에 코드들은 실행조차도 못함
			
			String[] 문자열4 = new String[2];
			문자열4[0] = "유재석1";
			문자열4[1] = "유재석2";
			문자열4[2] = "유재석3";
		}
	
		// 다중캐치 쓸대 순서는 슈퍼클래스 Exception이 예외처리중 맨마지막으로해야 에러 안남
		catch (ArrayIndexOutOfBoundsException e) {  // 특정한경우에 에러발생했을때
			System.out.println("오류 이유 :" + e);
		}
		
		catch (NullPointerException e) {  // 특정한경우에 에러발생했을때
			System.out.println("오류 이유 :" + e);
		}
		
		catch (Exception e) { // 종류상관안하고 아무에러나 발생했을때
			System.out.println("오류 발생 : " + e);
		}
		
		finally { // 무조건 실행되는 코드
			System.out.println("오류 있든 없든 무조건 실행");
		}
		
		
			
			
			
	}

}
