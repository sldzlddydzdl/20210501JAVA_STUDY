package java2_13;

public class java1_13_2 {

	public static void main(String[] args) {
		
		// ���� ������ : �ش� �޼ҵ忡�� ó�� ���� ������ ȣ���Ѱ����� ���� �ֱ�
				
		try {
			findclass();
		}
		catch (Exception e) {
			System.out.println("�ش� Ŭ������ ã���� �����ϴ�");
			System.out.println("���� ���� : " + e);
		}
	}
	
	public static void findclass() throws Exception { 
		// throws Exception => �Լ��ȿ��� �߻��� ������ ���ο��� �޼ҵ带 ȣ���Ҷ� ������ �߻��ϵ��� ������ ������
		
		
		// �ѱ۷� �� Ŭ������ ���� => ���� �߻���
		Class class1 = Class.forName("java.lang.����");
		
		
		// ���࿡ �ش� Ŭ������ ������ ���
		System.out.println( class1 );
						
		
	}

}
