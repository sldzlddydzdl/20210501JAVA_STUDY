package main;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class method_practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int []a = new int[8];
		int []n = new int[8];
		
		
	//	for(int i = 0 ; i < a.length; i++) {
	//		a[i] = sc.nextInt();
	//	}
		
		int [][]b = new int[2][4];
		
		// �迭 -> ���ڿ�
		Arrays.toString(a);
		
		// char �迭 -> ���ڿ�
		String.valueOf(false);
		
		// ���ڿ� -> char 
	//	toCharArray;
		
		// �迭 �������� : 
		Arrays.sort(a);
		
		// �迭 �������� :
	//	Arrays.sort(a, Collections.reverseOrder());
	//	Arrays.sort(a , Collections.reverseOrder());
		
		// 2���� �迭�� ����
		int s = b[1].length;
		
		// �迭�� Ư�� ������ ���� 
		
		// Arrays.copyOfRange(a, n, m) -> a�迭����  n <=   < m ���ڱ��� ������ 
		n = Arrays.copyOfRange(a, 2, 4); // 2��° ����(����)���� 3��° ����(������) �ձ��� ����
		
		
		for(int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		
		String str = "abcdefg";

	 	// Ư�����ڷ� �����ϴ��� �Ǵ�
	 	System.out.println(str.startsWith("b"));
	 		 	
	 	str.startsWith(str);
	 	
	 	// Ư�����ڷ� �������� �Ǵ�
	 	System.out.println(str.endsWith("g"));
	 	
	 	str.endsWith("g");
		
	 	// ������ �ƴ��� �Ǵ�
	 	System.out.println(str.equals("abcdefg"));
	 	
	 	str.equals("abcdefg");
	 	
	 	// a�� ���° ��ġ�ϴ��� �Ǵ�
	 	System.out.println(str.indexOf("a"));
	 	
	 	str.indexOf("a");
	 	
	 	// str ���ڿ� ���� �Ǵ�
	 	System.out.println(str.length());
	 	
	 	str.length();
	 	
	 	// ���ڿ� 1���� ������ �迭�� ��ȯ , �ִ� ���� �������� ������������(str.split(" ")
	 	String[] strarr = str.split(" ");
	 	
	 	for(int i = 0 ; i < strarr.length; i++) {
	 		System.out.print(strarr + " ");
	 	}
	 	System.out.println();
	 		
	 	// 1��° ���ں��� 2��° ���� �ձ��� ��������
	 	System.out.println(str.substring(0, 2));
	 	
	 	str.substring(0, 2); // -> ��� : ab
	 	
	 	// ��繮�� �빮�� ��ȯ
	 	str.toUpperCase(); 
	 	
	 	System.out.println(str.toUpperCase());
	 	
	 	// ��繮�� �ҹ��� ��ȯ
	 	str.toLowerCase(); 
	 	 	
	 	System.out.println(str.toLowerCase());
	 	
	 	// ���ڿ� ��ĭ����
	 	String str1 = "    a b c d e f g";
	 		System.out.println(str1.trim());
	 		
	 		str1.trim();
	 		
	 	// i �� ���ڿ��� ��ȯ
	 	System.out.println(String.valueOf(5));
	 	
	 	String.valueOf(5);
	 	
	 	//StringBuilder�� ���ڿ��� ��ȯ
	 	StringBuilder sb = new StringBuilder("SB");
	 	sb.append(" ���̱�");
	 	
	 	System.out.println(sb);
	 	
	 	sb.insert(4, "str");
	 	
	 	System.out.println(sb);
	 	
	 	sb.delete(2 , 5);
	 	
	 	System.out.println(sb);
	 	
	 	str = str + " ���̱�";
	 	System.out.println(str);
	 	
	 	}
	

}
