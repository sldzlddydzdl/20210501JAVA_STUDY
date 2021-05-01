package day0328.classEx01;

// 객체는 class를 이용하여 만든다.
// 클래스는 설계도다. 
// 클래스의 형식
// class 클래스명{ 필드 , 메서드 }
// 클래스명은 반드시 대문자로 시작한다.

public class Person {
	
	// 필드 , 멤버변수
	String name;
	int age;
	int money;
	
	// 메서드 , 동작
	void introduce () {
		System.out.println("나의 이름은 : " + name );
		System.out.println("내 나이는 : " + age);
		System.out.println("나는 " + money + " 원을 갖고있음");
		System.out.println("---------------------------");
	}

	
}
