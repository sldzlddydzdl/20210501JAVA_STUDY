package EX;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[] args) {	
		// ����ڷ� ���� 0~299 ������ ���ڸ� �Է¹޾�
		// �Ʒ� ���ǿ� �µ��� ���!
		
		// ����� 0~99�� "�̲ٽ���"
		// ����� 100~199�� "�̲ٹ̵��"
		// ����� 200~299�� "�̲ٶ���"
		
		Scanner sc = new Scanner(System.in);
		
		int size = sc.nextInt();
		
		if(size >= 200) System.out.println("�̲ٶ���");
		else if(size >= 100) System.out.println("�̲ٹ̵��");
		else System.out.println("�̲ٽ���");
	}
}
