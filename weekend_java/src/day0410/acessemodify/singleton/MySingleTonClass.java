package day0410.acessemodify.singleton;

public class MySingleTonClass {
	//싱글톤패턴 만들기
	//프로그램상 무수히 많이 생기고 삭제되는 객체로 인해 발생되는 문제를 해결하고자
	//객체를 한번만 만들어 재사용 할 수 있도록 하는 방식!!!
	
	// 일단은 외부에서 객체 생성을 막고
	private MySingleTonClass() {}
	private static MySingleTonClass instance = new MySingleTonClass();
	// static : 자바를 실행할때 처음 메모리에 로드되는 시점
	public static MySingleTonClass getInstance() {
		return instance;
	}
	
	public void sum(int num1 , int num2) {
		System.out.println(num1 + num2);
	}
}
