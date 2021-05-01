package main;

import java.util.*;

public class  로프 {

		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			Integer N = sc.nextInt();
			
			Integer[] loop = new Integer[N];
			
			for(int i = 0; i < loop.length; i++) {
				loop[i] = sc.nextInt();
			}
			
			Arrays.sort(loop ,Collections.reverseOrder());

			int[] newloop = new int[loop.length];
			
			for(int i = 0; i < newloop.length; i++) {
				newloop[i] = loop[i];
			}
			
			System.out.println("----------loop----------");
			for(int s : loop)
				System.out.println(s);
			
			System.out.println("----------newloop----------");
			for(int i = 0;i < newloop.length; i++) {
				System.out.println(newloop[i]);
			}
			
			System.out.println("???: " + newloop[newloop.length-1]);
			
			int[] sum = new int[newloop.length];
			int j = 0;
			
			for(int i = newloop.length-1; i >= 0; i--) {
				sum[j] = (i+1)*newloop[i];
				j++;
			}
			
			System.out.println("----------sum----------");
			for(int s  : sum)
				System.out.println(s);
			
			int max = 0;
			for(int i = 0 ; i< sum.length; i++) {
				max = Math.max(max, sum[i]);
			}
			
			System.out.println(max);
			
		}
		
           
		// 10 9 8 1 -> 4 
		// 10 9 8   -> 24
		// 10 9     -> 18
		// 10       -> 10
		
		// 9 7 5 3 1 -> 5
		// 9 7 5 3   -> 12
		// 9 7 5     -> 15
		// 9 7       -> 14
		// 9         -> 9
		
		// 9 9 7 7 3 3 -> 18
		// 9 9 7 7 3   -> 15
		// 9 9 7 7     -> 28
		// 9 9 7       -> 21
		// 9 9         -> 18
		// 9           -> 9
}