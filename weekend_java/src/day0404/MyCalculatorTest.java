package day0404;

import java.util.Scanner;

public class MyCalculatorTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MyCalculator my = new MyCalculator();
		System.out.println(my.ShowSub(5, 10));
		System.out.println(my.ShowMul(5, 4));
		System.out.println(my.ShowDiv(39, 4));
		
		System.out.println("연산할 두 숫자를 입력해주세요");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("연산할 연산자를 골라주세요 (+,-,/,*,% 중)");
		String s = sc.next();
		char[] ch = s.toCharArray();
		System.out.println(my.Calculator(a, b, ch[0]));
		
	}
}



