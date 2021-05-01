package main;

import java.util.*;

public class 수찾기 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0 ;i < N; i++) {
			set.add(sc.nextInt());
		}
		
		int M = sc.nextInt();
		int[] second = new int[M];
		for(int i = 0 ; i < M; i++) {
			second[i] = sc.nextInt();
		}
		
		for(int i = 0 ; i < second.length; i++) {
			int s = set.size();
			set.add(second[i]);
			if(s == set.size()) {
				System.out.println(1);
			}
			else {
				System.out.println(0);
			}
		}
		
	}
}	