package java2_13;

import java.util.ArrayList;
import java.util.Scanner;

public class Ű����ũ2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
			else {
				System.out.println(" 1. �Ƹ޸�ī��[ ���� ] " );
			}
			
			if(������.size() != 0) {
				System.out.println(" 2. ������[ " + ������.size() + " ���� ]" );
			}
			else {
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
					�Ƹ޸�ī��.add("o");
				}
				for(int i = 0 ; i < count2; i++) {
					������.add("o");
				}
			}
			
			if(ch1 == 1) {
				System.out.print(" ��� �ֹ��Ͻǰǰ���? : ");
				int count1 = 0;
				count1 = sc.nextInt();
				try {
					for(int i = 0; i < count1; i++) {
						�Ƹ޸�ī��.remove(i);
					}
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("�Ƹ޸�ī�밡 �����մϴ�.");
				}
			
			}
			
			if(ch1 == 2) {
				System.out.print(" ��� �ֹ��Ͻǰǰ���? : ");
				int count1 = 0;
				count1 = sc.nextInt();
				try {
					for(int i = 0; i < count1; i++) {
						������.remove(i);
					}
				}
				catch (Exception e) {
					// TODO: handle exception
					System.out.println("������ �����մϴ�.");
				}
			
			}
			
		}
		
		
	}

}
