package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class exexex {

	public static void main(String[] args) {
		
		System.out.println("*subString() �� ����Ͽ� java�� �ε������� ���ڿ��� ���� ��ü*");
		////////////////////////////////////////////////////////////////////////////
//			*subString() �� ����Ͽ� java�� �ε������� ���ڿ��� ���� ��ü*/////
		String ab = "This is A String";
		int index = 8;
		
		String newString = ab.substring(0,index) + 'a' + ab.substring(index +1);
		
		System.out.println(newString+"\n\n");
		
		//////////////////////////////////////////////////////////////////////////////
		
		
		
		
		//////////////////////////////////////////////////////////////////////////////
		// * StringBuilder() �� ����Ͽ� java�� �ε������� ���ڿ��� ���� ��ü
		
		System.out.println("* StringBuilder() �� ����Ͽ� java�� �ε������� ���ڿ��� ���� ��ü *");
		String bc = "This is A String";
		
		StringBuilder newString2 = new StringBuilder(bc);
		
		newString2.setCharAt(8 , 'a');
		
		System.out.println(newString2+"\n\n");
		
		//////////////////////////////////////////////////////////////////////////////
		
		
		
		//////////////////////////////////////////////////////////////////////////////
		// * ���ڿ��� chars�� Array�� ��ȯ�Ͽ� java�� Index���� ���ڿ��� ���ڸ� ��ü
		
		System.out.println("* ���ڿ��� chars�� Array�� ��ȯ�Ͽ� java�� Index���� ���ڿ��� ���ڸ� ��ü *");
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
