package java1_11;

public class ȸ�� {

	// �ʵ�
	String id;
	String pw;
	String name;
	
	// ������
	public ȸ��(String id, String pw, String name) {
		
		this.id = id;
		this.pw = pw;
		this.name = name;
		
	}
	
	
	// �޼ҵ�
	public void ȸ������() {
		
		System.out.println("���̵� : " + id );
		System.out.println("��й�ȣ : " + pw );
		System.out.println("�̸� : " + name );
		
		
	}
	
	public void ȸ������() {
		System.out.println(" ���Ѿ����ϴ�. ");
	}
	
	public void ȸ�����() {
		System.out.println(" ���Ѿ����ϴ�. ");
	}
	
}
