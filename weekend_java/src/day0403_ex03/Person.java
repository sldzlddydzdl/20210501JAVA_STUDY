package day0403_ex03;

public class Person {

	String name;
	Car car;
	Phone phone;
	Shoes shoes;
	
	public void PrintInfo() {
		System.out.println("제 이름은 " + name + "입니다");
		System.out.println("제 차의 이름은 " + car.name + " 이고 " + "제 차는 " + car.price + " 입니다");
		System.out.println("제 핸드폰의 이름은 " + phone.name + "이고" + "브랜드는 " + phone.brand + " 이고 " + phone.price +"원 짜리입니다.");
		System.out.println("제 신발의 브랜드는 " + shoes.brand + "이고" + "사이즈는는 " + shoes.size + " 이고 " + shoes.price +"원 짜리입니다.");
	}
}
