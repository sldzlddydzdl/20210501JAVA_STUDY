package day0404;

import java.util.Arrays;

public class Ex04 {
	public static void main(String[] args) {
		// �迭 ������ ����
		int[] numbers = {10, 20, 30, 40, 80, 90};
		
		// �޼��带 ����Ϸ��� ��ü�� �־�ߵ�
		MyArrayCopy mac = new MyArrayCopy();
		// mac.�޼����();
		
		// ����� �迭�� cpArray�� ��´�.
		int[] cpArray = mac.DeepCopy(numbers);
		
		System.out.println("�����ּ� : " + numbers );
		System.out.println("ī���ּ� : " + cpArray);
		
		for(int i = 0 ; i< numbers.length; i++) {
			System.out.println("�����迭 : " + numbers[i]);
			System.out.println("ī�ǹ迭 : " + cpArray[i]);
		}
		
		int[] cpArray01 = mac.shallowCopy(numbers);
		System.out.println("�������� �ּ� : " + cpArray01);
		for(int i = 0 ; i < cpArray01.length; i++) {
			System.out.println("�������� �迭 : " + cpArray01[i]);
		}
		
		// �迭�� ���� ����!
		cpArray[0] = 1000;
		System.out.println("����:"+Arrays.toString(numbers));
		System.out.println("cpArray:"+Arrays.toString(cpArray));
		
		cpArray01[1] = 5000;
		System.out.println("����:"+Arrays.toString(numbers));
		System.out.println("cpArray01:"+Arrays.toString(cpArray01));
		
		
		
		for(int a : mac.DeepCopy(numbers))
			System.out.print(a + " ");
		
		System.out.println();
		
		for(int a : mac.ShallowCopy(numbers))
			System.out.print(a + " ");
	}

}
