package day0404;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		// 배열 생성의 예외
		int[] numbers = {10, 20, 30, 40, 80, 90};
		
		// 메서드를 사용하려면 객체가 있어야되
		MyArrayCopy mac = new MyArrayCopy();
		// mac.메서드명();
		
		// 복사된 배열을 cpArray에 담는다.
		int[] cpArray = mac.DeepCopy(numbers);
		
		System.out.println("원본주소 : " + numbers );
		System.out.println("카피주소 : " + cpArray);
		
		for(int i = 0 ; i< numbers.length; i++) {
			System.out.println("원본배열 : " + numbers[i]);
			System.out.println("카피배열 : " + cpArray[i]);
		}
		
		int[] cpArray01 = mac.shallowCopy(numbers);
		System.out.println("얕은복사 주소 : " + cpArray01);
		for(int i = 0 ; i < cpArray01.length; i++) {
			System.out.println("얕은복사 배열 : " + cpArray01[i]);
		}
		
		// 배열의 내용 변경!
		cpArray[0] = 1000;
		System.out.println("원본:"+Arrays.toString(numbers));
		System.out.println("cpArray:"+Arrays.toString(cpArray));
		
		cpArray01[1] = 5000;
		System.out.println("원본:"+Arrays.toString(numbers));
		System.out.println("cpArray01:"+Arrays.toString(cpArray01));
		
		
		
		for(int a : mac.DeepCopy(numbers))
			System.out.print(a + " ");
		
		System.out.println();
		
		for(int a : mac.ShallowCopy(numbers))
			System.out.print(a + " ");
	}

}
