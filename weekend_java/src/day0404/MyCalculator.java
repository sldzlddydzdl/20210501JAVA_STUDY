package day0404;

public class MyCalculator {
//	MyCalculator 클래스 생성
//	두 수의 차를 구하는 sub 메서드 구현(첫 번째 인자 - 두 번째 인자)
//	두 수의 곱을 반환하는 mul 메서드 구현
//	두 수의 나눗셈을 구하여 출력하는 메서드 div구현
//	두 수의 차이를 구하여 반환하는 메서드 abs 구현 ( 두 수의 차이 절대값 )
//	
//	MyCalculatorTest 클래스 생성
//	main 메서드에서 위 클래스 객체를 만들어 메서드를 호출하는 결과값을 출력하시오.
	
	String ShowSub(int a, int b) {
		if(a > b) return a + " - " + b + " = " +  (a - b);
		else return b + " - " + a + " = " + (b - a);
	}
	
	String ShowMul(int a, int b) {
		return a + " X " + b + " = " +  (a * b);
	}
	
	String ShowDiv(double a , double b) {
		return a + " / " + b + " "
				+ "= " +  (a / b);
	}
	
	String Calculator(int a, int b, char cal) {
		String s = "";
		
		switch(cal) {
			case '+' :
				s = a + " " + cal +  " " + b + " = " + (a + b);
				break;
			case '-' :
				s = a + " " + cal +  " " + b + " = " + (a - b);
				break;
			case '*' :
				s = a + " " + cal +  " " + b + " = " + (a * b);
				break;
			case '/' :
				s = a + " " + cal +  " " + b + " = " + (a / b);
				break;
			case '%' :
				s = a + " " + cal +  " " + b + " = " + (a % b);
				break;
			default :
				System.out.println("올바른 연산자를 골라주세요");
				break;	
		}
		
		return s;
	}
	
}
