package java2_13;

public class java1_13 {

	public static void main(String[] args) {
			// ���� ���� : 1.��Ÿ(������Է¿����� ��Ÿ) 2. Ÿ�� 3. �迭, ����Ʈ ��ĥ��� ����.........
		// ����ó�� : ���� �߻� ������ �ٸ� �ڵ�� �̵�
			// try{ �����ڵ�[���Ͽ����̸� catch�� �̵�] }  ~ catch( ����Ŭ���� ��ü�� ) { �����ڵ�2 } ~
				// ~ finally{ ������ �ֵ� ���� ������ ����Ǵ� �ڵ� }
		
			// 1. Exception : ���� ���� Ŭ����
				// NullPointerException
				// ArrayIndexOutOfBoundsException
				// NumberFormatException
				//         ..........  ���
			
		
		// ����1 : ������ null�ΰ�� ���ܹ߻�
		try {
			String ���� = null;
			System.out.println(����.toString());
									// ��ü���� �޼ҵ�: toString()
			}
		catch (Exception ���ܰ�ü) {
			
			System.out.println("���ڿ��� �����Դϴ�");
			System.out.println(" ���� ���� : " + ���ܰ�ü);
			
		}
		
		
		// ����2 : �迭 ����
		try {
			String[] ���ڿ� = new String[2];
				���ڿ�[0] = "���缮";
				���ڿ�[1] = "���缮";
				���ڿ�[3] = "���缮";
			}
		catch (Exception ���ܰ�ü2) {
			// TODO: handle exception
			
			System.out.println("�迭�� ũ�Ⱑ �����մϴ�.");
			System.out.println(" ���� ���� : " + ���ܰ�ü2);
		}
		
		
		// ����3 : ���� => ���ڿ� ��ȯ ����
		try {
			String ���ڿ�1 = "100";
			String ���ڿ�2 = "a100";
			// ���ڿ� => ���ڿ�
			int ����1 = Integer.parseInt(���ڿ�1); // "100" => 100 ��ȯ ����
			int ����2 = Integer.parseInt(���ڿ�2); // "a100" => ���� ��ȯ �Ұ���
		}
		catch (Exception ���ܰ�ü3) {
			// TODO: handle exception
			
			System.out.println("�ش� ���ڿ��� ���ڿ��� ��ȯ �Ҽ� �����ϴ�.");
			System.out.println("���� ���� : " + ���ܰ�ü3);
		}
		
		
		// ����4 : ���� ĳġ
		try {
			String ���ڿ�3 = null;
			System.out.println(���ڿ�3.toString());
				// ���� �߻� => catch �� �̵� 
				// �ؿ� �ڵ���� ���������� ����
			
			String[] ���ڿ�4 = new String[2];
			���ڿ�4[0] = "���缮1";
			���ڿ�4[1] = "���缮2";
			���ڿ�4[2] = "���缮3";
		}
	
		// ����ĳġ ���� ������ ����Ŭ���� Exception�� ����ó���� �Ǹ����������ؾ� ���� �ȳ�
		catch (ArrayIndexOutOfBoundsException e) {  // Ư���Ѱ�쿡 �����߻�������
			System.out.println("���� ���� :" + e);
		}
		
		catch (NullPointerException e) {  // Ư���Ѱ�쿡 �����߻�������
			System.out.println("���� ���� :" + e);
		}
		
		catch (Exception e) { // ����������ϰ� �ƹ������� �߻�������
			System.out.println("���� �߻� : " + e);
		}
		
		finally { // ������ ����Ǵ� �ڵ�
			System.out.println("���� �ֵ� ���� ������ ����");
		}
		
		
			
			
			
	}

}
