package main;

import java.util.*;

public class 캠핑 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int L = 1;
			int P = 1;
			int V = 1;
			int count = 0;
			int sum = 0;
			while(L != 0 || P != 0 || V != 0 ) {
				
				L = sc.nextInt();
				P = sc.nextInt();
				V = sc.nextInt();
				count++;
				if( L == 0 || P == 0 || V == 0) {
					break;
				}
				while(V > 0) {
					if(V <= L) {
						sum += V;
						V -= P;
					}
					else {
						V -= P;
						sum += L;
					}
				}
				
				System.out.println("Case " + count + ": " + sum);
				L = 1;
				P = 1;
				V = 1;
				sum = 0;
			}
			
		}
}


// 5일중 8일동안만 사용할수 있다. 이제막 20일짜리 휴가를 시작햇다

// 강산이가 최대 몇일동안 사용할수있나? 출력 : 