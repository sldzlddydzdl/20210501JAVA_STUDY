package main;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class 대칭차집합 {

	public static void main(String[] args) throws Exception {
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
        
        StringTokenizer st = new StringTokenizer( br.readLine() );
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        
        st = new StringTokenizer(br.readLine());
     	int[] numA = new int[A];
        for(int i=0; i< numA.length; i++) 
        	numA[i] = Integer.parseInt(st.nextToken());
        
		st = new StringTokenizer( br.readLine() );
		int[] numB = new int[B];
		for(int i = 0 ; i < numB.length; i++) {
			numB[i] = Integer.parseInt(st.nextToken());
		}
		
		Set<Integer> set = new HashSet<>();
		
		for(int i = 0 ; i < numA.length; i++) {
			set.add(numA[i]);
		}
		
		int count = 0;
		for(int i = 0 ; i < numB.length; i++) {
			int setsize = set.size();
			set.add(numB[i]);
			if(setsize == set.size()) {
				count++;
			}
		}
		
		System.out.println((numA.length - count) + (numB.length- count));
			
		
		
		
	}
}	