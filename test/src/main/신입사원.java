package main;

import java.util.*;

public class 신입사원 {

		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
		/*
			int T = sc.nextInt();
			int[] count = new int[T];
			int[][] score;
//			int[] valueN = new int[T];
			int N = 0;
			
			for(int i = 0 ; i < T ; i ++) {
				N = sc.nextInt();
//				valueN[i] = N;
				score = new int[N][2];
				for(int j = 0 ; j < score.length; j++) {
					score[j][0] = sc.nextInt();
					score[j][1] = sc.nextInt();
				}
				
				Arrays.sort(score, Comparator.comparingInt(o1 -> o1[0]));
				
				System.out.println();
				for(int[] s : score) {
					System.out.println(s[0] + " " + s[1]);
				}
				
				count[i] = 1;
				for(int k = 1 ; k < N; k++ ) {	
					if(score[k][1] < score[k-1][1]) {
						count[i]++;
					}
				}
				
			}
			
			for(int i = 0 ; i < count.length; i++) {
				System.out.println(count[i]);
			}
			*/
			int T = sc.nextInt();
			int[] count = new int[T];
			int[] score;
			int N = 0;
			
			for(int i = 0 ; i < T ; i ++) {
				N = sc.nextInt();
				score = new int[N+1];
				for(int j = 0 ; j < score.length-1; j++) {
					score[sc.nextInt()] = sc.nextInt();
				}
			
				
				int temp = score[1];
				count[i] = 1;
				for(int k = 2 ; k < N+1; k++ ) {	
					if(temp >= score[k]) {
						temp = score[k];
						count[i]++;
					}
				}			
			}
			
			for(int i = 0 ; i < count.length; i++) {
				System.out.println(count[i]);
			}
			
			

		}
		
//		1 4		1
//		2 5		X
//		3 6		X
//		4 2		2
//		5 7		X
//		6 1		3
//		7 3		X

		// 서류심사 성적 , 면접시험 성적 중 적어도 하나가 다른지원자보다 떨어지지않는 자만 
//		 다른 모든 지원자와 비교했을 때 서류심사 성적과 면접시험 성적 중 적어도 하나가 다른 지원자보다 떨어지지 않는 자만 선발한다는 원칙을 세웠다.
		//어떤 지원자 A의 성적이 다른 어떤 지원자 B의 성적에 비해 서류 심사 결과와 면접 성적이 모두 떨어진다면 A는 결코 선발되지 않는다.
}