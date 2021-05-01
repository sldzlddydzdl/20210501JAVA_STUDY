package day0418.genericEx03;

public class Store<T> {
	private T data;
	// T는 내부적으로 Object를쓴다.
	
	public void setData(T data) {
		this.data = data;
	}
	
	public T getData() {
		return data;
	}

}
