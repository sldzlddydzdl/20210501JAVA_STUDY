package infrun;

import java.util.*;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] list = {"eat" , "tea", "tan" ,"ate" ,"nat" ,"bat"};
		System.out.println(solve(list));
		
	}

	
	public static List<List<String>> solve(String[] strs) {
	     
        List<List<String>> result= new ArrayList<>();

        //1
        if(strs == null || strs.length == 0)
        	return result;
        Map<String , List<String>> map = new HashMap<>();
        
        //2
        for(String str : strs) {
        	System.out.println("str : " + str);
        	char[] charArray = str.toCharArray(); // String -> char[]
        	Arrays.sort(charArray); // char[] 정렬
        	System.out.println(charArray); 
        	String key = String.valueOf(charArray); // char[] 정렬된거 -> String
        	System.out.println("key : " + key);
        	if(map.containsKey(key)) {
        		map.get(key).add(str);
        	}
        	else {
        		List<String> list = new ArrayList<>();
        		list.add(str);
        		map.put(key, list);
        	}
        }
        
        result.addAll(map.values());
        return result;
    }
	
	
}
