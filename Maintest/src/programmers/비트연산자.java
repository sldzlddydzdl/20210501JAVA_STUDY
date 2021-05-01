package programmers;

import java.util.Scanner;

public class 비트연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] Arr = new int[10];
		
		int N = sc.nextInt();
		for(int i = 0 ; i < N; i++) 
			Arr[i] = sc.nextInt();
		
		System.out.println(solve(Arr, N));
		
		char[] data = { 'A' , 'B' , 'C' , 'D' };
		printSubsets(data, 4);
		
	}
	
	static void printSubsets(char[] arr, int n) {
		for(int i = 0 ; i < (1<< n); i++) {
			System.out.print("{");
			for(int j = 0 ; j < n; j++) {
				if((i & 1 << j ) != 0)
					System.out.print(arr[j] + " ");
			}
			System.out.println("}");
		}
	}
	
	static int solve(int[] Arr , int N ) {
		
		int ret = 0;
		for(int i = 0 ; i < (1 << N); i++) {
			if(Integer.bitCount(i) != 2)
				continue;
			
			int sum = 0;
			for(int j = 0 ; j < N; j++) {
				if((i & 1 << j) != 0 )
					sum += Arr[j];
				System.out.println(Arr[j]);
			}
			if(sum == 7) ret++;
		}
		return ret;
	}

}
//
// i 번째 원소가 있는지 확인
//	 (비트로 표현된 집합)&(1<<i) 결과가 0이 아니면 존재
//	 2번째 원소가 있는지 확인
//		 0101 & (1 << 2) = 0101 & 0100 = 0100
//
// i 번째 원소를 추가
//	 (비트로 표현된 집합) | (1 << i)
//	 1번째 원소를 추가
//		 0101 & (1 << 1) = 0101 | 0010 = 0111
//		
// i 번재 원소를 삭제
//	 (비트로 표현된 집합)&~(1<<i)
//	 2번째 원소를 삭제
//	 	 0101 & ~(1<<2) = 0101 &~(0100) = 0101 & 1011 = 0001
//		

// Integer.bitCount(int i)메소드 사용
// 비트로 표현된 정수값에서 비트가 1인 갯수를 새는 함수

	