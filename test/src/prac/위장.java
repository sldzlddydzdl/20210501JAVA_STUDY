package prac;

import java.util.*;


public class ���� {

	public static void main(String[] args) {
		String[][] clothes = {{"yellowhat", "headgear"}, 
								{"bluesunglasses", "eyewear"}, 
								{"green_turban", "headgear"}};	
		
		System.out.println(solution(clothes));
	}
	
	public static int solution(String[][] clothes) {
	        int answer = 0;
	        
	        Arrays.sort(clothes, Comparator.comparing(o1 -> o1[1]));
	        
	        for(String[] s : clothes)
	        	System.out.println(s[0] + " , " + s[1]);
	        
	        String temp = "";
	        
	        for(int i = 0 ; i < clothes.length; i++) {
	        	
	        	if(clothes[i][1].equals(temp)) {
	        		
	        	}
	        }
	        
	        
	        
	        /* hashmap ����µ� ��ĳ�ؾ����� �𸣰ٴ�. 
	        Map<String, String> mapclothes = new HashMap<>();
	        List<String> list = new ArrayList<>();
	        
	        for(int i = 0 ; i < clothes.length ;i++) {
	        	mapclothes.put(clothes[i][0] , clothes[i][1]);
	        }
	        
	        
	        for(int i = 0 ; i < clothes.length; i++) {
	        	
	        	
	        	mapclothes.get(clothes[i][0]);
	        	
	        	
	        	
	        	list.add(clothes[i][0]);
	        }
	        */
	        
//	        System.out.println(mapclothes.get("yellowhat")); // headgear
	        
	        
	        return answer;
	}
	// Ű , �� // �ߺ� Ű ���x // ���� �ߺ� ���o
	
	// ���� 1
	
//		headgear : yellowhat , green_turban
//		eyewear : bluesunglasses
		
//		1. yellowhat
//		2. green_turban
//		3. bluesunglasses
//		4. yellowhat + bluesunglasses
//		5. green_turban + bluesungglasses
//		
//		return 5;
		
	// ���� 2
	
//		face : crowmask , bluesunglasses , smoky_makeup
//		
//		1. crowmask
//		2. bluesungalsses
//		3. smoky_makeup
//		
//		return 3;
		
//	�� : ��, ��, �� // 3 
//	���� : �� , ��	// 2 
//	���� : �� , ��// 2 
//	�ѿ� : �� , ��// 2 
//	
//	3+2+2+2,
//	2 2 2 , 2 2 2 , 2 2 2 , 3 2 2 , 3 2 2 , 3 2 2 , 3 2 2 , 3 2 2  ,3 2 2
//	1 1 1 1 , 1 1 1 1 ,1 1 1 1 , 3 3 3 3 
 	
}


