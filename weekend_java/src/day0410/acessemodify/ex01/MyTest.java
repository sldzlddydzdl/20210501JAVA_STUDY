package day0410.acessemodify.ex01;

public class MyTest {
	public static void main(String[] args) {
		MyClass m = new MyClass();
		m.publicNum = 10;
		m.protecteNum = 10;
		m.defaultNum = 10;
		// m.privateNum =10; // private 클래스 안에서만 보인다.(사용가능)
		
		System.out.println(m.publicMethod()); // retrun 이 private이여도 된다,.
		System.out.println(m.protectedMethod());
		System.out.println(m.defaultMethod());
	
//		m.privateMethod();
		
		
	}

}
