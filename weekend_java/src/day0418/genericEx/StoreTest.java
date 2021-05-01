package day0418.genericEx;

public class StoreTest {
	public static void main(String[] args) {
		
		StoreEx01 store = new StoreEx01();
		store.setData(10);
		
		System.out.println("저장된 데이타"+store.getData());
		
		StoreEx02 store2 = new StoreEx02();
		store2.setData("사과");
		
		System.out.println("저장된 데이타"+store2.getData());
		
		
		
		
	}
}
