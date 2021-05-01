package day0410.aceesemodify.ex02;

import day0410.acessemodify.ex01.MyClass;

public class MySubClass extends MyClass {
	void printInfo() {
		System.out.println(publicNum);
		System.out.println(protecteNum);
		
		// 같은 패키지가 아니므로 에러가 생긴다.
//		System.out.println(defaultNum);
//		System.out.println(privateNum);
	}
}
