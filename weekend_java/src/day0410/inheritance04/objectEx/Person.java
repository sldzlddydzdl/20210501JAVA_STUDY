package day0410.inheritance04.objectEx;

public class Person {
	private String name;
	private int age;

	public Person(String name , int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " + age;
	}
	
}
