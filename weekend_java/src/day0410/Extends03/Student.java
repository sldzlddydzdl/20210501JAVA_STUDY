package day0410.Extends03;


//상속은 extends 라는 키워드로 한다.
//class 클래스명 extends 부모클래스명{ } 

//서브클래스 , child클래스
//Implicit super constructor Person() is undefined 
//for default constructor. Must define an explicit constructor

// Student는 Person인가?
// 자식이 부모의 형태다 is a 관계
// java는 단일상속만 허용한다

public class Student extends Person{
	
	Student(String name){
		super(name);
	}
	
	int kor;
	int math;
	int eng;
	
	// 메서드 재정의 Override라고 한다.
	//Override - 부모의 메서드를 재정의한다.
	//어노테이션 @Override
	@Override
	void printInfo() {
		System.out.println("이름 : " + name);
		System.out.println("국어 : " + kor + ", 영어 : " +eng+ ", 수학 : " + math);
	}
}