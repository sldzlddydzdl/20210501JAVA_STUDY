package programmers;

import java.util.*;

public class 메뉴리뉴얼 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] orders = { "ABCFG", "AC", "CDE", "ACDE", "BCFG", "ACDEH" };
		int[] course = {2 ,3 ,4};
		
		for(String s : solution(orders, course))
			System.out.println(s);

		
	}
	
	
	
  public static String[] solution(String[] orders, int[] course) {
	        List<String> answer = new ArrayList<>();
	        List<String> list = new ArrayList<>();
	        HashMap<String, Integer> map = new HashMap<>();
	        
	        for(int i = 0 ; i < course.length; i++){
	            for(int j = 0; j < orders.length; j++){
	                for(int k = 0 ; k < (1 << orders[j].length()); k++){
	                    if(Integer.bitCount(k) != course[i])
	                        continue;
	                    
	                    String allmenu = "";
	                    for(int s = 0; s < orders[j].length(); s++){
	                        if( ( k & ( 1 << s ) ) != 0 ){
	                            allmenu += orders[j].charAt(s);
	                        }
	                    }
	                    char[] ch = allmenu.toCharArray();
	                    Arrays.sort(ch);
	                    String newallmenu = "";
	                    for(char m : ch)
	                        newallmenu += m;
	                    System.out.println(newallmenu);
	                    list.add(newallmenu);
	                }
	            }
	            
	            for(String key : list)
	            	map.put(key, map.getOrDefault(key, 0) + 1);
	            
	            int a= 0;
	            int max = 0;
	            
	            for(String key : list) {
	            	a = map.get(key);
	        
	            	max = Math.max(max, a);
	            }
	           
	            
	            while(map.containsValue(max) && max >= 2) {
	            	answer.add(getKey(map, max));
	            	System.out.println("max 에 대한 키값 : " + getKey(map, max));	
	            	map.remove(getKey(map,max), max);
	            }
	            
//	            Iterator<String> keys = map.keySet().iterator();
//	            while(keys.hasNext()) {
//	            	String key = keys.next();
//	            	System.out.println("max 에 대한 키값 : " + getKey(map, max));	
//	            }
	            
	            
	            System.out.println("max : " + max);
	            System.out.println("결과 : " + map);
	            list.clear();
	            map.clear();
	        }        
	        
	        String[] result = new String[answer.size()];
	        for(int i = 0 ; i < result.length; i++) {
	        	result[i] = answer.get(i);
	        }
	        Arrays.sort(result);
	        return result;
	    }
	 
	 
	 
	 
	 public static <String, Integer> String getKey(Map<String,Integer> map, Integer value) {
		 for(String key : map.keySet()) {
			 if(value ==  map.get(key)) {
				 return key;
			 }
		 }
		 return null;
		 
	 }
}

// AB AC AF AG BC BF BG CF CG FG , BA CA FA GA CB FB GB FC GC GF