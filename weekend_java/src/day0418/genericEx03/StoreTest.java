package day0418.genericEx03;

public class StoreTest {
	public static void main(String[] args) {
		Car car = new Car();
		car.name = "현대";
		
		Store<Car> store = new Store<>();
		
		store.setData(car);
		Car car01 = store.getData();
		System.out.println(car01.name);
		car01.go();
		
		String str = "사과";
// 		Car만 저장되도록 했기 때문에 다른 타입은 사용이 안됨.
//		store.setData(str); 
		
		
		
	}
}
