package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		/*
		 int[] answer = {};
	     int k = 0;
	     long n = 123456;
	        
	     
	        String str = String.valueOf(n); // long -> string
	        String[] str1 = new String[] {str};
	     
	        int[] temp = Arrays.stream(str1).mapToInt(Integer::parseInt).toArray();
	        
	        
	       // char[] temp = str.toCharArray(); // string -> char[] 배열
	        System.out.println(temp.length);
	        for(int i = 0 ; i < temp.length; i++) {
	        	System.out.println(temp[i] + " ");
	        }
	        
	        // 홀수
	        if(temp.length % 2 == 1){
	            for(int i = 0; i <  temp.length/2; i++){
	                k = temp[temp.length -1 - i];
	                temp[temp.length - 1 - i] = temp[i];
	                temp[i] = k;
	            }
	        }
	        
	        // 짝수
	        if(temp.length %2 == 0){
	            for(int i = 0 ; i< temp.length/2; i++){
	                k = temp[temp.length -1 - i];
	                temp[temp.length - 1 - i] = temp[i];
	                temp[i] = k;
	            }
	        }
	        
	        for(int i =0 ; i < temp.length; i++) {
	        	System.out.print(temp[i]);
	        }
	        
	        System.out.println();
	        
	        char a = '2';
	        int b = (int)a;
	        System.out.println("b : " + (b-48));
	        */
		
			/*
		long n = 2345678;
		 String str = n + "";
	      int[] answer = new int[str.length()];

	      int j = 0;
	      for(int i = str.length()-1; i >= 0; i-- ){
	          answer[j] = Integer.parseInt(str.charAt(i)+"");
	          j++;
	      }

	      for(int i = 0 ; i < answer.length; i++) {
	    	  System.out.print(answer[i] + " ");
	      }
	      
	      System.out.println();
	      
	      int[] arr = new int[4];
	       arr[0] = 4;
	       arr[1] = 3;
	       arr[2] = 2;
	       arr[3] = 4;
	       int min = 1000000000;
	       
	      for(int i = 0 ; i < arr.length; i++) {
	    	  if(arr[i] < min) {
	    		   min = arr[i];
	    	  }
	      }
	      
	      System.out.println(min);
	      */
		
		/*
		int[] arr = {1 ,2 ,3 , 4 ,5};
		
		int min = 10000000;
        
        ArrayList<Integer> list = new ArrayList<>();
       
        
        for(int i = 0; i < arr.length; i++){
            list.add(arr[i]);
        }
        
        for(int i  =0 ; i < list.size(); i++) {
        	System.out.print(list.get(i) + " ");
        }
        
        System.out.println();
        
        for(int i= 0; i< arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }
        
       
        
        //list.remove(charAt(1));
        
        int[] answer = new int[list.size()];
        
        for(int i = 0 ; i < answer.length; i++){
            answer[i] = list.get(i);
        }
        
        for(int i = 0 ; i < answer.length; i++) {
        	System.out.print(answer[i] + " ");
        }
        */
		/*
        char[] ch = new char[3];
        ch[0] = '1';
        ch[1] = '2';
        ch[2] = '3';
        
        
		
        ArrayList<Character> list1 = new ArrayList<>();
        
        list1.add('1');
        list1.add('2');
        list1.add('3');
        
        
        for(int i = 0 ; i < list1.size(); i++) {
        	System.out.println(list1.get(i));
        }
        */
		/*
		int n;
		Integer[] num = {3, 4, 5, 2, 1};
		String[] leftnum = {"1" ,"4" ,"7" ,"*"};  //왼쪽줄
		System.out.println(getIndex(leftnum , "4"));
		System.out.println(getIndex(num, 3));
		
		int[] numbers = new int[3];
		numbers[0] = 1;
		numbers[1] = 3;
		numbers[2] = 5;
	//	int[] numbers = { 4, 2, 3, 5, 1};
		String number = Arrays.toString(numbers);
		
		String[] realnumber = new String[number.length()];
		
		System.out.println("charAt : " + number.charAt(0));
		
	//	for(int i = 0; i < realnumber.length; i++) {
	//		realnumber[i] = number.charAt(i);
	//	}
		//String[] realnumber = number.split("(?<!&)");
	
		
		for(int i = 0 ; i < realnumber.length; i++) {
			System.out.print(realnumber[i] + "");
		}
		
		System.out.println(realnumber[0]);
		System.out.println(realnumber[1]);
		
		System.out.println();
		*/
		
		/*
		int[] a = { 1, 2, 3, 4 };
		for(int b : a )

		System.out.print(b + " ");
		System.out.println();
		
		int[] c = Arrays.copyOfRange(a, 1, 2); // 1 <= x < 2 index 1만 복사
//		int[] c = Arrays.copyOfRange(a, 1, 4); // 1 <= x < 4 index 1 , 2 , 3 만 복사
		
		for(int i = 0 ; i < c.length; i++) {
			System.out.print(c[i] + " ");
		}
		
		System.out.println();
		
		int[] f = Arrays.copyOf(a , 4); 
		
		for(int i  = 0 ; i < f.length; i++) {
			System.out.print(f[i] + " ");
		}
		
		System.out.println();
		String[] arr = new String[3];
		arr[0] ="A";
		arr[1] ="B";    
		arr[2] ="C";
		
		for(String str : arr)
		
		System.out.print(str + " ");
		
		//Arrays.sort(a);
		//Arrays.sort(a , 1 ,3 );
		
		System.out.println();
		
		Integer q[] = { 5 ,3, 2 , 4, 1};
		
		Arrays.sort(q , Collections.reverseOrder());
		
		Arrays.sort(q , 1 ,4); // q의 배열을 1 <=  x < 4 -> index 1 , 2, 3 만 오름차순으로 정렬
		
		for(int i = 0 ; i < q.length; i++) {
			System.out.print(q[i] + " ");
		}
		
		System.out.println();
		
		 String[] strings = { "abc", "def", "ghi" };
		  String stringForStringArray = Arrays.toString(strings);
		  System.out.println(stringForStringArray);

		  int[] ints = { 1, 2, 3 };
		  String stringForIntArray = Arrays.toString(ints);
		  System.out.println(stringForIntArray);
		*/
		
		  int count = 0;
		  int n = 16;
	      int k = n;
	        int[] numbers = new int[n];
	        
	        for(int i = 0 ; i < numbers.length; i++){
	            
	            numbers[i] = n;
	            n -= 1;
	            
	        }
	        
	        for(int i = 0 ; i < numbers.length;i ++) {
	        	System.out.print(numbers[i] + " ");
	        }
	        
	        System.out.println();
	        
	        // numbers[]  = {12 ,11 ,10 ,9, 8, 7, 6, 5, 4, 3, 2, 1};
	        
	        for(int i = 0 ; i < numbers.length; i++){
	            for(int j = 0 ; j < numbers.length; j++){
	                if(numbers[i] * numbers[j] == k){
	                    count++;
	                }
	            }
	        }
	        
	        System.out.println(count);
	        int[] all = new int[count];
	        
	        int count2= 0;
	        for(int i = 0 ; i < numbers.length; i++) {
	        	for(int j = 0 ; j < numbers.length; j++) {
	        		if(numbers[i] * numbers[j] ==k) {
	        			all[count2] = numbers[i];
	        			count2++;
	        		}
	        	}
	        }
	        int sum = 0;
	        for(int i = 0; i < all.length; i++) {
	        	 sum += all[i];
	        }
	        
	        System.out.println(sum);
	        
	        String answer = "";
	        String s = "try hello world";
	        char ch = '0';
	        String[] str = s.split(" ");
	        for(int i = 0 ; i < str.length; i++) {
	        	System.out.println(str[i]);
	        }
	        
	        for(int i = 0; i < str.length; i++) {
	        	for(int j = 0 ; j < str[i].length(); j++) {
	        		if(j % 2 == 0) {
	        			if((int)str[i].charAt(j) >= 97 && (int)str[i].charAt(j) <= 122) {
	        				ch = (char)((int)str[i].charAt(j) - 32);
	        			}
	        			answer += ch;
	        			
	        			
	        		}
	        		if(j % 2 == 1) {
	        			answer += str[i].charAt(j);
	        		}
	        	}
	        	answer += " ";
	        }
	        
	        System.out.println(answer);
	        System.out.println((int)'z');
	        System.out.println((int)'Z');
	        System.out.println((int)'c');
	        System.out.println((int)'C');
	        System.out.println((int)'a');
	        System.out.println((int)'A');
	       // a = 97 , A = 65 , z =122 , Z = 90
	        
	        long p = 118372;
	        String str123 = Long.toString(p);
	        
	        System.out.println(str123);
	        
	        String[] str1234 = str123.split("(?<!^)");
	        
	        Arrays.sort(str1234, Collections.reverseOrder());
	        
	        for(int i = 0 ; i < str1234.length; i++) {
	        	System.out.print(str1234[i] + " ");
	        }
	        
	        String str12345 = "";
	        for(int i = 0 ; i < str1234.length; i++) {
	        	str12345 += str1234[i];
	        }
	        
	        
	        
	        long result = Long.parseLong(str12345);
	        
	        System.out.println(result);
	        
	      //  Arrays.sort(str1234);
	        
	      //  System.out.println(str1234);
	}
	
	public static int getIndex(Object[] array, Object obj) {
		for(int i = 0 ; i < array.length; i++) {
			if(obj.equals(array[i])) {
				return i;
			}
		}
		
		return -1;
	}

	
	

	
}
