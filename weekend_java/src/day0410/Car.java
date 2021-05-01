package day0410;

public class Car {
	// 생성자.
	// 객체를 생성할 때 가장먼저 호출하는 아이.
	
//  형식 : 클래스명(매개변수){ 
//	 	실행할 문장 
//	}
	
	// 필드 
	String name;
	int price;
	
	// 언제 쓰나? 객체를 초기화 하는 용도로 사용한다.
//	public Car() { } // 기본 생성자는 직접 만들지 않아도 컴파일 시 자동으로 생성해준다.
	public Car() {
		System.out.println("카 생성자 호출!!!!");
	}
	
	// 객체를 생성시에 필드에 데이타를 초기화 할때 
	// 매개변수를 받는 생성자를 호출하여 초기화 할 수 있다.
	public Car(String name ,int price) {
		
		// 필드에 파라미터로 넘어온 값을 대입
		// this : 객체자신을 의미
		this.name = name;
		this.price = price;
	}
	
	
	void printInfo() {
		System.out.println(name+","+price);
		
	}

}
