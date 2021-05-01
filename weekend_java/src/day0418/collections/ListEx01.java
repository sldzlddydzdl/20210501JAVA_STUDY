package day0418.collections;

import java.util.ArrayList;
import java.util.List;

public class ListEx01 {
	public static void main(String[] args) {
		List<String> foodlist;
		foodlist = new ArrayList<>();
		
		// 음식 추가
		foodlist.add("초밥"); // 초밥
		foodlist.add("대창"); // 초밥, 대창
		foodlist.add("떡볶이"); // 초밥, 대창, 떡볶이
		System.out.println("리스트의 크기 : " + foodlist.size());
		
		// list.get(index);
		System.out.println("index 0번의 음식 : " + foodlist.get(0));
		System.out.println("index 1번의 음식 : " + foodlist.get(1));
		System.out.println("index 2번의 음식 : " + foodlist.get(2));
		
		// 0번과 1번사이에 차돌박이 를 넣어보자
		// [ 초밥 , 대창 , 떡볶이 ]
		foodlist.add(1, "차돌박이");
		System.out.println("차돌박이 넣은 후");
		System.out.println(foodlist);
		
		// 제거
		String removedStr = foodlist.remove(3); // 이것도되고
//		boolean real = foodlist.remove("떡볶이"); // 내부적으로 equals로 해서 같은 문자열이면 지운다.
		
		System.out.println(foodlist);
//		System.out.println(real);
		System.out.println("삭제된 아이는 : " + removedStr);
		
		// 리스트 안에 있는 내용을 비교하는 메서드
		Boolean foodExist = foodlist.contains("대창");
		System.out.println(foodExist);
		
		
		
	}
}
