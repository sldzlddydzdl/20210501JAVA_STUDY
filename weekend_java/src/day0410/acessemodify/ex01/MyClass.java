package day0410.acessemodify.ex01;

public class MyClass {
	// 접근제한자란,
	// 외부접근 어디까지 허용할것이냐
	// 같은 클래스인가? 같은 패키지인가? 다른 패키지인가?
	// public , protected , private , default(아무것도 안넣는것)
	// public > protected > default > private
	public int publicNum;
	protected int protecteNum;
	/* default */	int defaultNum;
	private int privateNum;
	
	public  int publicMethod() {
		return privateNum;
	}
	
	protected int protectedMethod() {
		return privateNum;
	}
	
	int defaultMethod() {
		return privateNum;
	}
	
	private int privateMethod() {
		return privateNum;
	}
	
}
