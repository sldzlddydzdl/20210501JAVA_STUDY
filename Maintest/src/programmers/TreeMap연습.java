package programmers;

import java.util.*;

public class TreeMap연습 {
	public static void main(String[] args) {
		TreeMap<String , Integer> tree = new TreeMap<>(Collections.reverseOrder());
		
		tree.put("김동현", 10);
		tree.put("이우현", 35);
		tree.put("석창희", 25);
		tree.put("석창현", 15);
		
		int[] numbers = new int[tree.size()];
		
		int i = 0;
		for(Object o : tree.keySet()) {
			numbers[i] = tree.get(o);
			i++;
		}
		
		for(int s : numbers)
			System.out.println(s);
	
		  Map<String, String> map = new HashMap<String, String>();
	        map.put("key01", "value01");
	        map.put("key02", "value02");
	        map.put("key03", "value03");
	        map.put("key04", "value04");
	        map.put("key05", "value05");
	 
	        System.out.println("--------------방법01------------");
	        // 방법 01 : entrySet()
	        for (Map.Entry<String, String> entry : map.entrySet()) {
	            System.out.println("[key]:" + entry.getKey() + ", [value]:" + entry.getValue());
	        }
	        
	        System.out.println();
	        System.out.println("--------------방법02------------");
	        // 방법 02 : keySet()
	        for (String key : map.keySet()) {
	            String value = map.get(key);
	            System.out.println("[key]:" + key + ", [value]:" + value);
	        }
	    
	        System.out.println();
	        System.out.println("--------------방법03------------");
	        // 방법 03 : entrySet().iterator()
	        Iterator<Map.Entry<String, String>> iteratorE = map.entrySet().iterator();
	        while (iteratorE.hasNext()) {
	            Map.Entry<String, String> entry = (Map.Entry<String, String>) iteratorE.next();
	            String key = entry.getKey();
	            String value = entry.getValue();
	            System.out.println("[key]:" + key + ", [value]:" + value);
	        }
	    
	        System.out.println();
	        System.out.println("--------------방법04------------");
	        // 방법 04 : keySet().iterator()
	        Iterator<String> iteratorK = map.keySet().iterator();
	        while (iteratorK.hasNext()) {
	            String key = iteratorK.next();
	            String value = map.get(key);
	            System.out.println("[key]:" + key + ", [value]:" + value);
	        }
	        
	        
	        for(Object o : tree.keySet()) {
	        	Object s = tree.get(o);
	        	System.out.println("key :" + o + "    s : " + s);
	        }
	}
}
