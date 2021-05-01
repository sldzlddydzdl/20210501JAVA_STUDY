package day0404;

public class Ex01 {

	 
	/*
	 * 메서드는? 동작(기능)
	 * 형식
	 * [ 접근지정자 ] 반환타입 메서드명 (	 [	 마라미터타입 변수명, 마라미터타입 변수명.... ] ) {
	 * 						[ , ] <- 생략가능
	 * 	 
	 * 		실행할 문장1;
	 * 		실행할 문장2;
	 * 		...
	 * 
	 * }
	 * 
	 * 반환타입에는 기본적인 자료형이 올수 있다.
	 * 반환을 하지 않는 경우 void 라는 키워드를 사용한다.
	 * 
	 * 
	 * 예)
	 * void printInfo(){  메서드명 : printInfo
	 * 					  파라미터 : x
	 * 					  반환타입 : void 
	 * 		System.out.println("정보 출력");
	 * }
	 * 
	 * int sum(int num1, int num2){	 메서드명 : sum
	 * 								 파라미터 : int num1 , int num2
	 * 								 반환타입 : int
	 * 		return num1 + num2;
	 * }
	 * 
	 * 매서드는 왜 쓰지?
	 * 어떤 기능을 하나의 이름으로 실행하기 위해서.
	 * 코드의 재사용을 하기 위해
	 * 중복되는 코드를 줄이기 위해
	 * 
	 * 반환타입에는 기본적인 자료형이 올수 있다.
	 * 반환을 하지 않는 경우 void 라는 키워드를 사용한다.
	 * 반환을 하는 경우( 반환타입에 어떤 타입이 있는 경우 ) 반드시 return을 해줘야 한다.
	 * 
	 * 
	 * 
	 */
	
	
	public static void main(String[] args) {
		System.out.println("안녕하세요!");
		System.out.println("salut!");
		System.out.println("Hello!");
		System.out.println("Kon'nichiwa!");
		System.out.println("Nǐ hǎo!");
		
		// 아까 쓴 코드를 한번더 사용해야 하는 경우!
		System.out.println("안녕하세요!");
		System.out.println("salut!");
		System.out.println("Hello!");
		System.out.println("Kon'nichiwa!");
		
		// 아까 쓴 코드를 한번더 사용해야 하는 경우!
		System.out.println("안녕하세요!");
		System.out.println("salut!");
		System.out.println("Kon'nichiwa!");
		System.out.println("Nǐ hǎo!");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
