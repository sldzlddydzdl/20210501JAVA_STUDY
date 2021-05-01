package day0418.genericEx05;

public class StoreArray<T> {
	T[] datas;
	
	public StoreArray() {
		datas = (T[]) ( new Object[10] );
	}
	
}
