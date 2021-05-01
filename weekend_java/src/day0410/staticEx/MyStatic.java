package day0410.staticEx;

public class MyStatic {
	
	// static
	public static int staticNum;
	
	// non static
	public int num;
	
	public static void staticPrintNum() {
//		System.out.println(num);// num 은 인스턴스변수라서 아직 만들어지지 않았을 수도 있어서 쓸수없음
		System.out.println(staticNum);
		System.out.println("출력");
	}
	
	public void printNum() {
		System.out.println(num);
		System.out.println(staticNum);
		System.out.println("출력");
	}
	
	// final - 더이상 변하지 못하도록 막음. 마지막
	// final 도 메서드 에도 넣을수있다. ( 즉 , Override 도 막는다 )
	// final 변수느 대문자로 표기해준다.  
	
	// 우리가 만드는 모든 클래스는 Object라는 클래스를 상속받았음!!
	// 
	
//	메서드 or 클래스메모리
//	public void printinfo() {}
//	static 변수{클래스변수}
//	
//	스택
//	int a;
//	Student s;
//	
//	힙
//	new Student();
}
