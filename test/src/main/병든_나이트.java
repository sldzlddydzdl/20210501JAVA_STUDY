package main;

import java.util.*;

public class 병든_나이트 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			while(true) {
				long N = sc.nextInt();
				long M = sc.nextInt();
				
				long count = 1;
				if(N >= 3 && M >= 7) {
					for(int i = 1; i <= M-3; i++) {
						count++;
					}
				}
				else if(N >= 3 && M < 7) {
					count = Math.min(4, M);
				}
				else if(N == 1) {
					count = 1;
				}
				else if(N == 2 && M >= 7) {
					count = 4;					
				}
				else if(N == 2 && M >= 3 && M <= 7) {
					count = (M+1)/2;
				}
				
				
//				else if(N >= 3 && M < 7 && M >= 4) {
//					count = 4;
//				}
//				else if( N >= 4 && M <= 7 ) {
//					count = 4;
//				}
//				else if(N <= 2 && M <= 2) {
//					count = 1;
//				}
//				else if( ( N <= 2 && M <= 4 ) || ( N <= 4 && M <= 2 )) {
//					count = 2;
//				}
//				else if (( N == 3 && M == 4 ) || ( N == 4  && M == 3)) {
//					count = 3;
//				}
				System.out.println(count);
			}
		}
		

}
