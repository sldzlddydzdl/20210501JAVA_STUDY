package prac;

import java.util.Scanner;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] Arr = new int[N];
		for(int i = 0 ; i < N; i++) {
			Arr[i] = sc.nextInt();
		}
		
		int ret = 0;
		for(int i = 0 ; i < (1 << N); i++) {
			int sum = 0;
			for(int j = 0 ; j < N ; j++) {
				if(( i & ( 1 << j) )!= 0) {
					sum += Arr[j];
				}
			}
			if ( sum == 28) {
				ret++;
			}
		}
		
		System.out.println(ret);
	}
	
	

}
