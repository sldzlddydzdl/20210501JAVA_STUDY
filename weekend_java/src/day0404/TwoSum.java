package day0404;

public class TwoSum {
	// 두 수를 더해서 출력하는 매서드
	public void sum(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	// 두 수의 합을 반환하는 메서드 구현
	int sum01(int n1, int n2) {
		return n1+n2;
	}
	
	int sum02(int ...numbers) {
		int total = 0;
		for(int i = 0 ; i < numbers.length; i++) {
			total += numbers[i];
		}
		return total;
	}
}
