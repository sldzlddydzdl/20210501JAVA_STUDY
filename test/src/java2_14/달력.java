package java2_14;

import java.util.Calendar;

public class �޷� {   // ���� ��¥ �޷�

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); 			// 1. �޷� �ν��Ͻ� ���
		
		int today = cal.get(Calendar.DAY_OF_MONTH); 	// 2. ���� ��¥�� �ϼ�
		int nowyear = cal.get(Calendar.YEAR); 			// 3. ���� ��¥�� ����
		int nowmonth = cal.get(Calendar.MONTH); 		// 4. ���� ��¥�� ��
		
		cal.set(nowyear , nowmonth, 1); 				// 5. ���� ���� 1�Ϸ� ����
		int sDay = cal.get(Calendar.DAY_OF_WEEK); 		// 6. ���� 1���� ���� 
		int eDay = cal.getActualMaximum(Calendar.DAY_OF_MONTH);		// 7. ���� ���� ������ ��
		
		// �޷� ǥ��
		System.out.println("==================" + nowyear + "��=======" + (nowmonth+1) + "��======================");
		System.out.println("=======================================================");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("=======================================================");
		System.out.println("=======================================================");
		
		int ssDay = sDay; // 8. ������ �־��ְ�
		
		
		for(int i = 1 ; i < sDay; i++) {
			System.out.printf(" \t");
		}
		for(int i =1; i <= eDay; i++) {
			
			if( i == today )System.err.printf("%2d\t" , i);
			else System.out.printf("%2d\t" , i);
			if(ssDay % 7 == 0) System.out.println(); // 8_3. ssDay 7�� ����̸� �ٹٲ�
													 // ���� + ���� ���� 
			
			
			
			ssDay++; // 8_2. ���ڰ� �����Ҷ����� ssDay ����
		}
		
		
		

	}

}
