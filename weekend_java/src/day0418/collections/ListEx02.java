package day0418.collections;

import java.util.*;

public class ListEx02 {
	public static void main(String[] args) {
		// ArrayList numbers 를 만들고
		// 2~10 까지의 숫자를 추가 후 출력
		
		List<Integer> numbers =new ArrayList<>();
		
		
		for(int i = 2; i <= 10; i++) {
			numbers.add(i);
		}
		
		System.out.println("----------------2~10 까지의 숫자를 추가 후 출력----------------");
		System.out.println(numbers);
		for(int num : numbers)
			System.out.print(num + " ");
		
		System.out.println();
		
		for(int i = 0; i < numbers.size(); i++){
			System.out.print(numbers.get(i) + " ");
		}
		
		System.out.println();
		
		numbers.remove(3);
		System.out.println("---------------------index 3번째 제거후--------------------");
		System.out.println(numbers);
		for(int num : numbers)
			System.out.print(num + " ");
		
		System.out.println();
		
		for(int i = 0; i < numbers.size(); i++){
			System.out.print(numbers.get(i) + " ");
		}
		
		System.out.println();
		System.out.println("------------------index7에 100을 추가한후-------------------");
		numbers.add(7, 100);
		System.out.println(numbers);
		
		System.out.println("-----------------2의 배수를 모두 제거한 후 출력-----------------");
		
//		int numbers_size = numbers.size();
//		for(int i = 0; i < numbers_size; i++ ) {
//			if(numbers.get(i) % 2 ==0) {
//				numbers.remove(i);
//				numbers_size = numbers.size();
//				i = 0;
//			}	
//		}

		// 젤 좋은 방법 
		for(int i = numbers.size() -1; i >= 0; i--) {
			if(numbers.get(i) % 2 ==0) {
				numbers.remove(i);
			}
		}
		
//		List<Integer> list = new ArrayList<>();
//		
//		for(int s : numbers) 
//			if(s %2 == 0)
//				list.add(s);
//		
//		for(int s : list)
//			numbers.remove((Integer)s);

		System.out.println(numbers);
	}
}
