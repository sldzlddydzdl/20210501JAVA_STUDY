package infrun;

import java.util.*;

public class FindAllAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "abbabaabbaaba";
		String p = "aab";
		System.out.println("결과  : " + findAnagrams(s, p));
		
	}
	
	 public static List<Integer> findAnagrams(String s, String p) {
		 
		 /* 나의풀이 (못품)
 		 List<Integer> result  = new ArrayList<>();
	     Set<Character> set = new HashSet<>();
	     char[] k = new char[p.length()];
	        
        for(int i= 0 ; i < s.length()-(p.length()-1); i++){
            int count = 0;
            int count2 = 0;
            int j = 0;
            while(j < p.length()){       
                k[j] = s.charAt(i+j);
                System.out.println("배열 k : " + k[j]);
                j++;
                
            }    
            for(int m = 0 ; m < p.length(); m ++){
            	System.out.println("***** m *****");
            	
                for(int n = 0 ; n < p.length(); n++){
                    if( p.charAt(n) == k[m]){
                    	count2++;
                    	if(count2 == p.length()*p.length()) { 
                    		set.add('!');
                    	}
                        set.add(k[m]);
                        System.out.println("set.size() : " + set.size());
                        if(set.size() == p.length()) count++;
                    }
                }
            }
            set.clear();
            if(count == 1){
                        result.add(i);
            }
            count2 = 0;
        }
        return result;
        */
		 
		// 강의풀이  
		//1
			List<Integer> result = new ArrayList<>();
			if(s == null || s.length() == 0 || p == null || p.length() == 0 
					|| s.length() < p.length()) {
				return result;
			}
		 
		//2 
			// ASCII 코드 값 256개를 다 비교하는방법 ...
			int[] patArr = new int[256]; // [0,0,0,0,0,0,1,1,1,1,0,0,0]
			for(int i = 0 ; i < p.length(); i++) {
				patArr[p.charAt(i)]++;
			}
			
			for(int i =0; i < s.length() - p.length() +1 ; i++) {
				int[] txtArr = new int[256];
				for(int j = 0 ;  j< p.length(); j++) {
					txtArr[s.charAt(i+j)]++;
				}
				
				if(check(patArr ,txtArr)) {
					result.add(i);
				}
			}
			
			return result;
	 }
	 
	 public static boolean check(int[] patArr, int[] txtArr) {
		 for(int i = 0; i< patArr.length; i++) {
			 if(patArr[i] != txtArr[i]) {
				 return false;
			 }
			 
		 }
		 
		 return true;
	 }
	 
	 
	 
	 
}
