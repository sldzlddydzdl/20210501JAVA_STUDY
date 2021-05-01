package day0418.genericEx02;

public class StoreTest {
	public static void main(String[] args) {
		StoreObject store = new StoreObject();
		store.setData("사과");
		
		System.out.println(store.getData());
		
		StoreObject store2 = new StoreObject();
		store2.setData(10);
		
		// 래퍼클래스와 기본타입
		Integer num = 10;
		int num01 = new Integer(20);
		
		System.out.println(store2.getData());
		
		// ------------------------------------------------
		// car를 저장해보자!
		
		StoreObject store3 = new StoreObject();
		
		Car car = new Car();
		car.name = "현대";
		
		store3.setData(car);
		
		Car car01 = (Car)store3.getData();
		String carStr = (String)store3.getData();
		
		
		
		System.out.println(store3.getData());
		
	}
}

//	오토래핑 
//	int         ->  Integer   -> Object
//	double  	->  Double    -> Object
//	long    	->  Long	  -> Object
//	char   		->  Character -> Object
//	
