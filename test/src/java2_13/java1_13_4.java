package java2_13;

import java.util.ArrayList;
import java.lang.reflect.Array;
import java.util.Scanner;

public class java1_13_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// 1.Ű����ũ // �迭���
				// [�����] : 1�� : 5�� // 2�� : 6�� ~~~~~~~~
				// 1.[����߰�] : �迭 5���� // ���� �߻� => ����� �� á���ϴ� 
				// 2.[������] : 
		
		// 2. Ű����ũ // ����Ʈ ���
				// [r������]
				// 0. �����޴� [ ���� �Ǹ��� ���� ] : �Է��� ������ŭ ���������� ǥ��
				// [�����]
				// 1. �Ƹ޸�ī�� [ �������� : 3�� ] : �ֹ�������ŭ ���� => 0 �̵Ǹ� => ���� �߻� => ����
				// 2. ������ [ �������� : 10�� ] : �ֹ�������ŭ ���� => 0 �̵Ǹ� => ���� �߻� => ����
		/*
		Scanner sc = new Scanner(System.in);
		Integer[] ����� = new Integer[5];
		
		while(true) {
			System.out.println(" ===== ��� ���α׷� =======");
			System.out.println("1.����߰�");
			System.out.println("2.��ܻ���");
			System.out.println("=== ��� ��Ȳ ===");
			
			for(int i = 0; i < �����.length; i++) {
				if(�����[i] == null) {
					System.out.println((i+1) + "��" + 0 + "��");
				}
				else {
					System.out.println((i+1) + "�� : " + �����[i] + "��");
				}
			}
		
		
			System.out.print("���� : ");
			int ch = sc.nextInt();
			
			if(ch ==1) { // �迭 �߰�
			
					for(int i = 0 ; i< 10; i++) {
						try {
							if( �����[i] == null) {
								System.out.print("����� �����Ͻðڽ��ϱ�?");
								�����[i] = sc.nextInt();
								System.out.println("��� ��ȣ : " + (i+1));
								break;
							}
						}
						catch (Exception e) {
							// TODO: handle exception
							System.out.println(" �����߻� : �ִ� ����� �Դϴ� [��ٷ��ּ���] ");
							break;
						}
					}
			}
			
			if(ch ==2) { // �迭 ����
				
				for(int i = 0 ; i< �����.length; i++) {
					
					if(i == �����.length-1) { // ��������ȣ
						�����[i] = null;
						break;
					}
					
					�����[i] = �����[i+1];
					
				}

				
	
			}
			
		}
		*/
		
		Scanner sc = new Scanner(System.in);	
		ArrayList<String> �Ƹ޸�ī�� = new ArrayList<>();
		ArrayList<String> ������ = new ArrayList<>();
		
		while(true) {
			System.out.println("=== �����޴� ===");
			System.out.println("0.��ǰ �Ǹ��� ����");
			System.out.println("==== �޴� ====");
			
		
			if(�Ƹ޸�ī��.size() != 0) {
				System.out.println(" 1. �Ƹ޸�ī��[ " + �Ƹ޸�ī��.size() + " ���� ]" );
			}
			else if(�Ƹ޸�ī��.size() == 0){
				System.out.println(" 1. �Ƹ޸�ī��[ ���� ] " );
			}
			
			if(������.size() != 0) {
				System.out.println(" 2. ������[ " + ������.size() + " ���� ]" );
			}
			else{
				System.out.println(" 2. ������[ ���� ] " );
			}
			
			System.out.print(" �޴� ���� : ");
			int ch1 = sc.nextInt();
			
			
			if(ch1 == 0) {
				System.out.print(" �Ƹ޸�ī�븦 � �Ǹ��Ͻǰǰ���? ");
				int count1 = sc.nextInt();
			
				System.out.print(" ������ � �Ǹ��Ͻǰǰ��� ? ");
				int count2 = sc.nextInt();
		
				for(int i = 0 ; i < count1; i++) {
					�Ƹ޸�ī��.add(" ");
				}
				for(int i = 0 ; i < count2; i++) {
					������.add(" ");
				}
			}
			
			if(ch1 == 1) {
				System.out.print(" ��� �ֹ��Ͻǰǰ���? : ");
				int count1 = 0;
				count1 = sc.nextInt();
				
				if(�Ƹ޸�ī��.size() < count1) {
					System.out.println("�Ƹ޸�ī�밡 �����մϴ�");
				}
				else {
					try {
						for(int i = 0; i < count1; i++) {
							�Ƹ޸�ī��.remove(0);
						}
					}
					catch (Exception e) {
						// TODO: handle exception
						System.out.println("�Ƹ޸�ī�밡 �����մϴ�.");
						count1 = 0;
						/*
						for(int i = 0 ; i < count1; i++) {
							�Ƹ޸�ī��.add("o");
						}
						*/
					}
				}
			}
			
			if(ch1 == 2) {
				System.out.print(" ��� �ֹ��Ͻǰǰ���? : ");
				int count1 = 0;
				count1 = sc.nextInt();
				
				if(������.size() < count1 ) {
					System.out.println("������ �����մϴ�.");
				}
				else {
					try {
						for(int i = 0 ; i < count1; i++) {
							������.remove(0);
						}
					} catch (Exception e) {
						// TODO: handle exception
						System.out.println("������ �����մϴ�.");
						count1 = 0;
					}
				}
			
			}
			
		}
		
	}
		
		
}


