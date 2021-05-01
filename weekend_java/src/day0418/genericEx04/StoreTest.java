package day0418.genericEx04;

public class StoreTest {
	public static void main(String[] args) {
		Store<String, Integer> store = new Store<>();
		store.setData1("사과");
		store.setData2(10);
		
		String s = store.getData1();
		int a = store.getData2();
		
		
		
	}
}
