package day0401.Extendex01;


//상속은 extends 라는 키워드로 한다.
//class 클래스명 extends 부모클래스명{ } 

//서브클래스 , child클래스
//Implicit super constructor Person() is undefined for default constructor. Must define an explicit constructor
public class Student extends Person{
	
	// Student() 클래스가 Person()의 클래스의 기본생성자를 호출하는게 생략되있다.
	public Student() {
		super();
	}
	
//	String name;
	int kor;
	int math;
	int eng;
	
//	public String getName() {
//		return name;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
	
}

