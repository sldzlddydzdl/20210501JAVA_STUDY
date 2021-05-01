package main;

import java.util.*;

public class 베스트셀러UPDATE {

	public static void main(String[] args)  {
		
		// 베스트 셀러 문제 1302 번
		
//		첫째 줄에 가장 많이 팔린 책의 제목을 출력한다. 
//		만약 가장 많이 팔린 책이 여러 개일 경우에는 사전 순으로 가장 앞서는 제목을 출력한다.
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		// 맵을 하나판다.
		Map<String , Integer> map = new HashMap<>();
		
		// 책의 갯수만큼 제목을 입력한다.
		String[] book = new String[N];
		for(int i = 0 ; i < book.length; i++) {
			book[i] = sc.next();
		}
		
		// 책의 제목을 키값으로해서 제목이 중복되면 중복되는값을 Integer형으로 
		// value 값을 1씩 증가시킨다. 
		for(String key : book)
			map.put(key, map.getOrDefault(key, 0)+1);
		
		
		List<Integer> list = new ArrayList<>();
		
		// 리스트에 책이 팔린 숫자를 입력한다.
		for(String key : map.keySet())
			list.add(map.get(key));
		
		int max = 0;
		// list에서 책의 최대값을 구한다.
		for(int i = 0 ; i < list.size(); i++) {
			max = Math.max(max, list.get(i));
		}
		
		List<String> adb = new ArrayList<>();
		
		// 다시 만약에 가장많이팔린책이 여러개일 경우를 대비해서 그 책들의 제목을 adb리스트에 담는다.
		for(String key : map.keySet()) {
			if(map.get(key) == max) {
				adb.add(key);
			}
		}
		
		String[] answerbook = new String[adb.size()];
		
		for(int i = 0 ; i < adb.size(); i++) {
			answerbook[i] = adb.get(i);
		}
		
		// 책들을 사전순으로 나열한다.
		Arrays.sort(answerbook);
	
		System.out.println(answerbook[0]);		
	}
}	