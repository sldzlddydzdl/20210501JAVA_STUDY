package day0410.staticEx;

import javax.print.attribute.HashAttributeSet;
import java.util.*;

public class MyStaticTest {

	public static void main(String[] args) {
		// static으로 된 아이는 객체가 없어도 사용할 수 있다.
		// 클래스명.스태틱변수, 클래스명.스태틱메서드
		MyStatic.staticNum = 10;
		MyStatic.staticPrintNum();
		System.out.println("MyStatic.staticNum : " + MyStatic.staticNum);
		
		MyStatic m = new MyStatic();
		m.num = 20;
		System.out.println("m.num :" + m.num);
		m.staticNum = 20;
		System.out.println("m.staticNum : " + m.staticNum);
		
		m.staticPrintNum();
		m.printNum();
		
		System.out.println("MyStatic.staticNum : " + MyStatic.staticNum);
		
		MyStatic m2 = new MyStatic();
		System.out.println("m2.staticNum : " + m2.staticNum);
		
		Math.random();
		System.out.println(Math.PI);
		
		Map<String, Integer> map = new HashMap<>();
		
	}

}
