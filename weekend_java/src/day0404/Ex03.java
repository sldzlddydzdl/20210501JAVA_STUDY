package day0404;

public class Ex03 {
	public static void main(String[] args) {
		// 두 수를 더하여 출력
		TwoSum tw = new TwoSum();
		
		// sum메서드 호출
		tw.sum(10, 20);
		System.out.println("---------------------------");
		// 두 평균은 구할 수 있을까? 
		// 두 수의 합을 / 2로 나눠야 하는데 ~ 두 수의 합은 출력되버렷다이미
		int result = tw.sum01(20, 30);
		System.out.println(result);
		System.out.println("평균 : " + result / 2);
		
		tw.sum02(10,20,30);
		
		
	}
}
