package day0410;

public class CarTest {
	public static void main(String[] args) {
		
		//new Car() -> 생성자 호출
		
		Car car = new Car();
//				  생성자
		
		car.name = "소나타";
		car.price = 10000;
		car.printInfo();
		
		Car car1 = new Car("밴츠", 20000);
		System.out.println(car1.name);
	}
}
