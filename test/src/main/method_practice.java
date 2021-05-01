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
		
		// 배열 -> 문자열
		Arrays.toString(a);
		
		// char 배열 -> 문자열
		String.valueOf(false);
		
		// 문자열 -> char 
	//	toCharArray;
		
		// 배열 오름차순 : 
		Arrays.sort(a);
		
		// 배열 내림차순 :
	//	Arrays.sort(a, Collections.reverseOrder());
	//	Arrays.sort(a , Collections.reverseOrder());
		
		// 2차원 배열의 길이
		int s = b[1].length;
		
		// 배열의 특정 범위만 빼기 
		
		// Arrays.copyOfRange(a, n, m) -> a배열에서  n <=   < m 인자까지 빼오기 
		n = Arrays.copyOfRange(a, 2, 4); // 2번째 인자(포함)부터 3번째 인자(미포함) 앞까지 추출
		
		
		for(int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}
		
		String str = "abcdefg";

	 	// 특정문자로 시작하는지 판단
	 	System.out.println(str.startsWith("b"));
	 		 	
	 	str.startsWith(str);
	 	
	 	// 특정문자로 끝나는지 판단
	 	System.out.println(str.endsWith("g"));
	 	
	 	str.endsWith("g");
		
	 	// 같은지 아닌지 판단
	 	System.out.println(str.equals("abcdefg"));
	 	
	 	str.equals("abcdefg");
	 	
	 	// a가 몇번째 위치하는지 판단
	 	System.out.println(str.indexOf("a"));
	 	
	 	str.indexOf("a");
	 	
	 	// str 문자열 길이 판단
	 	System.out.println(str.length());
	 	
	 	str.length();
	 	
	 	// 문자열 1개씩 나누어 배열로 반환 , 넣는 값을 기준으로 나눌수도있음(str.split(" ")
	 	String[] strarr = str.split(" ");
	 	
	 	for(int i = 0 ; i < strarr.length; i++) {
	 		System.out.print(strarr + " ");
	 	}
	 	System.out.println();
	 		
	 	// 1번째 인자부터 2번째 인자 앞까지 문자추출
	 	System.out.println(str.substring(0, 2));
	 	
	 	str.substring(0, 2); // -> 출력 : ab
	 	
	 	// 모든문자 대문자 변환
	 	str.toUpperCase(); 
	 	
	 	System.out.println(str.toUpperCase());
	 	
	 	// 모든문자 소문자 변환
	 	str.toLowerCase(); 
	 	 	
	 	System.out.println(str.toLowerCase());
	 	
	 	// 문자열 빈칸제거
	 	String str1 = "    a b c d e f g";
	 		System.out.println(str1.trim());
	 		
	 		str1.trim();
	 		
	 	// i 를 문자열로 변환
	 	System.out.println(String.valueOf(5));
	 	
	 	String.valueOf(5);
	 	
	 	//StringBuilder을 문자열로 변환
	 	StringBuilder sb = new StringBuilder("SB");
	 	sb.append(" 붙이기");
	 	
	 	System.out.println(sb);
	 	
	 	sb.insert(4, "str");
	 	
	 	System.out.println(sb);
	 	
	 	sb.delete(2 , 5);
	 	
	 	System.out.println(sb);
	 	
	 	str = str + " 붙이기";
	 	System.out.println(str);
	 	
	 	}
	

}
