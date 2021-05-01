package EX;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// 배열 활용
		
		// 크기가 5인 int 타입의 배열 numbers 을 만들어 3의 배수를 넣으시오.
		System.out.println("1 ------------------------");
		System.out.println("크기가 5인 int 타입의 배열 numbers 을 만들어 3의 배수를 넣으시오.");
		int[] numbers = new int[5];
		for(int i =0 ; i < numbers.length ;i++) {
			numbers[i] = (i+1)*3;
		}
		for(int s : numbers)
		System.out.println(s);
		
		System.out.println("2 ------------------------");
		System.out.println("크기가 26개인 char 배열 alpha 을 만들어 a~z까지 의 값을 넣고 출력하세요");
		// 크기가 26개인 char 배열 alpha 을 만들어 a~z까지 의 값을 넣고 출력하세요
		
		char[] alpha = new char[26];
		char ch = 'a';
		for(int i = 0; i < alpha.length; i++) {
			alpha[i] = ch;
			ch++;
		}
		
		for(char s : alpha)
			System.out.println(s);
		
		System.out.println("3 -----------------------");
		System.out.println("크기가 26인 copyAlpha를 만들어 alpha의 값르 복사해 넣고 출력하세요");
		// 크기가 26인 copyAlpha를 만들어 alpha의 값르 복사해 넣고 출력하세요
		
		char[] copyAlpha = new char[alpha.length];
		
		for(int i = 0 ; i < copyAlpha.length; i++) {
			copyAlpha[i] = alpha[i];
		}
		
		for(char s : copyAlpha)
			System.out.println(s);
		
		System.out.println("4 -------------------------");
		System.out.println("copyAlpha를 이용하여 알파벳을 대문자로 출력하세요.");
		// copyAlpha를 이용하여 알파벳을 대문자로 출력하세요.
		
		// a = 65
		// A = 97
		
		for(int i = 0 ; i < copyAlpha.length; i++) {
			copyAlpha[i] -= 32;
		}
		
		for(char s : copyAlpha)
			System.out.println(s);

		System.out.println("5 -------------------------");
		System.out.println("크기가 10인 int형 배열10 개 짜리를 만들고 1~100 사이의 수 중 임의의 값으로 넣은 후");
		System.out.println("모든 값을 출력해볼것.");
		System.out.println("오름차순으로 정렬하여 출력 해 볼것!");
		// 크기가 10인 int형 배열10 개 짜리를 만들고 1~100 사이의 수 중 임의의 값으로 넣은 후
		// 모든 값을 출력해볼것.
		// 오름차순으로 정렬하여 출력 해 볼것!
		
		int[] number = new int[10];
		
		int i = 0;
		while(i < number.length){
			number[i] = (int)(Math.random()*10000)+1;
			if(number[i] > 100) {
				
			}
			else {
				i++;
			}
		}
		
		Arrays.sort(number);
		for(int s : number)
			System.out.println(s);
		
		String[] str = new String[5];
		str[0] = "abcdefg";
		String s = "a";
		String K = "abcdefghijklmn";
		
		String[] k = K.split("j");
		System.out.println("k.length : " + k.length);
		System.out.println(k[0]);
		
		int a = str[0].indexOf("g");
		System.out.println("a : " + a);
		
		s.toUpperCase();
		
		char[] q = new char[3];
		q = s.toCharArray();
		
		System.out.println(q.length);
		
		
		for(char m : q)
			System.out.println(m);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
