package main;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

import javax.print.attribute.HashAttributeSet;

public class 숫자카드2 {

	public static void main(String[] args) throws IOException {
		
		
//		Scanner sc = new Scanner(System.in);
		
//		int N = sc.nextInt();
//		
//		int[] numN = new int[N];
//		for(int i = 0 ; i < numN.length; i++) {
//			numN[i] = sc.nextInt();
//		}
//		
//		int M = sc.nextInt();
//		int[] numM = new int[M];
//		for(int i = 0 ; i < numM.length; i++) {
//			numM[i] = sc.nextInt();
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer( br.readLine() );
     	int[] cnt = new int[20_000_001];
        for(int i=0; i< N; i++) 
           cnt[Integer.parseInt(st.nextToken()) + 10_000_000]++;
        
		int M = Integer.parseInt(br.readLine());
		st = new StringTokenizer( br.readLine() );
		StringBuffer sb = new StringBuffer();
		
		for(int i = 0 ; i < M; i++) {
			sb.append(cnt[Integer.parseInt(st.nextToken()) + 10_000_000] + " ");
		}
		
		System.out.println(sb);

		
		
		
		
		
//		Map<Integer, Integer> map = new HashMap<>();
//		
//		for(int s : numN)
//			map.put(s, map.getOrDefault(s,0) + 1);
//		
////		System.out.println(map);
//		
//		for(int s : numM) {
//			if(map.get(s) == null)
//				System.out.print(0 + " ");
//			else
//			System.out.print(map.get(s) + " ");
//		}
	}
}	