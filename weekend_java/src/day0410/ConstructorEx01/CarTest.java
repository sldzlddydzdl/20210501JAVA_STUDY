package day0410.ConstructorEx01;

public class CarTest {
	public static void main(String[] args) {
		
		//기본생성자는
		//내가 다른 생성자를 정의하면
		//자동으로 만들어 주지 않는다.
		Car car = new Car(); // 기본 생성자 호출이 안됨
//		Car car1 = new Car("소나타", 30000);
	
		Car car2 = new Car("K7");
		Car car3 = new Car("123", 3, "123211");
		
	}
}
