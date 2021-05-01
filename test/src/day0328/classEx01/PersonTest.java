package day0328.classEx01;

import java.util.Scanner;

public class PersonTest {
	
	public static void main(String[] args) { // 자바는 항상 main부터 실행한다.
		// Person 이라는 클래스로 객체를 만들어 보자.
		// 객체를 만드는 키워드는? new 
		// 클래스명 변수명 : 변수의 선언 
		// 변수 = new 클래스명(); 객체 생성과 대입
		
		/*
		System.out.println("---------------------------");
		// 클래스 : 사용자 정의 자료형
		Person person1 = new Person(); // 비어있는 객체
		
		// 객체에 있는 필드에 값을 넣는 방법
		// . 연산자를 이용한다.
		// 변수명.필드명
		person1.name = "송광호";
		person1.age = 40;
		person1.money = 1000000;
		
		// 메서드 호출
		// 변수명.메서드명();
		person1.introduce();
		
		Person person2 = new Person();
		person2.name = "유재석";
		person2.age = 43;
		person2.money = 1000;
		
		person2.introduce();
		
		Person person3 = new Person();
		person3.name = "강호동";
		person3.age = 45;
		person3.money = 5000;
		
		person3.introduce();
		
		System.out.println("person2의 이름은 : " + person2.name);
		System.out.println("person3의 이름과 나이는 : " + person3.name + " , " + person3.age);
		
		// 송광호의 나이를 70으로 바꾸고
		// 돈을 10억으로 변경하여 
		// 출력하세요.
		person1.age = 70;
		person1.money = 1000000000;
		person1.introduce();
		*/
		
		/*
		 *  하나의 값을 담기 위해서는 변수가 필요함
		 *  같은 자료형의 데이터를 여러개 담기 위해서는 배열이 필요하다
		 *  서로다른 자료형의 데이터를 담기 위해서는 클래스가 필요하다.
		 *  
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("이름 , 나이 , 국어성적 , 영어성적 , 수학성적 순으로 입력해주세요~");
		Student student = new Student(sc.next(), sc.nextInt(), sc.nextInt()
										, sc.nextInt(), sc.nextInt());
		student.show();
	}
}
