package java2_14;

import java.util.Calendar;
import java.util.Scanner;

public class �޷°˻�3 {

	public static void main(String[] args) { // �ΰ� ���� �˻�
		// ���� �޷�
		
		java2_14.�޷�.main(args);
		
		// �˻� �޷�
		Scanner sc = new Scanner(System.in); // 1. �Է¹ޱ�
		System.out.print("\n �˻��� ���� : ");
			int inputyear = sc.nextInt();
		System.out.print(" ���� �� : ");
			int inputmonth = sc.nextInt();
		System.out.print("\n �� ���� ");
			int endyear = sc.nextInt();
		System.out.print(" �� �� ");
			int endmonth = sc.nextInt();
		
		if(inputyear == endyear) {
			
			for(int j = inputmonth-1; j < endmonth; j++){	
				Calendar cal = Calendar.getInstance();
				cal.set(inputyear, j , 1); // �Է��� ��¥�� 1��
				
			
				int sDay = cal.get(Calendar.DAY_OF_WEEK); // �Է��� ��¥�� 1���� ����
				int eDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // �Է��� ��¥�� �� ������ �ϼ�
				
				int nowyear = cal.get(Calendar.YEAR);
				int nowmonth = cal.get(Calendar.MONTH);
				
				// �޷� ǥ��
				
						System.out.println("\n==================" + nowyear + "��=======" + (nowmonth+1) + "��======================");
						System.out.println("��\t��\tȭ\t��\t��\t��\t��");
						System.out.println("=======================================================");
						
						
						int ssDay = sDay; // 8. ������ �־��ְ�
						
						
							for(int i = 1 ; i < sDay; i++) {
								System.out.printf(" \t");
							}
							for(int i =1; i <= eDay; i++) {
								
								
								System.out.printf("%2d\t" , i);
								
								if(ssDay % 7 == 0) System.out.println(); // 8_3. ssDay 7�� ����̸� �ٹٲ�
																		 // ���� + ���� ���� 
								
								
								
								ssDay++; // 8_2. ���ڰ� �����Ҷ����� ssDay ����
							}
						
						
					
				}
		}
		
		
		else if(inputyear < endyear) {
			
			for(int j = inputmonth-1; j < 12; j++){	
				Calendar cal = Calendar.getInstance();
				cal.set(inputyear, j , 1); // �Է��� ��¥�� 1��
				
			
				int sDay = cal.get(Calendar.DAY_OF_WEEK); // �Է��� ��¥�� 1���� ����
				int eDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // �Է��� ��¥�� �� ������ �ϼ�
				
				int nowyear = cal.get(Calendar.YEAR);
				int nowmonth = cal.get(Calendar.MONTH);
				
				// �޷� ǥ��
				
						System.out.println("\n==================" + nowyear + "��=======" + (nowmonth+1) + "��======================");
						System.out.println("��\t��\tȭ\t��\t��\t��\t��");
						System.out.println("=======================================================");
						
						
						int ssDay = sDay; // 8. ������ �־��ְ�
						
						
							for(int i = 1 ; i < sDay; i++) {
								System.out.printf(" \t");
							}
							for(int i =1; i <= eDay; i++) {
								
								
								System.out.printf("%2d\t" , i);
								
								if(ssDay % 7 == 0) System.out.println(); // 8_3. ssDay 7�� ����̸� �ٹٲ�
																		 // ���� + ���� ���� 
								
								
								
								ssDay++; // 8_2. ���ڰ� �����Ҷ����� ssDay ����
							}
						
						
					
				}
			///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
			
			for(int j = 0; j < endmonth; j++){	
				Calendar cal = Calendar.getInstance();
				cal.set( endyear, j , 1); // �Է��� ��¥�� 1��
				
			
				int sDay = cal.get(Calendar.DAY_OF_WEEK); // �Է��� ��¥�� 1���� ����
				int eDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH); // �Է��� ��¥�� �� ������ �ϼ�
				
				int nowyear = cal.get(Calendar.YEAR);
				int nowmonth = cal.get(Calendar.MONTH);
				
				// �޷� ǥ��
				
						System.out.println("\n==================" + nowyear + "��=======" + (nowmonth+1) + "��======================");
						System.out.println("��\t��\tȭ\t��\t��\t��\t��");
						System.out.println("=======================================================");
						
						
						int ssDay = sDay; // 8. ������ �־��ְ�
						
						
							for(int i = 1 ; i < sDay; i++) {
								System.out.printf(" \t");
							}
							for(int i =1; i <= eDay; i++) {
								
								System.out.printf("%2d\t" , i);
								
								if(ssDay % 7 == 0) System.out.println(); // 8_3. ssDay 7�� ����̸� �ٹٲ�
																		 // ���� + ���� ���� 
								
								ssDay++; // 8_2. ���ڰ� �����Ҷ����� ssDay ����
							}
						
				}
		}
		else {
			System.out.println("�ùٸ� ��¥ �Է� �ƴմϴ�.");
		}
			
			
		
				
	}

}
