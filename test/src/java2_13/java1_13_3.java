package java2_13;

public class java1_13_3 {

	public static void main(String[] args) {
		
		// ���� Ŭ���� ����
			// throw new Exception("�����߻��� �ְ������");
			// ���� Ŭ���� ����� : Ŭ������ extends Exception
		
		���� ����1 = new ����();
		
		����1.set�ݾ�(5000);
		System.out.println(����1.get�ݾ�());
		
		/*
		 * 			// throw new Exception("�����߻��� �ְ������");
		try {
			����1.���(10000);
		} catch (Exception e) {
			System.out.println("���� �߻� : " + e);
		}
		*/
		
		
					// ���� Ŭ���� ����� : Ŭ������ extends Exception
		try {
			����1.���(10000);
		} catch (��ݾ׺��� e) {
			System.out.println("���� �߻� : " + e);
		}
			
		
		
	}

}
