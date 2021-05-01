package day0410.Extends03;

//super클래스 , parent클래스, base클래스
public class Person {
	String name;
	
	Person(String name){
		this.name = name;
	}
	

	//필드 name을 반환하는 메서드
	String getName() {
		return name;
	}
	
	//필드 name에 값을 넣어주는 메서드
	void setName(String name) {
		this.name = name;
	}
	
	// 필드의 내용을 출력하는 메서드
	void printInfo() {
		System.out.println("이름 : " + name);
	}
}
