package main;

import java.util.*;

public class 패션왕신해빈 {

	public static void main(String[] args)  {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i < N ; i++) {
			int M = sc.nextInt();
			
			String[][] clothes = new String[M][2];
			for(int j =  0 ;  j < clothes.length; j++) {
				clothes[j][0] = sc.next();
				clothes[j][1] = sc.next();
			}
			
			Map<String, Integer> map = new HashMap<>();
			
			for(String[] key : clothes)
				map.put(key[1], map.getOrDefault(key[1], 0)+ 1);
			
//			int[] NumberOfCases  =new int[map.size()];
			List<Integer> NumberOfCases = new ArrayList<>();
			
			for(String key : map.keySet()) {
				NumberOfCases.add(map.get(key)+1);
			}
			
			int answer = 1;
			
			for(int j = 0 ; j < NumberOfCases.size(); j++) {
				answer = answer * NumberOfCases.get(j);
			}
			
			System.out.println(answer - 1);
		}
		
	}
}	


//						1 2
//						3 4 5
//						
//						1
//						2
//						3
//						4
//						5
//						
//						1 3		
//						1 4		3 * 4 - 1  = 11;
//						1 5
//						2 3
//						2 4
//						2 5
//						
//						
//						
//						안경 코트 상의 신발 
//						바지 
//						안경대신 렌즈
//						
//						headgear - hat , turban
//						eyewear - sunglasses
//						
//						hat
//						turban
//						sunglasses 			 3 * 2 -1 =	5
//						hat -sunglasses
//						turban - sunglasses
//						
//						
//						
//						face - mask, sunglasses, makeup
//						
//						mask
//						sunglasses				4 -1 = 3
//						makeup
//						
//						1 2 3
//						4 5 
//						6
//						
//						
//						1
//						2
//						3
//						4
//						5
//						6
//						
//						1 4
//						1 5
//						2 4
//						2 5
//						3 4				4 * 3 * 2 - 1= 23
//						3 5				6 + 11 + 6 = 23
//						1 6
//						2 6
//						3 6
//						4 6
//						5 6
//						
//						1 4 6
//						1 5 6
//						2 4 6 
//						2 5 6
//						3 4 6
//						3 5 6

	
