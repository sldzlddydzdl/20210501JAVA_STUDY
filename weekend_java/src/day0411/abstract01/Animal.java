package day0411.abstract01;

// 추상클래스!
// "추상" 구체화되지 못하는아이!
// 객체로 만들수 없는 아이.
// 만들수 없는 동작을 가지고있다.
// 추상클래스는 추상 메서드를 갖고있는 아이이다.


public abstract class Animal {
	String name; // 필드도 가질수 있다.
	

	
	//동물이 어떻게 짖을지 알 수 없음.
	//따라서 몸통(실행할 내용을 정의 할 수 없음.)
	public abstract void bark(); 	// 추상메소드 
	
}


// abstract를 쓰는 이유
//	결제
//		두결제!!
//			
//			현금결제
//			카드결제
//			xx결제
//				 .
//			 .