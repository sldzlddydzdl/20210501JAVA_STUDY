package main;

import java.util.*;

public class Àú¿ï {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			
			int[] sinkers = new int[N];
			
			for(int i = 0 ; i < sinkers.length; i++) {
				sinkers[i] = sc.nextInt();
			}
			
			Arrays.sort(sinkers);
			
			int min = 1;
	        for(int i=0; i<N; i++) {
	            if(min < sinkers[i]) {
	                break;
	            }
	            min += sinkers[i];
	        }
	        System.out.println(min);
	 
		        
			
		}
}
