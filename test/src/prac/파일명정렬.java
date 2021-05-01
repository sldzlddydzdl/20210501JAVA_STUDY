package prac;

import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class 파일명정렬 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG" , "foo010bar020.zip"};
		String[] answer= new String[files.length];
		answer = solution(files);
		
		for(String s : answer)
			System.out.println(s);
		String asdf = "1234567";
		asdf.substring(0, 3); // index 0 ,1, 2
		System.out.println(asdf);
		
		
		
//		String k = "0101";
//		int s = Integer.parseInt(k);
//		System.out.println(s);
		
//		System.out.println((int)'0');
//		System.out.println((int)'1');
//		System.out.println((int)'2');
//		System.out.println((int)'3');
//		System.out.println((int)'4');
//		System.out.println((int)'5');
//		System.out.println((int)'6');
//		System.out.println((int)'7');
//		System.out.println((int)'8');
//		System.out.println((int)'9');
//		
//		System.out.println("a : " + (int)'a');
//		System.out.println("z : " + (int)'z');
//		System.out.println("A : " + (int)'A');
//		System.out.println("Z : " + (int)'Z');
//		System.out.println((int)' ');
//		System.out.println((int)'.');
//		System.out.println((int)'-');
//		
//		for(char ch = 'A' ; ch <= 'Z' ; ch++) {
//			System.out.print(ch);
//		}
	}
	
	
	   public static String[] solution(String[] files) {
	        String[] answer = {};
	        
	        ArrayList<String> HEAD = new ArrayList<>();
	        ArrayList<String> NUMBER = new ArrayList<>();
	        ArrayList<String> TAIL = new ArrayList<>();
	        
	        
	        List<FileName> allfiles = new ArrayList<>();
	        
	        for(String str : files) {
	        	StringTokenizer stkNum = new StringTokenizer(str, "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ.- ");
	        	
	        	String start = stkNum.nextToken();
	        	int Numlength = start.length();
	        
	        	NUMBER.add(start); // 첫번째 이름만 가져오기 
	        	
	        	
	        	StringTokenizer stkalpha = new StringTokenizer(str, "1234567890");
	        	
	        	String second = stkalpha.nextToken();
	        	int alphalength = second.length();
	        	
	        	HEAD.add(second);
	        	
	        	String newStr = str.substring( ( Numlength + alphalength ), str.length() );
	        	System.out.println(newStr);
	        	
	        	FileName temp = new FileName(second, start, newStr);
	        	allfiles.add(temp);
	        	
	        	
	        }
	        
	        for(FileName s : allfiles)
	        	System.out.println(s.HEAD + s.NUMBER + s.TAIL);
	        

	        
	      
	        return answer;
	    }
	   
	   public static class FileName implements Comparable<FileName> {
		   String HEAD;
		   int NUMBER;
		   String TAIL;
		   
			public FileName(String hEAD, String nUMBER, String tAIL) {
				
				HEAD = hEAD;
				NUMBER = Integer.parseInt(nUMBER);
				TAIL = tAIL;
			}
		   @Override
		public int compareTo(FileName o) {
			// TODO Auto-generated method stub
			   
			return NUMBER - o.NUMBER;
		}
	   }

}

































/*
for(String s : files) {
	   char[] ch = s.toCharArray();
	   
	   for(int i = 0; i < ch.length; i++) {
		   
		   // 숫자만 있을때 NUMBER 를 위한
		   if( ( (int)ch[i] >= 48 && (int)ch[i] <= 57 ) ) {
			   NUMBER.add(ch[i]);
			   
		   }
		   
		   // 알파벳만 있을때 HEAD를 위한 : 영문 대소문자 ,숫자 ,공백(" ") , 마침표("."), 빼기 부호("-") 
		   else if( ( ( ch[i] >= 'a' && ch[i] <= 'z' ) || ( ch[i] >= 'A' && ch[i] <= 'Z') ) 
				   			|| ( (int)ch[i] == 32 || (int)ch[i] == 45 || (int)ch[i] == 46 )) {
			   HEAD.add(ch[i]);
			   
		   }
		   
		   // TAIL
		   else if( ( ( ch[i] >= 'a' && ch[i] <= 'z' ) || ( ch[i] >= 'A' && ch[i] <= 'Z') ) 
		   			|| ( (int)ch[i] == 32 || (int)ch[i] == 45 || (int)ch[i] == 46 ||
		   			( (int)ch[i] >= 48 && (int)ch[i] <= 57) ) ) {
			   TAIL.add(ch[i]);
		   	}
	   }
	   
	   String head = "";
	   for(int i = 0 ; i < HEAD.size(); i++) {
		   head += HEAD.get(i).toString();
	   }
	   
	   System.out.println("head : " + head);
	   
	   String number = "";
	   for(int i = 0 ; i < NUMBER.size(); i++) {
		   number += NUMBER.get(i).toString();
	   }
	   
	   System.out.println("number : " + number);
	   
	   String tail = "";
	   for(int i = 0 ; i < TAIL.size(); i++) {
		   tail += TAIL.get(i).toString();
	   }
	   
	   System.out.println("tail : " + tail);
	   
}
 */
 
