package infrun;

import java.util.HashMap;
import java.util.Map;

public class LongestSubMostTwoDist {
	
	/*
	String[] al = { "A" , "B" , "C" ,"A" };
	HashMap<String, Integer> hm = new HashMap<>();
	for(String key : al) hm.put(key, hm.getOrDefault(key, 0) + 1);
	
	System.out.println("결과 : " + hm);
	//	결과 : {A=2, B=1, C=1}



// getOrDefault

// 찾는 키가 존재한다면 찾는 키의 값을 반환하고 없다면 기본값을 반환하는 메서드 

// 사용방법
// getOrDefault( Object key , V DefaultValue )

// 매개 변수 : 이 메서드는 두 개의 매개 변수를 허용합니다.
	// key : 값을 가져와야 하는 요소의 키입니다.
	// defaultValue : 지정된 키로 매핑된 값이 없는 경우 반환되어야 하는 기본값입니다.

	// 반환 값 : 찾는 key가 존재하면 해당 key에 매핑되어 있는 값을 반환하고, 그렇지않으면
	// 디폴트 값이 반환됩니다.
	 */
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	String s = "eceba";
		String s = "ccaabbb";
		
		System.out.println(lengthOfLongestSubstringTwoDistinct(s));
		
		
		
	}
	
	public static int lengthOfLongestSubstringTwoDistinct(String s) {
		
		
		int start = 0 , end = 0, length =0 , counter = 0;
		Map<Character, Integer> map = new HashMap<>();
		
		while(end < s.length()) {
			char endchar = s.charAt(end);
			map.put(endchar,  map.getOrDefault(endchar, 0) +1 );
			if(map.get(endchar) == 1) counter++;
			end++;
			
			while(counter > 2) {
				char startchar = s.charAt(start);
				map.put(startchar, map.get(startchar)-1);
				if(map.get(startchar ) == 0) counter--;
				start++;
			}
			System.out.println("end : " + end);
			System.out.println("start : " +start);
			System.out.println("Max 전 length : " +length);
			
			length = Math.max(length, end - start);
			
			System.out.println("Max 후 length : " +length);
			System.out.println("**********************");
		}
		
		
		
		/*
		 if(s == null || s.length() == 0) return 0;
	        int max = 0, candi = 0, i = 0, chain = 1;
	        char[] c = s.toCharArray();
	        char first, second;
	        
	        first = c[0];
	        
	        for(i = 0 ; i < c.length && c[i] == first; i++) {}
	        if(i == c.length) return i;
	        
	        max = candi = i;
	        second = c[i];
	        
	        for(i = i ; i < c.length ; i++) {
	            if(c[i] == first || c[i] == second) candi++;
	            else {
	                first = c[i-1];
	                second = c[i];
	                max = Math.max(max, candi);
	                candi = chain+1;
	            }
	            if(c[i] == c[i-1]) chain++;
	            else chain = 1;
	        }
	        
	        max = Math.max(max, candi);
	        return max;
		*/
		 return length;
	}
	

}
