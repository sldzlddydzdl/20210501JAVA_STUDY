package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class 암기왕 {

	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(br.readLine());
		
		for(int k = 0 ; k < T; k++) {
			int	N = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			Map<Integer,Boolean> map = new HashMap<>();
			for(int i = 0 ; i < N; i++) {
				map.put(Integer.parseInt(st.nextToken()), true);
			}
			
			int M = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			for(int i = 0 ; i < M; i++) {
				if(map.containsKey(Integer.parseInt(st.nextToken()))) {
					bw.write("1\n");
				}else {
					bw.write("0\n");
				}
			}
		}
		
		bw.flush();
		br.close();
		bw.close();
	}
}	





//Scanner sc = new Scanner(System.in);
//Set<Integer> set = new HashSet<>();
//int T = sc.nextInt();
//for(int i = 0 ; i < T; i++) {
//	int N = sc.nextInt();
//	for(int j= 0 ; j <N; j++) {
//		set.add(sc.nextInt());
//	}
//	
//	int M =sc.nextInt();
//	for(int j = 0 ; j < M; j++) {
//		int size = set.size();
//		set.add(sc.nextInt());
//		if(size == set.size()) 
//			System.out.println(1);
//		else 
//			System.out.println(0);
//	}
//}