package java2_13;

public class java1_13_3 {

	public static void main(String[] args) {
		
		// 예외 클래스 정의
			// throw new Exception("오류발생시 넣고싶은말");
			// 예외 클래스 만들기 : 클래스명 extends Exception
		
		통장 통장1 = new 통장();
		
		통장1.set금액(5000);
		System.out.println(통장1.get금액());
		
		/*
		 * 			// throw new Exception("오류발생시 넣고싶은말");
		try {
			통장1.출금(10000);
		} catch (Exception e) {
			System.out.println("오류 발생 : " + e);
		}
		*/
		
		
					// 예외 클래스 만들기 : 클래스명 extends Exception
		try {
			통장1.출금(10000);
		} catch (출금액부족 e) {
			System.out.println("오류 발생 : " + e);
		}
			
		
		
	}

}
