package prac;

import java.util.*;


public class 위장 {

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
	        
	        
	        
	        /* hashmap 쓸라는데 어캐해야할지 모르겟다. 
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
	// 키 , 값 // 중복 키 허용x // 값은 중복 허용o
	
	// 예제 1
	
//		headgear : yellowhat , green_turban
//		eyewear : bluesunglasses
		
//		1. yellowhat
//		2. green_turban
//		3. bluesunglasses
//		4. yellowhat + bluesunglasses
//		5. green_turban + bluesungglasses
//		
//		return 5;
		
	// 에제 2
	
//		face : crowmask , bluesunglasses , smoky_makeup
//		
//		1. crowmask
//		2. bluesungalsses
//		3. smoky_makeup
//		
//		return 3;
		
//	얼굴 : ㅊ, ㅁ, ㅠ // 3 
//	상의 : ㅂ , ㄷ	// 2 
//	하의 : ㅋ , ㅌ// 2 
//	겉옷 : ㅔ , ㅏ// 2 
//	
//	3+2+2+2,
//	2 2 2 , 2 2 2 , 2 2 2 , 3 2 2 , 3 2 2 , 3 2 2 , 3 2 2 , 3 2 2  ,3 2 2
//	1 1 1 1 , 1 1 1 1 ,1 1 1 1 , 3 3 3 3 
 	
}


