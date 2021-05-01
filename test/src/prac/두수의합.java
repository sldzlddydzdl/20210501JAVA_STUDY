package prac;

import java.util.*;


public class 두수의합 {

	static int N;
	static int[] Arr = new int[10];
	static int solve() {
		int ret = 0;
		for(int i = 0 ; i < ( 1<<N ); i++) {
			if(Integer.bitCount(i) != 2)
				continue;
		
		
			int sum = 0;
			for(int j = 0 ; j < N; j++) {
				if( ( i & (1 << j) ) != 0){
					sum += Arr[j];
				}
			}
			
			if(sum == 7) ret++;
		}
		return ret;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		N = sc.nextInt();
		for(int i = 0 ; i < N; i++) {
			Arr[i] = sc.nextInt();
		}
		
		System.out.println(solve());
	}

}



//		000000	010000	100000	110000
//		000001	010001	100001	110001
//		000010	010010	100010	110010
//		000011	010011	100011	110011
//		000100	010100	100100	110100
//		000101	010101	100101	110101
//		000110	010110	100110	110110
//		000111	010111	100111	110111
//		001000	011000	101000	111000
//		001001	011001	101001	111001
//		001010	011010	101010	111010
//		001011	011011	101011	111011
//		001100	011100	101100	111100
//		001101	011101	101101	111101
//		001110	011110	101110	111110
//		001111	011111	101111	111111

//		이중에서 Integer.bitCount(i) != 2 2가아니면 썡까고 
//		두개를골라서 그합이 7이면 ret++
