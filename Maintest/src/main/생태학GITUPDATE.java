package main;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.*;

public class 생태학GITUPDATE {

	public static void main(String[] args) throws Exception {
		// 백준 4358 번 생태학
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tree = br.readLine();
		
		int alltree_count = 0;
		
		
		Map<String, Integer> map = new HashMap<>();
		
		// 무한반복
		while(true) {
			// 나무이름을 넣을때마다 그나무의 이름에 1.0을 더한다
			map.put(tree, map.getOrDefault(tree, 0) + 1);
			
			// 평균을 구하기위해 나무의 총 갯수를 샌다.
			alltree_count++;
			
			tree = br.readLine();
			
			// 입력이 공백이면 while문을 탈출한다.
			if(tree == null || tree.length() == 0) {
				break;
			}
		}
		
	
	
		
		// map.keySet().toArray(); 을 하는데 이값을 받는 newtree는 뭐가올지모르므로
		// Object로 선언해줘야 에러가 안난다.
		Object[] newtree = map.keySet().toArray();
		
		// 사전순으로 정렬
		Arrays.sort(newtree);
	
		StringBuilder sb = new StringBuilder();
		// 출력
		for(Object key : newtree) {
			String str = (String)key;
			int count = map.get(key);
			double per = (double)(count * 100)/ alltree_count;
			
			sb.append(str + " " + String.format("%.4f", per) + "\n");
		}
		
		System.out.println(sb.toString());
		
		
	}
}	
