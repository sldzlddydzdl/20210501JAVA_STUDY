package main;

import java.util.*;

public class 연결요소의개수 {
	
	
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] numN = new String[N];
		for(int i = 0 ; i < numN.length; i++) {
			numN[i] = sc.next();
		}
		
		int M = sc.nextInt();
		String[] numM = new String[M];
		for(int i = 0 ; i < numM.length; i++) {
			numM[i] = sc.next();
		}
		
		Map<String, Integer> map = new HashMap<>();
		
		for(String s : numN)
			map.put(s, map.getOrDefault(s,0) + 1);
		
//		System.out.println(map);
		
		for(String s : numM) {
			if(map.get(s) == null)
				System.out.print(0 + " ");
			else
			System.out.print(map.get(s) + " ");
		}
	}
}
