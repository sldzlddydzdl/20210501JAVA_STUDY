package java2_15;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class �۾��� {
	public static Scanner sc = new Scanner(System.in);
	String �۳���;
	String �ۼ���;
	String �ۼ���;

	public void write(int log) {
		System.out.println(" === �۾��� === ");
		System.out.print(" �۳��� : ");
			�۳��� = sc.nextLine(); // ���� ����
		�ۼ��� = Main.ȸ�����.get(log).�̸�;
		
		Date ��¥ = new Date();
		SimpleDateFormat ���� = new SimpleDateFormat("MM�� dd�� hh:mm:ss");
		
		�ۼ��� = ����.format(��¥);
	}
	
	public void remove(int log) {
		System.out.println(" ===== �ۻ��� ===== ");
		System.out.println(" ������ �Խù� ��ȣ : ");
			int ���� = sc.nextInt();
			
		if(Main.ȸ�����.get(log).�̸�.equals(Main.�۸��.get(����).�ۼ���)) {
			Main.�۸��.remove(����);
		}
		else {
			System.out.println(" ** �˸� : ���� ������ �����ϴ� " );
		}
	}
	
	public void modify(int log) {
		System.out.println(" ===== �ۻ��� ===== ");
		System.out.println(" ������ �Խù� ��ȣ : ");
			int ���� = sc.nextInt();
			
		if(Main.ȸ�����.get(log).�̸�.equals(Main.�۸��.get(����).�ۼ���)) {
			
			System.out.print(" ������ ���� �Է� : ");
			sc.nextLine(); // nextLine() ���� ����  // nextLine() �ι��� �������ο��� �տ� nextLine()�� ����� �νĸ��ϰ��ϱ�����
			Main.�۸��.get(����).�۳��� = sc.nextLine(); // ���� : nextLine() ���� 
			
		}
		else {
			System.out.println(" ** �˸� : ���� ������ �����ϴ� " );
		}
	}

}
