package day0404;

public class Ex03 {
	public static void main(String[] args) {
		// �� ���� ���Ͽ� ���
		TwoSum tw = new TwoSum();
		
		// sum�޼��� ȣ��
		tw.sum(10, 20);
		System.out.println("---------------------------");
		// �� ����� ���� �� ������? 
		// �� ���� ���� / 2�� ������ �ϴµ� ~ �� ���� ���� ��µǹ��Ǵ��̹�
		int result = tw.sum01(20, 30);
		System.out.println(result);
		System.out.println("��� : " + result / 2);
		
		tw.sum02(10,20,30);
		
		
	}
}
