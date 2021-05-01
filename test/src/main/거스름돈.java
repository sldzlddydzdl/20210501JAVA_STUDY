package main;

import java.util.*;

public class  거스름돈 {

		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			
			int amount = 1000 - N;
			int count = 0;
			
			while(amount >= 500) {
				amount = amount - 500;
				count++;
			}
			
			while(amount >= 100) {
				amount = amount -100;
				count++;
			}
			
			while(amount >= 50) {
				amount = amount - 50;
				count++;
			}
			
			while(amount >= 10) {
				amount = amount - 10;
				count++;
			}
			
			while(amount >= 5) {
				amount = amount - 5;
				count++;
			}
			while(amount >= 1) {
				amount = amount - 1;
				count++;
			}
			
			System.out.println(count);
		
			// 620 -500 = 120 //1 
			// 120 -100 = 20 // 1
			// 20 - 20 = 0 // 2
			

		}
           
}