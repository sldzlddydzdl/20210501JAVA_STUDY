package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class exexex {

	public static void main(String[] args) {
		
		System.out.println("*subString() 을 사용하여 java의 인덱스에서 문자열의 문자 교체*");
		////////////////////////////////////////////////////////////////////////////
//			*subString() 을 사용하여 java의 인덱스에서 문자열의 문자 교체*/////
		String ab = "This is A String";
		int index = 8;
		
		String newString = ab.substring(0,index) + 'a' + ab.substring(index +1);
		
		System.out.println(newString+"\n\n");
		
		//////////////////////////////////////////////////////////////////////////////
		
		
		
		
		//////////////////////////////////////////////////////////////////////////////
		// * StringBuilder() 를 사용하여 java의 인덱스에서 문자열의 문자 교체
		
		System.out.println("* StringBuilder() 를 사용하여 java의 인덱스에서 문자열의 문자 교체 *");
		String bc = "This is A String";
		
		StringBuilder newString2 = new StringBuilder(bc);
		
		newString2.setCharAt(8 , 'a');
		
		System.out.println(newString2+"\n\n");
		
		//////////////////////////////////////////////////////////////////////////////
		
		
		
		//////////////////////////////////////////////////////////////////////////////
		// * 문자열을 chars의 Array로 변환하여 java의 Index에서 문자열의 문자르 대체
		
		System.out.println("* 문자열을 chars의 Array로 변환하여 java의 Index에서 문자열의 문자르 대체 *");
		String oldString = "This is an example Strimg";
		int index2 =23;
		char[] charArray = oldString.toCharArray();
		charArray[index2] = 'n';
		
		String newString3 = String.valueOf(charArray);
		
		System.out.println(newString3);
		
		
		List<List<Integer>> list = new ArrayList<>();
		
		List<Integer> small = new ArrayList<>();
		List<Integer> num = new ArrayList<>();
		
		for(int i = 0 ; i < 3; i++) {
			small.add(i);
		}
		
		
		num.add(3);
		num.add(5);
		num.add(2);
		num.add(15);
		num.add(10);
		num.add(7);
		
			list.add(small);
			Collections.sort(num, Collections.reverseOrder());
		
			for(int i =0 ; i < num.size(); i++) {
				System.out.println(num.get(i));
			}
			
		int ret = Collections.binarySearch( num , 3 , Collections.reverseOrder());
		
		
		System.out.println(ret);
	}

}
