package main;

import java.util.*;

public class º≥≈¡πË¥ﬁ {

		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int carry = N;
			int N5 = N/5;
			int[] temp = new int[N5+1];
			int[] count = new int[N5+1];
				
			for(int i = 0 ; i <= N5; i++) {
				
				temp[i] = N - (5*(i));
				N = carry;
			}
			
			System.out.println("------temp---------");
			for(int s : temp)
				System.out.println(s);
			
			for(int i = 0 ; i <temp.length; i++) {
				
				if(temp[i] % 3 == 0) {
					int N3 = temp[i] / 3;
					count[i] = i+N3;
				}
				else {
					count[i] = 1600;
				}
				
			}
			
			System.out.println("------count---------");
			for(int s : count)
				System.out.println(s);
			
			int min = 1600;
			
			for(int i = 0 ; i < count.length; i++) {
				min = Math.min(min, count[i]);
			}
			
			System.out.println("-------------------------");
			if(min == 1600) {
				System.out.println(-1);
			}
			else {
				System.out.println(min);
			}
			
			
			
			
			
		}
//		    26  5:0 3:x
//  		21  5:1 3:7
//		    16  5:2 3:x
//		    11  5:3 3:x
//           6  5:4 3:2
//           1  5:5 3:x

           
           
           
}