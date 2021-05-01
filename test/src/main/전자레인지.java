package main;

import java.util.*;

public class 전자레인지 {

		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			int Time = sc.nextInt();
			int A = 0;
			int B = 0;
			int C = 0;
			
			while(Time >= 300) {
				Time -= 300;
				A++;
			}
			System.out.println("A Time : " + Time);
	//		Time += 300;
			while(Time >= 60) {
				Time -= 60;
				B++;
			}
			System.out.println("B Time : " + Time);
	//		Time += 60;
	//		
			while(Time >= 10) {
				Time -= 10;
				C++;
			}
			
	//		Time += 10;
			
			System.out.println("C Time : " + Time);
			
			if(Time == 0) {
				System.out.println(A + " " + B + " " + C);
			}
			else {
				System.out.println(-1);
			}

		}

}