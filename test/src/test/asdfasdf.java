package test;

import java.util.*;

public class asdfasdf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String number = "1924";
		int k = 2;
		System.out.println(solution(number, k));
	}

	  public static String solution(String number, int k) {
	        String answer = "";
	        
	        char[] newnumber = number.toCharArray();
	        List<String> list = new ArrayList<>();
	        
	        for(int i = 0 ; i < newnumber.length; i++) {
	        	String m = String.valueOf(newnumber[i]);
	        	list.add(m);
	        }
	        
	        int[] numberlist = new int[list.size()];
	        
	        for(int i = 0; i < list.size(); i++) {
	        	numberlist[i] = Integer.parseInt(list.get(i));
	        }
	  
	        
	        // k 개 만큼 뽑아서 최대값 만들기
	        int max = 0;
        	for(int i = 0 ; i < numberlist.length-1; i++) {
        		for(int j = i+1 ; j < numberlist.length; j++) {
        			
        			String s = Integer.toString(numberlist[i]);
        			String q = Integer.toString(numberlist[j]);
        			
        			s += q;
        			int strnum = Integer.parseInt(s);
        			max = Math.max(max, strnum);
        		}
        	}
        	
	        answer = Integer.toString(max);
	        
	        
	        return answer;
	   }
	
}
