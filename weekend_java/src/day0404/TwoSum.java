package day0404;

public class TwoSum {
	// �� ���� ���ؼ� ����ϴ� �ż���
	public void sum(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	// �� ���� ���� ��ȯ�ϴ� �޼��� ����
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
