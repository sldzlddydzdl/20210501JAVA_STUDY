package java2_14;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class java22_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// API Ŭ����
					// Ŭ���� : �ֻ��� Ŭ���� object
						// ��� Ŭ������ object Ŭ�����κ��� ��� �޴´� !!
				
				// 1. ��¥ / ��¥/�ð� ���� Ŭ����
				// 2. SimpleDateFormat Ŭ���� : ��¥ ���� Ŭ����
				// 3. Calender Ŭ���� : �޷�
				Date ��¥ = new Date();
				System.out.println(��¥.toString());
				
				SimpleDateFormat ���� = new SimpleDateFormat("yy�� MM�� dd�� hh�� mm�� ss��");
										// y : ����, M : ��, d : ��, h : ��,  m : ��, s : ��
				
				System.out.println(����.format(��¥));
				
				Calendar �޷� = Calendar.getInstance(); //  getInstace() : �ش� �ν��Ͻ�[��ü] ���
														// ���ñ������� �޷� ��������
				
				System.out.println("���� : " + �޷�.get(�޷�.YEAR)); // ���� �޷��� ����
				System.out.println("�� : " + (�޷�.get(�޷�.MONTH)+1)); // ���� �޷��� ����
				System.out.println("��[��] : " + �޷�.get(�޷�.DAY_OF_MONTH)); // ���� �޷��� ����
				System.out.println("��[��] : " + �޷�.get(�޷�.DAY_OF_WEEK));  // ��[1] ��[2] ȭ[3] ��[4] 
				System.out.println("��[��] : " + �޷�.get(�޷�.DAY_OF_YEAR)); // �⵵�� �������� 365�� �������� �ؼ� 
				
				int ���� = �޷�.get(�޷�.DAY_OF_WEEK);
				if(���� == 1) System.out.println("�Ͽ���");
				if(���� == 2) System.out.println("������");
				if(���� == 3) System.out.println("ȭ����");
				if(���� == 4) System.out.println("������");
				if(���� == 5) System.out.println("�����");
				if(���� == 6) System.out.println("�ݿ���");
				if(���� == 7) System.out.println("�����");
				
				System.out.println(" ����/���� : " + �޷�.get(�޷�.AM_PM)); // 0 ���� , 1 ����
				int ���� = �޷�.get(�޷�.AM_PM);
				if(���� == 0) {
					System.out.println(" ����");
				}
				if(���� == 1) {
					System.out.println(" ����");
				}
				
				
	}

}
