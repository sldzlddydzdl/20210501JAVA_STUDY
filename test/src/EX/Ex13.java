package EX;

public class Ex13 {

	public static void main(String[] args) {
		
		// �迭 ���� -> ���� ����
		// ���� reference 
		int[] numbers = new int[5];
		int[] copy;
		
		numbers[0] = 100;
		numbers[1] = 90;
		numbers[2] = 80;
		numbers[3] = 70;
		numbers[4] = 60;
		
		// copy �� ����
		copy = numbers;
		// -> ������ �迭��ü�� �Ѱ��� ����� ����.!
		
		System.out.println("copy = numbers ��");
		System.out.println("copy[0] : " + copy[0]); // 100
		System.out.println("numbers[0] : " + numbers[0]); // 100
		System.out.println("copy[3] : " + copy[3]); // 70
		System.out.println("numbers[3] : " + numbers[3]); // 70
		
		System.out.println("----------------------------------");
		copy[2] = 0;
		numbers[3] = 0;
		System.out.println("copy[2] = 0 ���� ��");
		System.out.println(" copy[2] : " + copy[2] ); // 0
		System.out.println("numbers[2] : " + numbers[2]); // 80����������. 0
		System.out.println("copy[3] : " + copy[3]);
		
		// copy �� numbers �� �ּҸ� �����ϹǷ�
		// copy[2] = 0; �� ������
		// numbers[2] ���� 0 �� ���Եȴ�.
		
		int[] copy1 = new int[5];
		copy1[0] = numbers[0];
		copy1[1] = numbers[1];
		copy1[2] = numbers[2];
		copy1[3] = numbers[3];
		copy1[4] = numbers[4];
		
		// �ּ��� ���� : �������� shallow copy 
		// ������ ���� : �������� deep copy
		
		
	}
}
