package EX;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		// ������ ǥ���ϱ��???
		// 100�� "�����Դϴ�"
		// 90~99 "A����"
		// 80~89 "B����"
		// 70~79 "C����"
		// �� �� "F����"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�������Է��ϼ���");
		int score = sc.nextInt();
		
		switch (score/10) {
			case 10:
				System.out.println("����");
				break;
			case 9:
				System.out.println("A����");
				break;
			case 8:
				System.out.println("B����");
				break;
			case 7: 
				System.out.println("C����");
				break;
			default:
				System.out.println("F����");
		}
		
		System.out.println("-------------------------------");
		
		switch (score) {
			case 100:
				System.out.println("����");
				break;
			case 90: case 91: case 92: case 93: case 94:
			case 95: case 96: case 97: case 98: case 99: // �̷��Ե������ϴ�
				System.out.println("A����");
				break;
			case 80: case 81: case 82: case 83: case 84:
			case 85: case 86: case 87: case 88: case 89:	
				System.out.println("B����");
				break;
			case 70: case 71: case 72: case 73: case 74:
			case 75: case 76: case 77: case 78: case 79: 
				System.out.println("C����");
				break;
			default:
				System.out.println("F����");
		}
		
		
	}
}
