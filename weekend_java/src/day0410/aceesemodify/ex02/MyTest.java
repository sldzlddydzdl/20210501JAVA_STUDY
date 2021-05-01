package day0410.aceesemodify.ex02;

import day0410.acessemodify.ex01.MyClass;

public class MyTest extends MyClass {
	public static void main(String[] args) {
		MyClass m = new MyClass(); // 다른패키지에 있는 클래스를 불러올때는 import를 해야만한다.
		m.publicNum = 10;
//		m.protecteNum = 10; // 같은 패키지 또는 다른패키지 상속받았을 때 접근 가능.
//		m.defaultNum = 10; // 같은 패키지에서만 접근 가능
		// m.privateNum =10; // private 클래스 안에서만 보인다.(사용가능)
		
		System.out.println(m.publicMethod()); // retrun 이 private이여도 된다,.
//		System.out.println(m.protectedMethod());
//		System.out.println(m.defaultMethod());
	
//		m.privateMethod();
		
		
	}

}
