package EX;

import java.util.*;

public class Ex07 {

	public static void main(String[] args) {
		// ����ڷκ��� 1~5 �� �ϳ��� ���ڸ� �Է¹޾�
		// �ش�Ǵ� ��ȣ�� �޴��� ����ϴ� �ڵ带 �ۼ��Ͻÿ�
		System.out.println("***********�޴���***********");
		System.out.println("1. ���" );
		System.out.println("2. �ָԹ�" );
		System.out.println("3. ����");
		System.out.println("4. ���");
		System.out.println("5. ������");
		System.out.println("**************************");
		System.out.print("�����Ͻ� �޴��� ����ּ��� : ");
		Scanner sc = new Scanner(System.in);
		
		int ch = sc.nextInt();
		if( ch >= 1 && ch <= 5) {
			switch(ch) {
				case 1:
					System.out.println("����� �����߽��ϴ�.");
					break;
				case 2:
					System.out.println("�ָԹ��� �����߽��ϴ�.");
					break;
				case 3:
					System.out.println("���θ� �����߽��ϴ�.");
					break;
				case 4:
					System.out.println("����� �����߽��ϴ�.");
					break;
				case 5:
					System.out.println("�����̸� �����߽��ϴ�.");
			}
		}else {
			System.out.println("�ش� �޴��� �����ϴ�. �ٽ� ����ּ��� ");
			Ex07.main(args);
		}
	}

}
