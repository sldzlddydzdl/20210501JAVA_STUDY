package EX;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		
		// ����ڷκ��� 0 ~ 100 �� ������ �Է¹޾Ƽ�
		// 100���̸� "�����Դϴ�"
		// 90~99���̸� "A����"
		// 80~89���̸� "B����"
		// 70~79���̸� "C����"
		// �������� "F����"
		
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �Է����ּ���");
		
		// �Է¹޾� ������ �ֱ�
		int score = sc.nextInt();
		if(score == 100) {
			System.out.println("�����Դϴ�");
		}else if(score >= 90) {
			System.out.println("A����");
		}else if(score >= 80) {
			System.out.println("B����");
		}else if(score >= 70) {
			System.out.println("C����");
		}else {
			System.out.println("F����");
		}
		
		if(score == 100) {
			System.out.println("�����Դϴ�");
		}if(score <= 99 && score >= 90) {
			System.out.println("A����");
		}if(score <= 89 && score >= 80) {
			System.out.println("B����");
		}if(score <= 79 && score >= 70) {
			System.out.println("C����");
		}else {
			System.out.println("F����");
		}
		
		if(score == 100) {
			System.out.println("�����Դϴ�");
		}else if(score <= 99 && score >= 90) {
			System.out.println("A����");
		}else if(score <= 89 && score >= 80) {
			System.out.println("B����");
		}else if(score <= 79 && score >= 70) {
			System.out.println("C����");
		}else {
			System.out.println("F����");
		}
		
		
		
		
	}

}
