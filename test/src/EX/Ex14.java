package EX;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		// �迭 Ȱ��
		
		// ũ�Ⱑ 5�� int Ÿ���� �迭 numbers �� ����� 3�� ����� �����ÿ�.
		System.out.println("1 ------------------------");
		System.out.println("ũ�Ⱑ 5�� int Ÿ���� �迭 numbers �� ����� 3�� ����� �����ÿ�.");
		int[] numbers = new int[5];
		for(int i =0 ; i < numbers.length ;i++) {
			numbers[i] = (i+1)*3;
		}
		for(int s : numbers)
		System.out.println(s);
		
		System.out.println("2 ------------------------");
		System.out.println("ũ�Ⱑ 26���� char �迭 alpha �� ����� a~z���� �� ���� �ְ� ����ϼ���");
		// ũ�Ⱑ 26���� char �迭 alpha �� ����� a~z���� �� ���� �ְ� ����ϼ���
		
		char[] alpha = new char[26];
		char ch = 'a';
		for(int i = 0; i < alpha.length; i++) {
			alpha[i] = ch;
			ch++;
		}
		
		for(char s : alpha)
			System.out.println(s);
		
		System.out.println("3 -----------------------");
		System.out.println("ũ�Ⱑ 26�� copyAlpha�� ����� alpha�� ���� ������ �ְ� ����ϼ���");
		// ũ�Ⱑ 26�� copyAlpha�� ����� alpha�� ���� ������ �ְ� ����ϼ���
		
		char[] copyAlpha = new char[alpha.length];
		
		for(int i = 0 ; i < copyAlpha.length; i++) {
			copyAlpha[i] = alpha[i];
		}
		
		for(char s : copyAlpha)
			System.out.println(s);
		
		System.out.println("4 -------------------------");
		System.out.println("copyAlpha�� �̿��Ͽ� ���ĺ��� �빮�ڷ� ����ϼ���.");
		// copyAlpha�� �̿��Ͽ� ���ĺ��� �빮�ڷ� ����ϼ���.
		
		// a = 65
		// A = 97
		
		for(int i = 0 ; i < copyAlpha.length; i++) {
			copyAlpha[i] -= 32;
		}
		
		for(char s : copyAlpha)
			System.out.println(s);

		System.out.println("5 -------------------------");
		System.out.println("ũ�Ⱑ 10�� int�� �迭10 �� ¥���� ����� 1~100 ������ �� �� ������ ������ ���� ��");
		System.out.println("��� ���� ����غ���.");
		System.out.println("������������ �����Ͽ� ��� �� ����!");
		// ũ�Ⱑ 10�� int�� �迭10 �� ¥���� ����� 1~100 ������ �� �� ������ ������ ���� ��
		// ��� ���� ����غ���.
		// ������������ �����Ͽ� ��� �� ����!
		
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
