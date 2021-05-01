package day0418.genericEx04;

public class Store <T ,E> {
	// 저장하는 아이가 두개라면?
	
	private T data1;
	private E data2;
	public void setData1(T data) {
		this.data1 = data1;
	}
	public void setData2(E data) {
		this.data2 = data2;
	}
	
	public T getData1() {
		return data1;
	}
	
	public E getData2() {
		return data2;
	}
	
	
	
}
