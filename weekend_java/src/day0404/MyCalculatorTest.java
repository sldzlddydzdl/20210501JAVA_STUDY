package day0404;

import java.util.Scanner;

public class MyCalculatorTest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		MyCalculator my = new MyCalculator();
		System.out.println(my.ShowSub(5, 10));
		System.out.println(my.ShowMul(5, 4));
		System.out.println(my.ShowDiv(39, 4));
		
		System.out.println("������ �� ���ڸ� �Է����ּ���");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("������ �����ڸ� ����ּ��� (+,-,/,*,% ��)");
		String s = sc.next();
		char[] ch = s.toCharArray();
		System.out.println(my.Calculator(a, b, ch[0]));
		
	}
}



