package infrun;

import java.util.ArrayList;
import java.util.*;

public class LicenseKeyFormatting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "8F3Z-2e-9-wqweasdcqqw";
	//	String str = "8-5g-3-j";
		int k = 4;
		
		// 8F3Z-2E9W
		Stack<Integer> example = new Stack<>();
		
		
		for(int i = 0; i < 10000; i++) {
			example.push(i);
		}
		
		while(!example.isEmpty()) {
			System.out.println(example.pop());
		}
		
		
		System.out.println(licenseKeyFormatting(str, k));
		
	}

	// 뒤에서부터 K길이만큼 자르고, 소문자는 대문자로 변환해주어 새로운 문자열을 만들어라
	
	public static String licenseKeyFormatting(String S, int K) {
		
		/*
		String result ="";

		String newS = S.toUpperCase();
		
		Stack<Character> list = new Stack<>();
		
		
		System.out.println(newS);		
		
		for(int i = 0; i < newS.length(); i++) {
	
			
				
				if(newS.charAt(i) != '-') {
					list.push(newS.charAt(i));
					result+=list.peek();
					
					
					if(list.size() == K) {
						
						list.push('-');
						
					//	for(int j = 0 ; j < list.size(); j++) {
					//		result += list.pop();
					//		System.out.println("result : " + result);
					//	}
						
						result += list.peek();
						
						//list.clear();
					}
					
					
				}
		}
					
		System.out.println(" list ");
		
		//list.clear();
		
		while(!list.isEmpty()) {
			System.out.println(list.pop());
		}
		
		
		
		int count = 0;
		String str123 = "";
		
		for(int i = result.length()-1; i >= 0; i--) {
			
			if(count == K ) {
				count = 0;
				str123 += "-";
			}
			str123 += result.charAt(i);
			count++;
		
			
		}
	
		*/
		
		String newStr = S.replace("-" , "");
		System.out.println("newStr : " + newStr);
		
		newStr = newStr.toUpperCase();
		System.out.println("newStr : " + newStr);
		
		StringBuilder sb = new StringBuilder();
		for(int i= 0 ; i < newStr.length(); i++) {
			sb.append(newStr.charAt(i));
		}
		
		System.out.println("sb : " + sb);
		
		for(int i = K; i < newStr.length(); i=i+K) {
			sb.insert(newStr.length() - i, '-');
		}
		
		System.out.println(" --sb : " + sb);
		
		String s1 = sb.toString();
		
		return s1;
	 }

}
