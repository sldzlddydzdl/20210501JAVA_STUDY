package main;

import java.util.*;

public class 행렬_못품 {

		public static void main(String[] args) {
			
			Scanner sc = new Scanner(System.in);
			
			int N = sc.nextInt();
			int M = sc.nextInt();
			
			int ans = 0;
			
			String[] arr = new String[N];
			
			String[] temp = new String[N];
			for(int i = 0; i < N ; i++) {
				arr[i] = sc.next();
			}
			for(int i = 0 ; i < N ;i++) {
				temp[i] = sc.next();
			}
			
//			for(int i = 0 ; i < N; i++) {
//				arr[i].replace('0', '1');
//				
//			}
			
			String[] arrtemp = new String[N];
			String[] verticaltemp = new String[N];
			for(int i = 0 ; i < N ; i++) {
				arrtemp[i] = arr[i];
			}
			
			for(int i = 0; i < N ; i++) {
				System.out.println(arr[i]);			
			}
			for(int i = 0; i < N ; i++) {
				System.out.println(temp[i]);
			}
			
			StringBuilder newString;
			int j = 0;
			int count_horizontal = 0;
			int count_vertical = 0;
			
			// 세로만 찾기
			while(j < M) {
				for(int i = 0 ; i < N; i++) {
						newString =  new StringBuilder(arr[i]);
						if(arr[i].charAt(j) == '1') {
							newString.setCharAt(j, '0');
						}
						else if(arr[i].charAt(j) == '0') {
							newString.setCharAt(j, '1');
						}
						arr[i] = newString.toString();
						if(arr[i].charAt(j) == temp[i].charAt(j)) {
							count_vertical++;
						}
						arr[i] = newString.toString(); //
				}
				if(count_vertical == N) {
					ans++;
					
				}
				if(count_vertical < N) {
					for(int k = 0 ; k < N; k++) {
						newString = new StringBuilder(arr[k]);
						if(arr[k].charAt(j) == '1') {
							newString.setCharAt(j, '0');
						}
						if(arr[k].charAt(j) == '0') {
							newString.setCharAt(j, '1');
						}
						arr[k] = newString.toString();
					}
				}
				count_vertical = 0;
				j++;
			}
			for(int i = 0 ; i < N; i++) {
				verticaltemp[i] = arr[i];
			}
			for(int i = 0 ;i < N; i++) {
				arr[i] = arrtemp[i];
			}
			
//			System.out.println("세로만 확인후");
//			for(int i = 0; i < N ; i++) {
//				System.out.println(arr[i]);			
//			}
//			int amount = 0;
//			for(int i = 0 ; i< N; i++) {
//				if(arr[i].equals(temp[i]))
//					amount++;
//			}
//			if(amount == N) {
//				System.out.println(ans);
//			}
//			else {
//				System.out.println(-1);
//			}
			
			// 가로만 찾기
			int h = 0;
			while(h < N) {
				for(int i = 0 ; i < M; i++) {
					newString = new StringBuilder(arr[h]);
					if(arr[h].charAt(i) == '1') {
						newString.setCharAt(i, '0');
					}
					else if(arr[h].charAt(i) == '0') {
						newString.setCharAt(i, '1');
					}
					arr[h] = newString.toString();
					if(arr[h].charAt(i) == temp[h].charAt(i)) {
						count_horizontal++;
					}
					arr[h] = newString.toString(); //
				}
				if(count_horizontal == M) {
					ans++;
				}
				if(count_horizontal < M) {
					for(int k = 0 ; k < M; k++) {
						newString = new StringBuilder(arr[h]);
						if(arr[h].charAt(k) == '1') {
							newString.setCharAt(k, '0');
						}
						if(arr[h].charAt(k) == '0') {
							newString.setCharAt(k, '1');
						}
						arr[h] = newString.toString();
					}
				}
				count_horizontal = 0;
				h++;
			}
			
			
			System.out.println(" ------ newsString ------ ");
			for(int i = 0; i < N ; i++) {
				System.out.println(arr[i]);			
			}
			
			int amount = 0;
			for(int i = 0 ; i< N; i++) {
				if(arr[i].equals(temp[i]) || verticaltemp[i].equals(temp[i]))
					amount++;
			}
			if(amount == N) {
				System.out.println(ans);
			}
			else {
				System.out.println(-1);
			}
			
		}
}

//						0000
//						0010
//						0000
//						0000
//						
//						1111
//						0010
//						0000
//						1111
//						
//						2