package java2_14;


import java.util.ArrayList;
import java.util.Scanner;


public class java1_14 {

	public static void main(String[] args) {

				Scanner sc = new Scanner(System.in);	
				ArrayList<String> �Ƹ޸�ī�� = new ArrayList<>();
				ArrayList<String> ������ = new ArrayList<>();
				
				try {
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
							
								for(int i = 0; i < count1; i++) {
									try {
									�Ƹ޸�ī��.remove(0);
									System.out.println((i+1) + "��° �Ƹ޸�ī�� ����");
									}
									catch (Exception e) {
										// TODO: handle exception
										System.out.println("�Ƹ޸�ī�밡 �����մϴ�.");
										break;
									}
								}
							
							
						
						}
						
						if(ch1 == 2) {
							System.out.print(" ��� �ֹ��Ͻǰǰ���? : ");
							int count1 = 0;
							count1 = sc.nextInt();
							
								for(int i = 0; i < count1; i++) {
									try {
									������.remove(0);
									System.out.println((i+1) + "��° ������ ����");
									}
									catch (Exception e) {
										// TODO: handle exception
										System.out.println("������ �����մϴ�.");
										break;
									}
								}
							
							
						
						}
						
					}
				}
				catch(Exception e) {
					System.out.println("�˼� ���� �ൿ �Դϴ�.");
					java1_14.main(args);
				}
				
				
			}

		}
		
		
	


