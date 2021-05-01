package day0410.ConstructorEx01;

public class Car {
	String name;
	int price;
	String color;
	
	public Car(String name, int price) {
		System.out.println("Car(String name, int price)");
		this.name = name;
		this.price = price;
	}

	public Car(String name) {
		this.name = name;
	}

	public Car() {
		
	}

	public Car(String name, int price, String color) {
		// 다른 생성자를 호출
		this(name ,price); // public Car(String name , int prcie){} 생성자 호출
		this.color = color;
		System.out.println("Car(String name, int price, String color)");
	}
	
	
}
